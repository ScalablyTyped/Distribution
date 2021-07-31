package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerHealthReport extends StObject {
  
  /** A message describing any unusual health reports. */
  var msg: js.UndefOr[String] = js.undefined
  
  /**
    * The pods running on the worker. See: http://kubernetes.io/v1.1/docs/api-reference/v1/definitions.html#_v1_pod This field is used by the worker to send the status of the indvidual
    * containers running on each worker.
    */
  var pods: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerHealthReport & TopLevel[js.Any]
    ]
  ] = js.undefined
  
  /** The interval at which the worker is sending health reports. The default value of 0 should be interpreted as the field is not being explicitly set by the worker. */
  var reportInterval: js.UndefOr[String] = js.undefined
  
  /** Whether the VM is in a permanently broken state. Broken VMs should be abandoned or deleted ASAP to avoid assigning or completing any work. */
  var vmIsBroken: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the VM is currently healthy. */
  var vmIsHealthy: js.UndefOr[Boolean] = js.undefined
  
  /** The time the VM was booted. */
  var vmStartupTime: js.UndefOr[String] = js.undefined
}
object WorkerHealthReport {
  
  @scala.inline
  def apply(): WorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerHealthReport]
  }
  
  @scala.inline
  implicit class WorkerHealthReportMutableBuilder[Self <: WorkerHealthReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    @scala.inline
    def setPods(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerHealthReport & TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
    
    @scala.inline
    def setPodsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerHealthReport & TopLevel[js.Any])*
    ): Self = StObject.set(x, "pods", js.Array(value :_*))
    
    @scala.inline
    def setReportInterval(value: String): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIntervalUndefined: Self = StObject.set(x, "reportInterval", js.undefined)
    
    @scala.inline
    def setVmIsBroken(value: Boolean): Self = StObject.set(x, "vmIsBroken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIsBrokenUndefined: Self = StObject.set(x, "vmIsBroken", js.undefined)
    
    @scala.inline
    def setVmIsHealthy(value: Boolean): Self = StObject.set(x, "vmIsHealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIsHealthyUndefined: Self = StObject.set(x, "vmIsHealthy", js.undefined)
    
    @scala.inline
    def setVmStartupTime(value: String): Self = StObject.set(x, "vmStartupTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmStartupTimeUndefined: Self = StObject.set(x, "vmStartupTime", js.undefined)
  }
}
