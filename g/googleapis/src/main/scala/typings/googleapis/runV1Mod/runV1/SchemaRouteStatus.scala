package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouteStatus extends StObject {
  
  /**
    * Similar to url, information on where the service is available on HTTP.
    */
  var address: js.UndefOr[SchemaAddressable] = js.undefined
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False. Note that providing a trafficTarget that only has a configurationName will result in a Route that does not increment either its metadata.generation or its observedGeneration, as new "latest ready" revisions from the Configuration are processed without an update to the Route's spec.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.undefined
  
  /**
    * URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form: https://{route-hash\}-{project-hash\}-{cluster-level-suffix\}.a.run.app
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouteStatus {
  
  inline def apply(): SchemaRouteStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteStatus]
  }
  
  extension [Self <: SchemaRouteStatus](x: Self) {
    
    inline def setAddress(value: SchemaAddressable): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
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
