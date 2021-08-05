package typings.lowerCase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lower-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def localeLowerCase(str: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localeLowerCase")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def lowerCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
