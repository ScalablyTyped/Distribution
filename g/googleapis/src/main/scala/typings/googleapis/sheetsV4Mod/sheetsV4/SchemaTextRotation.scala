package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rotation applied to text in a cell.
  */
trait SchemaTextRotation extends StObject {
  
  /**
    * The angle between the standard orientation and the desired orientation.
    * Measured in degrees. Valid values are between -90 and 90. Positive angles
    * are angled upwards, negative are angled downwards.  Note: For LTR text
    * direction positive angles are in the counterclockwise direction, whereas
    * for RTL they are in the clockwise direction
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, text reads top to bottom, but the orientation of individual
    * characters is unchanged. For example:      | V |     | e |     | r | | t
    * |     | i |     | c |     | a |     | l |
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object SchemaTextRotation {
  
  @scala.inline
  def apply(): SchemaTextRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextRotation]
  }
  
  @scala.inline
  implicit class SchemaTextRotationMutableBuilder[Self <: SchemaTextRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
