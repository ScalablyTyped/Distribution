package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var traces: TracesResource
}
object ProjectsResource {
  
  inline def apply(traces: TracesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(traces = traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setTraces(value: TracesResource): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
  }
}
