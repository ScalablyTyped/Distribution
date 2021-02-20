package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var traces: TracesResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(traces: TracesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(traces = traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTraces(value: TracesResource): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
  }
}
