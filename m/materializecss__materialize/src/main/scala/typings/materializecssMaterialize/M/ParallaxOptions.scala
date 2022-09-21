package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallaxOptions extends StObject {
  
  /**
    * The minimum width of the screen, in pixels, where the parallax functionality starts working
    * @default 0
    */
  var responsiveThreshold: Double
}
object ParallaxOptions {
  
  inline def apply(responsiveThreshold: Double): ParallaxOptions = {
    val __obj = js.Dynamic.literal(responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxOptions]
  }
  
  extension [Self <: ParallaxOptions](x: Self) {
    
    inline def setResponsiveThreshold(value: Double): Self = StObject.set(x, "responsiveThreshold", value.asInstanceOf[js.Any])
  }
}
