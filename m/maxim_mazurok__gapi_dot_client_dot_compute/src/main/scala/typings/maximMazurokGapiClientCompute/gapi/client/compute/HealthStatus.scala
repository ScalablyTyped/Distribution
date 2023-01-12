package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthStatus extends StObject {
  
  /** Metadata defined as annotations for network endpoint. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** URL of the forwarding rule associated with the health status of the instance. */
  var forwardingRule: js.UndefOr[String] = js.undefined
  
  /** A forwarding rule IP address assigned to this instance. */
  var forwardingRuleIp: js.UndefOr[String] = js.undefined
  
  /** Health state of the instance. */
  var healthState: js.UndefOr[String] = js.undefined
  
  /** URL of the instance resource. */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * For target pool based Network Load Balancing, it indicates the forwarding rule's IP address assigned to this instance. For other types of load balancing, the field indicates VM
    * internal ip.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /** The named port of the instance group, not necessarily the port that is health-checked. */
  var port: js.UndefOr[Double] = js.undefined
  
  var weight: js.UndefOr[String] = js.undefined
  
  var weightError: js.UndefOr[String] = js.undefined
}
object HealthStatus {
  
  inline def apply(): HealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthStatus] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setForwardingRule(value: String): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleIp(value: String): Self = StObject.set(x, "forwardingRuleIp", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleIpUndefined: Self = StObject.set(x, "forwardingRuleIp", js.undefined)
    
    inline def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
    
    inline def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    inline def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightError(value: String): Self = StObject.set(x, "weightError", value.asInstanceOf[js.Any])
    
    inline def setWeightErrorUndefined: Self = StObject.set(x, "weightError", js.undefined)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
