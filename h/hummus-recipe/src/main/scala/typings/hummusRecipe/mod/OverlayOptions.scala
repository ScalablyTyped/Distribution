package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayOptions extends StObject {
  
  var fitHeight: js.UndefOr[Boolean] = js.undefined
  
  var fitWidth: js.UndefOr[Boolean] = js.undefined
  
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object OverlayOptions {
  
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsMutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFitHeight(value: Boolean): Self = StObject.set(x, "fitHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitHeightUndefined: Self = StObject.set(x, "fitHeight", js.undefined)
    
    @scala.inline
    def setFitWidth(value: Boolean): Self = StObject.set(x, "fitWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitWidthUndefined: Self = StObject.set(x, "fitWidth", js.undefined)
    
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
