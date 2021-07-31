package typings.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KikGetFromCameraOptions extends StObject {
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
}
object KikGetFromCameraOptions {
  
  @scala.inline
  def apply(): KikGetFromCameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikGetFromCameraOptions]
  }
  
  @scala.inline
  implicit class KikGetFromCameraOptionsMutableBuilder[Self <: KikGetFromCameraOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
