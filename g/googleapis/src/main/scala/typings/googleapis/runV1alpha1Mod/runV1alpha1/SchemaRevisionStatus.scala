package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RevisionStatus communicates the observed state of the Revision (from the
  * controller).
  */
trait SchemaRevisionStatus extends StObject {
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.  As a Revision is being prepared, it will incrementally
    * update conditions &quot;ResourcesAvailable&quot;,
    * &quot;ContainerHealthy&quot;, and &quot;Active&quot;, which contribute to
    * the overall &quot;Ready&quot; condition.
    */
  var conditions: js.UndefOr[js.Array[SchemaRevisionCondition]] = js.undefined
  
  /**
    * ImageDigest holds the resolved digest for the image specified within
    * .Spec.Container.Image. The digest is resolved during the creation of
    * Revision. This field holds the digest value regardless of whether a tag
    * or digest was originally specified in the Container object.
    */
  var imageDigest: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the generated logging url for this particular revision based on
    * the revision url template specified in the controller&#39;s config.
    * +optional
    */
  var logUrl: js.UndefOr[String] = js.undefined
  
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Revision that was
    * last processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration =
    * metadata.generation, and the Ready condition&#39;s status is True or
    * False.
    */
  var observedGeneration: js.UndefOr[Double] = js.undefined
  
  /**
    * Not currently used by Cloud Run.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object SchemaRevisionStatus {
  
  inline def apply(): SchemaRevisionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionStatus]
  }
  
  extension [Self <: SchemaRevisionStatus](x: Self) {
    
    inline def setConditions(value: js.Array[SchemaRevisionCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaRevisionCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
