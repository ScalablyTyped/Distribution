package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The crop properties of an image.  The crop rectangle is represented using
  * fractional offsets from the original content&#39;s four edges.  - If the
  * offset is in the interval (0, 1), the corresponding edge of crop rectangle
  * is positioned inside of the image&#39;s original bounding rectangle. - If
  * the offset is negative or greater than 1, the corresponding edge of crop
  * rectangle is positioned outside of the image&#39;s original bounding
  * rectangle. - If all offsets and rotation angle are 0, the image is not
  * cropped.
  */
@js.native
trait SchemaCropProperties extends StObject {
  
  /**
    * The clockwise rotation angle of the crop rectangle around its center, in
    * radians. Rotation is applied after the offsets.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies how far inwards the bottom edge of the crop
    * rectangle is from the bottom edge of the original content as a fraction
    * of the original content&#39;s height.
    */
  var offsetBottom: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies how far inwards the left edge of the crop rectangle
    * is from the left edge of the original content as a fraction of the
    * original content&#39;s width.
    */
  var offsetLeft: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies how far inwards the right edge of the crop rectangle
    * is from the right edge of the original content as a fraction of the
    * original content&#39;s width.
    */
  var offsetRight: js.UndefOr[Double] = js.native
  
  /**
    * The offset specifies how far inwards the top edge of the crop rectangle
    * is from the top edge of the original content as a fraction of the
    * original content&#39;s height.
    */
  var offsetTop: js.UndefOr[Double] = js.native
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
    def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetRight(value: Double): Self = StObject.set(x, "offsetRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRightUndefined: Self = StObject.set(x, "offsetRight", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
  }
}
