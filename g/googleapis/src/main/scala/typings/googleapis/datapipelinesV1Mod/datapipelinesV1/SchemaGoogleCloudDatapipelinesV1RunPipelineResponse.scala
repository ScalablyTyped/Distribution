package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1RunPipelineResponse extends StObject {
  
  /**
    * Job that was created as part of RunPipeline operation.
    */
  var job: js.UndefOr[SchemaGoogleCloudDatapipelinesV1Job] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1RunPipelineResponse {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1RunPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1RunPipelineResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1RunPipelineResponse](x: Self) {
    
    inline def setJob(value: SchemaGoogleCloudDatapipelinesV1Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
