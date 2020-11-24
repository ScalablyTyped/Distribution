package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RevisionSpec holds the desired state of the Revision (from the client).
  */
@js.native
trait SchemaRevisionSpec extends js.Object {
  
  /**
    * ConcurrencyModel specifies the desired concurrency model (Single or
    * Multi) for the Revision. Defaults to Multi. Deprecated in favor of
    * ContainerConcurrency. +optional
    */
  var concurrencyModel: js.UndefOr[String] = js.native
  
  /**
    * Container defines the unit of execution for this Revision. In the context
    * of a Revision, we disallow a number of the fields of this Container,
    * including: name, ports, and volumeMounts. The runtime contract is
    * documented here:
    * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
    */
  var container: js.UndefOr[SchemaContainer] = js.native
  
  /**
    * ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
    * requests per container of the Revision. Values are: - `0` thread-safe,
    * the system should manage the max concurrency. This is    the default
    * value. - `1` not-thread-safe. Single concurrency - `2-N` thread-safe, max
    * concurrency of N
    */
  var containerConcurrency: js.UndefOr[Double] = js.native
  
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  
  /**
    * Not currently used by Cloud Run.
    */
  var serviceAccountName: js.UndefOr[String] = js.native
  
  /**
    * ServingState holds a value describing the state the resources are in for
    * this Revision. Users must not specify this when creating a revision. It
    * is expected that the system will manipulate this based on routability and
    * load.  Populated by the system. Read-only.
    */
  var servingState: js.UndefOr[String] = js.native
  
  /**
    * TimeoutSeconds holds the max duration the instance is allowed for
    * responding to a request. Not currently used by Cloud Run.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}
object SchemaRevisionSpec {
  
  @scala.inline
  def apply(): SchemaRevisionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionSpec]
  }
  
  @scala.inline
  implicit class SchemaRevisionSpecOps[Self <: SchemaRevisionSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConcurrencyModel(value: String): Self = this.set("concurrencyModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrencyModel: Self = this.set("concurrencyModel", js.undefined)
    
    @scala.inline
    def setContainer(value: SchemaContainer): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerConcurrency(value: Double): Self = this.set("containerConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerConcurrency: Self = this.set("containerConcurrency", js.undefined)
    
    @scala.inline
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setServiceAccountName(value: String): Self = this.set("serviceAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountName: Self = this.set("serviceAccountName", js.undefined)
    
    @scala.inline
    def setServingState(value: String): Self = this.set("servingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServingState: Self = this.set("servingState", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
}
