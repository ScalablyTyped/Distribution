package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.continuous
import typings.kendoUi.kendoUiStrings.half
import typings.kendoUi.kendoUiStrings.item
import typings.kendoUi.kendoUiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RatingOptions extends js.Object {
  
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
  implicit class RatingOptionsOps[Self <: RatingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrecision(value: String | item | half): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: String | continuous | single): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: /* e */ RatingChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHoveredTemplate(value: String | js.Function): Self = this.set("hoveredTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoveredTemplate: Self = this.set("hoveredTemplate", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: String | js.Function): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean | RatingLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ RatingSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectValueOnFocus(value: Double): Self = this.set("selectValueOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectValueOnFocus: Self = this.set("selectValueOnFocus", js.undefined)
    
    @scala.inline
    def setSelectedTemplate(value: String | js.Function): Self = this.set("selectedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedTemplate: Self = this.set("selectedTemplate", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
