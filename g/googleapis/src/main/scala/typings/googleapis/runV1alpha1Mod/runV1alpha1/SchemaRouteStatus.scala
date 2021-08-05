package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RouteStatus communicates the observed state of the Route (from the
  * controller).
  */
trait SchemaRouteStatus extends StObject {
  
  /**
    * Similar to domain, information on where the service is available on HTTP.
    */
  var address: js.UndefOr[SchemaAddressable] = js.undefined
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaRouteCondition]] = js.undefined
  
  /**
    * Domain holds the top-level domain that will distribute traffic over the
    * provided targets. It generally has the form
    * https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * For Cloud Run, identifical to domain.
    */
  var domainInternal: js.UndefOr[String] = js.undefined
  
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Route that was last
    * processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.  Note that
    * providing a trafficTarget that only has a configurationName will result
    * in a Route that does not increment either its metadata.generation or its
    * observedGeneration, as new &quot;latest ready&quot; revisions from the
    * Configuration are processed without an update to the Route&#39;s spec.
    */
  var observedGeneration: js.UndefOr[Double] = js.undefined
  
  /**
    * Traffic holds the configured traffic distribution. These entries will
    * always contain RevisionName references. When ConfigurationName appears in
    * the spec, this will hold the LatestReadyRevisionName that we last
    * observed.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.undefined
}
object SchemaRouteStatus {
  
  inline def apply(): SchemaRouteStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteStatus]
  }
  
  extension [Self <: SchemaRouteStatus](x: Self) {
    
    inline def setAddress(value: SchemaAddressable): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaRouteCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaRouteCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainInternal(value: String): Self = StObject.set(x, "domainInternal", value.asInstanceOf[js.Any])
    
    inline def setDomainInternalUndefined: Self = StObject.set(x, "domainInternal", js.undefined)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    inline def setTrafficVarargs(value: SchemaTrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value :_*))
  }
}
