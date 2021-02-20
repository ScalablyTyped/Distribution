package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSliderTooltip extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
}
object RangeSliderTooltip {
  
  @scala.inline
  def apply(): RangeSliderTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSliderTooltip]
  }
  
  @scala.inline
  implicit class RangeSliderTooltipMutableBuilder[Self <: RangeSliderTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
