package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthStatus extends StObject {
  
  /** Metadata defined as annotations for network endpoint. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.HealthStatus & TopLevel[js.Any]
  ] = js.undefined
  
  /** Health state of the instance. */
  var healthState: js.UndefOr[String] = js.undefined
  
  /** URL of the instance resource. */
  var instance: js.UndefOr[String] = js.undefined
  
  /** A forwarding rule IP address assigned to this instance. */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /** The named port of the instance group, not necessarily the port that is health-checked. */
  var port: js.UndefOr[Double] = js.undefined
}
object HealthStatus {
  
  @scala.inline
  def apply(): HealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthStatus]
  }
  
  @scala.inline
  implicit class HealthStatusMutableBuilder[Self <: HealthStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.HealthStatus & TopLevel[js.Any]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
