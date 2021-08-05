package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  /** Container image path set for flex Template. */
  var containerSpec: js.UndefOr[ContainerSpec] = js.undefined
  
  /** job_graph_gcs_path set for legacy Template. */
  var jobGraphGcsPath: js.UndefOr[String] = js.undefined
  
  /** Metadata set for legacy Template. */
  var metadata: js.UndefOr[TemplateMetadata] = js.undefined
}
object Artifact {
  
  inline def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  extension [Self <: Artifact](x: Self) {
    
    inline def setContainerSpec(value: ContainerSpec): Self = StObject.set(x, "containerSpec", value.asInstanceOf[js.Any])
    
    inline def setContainerSpecUndefined: Self = StObject.set(x, "containerSpec", js.undefined)
    
    inline def setJobGraphGcsPath(value: String): Self = StObject.set(x, "jobGraphGcsPath", value.asInstanceOf[js.Any])
    
    inline def setJobGraphGcsPathUndefined: Self = StObject.set(x, "jobGraphGcsPath", js.undefined)
    
    inline def setMetadata(value: TemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
