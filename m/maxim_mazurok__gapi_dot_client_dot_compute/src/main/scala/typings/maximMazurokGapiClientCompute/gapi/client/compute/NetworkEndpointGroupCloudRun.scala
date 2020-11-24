package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointGroupCloudRun extends js.Object {
  
  /**
    * Cloud Run service is the main resource of Cloud Run.
    *
    * The service must be 1-63 characters long, and comply with RFC1035.
    *
    * Example value: "run-service".
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information.
    *
    * The tag must be 1-63 characters long, and comply with RFC1035.
    *
    * Example value: "revision-0010".
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and
    * backend services.
    *
    * For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL
    * mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
    */
  var urlMask: js.UndefOr[String] = js.native
}
object NetworkEndpointGroupCloudRun {
  
  @scala.inline
  def apply(): NetworkEndpointGroupCloudRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupCloudRun]
  }
  
  @scala.inline
  implicit class NetworkEndpointGroupCloudRunOps[Self <: NetworkEndpointGroupCloudRun] (val x: Self) extends AnyVal {
    
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
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setUrlMask(value: String): Self = this.set("urlMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlMask: Self = this.set("urlMask", js.undefined)
  }
}
