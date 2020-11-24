package typings.kendoUi.kendo.stepper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepOptions extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var iconTemplate: js.UndefOr[String | js.Function] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var indicatorVisible: js.UndefOr[Boolean] = js.native
  
  var isFirstStep: js.UndefOr[Boolean] = js.native
  
  var isLastStep: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelVisible: js.UndefOr[Boolean] = js.native
  
  var previous: js.UndefOr[Boolean] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var successIcon: js.UndefOr[String] = js.native
}
object StepOptions {
  
  @scala.inline
  def apply(): StepOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptions]
  }
  
  @scala.inline
  implicit class StepOptionsOps[Self <: StepOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconTemplate(value: String | js.Function): Self = this.set("iconTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconTemplate: Self = this.set("iconTemplate", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIndicatorVisible(value: Boolean): Self = this.set("indicatorVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorVisible: Self = this.set("indicatorVisible", js.undefined)
    
    @scala.inline
    def setIsFirstStep(value: Boolean): Self = this.set("isFirstStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFirstStep: Self = this.set("isFirstStep", js.undefined)
    
    @scala.inline
    def setIsLastStep(value: Boolean): Self = this.set("isLastStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLastStep: Self = this.set("isLastStep", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelVisible(value: Boolean): Self = this.set("labelVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelVisible: Self = this.set("labelVisible", js.undefined)
    
    @scala.inline
    def setPrevious(value: Boolean): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSuccessIcon(value: String): Self = this.set("successIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessIcon: Self = this.set("successIcon", js.undefined)
  }
}
