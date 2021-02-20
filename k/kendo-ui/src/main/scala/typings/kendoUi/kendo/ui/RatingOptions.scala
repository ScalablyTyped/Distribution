package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.continuous
import typings.kendoUi.kendoUiStrings.half
import typings.kendoUi.kendoUiStrings.item
import typings.kendoUi.kendoUiStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RatingOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ RatingChangeEvent, Unit]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var hoveredTemplate: js.UndefOr[String | js.Function] = js.native
  
  var itemTemplate: js.UndefOr[String | js.Function] = js.native
  
  var label: js.UndefOr[Boolean | RatingLabel] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var precision: String | item | half = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ RatingSelectEvent, Unit]] = js.native
  
  var selectValueOnFocus: js.UndefOr[Double] = js.native
  
  var selectedTemplate: js.UndefOr[String | js.Function] = js.native
  
  var selection: String | continuous | single = js.native
  
  var tooltip: js.UndefOr[Boolean] = js.native
}
object RatingOptions {
  
  @scala.inline
  def apply(precision: String | item | half, selection: String | continuous | single): RatingOptions = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingOptions]
  }
  
  @scala.inline
  implicit class RatingOptionsMutableBuilder[Self <: RatingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ RatingChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHoveredTemplate(value: String | js.Function): Self = StObject.set(x, "hoveredTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredTemplateUndefined: Self = StObject.set(x, "hoveredTemplate", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: String | js.Function): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean | RatingLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrecision(value: String | item | half): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ RatingSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectValueOnFocus(value: Double): Self = StObject.set(x, "selectValueOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectValueOnFocusUndefined: Self = StObject.set(x, "selectValueOnFocus", js.undefined)
    
    @scala.inline
    def setSelectedTemplate(value: String | js.Function): Self = StObject.set(x, "selectedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTemplateUndefined: Self = StObject.set(x, "selectedTemplate", js.undefined)
    
    @scala.inline
    def setSelection(value: String | continuous | single): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
