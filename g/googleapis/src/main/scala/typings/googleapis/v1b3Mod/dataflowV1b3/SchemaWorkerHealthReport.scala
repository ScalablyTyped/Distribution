package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerHealthReport extends StObject {
  
  /**
    * Message describing any unusual health reports.
    */
  var msg: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The pods running on the worker. See: http://kubernetes.io/v1.1/docs/api-reference/v1/definitions.html#_v1_pod This field is used by the worker to send the status of the indvidual containers running on each worker.
    */
  var pods: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  
  /**
    * The interval at which the worker is sending health reports. The default value of 0 should be interpreted as the field is not being explicitly set by the worker.
    */
  var reportInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Code to describe a specific reason, if known, that a VM has reported broken state.
    */
  var vmBrokenCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the VM is in a permanently broken state. Broken VMs should be abandoned or deleted ASAP to avoid assigning or completing any work.
    */
  var vmIsBroken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the VM is currently healthy.
    */
  var vmIsHealthy: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The time the VM was booted.
    */
  var vmStartupTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerHealthReport {
  
  inline def apply(): SchemaWorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerHealthReport]
  }
  
  extension [Self <: SchemaWorkerHealthReport](x: Self) {
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setMsgNull: Self = StObject.set(x, "msg", null)
    
    inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    inline def setPods(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    inline def setPodsNull: Self = StObject.set(x, "pods", null)
    
    inline def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
    
    inline def setPodsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "pods", js.Array(value*))
    
    inline def setReportInterval(value: String): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
    
    inline def setReportIntervalNull: Self = StObject.set(x, "reportInterval", null)
    
    inline def setReportIntervalUndefined: Self = StObject.set(x, "reportInterval", js.undefined)
    
    inline def setVmBrokenCode(value: String): Self = StObject.set(x, "vmBrokenCode", value.asInstanceOf[js.Any])
    
    inline def setVmBrokenCodeNull: Self = StObject.set(x, "vmBrokenCode", null)
    
    inline def setVmBrokenCodeUndefined: Self = StObject.set(x, "vmBrokenCode", js.undefined)
    
    inline def setVmIsBroken(value: Boolean): Self = StObject.set(x, "vmIsBroken", value.asInstanceOf[js.Any])
    
    inline def setVmIsBrokenNull: Self = StObject.set(x, "vmIsBroken", null)
    
    inline def setVmIsBrokenUndefined: Self = StObject.set(x, "vmIsBroken", js.undefined)
    
    inline def setVmIsHealthy(value: Boolean): Self = StObject.set(x, "vmIsHealthy", value.asInstanceOf[js.Any])
    
    inline def setVmIsHealthyNull: Self = StObject.set(x, "vmIsHealthy", null)
    
    inline def setVmIsHealthyUndefined: Self = StObject.set(x, "vmIsHealthy", js.undefined)
    
    inline def setVmStartupTime(value: String): Self = StObject.set(x, "vmStartupTime", value.asInstanceOf[js.Any])
    
    inline def setVmStartupTimeNull: Self = StObject.set(x, "vmStartupTime", null)
    
    inline def setVmStartupTimeUndefined: Self = StObject.set(x, "vmStartupTime", js.undefined)
  }
}
