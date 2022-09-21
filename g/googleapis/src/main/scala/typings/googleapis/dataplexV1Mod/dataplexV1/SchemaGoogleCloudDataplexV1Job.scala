package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Job extends StObject {
  
  /**
    * Output only. The time when the job ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional information about the current state.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the job, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/tasks/{task_id\}/jobs/{job_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of times the job has been retried (excluding the initial attempt).
    */
  var retryCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The underlying service running a job.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The full resource name for the job run under a particular service.
    */
  var serviceJob: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the job was started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Execution state for the job.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. System generated globally unique ID for the job.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Job {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Job]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Job](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    
    inline def setRetryCountNull: Self = StObject.set(x, "retryCount", null)
    
    inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceJob(value: String): Self = StObject.set(x, "serviceJob", value.asInstanceOf[js.Any])
    
    inline def setServiceJobNull: Self = StObject.set(x, "serviceJob", null)
    
    inline def setServiceJobUndefined: Self = StObject.set(x, "serviceJob", js.undefined)
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
