package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Autoscaler resource. Autoscalers allow you to automatically
  * scale virtual machine instances in managed instance groups according to an
  * autoscaling policy that you define. For more information, read Autoscaling
  * Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for
  * v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (==
  * resource_for v1.regionAutoscalers ==)
  */
trait SchemaAutoscaler extends StObject {
  
  /**
    * The configuration parameters for the autoscaling algorithm. You can
    * define one or more of the policies for an autoscaler: cpuUtilization,
    * customMetricUtilizations, and loadBalancingUtilization.  If none of these
    * are specified, the default will be to autoscale based on cpuUtilization
    * to 0.6 or 60%.
    */
  var autoscalingPolicy: js.UndefOr[SchemaAutoscalingPolicy] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#autoscaler for
    * autoscalers.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the region where the instance group resides (for
    * autoscalers living in regional scope).
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The status of the autoscaler configuration.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Human-readable details about the current state of the
    * autoscaler. Read the documentation for Commonly returned status messages
    * for examples of status messages you might encounter.
    */
  var statusDetails: js.UndefOr[js.Array[SchemaAutoscalerStatusDetails]] = js.undefined
  
  /**
    * URL of the managed instance group that this autoscaler will scale.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the zone where the instance group resides (for
    * autoscalers living in zonal scope).
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaAutoscaler {
  
  inline def apply(): SchemaAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscaler]
  }
  
  extension [Self <: SchemaAutoscaler](x: Self) {
    
    inline def setAutoscalingPolicy(value: SchemaAutoscalingPolicy): Self = StObject.set(x, "autoscalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingPolicyUndefined: Self = StObject.set(x, "autoscalingPolicy", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: js.Array[SchemaAutoscalerStatusDetails]): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "statusDetails", js.undefined)
    
    inline def setStatusDetailsVarargs(value: SchemaAutoscalerStatusDetails*): Self = StObject.set(x, "statusDetails", js.Array(value :_*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
