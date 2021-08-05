package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Revision is an immutable snapshot of code and configuration.  A revision
  * references a container image. Revisions are created by updates to a
  * Configuration.  Cloud Run does not currently support referencing a build
  * that is responsible for materializing the container image from source.  See
  * also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#revision
  */
trait SchemaRevision extends StObject {
  
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of this resource, in this case &quot;Revision&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata associated with this Revision, including name, namespace,
    * labels, and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.undefined
  
  /**
    * Spec holds the desired state of the Revision (from the client).
    */
  var spec: js.UndefOr[SchemaRevisionSpec] = js.undefined
  
  /**
    * Status communicates the observed state of the Revision (from the
    * controller).
    */
  var status: js.UndefOr[SchemaRevisionStatus] = js.undefined
}
object SchemaRevision {
  
  inline def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  
  extension [Self <: SchemaRevision](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: SchemaRevisionSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: SchemaRevisionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
