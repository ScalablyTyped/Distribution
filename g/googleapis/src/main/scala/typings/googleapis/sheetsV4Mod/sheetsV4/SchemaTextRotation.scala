package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextRotation extends StObject {
  
  /**
    * The angle between the standard orientation and the desired orientation. Measured in degrees. Valid values are between -90 and 90. Positive angles are angled upwards, negative are angled downwards. Note: For LTR text direction positive angles are in the counterclockwise direction, whereas for RTL they are in the clockwise direction
    */
  var angle: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If true, text reads top to bottom, but the orientation of individual characters is unchanged. For example: | V | | e | | r | | t | | i | | c | | a | | l |
    */
  var vertical: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTextRotation {
  
  inline def apply(): SchemaTextRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextRotation]
  }
  
  extension [Self <: SchemaTextRotation](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleNull: Self = StObject.set(x, "angle", null)
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalNull: Self = StObject.set(x, "vertical", null)
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
