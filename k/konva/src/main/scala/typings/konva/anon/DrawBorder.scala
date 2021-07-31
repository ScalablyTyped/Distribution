package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawBorder extends StObject {
  
  var drawBorder: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object DrawBorder {
  
  @scala.inline
  def apply(): DrawBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawBorder]
  }
  
  @scala.inline
  implicit class DrawBorderMutableBuilder[Self <: DrawBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawBorder(value: Boolean): Self = StObject.set(x, "drawBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBorderUndefined: Self = StObject.set(x, "drawBorder", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
