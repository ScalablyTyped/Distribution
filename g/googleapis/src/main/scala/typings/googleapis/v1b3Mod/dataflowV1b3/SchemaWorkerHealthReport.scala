package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkerHealthReport contains information about the health of a worker.  The
  * VM should be identified by the labels attached to the WorkerMessage that
  * this health ping belongs to.
  */
trait SchemaWorkerHealthReport extends StObject {
  
  /**
    * The pods running on the worker. See:
    * http://kubernetes.io/v1.1/docs/api-reference/v1/definitions.html#_v1_pod
    * This field is used by the worker to send the status of the indvidual
    * containers running on each worker.
    */
  var pods: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
  
  /**
    * The interval at which the worker is sending health reports. The default
    * value of 0 should be interpreted as the field is not being explicitly set
    * by the worker.
    */
  var reportInterval: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the VM is healthy.
    */
  var vmIsHealthy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time the VM was booted.
    */
  var vmStartupTime: js.UndefOr[String] = js.undefined
}
object SchemaWorkerHealthReport {
  
  @scala.inline
  def apply(): SchemaWorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerHealthReport]
  }
  
  @scala.inline
  implicit class SchemaWorkerHealthReportMutableBuilder[Self <: SchemaWorkerHealthReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPods(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
    
    @scala.inline
    def setPodsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "pods", js.Array(value :_*))
    
    @scala.inline
    def setReportInterval(value: String): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIntervalUndefined: Self = StObject.set(x, "reportInterval", js.undefined)
    
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
