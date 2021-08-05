package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.continuous
import typings.kendoUi.kendoUiStrings.half
import typings.kendoUi.kendoUiStrings.item
import typings.kendoUi.kendoUiStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RatingOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ RatingChangeEvent, Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var hoveredTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var itemTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var label: js.UndefOr[Boolean | RatingLabel] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var precision: String | item | half
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ RatingSelectEvent, Unit]] = js.undefined
  
  var selectValueOnFocus: js.UndefOr[Double] = js.undefined
  
  var selectedTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var selection: String | continuous | single
  
  var tooltip: js.UndefOr[Boolean] = js.undefined
}
object RatingOptions {
  
  inline def apply(precision: String | item | half, selection: String | continuous | single): RatingOptions = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingOptions]
  }
  
  extension [Self <: RatingOptions](x: Self) {
    
    inline def setChange(value: /* e */ RatingChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHoveredTemplate(value: String | js.Function): Self = StObject.set(x, "hoveredTemplate", value.asInstanceOf[js.Any])
    
    inline def setHoveredTemplateUndefined: Self = StObject.set(x, "hoveredTemplate", js.undefined)
    
    inline def setItemTemplate(value: String | js.Function): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    inline def setLabel(value: Boolean | RatingLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrecision(value: String | item | half): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setSelect(value: /* e */ RatingSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectValueOnFocus(value: Double): Self = StObject.set(x, "selectValueOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectValueOnFocusUndefined: Self = StObject.set(x, "selectValueOnFocus", js.undefined)
    
    inline def setSelectedTemplate(value: String | js.Function): Self = StObject.set(x, "selectedTemplate", value.asInstanceOf[js.Any])
    
    inline def setSelectedTemplateUndefined: Self = StObject.set(x, "selectedTemplate", js.undefined)
    
    inline def setSelection(value: String | continuous | single): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
