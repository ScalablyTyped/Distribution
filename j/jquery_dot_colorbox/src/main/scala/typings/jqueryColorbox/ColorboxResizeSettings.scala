package typings.jqueryColorbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorboxResizeSettings extends StObject {
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var innerHeight: js.UndefOr[Double | String] = js.undefined
  
  var innerWidth: js.UndefOr[Double | String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ColorboxResizeSettings {
  
  @scala.inline
  def apply(): ColorboxResizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorboxResizeSettings]
  }
  
  @scala.inline
  implicit class ColorboxResizeSettingsMutableBuilder[Self <: ColorboxResizeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInnerHeight(value: Double | String): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    @scala.inline
    def setInnerWidth(value: Double | String): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
