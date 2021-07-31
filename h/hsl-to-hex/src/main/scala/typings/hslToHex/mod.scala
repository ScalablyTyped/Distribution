package typings.hslToHex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(hue: Double, saturation: Double, luminosity: Double): String = (^.asInstanceOf[js.Dynamic].apply(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], luminosity.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("hsl-to-hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
