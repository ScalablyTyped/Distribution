package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
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
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: NotesResource): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrences(value: OccurrencesResource): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanConfigs(value: ScanConfigsResource): Self = StObject.set(x, "scanConfigs", value.asInstanceOf[js.Any])
  }
}
