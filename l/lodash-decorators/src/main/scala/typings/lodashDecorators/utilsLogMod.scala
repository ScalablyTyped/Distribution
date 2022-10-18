package typings.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsLogMod {
  
  @JSImport("lodash-decorators/utils/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def log(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[String]
  inline def log(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[String]
}
