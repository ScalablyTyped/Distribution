package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RevisionSpec holds the desired state of the Revision (from the client).
  */
trait SchemaRevisionSpec extends StObject {
  
  /**
    * ConcurrencyModel specifies the desired concurrency model (Single or
    * Multi) for the Revision. Defaults to Multi. Deprecated in favor of
    * ContainerConcurrency. +optional
    */
  var concurrencyModel: js.UndefOr[String] = js.undefined
  
  /**
    * Container defines the unit of execution for this Revision. In the context
    * of a Revision, we disallow a number of the fields of this Container,
    * including: name, ports, and volumeMounts. The runtime contract is
    * documented here:
    * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
    */
  var container: js.UndefOr[SchemaContainer] = js.undefined
  
  /**
    * ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
    * requests per container of the Revision. Values are: - `0` thread-safe,
    * the system should manage the max concurrency. This is    the default
    * value. - `1` not-thread-safe. Single concurrency - `2-N` thread-safe, max
    * concurrency of N
    */
  var containerConcurrency: js.UndefOr[Double] = js.undefined
  
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.undefined
  
  /**
    * Not currently used by Cloud Run.
    */
  var serviceAccountName: js.UndefOr[String] = js.undefined
  
  /**
    * ServingState holds a value describing the state the resources are in for
    * this Revision. Users must not specify this when creating a revision. It
    * is expected that the system will manipulate this based on routability and
    * load.  Populated by the system. Read-only.
    */
  var servingState: js.UndefOr[String] = js.undefined
  
  /**
    * TimeoutSeconds holds the max duration the instance is allowed for
    * responding to a request. Not currently used by Cloud Run.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}
object SchemaRevisionSpec {
  
  inline def apply(): SchemaRevisionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionSpec]
  }
  
  extension [Self <: SchemaRevisionSpec](x: Self) {
    
    inline def setConcurrencyModel(value: String): Self = StObject.set(x, "concurrencyModel", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModelUndefined: Self = StObject.set(x, "concurrencyModel", js.undefined)
    
    inline def setContainer(value: SchemaContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerConcurrency(value: Double): Self = StObject.set(x, "containerConcurrency", value.asInstanceOf[js.Any])
    
    inline def setContainerConcurrencyUndefined: Self = StObject.set(x, "containerConcurrency", js.undefined)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setServingState(value: String): Self = StObject.set(x, "servingState", value.asInstanceOf[js.Any])
    
    inline def setServingStateUndefined: Self = StObject.set(x, "servingState", js.undefined)
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
