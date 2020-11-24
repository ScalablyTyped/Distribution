package typings.jqueryEditableSelect.JQueryEditableSelect

import typings.jqueryEditableSelect.JQuery
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.default
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.fade
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.fast
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.focus
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.manual
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.slide
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditableSelectOptions extends js.Object {
  
  /**
    * Where to append the dropdown list in the DOM.
    */
  var appendTo: js.UndefOr[String | JQuery] = js.native
  
  /**
    * Duration of the easings (in milliseconds).
    */
  var duration: js.UndefOr[Double | fast | slow] = js.native
  
  /**
    * Easing used for showing and hiding the dropdown list.
    */
  var effects: js.UndefOr[default | slide | fade] = js.native
  
  /**
    * Filter (or not) items in list while typing.
    */
  var filter: js.UndefOr[Boolean] = js.native
  
  /**
    * How dropdown list is triggered.
    */
  var trigger: js.UndefOr[focus | manual] = js.native
}
object EditableSelectOptions {
  
  @scala.inline
  def apply(): EditableSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditableSelectOptions]
  }
  
  @scala.inline
  implicit class EditableSelectOptionsOps[Self <: EditableSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setAppendTo(value: String | JQuery): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | fast | slow): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEffects(value: default | slide | fade): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setTrigger(value: focus | manual): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
}
