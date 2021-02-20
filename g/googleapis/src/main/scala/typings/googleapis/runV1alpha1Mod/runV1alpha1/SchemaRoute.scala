package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route is responsible for configuring ingress over a collection of
  * Revisions. Some of the Revisions a Route distributes traffic over may be
  * specified by referencing the Configuration responsible for creating them;
  * in these cases the Route is additionally responsible for monitoring the
  * Configuration for &quot;latest ready&quot; revision changes, and smoothly
  * rolling out latest revisions. See also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#route
  * Cloud Run currently supports referencing a single Configuration to
  * automatically deploy the &quot;latest ready&quot; Revision from that
  * Configuration.
  */
@js.native
trait SchemaRoute extends StObject {
  
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * The kind of this resource, in this case always &quot;Route&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Metadata associated with this Route, including name, namespace, labels,
    * and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  
  /**
    * Spec holds the desired state of the Route (from the client).
    */
  var spec: js.UndefOr[SchemaRouteSpec] = js.native
  
  /**
    * Status communicates the observed state of the Route (from the
    * controller).
    */
  var status: js.UndefOr[SchemaRouteStatus] = js.native
}
object SchemaRoute {
  
  @scala.inline
  def apply(): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoute]
  }
  
  @scala.inline
  implicit class SchemaRouteMutableBuilder[Self <: SchemaRoute] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: SchemaRouteSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaRouteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
