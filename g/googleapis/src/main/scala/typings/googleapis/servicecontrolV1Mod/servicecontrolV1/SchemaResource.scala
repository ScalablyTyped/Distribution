package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message defines core attributes for a resource. A resource is an
  * addressable (named) entity provided by the destination service. For
  * example, a file stored on a network storage service.
  */
@js.native
trait SchemaResource extends js.Object {
  
  /**
    * The labels or tags on the resource, such as AWS resource tags and
    * Kubernetes resource labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
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
  var name: js.UndefOr[String] = js.native
  
  /**
    * The name of the service that this resource belongs to, such as
    * `pubsub.googleapis.com`. The service may be different from the DNS
    * hostname that actually serves the request.
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * The type of the resource. The scheme is platform-specific because
    * different platforms define their resources differently.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaResource {
  
  @scala.inline
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  @scala.inline
  implicit class SchemaResourceOps[Self <: SchemaResource] (val x: Self) extends AnyVal {
    
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
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
