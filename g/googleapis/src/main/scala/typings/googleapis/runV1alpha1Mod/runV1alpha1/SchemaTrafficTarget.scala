package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TrafficTarget holds a single entry of the routing table for a Route.
  */
trait SchemaTrafficTarget extends StObject {
  
  /**
    * ConfigurationName of a configuration to whose latest revision we will
    * send this portion of traffic. When the
    * &quot;status.latestReadyRevisionName&quot; of the referenced
    * configuration changes, we will automatically migrate traffic from the
    * prior &quot;latest ready&quot; revision to the new one. This field is
    * never set in Route&#39;s status, only its spec. This is mutually
    * exclusive with RevisionName.  Cloud Run currently supports a single
    * ConfigurationName.
    */
  var configurationName: js.UndefOr[String] = js.undefined
  
  /**
    * Name is optionally used to expose a dedicated hostname for referencing
    * this target exclusively.  Not currently supported by Cloud Run. +optional
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Percent specifies percent of the traffic to this Revision or
    * Configuration. This defaults to zero if unspecified.  Cloud Run currently
    * requires 100 percent for a single ConfigurationName TrafficTarget entry.
    */
  var percent: js.UndefOr[Double] = js.undefined
  
  /**
    * RevisionName of a specific revision to which to send this portion of
    * traffic. This is mutually exclusive with ConfigurationName.  Providing
    * RevisionName in spec is not currently supported by Cloud Run.
    */
  var revisionName: js.UndefOr[String] = js.undefined
}
object SchemaTrafficTarget {
  
  inline def apply(): SchemaTrafficTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficTarget]
  }
  
  extension [Self <: SchemaTrafficTarget](x: Self) {
    
    inline def setConfigurationName(value: String): Self = StObject.set(x, "configurationName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNameUndefined: Self = StObject.set(x, "configurationName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setRevisionName(value: String): Self = StObject.set(x, "revisionName", value.asInstanceOf[js.Any])
    
    inline def setRevisionNameUndefined: Self = StObject.set(x, "revisionName", js.undefined)
  }
}
