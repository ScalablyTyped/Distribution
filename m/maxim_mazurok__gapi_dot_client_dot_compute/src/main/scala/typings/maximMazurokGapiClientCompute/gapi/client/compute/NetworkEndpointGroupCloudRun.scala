package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkEndpointGroupCloudRun extends StObject {
  
  /**
    * Cloud Run service is the main resource of Cloud Run.
    *
    * The service must be 1-63 characters long, and comply with RFC1035.
    *
    * Example value: "run-service".
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information.
    *
    * The tag must be 1-63 characters long, and comply with RFC1035.
    *
    * Example value: "revision-0010".
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and
    * backend services.
    *
    * For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL
    * mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
    */
  var urlMask: js.UndefOr[String] = js.undefined
}
object NetworkEndpointGroupCloudRun {
  
  inline def apply(): NetworkEndpointGroupCloudRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupCloudRun]
  }
  
  extension [Self <: NetworkEndpointGroupCloudRun](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setUrlMask(value: String): Self = StObject.set(x, "urlMask", value.asInstanceOf[js.Any])
    
    inline def setUrlMaskUndefined: Self = StObject.set(x, "urlMask", js.undefined)
  }
}
