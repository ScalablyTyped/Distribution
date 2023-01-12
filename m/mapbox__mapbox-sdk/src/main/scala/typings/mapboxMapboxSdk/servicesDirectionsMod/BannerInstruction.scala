package typings.mapboxMapboxSdk.servicesDirectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerInstruction extends StObject {
  
  /**
    * Float indicating in meters, how far from the upcoming maneuver
    * the banner instruction should begin being displayed. Only 1 banner should be displayed at a time.
    */
  var distanceAlongGeometry: Double
  
  /**
    * Most important content to display to the user. Our SDK displays this text larger and at the top.
    */
  var primary: Instruction
  
  /**
    * Additional content useful for visual guidance. Our SDK displays this text slightly smaller and below the primary. Can be null.
    */
  var secondary: js.UndefOr[js.Array[Instruction]] = js.undefined
  
  /**
    * Additional information that is included if we feel the driver needs a heads up about something.
    * Can include information about the next maneuver (the one after the upcoming one) if the step is short -
    * can be null, or can be lane information. If we have lane information, that trumps information about the next maneuver.
    */
  var sub: js.UndefOr[Sub] = js.undefined
  
  var `then`: js.UndefOr[Any] = js.undefined
}
object BannerInstruction {
  
  inline def apply(distanceAlongGeometry: Double, primary: Instruction): BannerInstruction = {
    val __obj = js.Dynamic.literal(distanceAlongGeometry = distanceAlongGeometry.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerInstruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BannerInstruction] (val x: Self) extends AnyVal {
    
    inline def setDistanceAlongGeometry(value: Double): Self = StObject.set(x, "distanceAlongGeometry", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: Instruction): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: js.Array[Instruction]): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setSecondaryVarargs(value: Instruction*): Self = StObject.set(x, "secondary", js.Array(value*))
    
    inline def setSub(value: Sub): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    
    inline def setThen(value: Any): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
