package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1Job extends StObject {
  
  /**
    * Output only. The time of job creation.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All the details that are specific to a Dataflow job.
    */
  var dataflowJobDetails: js.UndefOr[SchemaGoogleCloudDatapipelinesV1DataflowJobDetails] = js.undefined
  
  /**
    * Output only. The time of job termination. This is absent if the job is still running.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The internal ID for the job.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The fully qualified resource name for the job.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current state of the job.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status capturing any error code or message related to job creation or execution.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1Job {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1Job]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1Job](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataflowJobDetails(value: SchemaGoogleCloudDatapipelinesV1DataflowJobDetails): Self = StObject.set(x, "dataflowJobDetails", value.asInstanceOf[js.Any])
    
    inline def setDataflowJobDetailsUndefined: Self = StObject.set(x, "dataflowJobDetails", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
