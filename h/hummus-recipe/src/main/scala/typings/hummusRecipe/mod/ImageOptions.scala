package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOptions extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ImageOptions {
  
  @scala.inline
  def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  
  @scala.inline
  implicit class ImageOptionsMutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
