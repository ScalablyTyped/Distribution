package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttMessagesEditor extends js.Object {
  
  var assignButton: js.UndefOr[String] = js.native
  
  var editorTitle: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var percentComplete: js.UndefOr[String] = js.native
  
  var plannedEnd: js.UndefOr[String] = js.native
  
  var plannedStart: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[String] = js.native
  
  var resourcesEditorTitle: js.UndefOr[String] = js.native
  
  var resourcesHeader: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var unitsHeader: js.UndefOr[String] = js.native
}
object GanttMessagesEditor {
  
  @scala.inline
  def apply(): GanttMessagesEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesEditor]
  }
  
  @scala.inline
  implicit class GanttMessagesEditorOps[Self <: GanttMessagesEditor] (val x: Self) extends AnyVal {
    
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
    def setAssignButton(value: String): Self = this.set("assignButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignButton: Self = this.set("assignButton", js.undefined)
    
    @scala.inline
    def setEditorTitle(value: String): Self = this.set("editorTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorTitle: Self = this.set("editorTitle", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: String): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    
    @scala.inline
    def setPlannedEnd(value: String): Self = this.set("plannedEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlannedEnd: Self = this.set("plannedEnd", js.undefined)
    
    @scala.inline
    def setPlannedStart(value: String): Self = this.set("plannedStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlannedStart: Self = this.set("plannedStart", js.undefined)
    
    @scala.inline
    def setResources(value: String): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setResourcesEditorTitle(value: String): Self = this.set("resourcesEditorTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesEditorTitle: Self = this.set("resourcesEditorTitle", js.undefined)
    
    @scala.inline
    def setResourcesHeader(value: String): Self = this.set("resourcesHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesHeader: Self = this.set("resourcesHeader", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUnitsHeader(value: String): Self = this.set("unitsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitsHeader: Self = this.set("unitsHeader", js.undefined)
  }
}
