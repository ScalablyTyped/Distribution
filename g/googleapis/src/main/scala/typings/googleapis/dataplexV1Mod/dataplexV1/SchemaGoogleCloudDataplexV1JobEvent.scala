package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1JobEvent extends StObject {
  
  /**
    * The time when the job ended running.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique id identifying the job.
    */
  var jobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The log message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of retries.
    */
  var retries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The service used to execute the job.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reference to the job within the service.
    */
  var serviceJob: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the job started running.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The job state on completion.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the job.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1JobEvent {
  
  inline def apply(): SchemaGoogleCloudDataplexV1JobEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1JobEvent]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1JobEvent](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesNull: Self = StObject.set(x, "retries", null)
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
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
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
