package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var notes: NotesResource = js.native
  
  var occurrences: OccurrencesResource = js.native
  
  var scanConfigs: ScanConfigsResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(notes: NotesResource, occurrences: OccurrencesResource, scanConfigs: ScanConfigsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any], occurrences = occurrences.asInstanceOf[js.Any], scanConfigs = scanConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
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
    def setNotes(value: NotesResource): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrences(value: OccurrencesResource): Self = this.set("occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanConfigs(value: ScanConfigsResource): Self = this.set("scanConfigs", value.asInstanceOf[js.Any])
  }
}
