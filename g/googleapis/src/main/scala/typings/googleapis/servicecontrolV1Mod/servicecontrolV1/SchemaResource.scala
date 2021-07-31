package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message defines core attributes for a resource. A resource is an
  * addressable (named) entity provided by the destination service. For
  * example, a file stored on a network storage service.
  */
trait SchemaResource extends StObject {
  
  /**
    * The labels or tags on the resource, such as AWS resource tags and
    * Kubernetes resource labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The stable identifier (name) of a resource on the `service`. A resource
    * can be logically identified as
    * &quot;//{resource.service}/{resource.name}&quot;. The differences between
    * a resource name and a URI are:  *   Resource name is a logical
    * identifier, independent of network     protocol and API version. For
    * example,     `//pubsub.googleapis.com/projects/123/topics/news-feed`. *
    * URI often includes protocol and version information, so it can     be
    * used directly by applications. For example,
    * `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`.  See
    * https://cloud.google.com/apis/design/resource_names for details.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service that this resource belongs to, such as
    * `pubsub.googleapis.com`. The service may be different from the DNS
    * hostname that actually serves the request.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource. The scheme is platform-specific because
    * different platforms define their resources differently.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaResource {
  
  @scala.inline
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  @scala.inline
  implicit class SchemaResourceMutableBuilder[Self <: SchemaResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
