package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevisionStatus extends StObject {
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. As a Revision is being prepared, it will incrementally update conditions. Revision-specific conditions include: * "ResourcesAvailable": True when underlying resources have been provisioned. * "ContainerHealthy": True when the Revision readiness check completes. * "Active": True when the Revision may receive traffic.
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * ImageDigest holds the resolved digest for the image specified within .Spec.Container.Image. The digest is resolved during the creation of Revision. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
    */
  var imageDigest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the generated logging url for this particular revision based on the revision url template specified in the controller's config.
    */
  var logUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the Revision that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation, and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Not currently used by Cloud Run.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRevisionStatus {
  
  inline def apply(): SchemaRevisionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionStatus]
  }
  
  extension [Self <: SchemaRevisionStatus](x: Self) {
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestNull: Self = StObject.set(x, "imageDigest", null)
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlNull: Self = StObject.set(x, "logUrl", null)
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
