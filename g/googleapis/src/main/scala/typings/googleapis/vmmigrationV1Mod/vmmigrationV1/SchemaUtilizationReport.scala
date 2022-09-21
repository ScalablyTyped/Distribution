package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUtilizationReport extends StObject {
  
  /**
    * Output only. The time the report was created (this refers to the time of the request, not the time the report creation completed).
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The report display name, as assigned by the user.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provides details on the state of the report in case of an error.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The point in time when the time frame ends. Notice that the time frame is counted backwards. For instance if the "frame_end_time" value is 2021/01/20 and the time frame is WEEK then the report covers the week between 2021/01/20 and 2021/01/14.
    */
  var frameEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The report unique name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the report.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the state was last set.
    */
  var stateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time frame of the report.
    */
  var timeFrame: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Total number of VMs included in the report.
    */
  var vmCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * List of utilization information per VM. When sent as part of the request, the "vm_id" field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
    */
  var vms: js.UndefOr[js.Array[SchemaVmUtilizationInfo]] = js.undefined
}
object SchemaUtilizationReport {
  
  inline def apply(): SchemaUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUtilizationReport]
  }
  
  extension [Self <: SchemaUtilizationReport](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFrameEndTime(value: String): Self = StObject.set(x, "frameEndTime", value.asInstanceOf[js.Any])
    
    inline def setFrameEndTimeNull: Self = StObject.set(x, "frameEndTime", null)
    
    inline def setFrameEndTimeUndefined: Self = StObject.set(x, "frameEndTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateTime(value: String): Self = StObject.set(x, "stateTime", value.asInstanceOf[js.Any])
    
    inline def setStateTimeNull: Self = StObject.set(x, "stateTime", null)
    
    inline def setStateTimeUndefined: Self = StObject.set(x, "stateTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTimeFrame(value: String): Self = StObject.set(x, "timeFrame", value.asInstanceOf[js.Any])
    
    inline def setTimeFrameNull: Self = StObject.set(x, "timeFrame", null)
    
    inline def setTimeFrameUndefined: Self = StObject.set(x, "timeFrame", js.undefined)
    
    inline def setVmCount(value: Double): Self = StObject.set(x, "vmCount", value.asInstanceOf[js.Any])
    
    inline def setVmCountNull: Self = StObject.set(x, "vmCount", null)
    
    inline def setVmCountUndefined: Self = StObject.set(x, "vmCount", js.undefined)
    
    inline def setVms(value: js.Array[SchemaVmUtilizationInfo]): Self = StObject.set(x, "vms", value.asInstanceOf[js.Any])
    
    inline def setVmsUndefined: Self = StObject.set(x, "vms", js.undefined)
    
    inline def setVmsVarargs(value: SchemaVmUtilizationInfo*): Self = StObject.set(x, "vms", js.Array(value*))
  }
}
