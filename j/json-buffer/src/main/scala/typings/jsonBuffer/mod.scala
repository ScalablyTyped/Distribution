package typings.jsonBuffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(s: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def stringify(o: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[String]
}
