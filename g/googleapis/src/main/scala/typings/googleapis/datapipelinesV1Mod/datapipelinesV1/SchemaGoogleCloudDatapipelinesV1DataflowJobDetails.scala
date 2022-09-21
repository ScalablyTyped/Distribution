package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1DataflowJobDetails extends StObject {
  
  /**
    * Output only. The current number of workers used to run the jobs. Only set to a value if the job is still running.
    */
  var currentWorkers: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Cached version of all the metrics of interest for the job. This value gets stored here when the job is terminated. As long as the job is running, this field is populated from the Dataflow API.
    */
  var resourceInfo: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  
  /**
    * Output only. The SDK version used to run the job.
    */
  var sdkVersion: js.UndefOr[SchemaGoogleCloudDatapipelinesV1SdkVersion] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1DataflowJobDetails {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1DataflowJobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1DataflowJobDetails]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1DataflowJobDetails](x: Self) {
    
    inline def setCurrentWorkers(value: Double): Self = StObject.set(x, "currentWorkers", value.asInstanceOf[js.Any])
    
    inline def setCurrentWorkersNull: Self = StObject.set(x, "currentWorkers", null)
    
    inline def setCurrentWorkersUndefined: Self = StObject.set(x, "currentWorkers", js.undefined)
    
    inline def setResourceInfo(value: StringDictionary[Double]): Self = StObject.set(x, "resourceInfo", value.asInstanceOf[js.Any])
    
    inline def setResourceInfoNull: Self = StObject.set(x, "resourceInfo", null)
    
    inline def setResourceInfoUndefined: Self = StObject.set(x, "resourceInfo", js.undefined)
    
    inline def setSdkVersion(value: SchemaGoogleCloudDatapipelinesV1SdkVersion): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
