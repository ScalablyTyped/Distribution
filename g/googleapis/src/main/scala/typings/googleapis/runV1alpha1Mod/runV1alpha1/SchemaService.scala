package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service acts as a top-level container that manages a set of Routes and
  * Configurations which implement a network service. Service exists to provide
  * a singular abstraction which can be access controlled, reasoned about, and
  * which encapsulates software lifecycle decisions such as rollout policy and
  * team resource ownership. Service acts only as an orchestrator of the
  * underlying Routes and Configurations (much as a kubernetes Deployment
  * orchestrates ReplicaSets).  The Service&#39;s controller will track the
  * statuses of its owned Configuration and Route, reflecting their statuses
  * and conditions as its own.  See also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#service
  */
trait SchemaService extends StObject {
  
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of resource, in this case &quot;Service&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata associated with this Service, including name, namespace, labels,
    * and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.undefined
  
  /**
    * Spec holds the desired state of the Service (from the client).
    */
  var spec: js.UndefOr[SchemaServiceSpec] = js.undefined
  
  /**
    * Status communicates the observed state of the Service (from the
    * controller).
    */
  var status: js.UndefOr[SchemaServiceStatus] = js.undefined
}
object SchemaService {
  
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  @scala.inline
  implicit class SchemaServiceMutableBuilder[Self <: SchemaService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: SchemaServiceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
