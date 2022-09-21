package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceStatus extends StObject {
  
  /**
    * From RouteStatus. Similar to url, information on where the service is available on HTTP.
    */
  var address: js.UndefOr[SchemaAddressable] = js.undefined
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. Service-specific conditions include: * "ConfigurationsReady": true when the underlying Configuration is ready. * "RoutesReady": true when the underlying Route is ready. * "Ready": true when both the underlying Route and Configuration are ready.
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service's Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service's Configuration that has had its "Ready" condition become "True".
    */
  var latestReadyRevisionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.undefined
  
  /**
    * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form https://{route-hash\}-{project-hash\}-{cluster-level-suffix\}.a.run.app
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceStatus {
  
  inline def apply(): SchemaServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceStatus]
  }
  
  extension [Self <: SchemaServiceStatus](x: Self) {
    
    inline def setAddress(value: SchemaAddressable): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setLatestCreatedRevisionName(value: String): Self = StObject.set(x, "latestCreatedRevisionName", value.asInstanceOf[js.Any])
    
    inline def setLatestCreatedRevisionNameNull: Self = StObject.set(x, "latestCreatedRevisionName", null)
    
    inline def setLatestCreatedRevisionNameUndefined: Self = StObject.set(x, "latestCreatedRevisionName", js.undefined)
    
    inline def setLatestReadyRevisionName(value: String): Self = StObject.set(x, "latestReadyRevisionName", value.asInstanceOf[js.Any])
    
    inline def setLatestReadyRevisionNameNull: Self = StObject.set(x, "latestReadyRevisionName", null)
    
    inline def setLatestReadyRevisionNameUndefined: Self = StObject.set(x, "latestReadyRevisionName", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    inline def setTrafficVarargs(value: SchemaTrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
