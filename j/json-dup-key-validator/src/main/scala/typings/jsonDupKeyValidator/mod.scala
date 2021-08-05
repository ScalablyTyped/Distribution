package typings.jsonDupKeyValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-dup-key-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(jsonString: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(jsonString.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def parse(jsonString: String, allowDuplicatedKeys: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(jsonString.asInstanceOf[js.Any], allowDuplicatedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def validate(jsonString: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(jsonString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def validate(jsonString: String, allowDuplicatedKeys: Boolean): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(jsonString.asInstanceOf[js.Any], allowDuplicatedKeys.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
