package typings.hexRgba

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(hex: String): String = ^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(hex: String, opacity: Double): String = (^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("hex-rgba", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
