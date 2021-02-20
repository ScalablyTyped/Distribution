package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The crop properties of an object enclosed in a container. For example, an
  * Image.  The crop properties is represented by the offsets of four edges
  * which define a crop rectangle. The offsets are measured in percentage from
  * the corresponding edges of the object&#39;s original bounding rectangle
  * towards inside, relative to the object&#39;s original dimensions.  - If the
  * offset is in the interval (0, 1), the corresponding edge of crop rectangle
  * is positioned inside of the object&#39;s original bounding rectangle. - If
  * the offset is negative or greater than 1, the corresponding edge of crop
  * rectangle is positioned outside of the object&#39;s original bounding
  * rectangle. - If the left edge of the crop rectangle is on the right side of
  * its right edge, the object will be flipped horizontally. - If the top edge
  * of the crop rectangle is below its bottom edge, the object will be flipped
  * vertically. - If all offsets and rotation angle is 0, the object is not
  * cropped.  After cropping, the content in the crop rectangle will be
  * stretched to fit its container.
  */
@js.native
trait SchemaCropProperties extends StObject {
  
  /**
    * The rotation angle of the crop window around its center, in radians.
    * Rotation angle is applied after the offset.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies the bottom edge of the crop rectangle that is
    * located above the original bounding rectangle bottom edge, relative to
    * the object&#39;s original height.
    */
  var bottomOffset: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies the left edge of the crop rectangle that is located
    * to the right of the original bounding rectangle left edge, relative to
    * the object&#39;s original width.
    */
  var leftOffset: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies the right edge of the crop rectangle that is located
    * to the left of the original bounding rectangle right edge, relative to
    * the object&#39;s original width.
    */
  var rightOffset: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies the top edge of the crop rectangle that is located
    * below the original bounding rectangle top edge, relative to the
    * object&#39;s original height.
    */
  var topOffset: js.UndefOr[Double] = js.native
}
object SchemaCropProperties {
  
  @scala.inline
  def apply(): SchemaCropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropProperties]
  }
  
  @scala.inline
  implicit class SchemaCropPropertiesMutableBuilder[Self <: SchemaCropProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
    
    @scala.inline
    def setLeftOffset(value: Double): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
    
    @scala.inline
    def setRightOffset(value: Double): Self = StObject.set(x, "rightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightOffsetUndefined: Self = StObject.set(x, "rightOffset", js.undefined)
    
    @scala.inline
    def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
  }
}
