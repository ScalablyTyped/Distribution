package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointGroupCloudFunction extends js.Object {
  
  /**
    * A user-defined name of the Cloud Function.
    *
    * The function name is case-sensitive and must be 1-63 characters long.
    *
    * Example value: "func1".
    */
  var function: js.UndefOr[String] = js.native
  
  /**
    * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend
    * services.
    *
    * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/". The URL mask will parse them to {
    * function = "function1" } and { function = "function2" } respectively.
    */
  var urlMask: js.UndefOr[String] = js.native
}
object NetworkEndpointGroupCloudFunction {
  
  @scala.inline
  def apply(): NetworkEndpointGroupCloudFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupCloudFunction]
  }
  
  @scala.inline
  implicit class NetworkEndpointGroupCloudFunctionOps[Self <: NetworkEndpointGroupCloudFunction] (val x: Self) extends AnyVal {
    
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
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setUrlMask(value: String): Self = this.set("urlMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlMask: Self = this.set("urlMask", js.undefined)
  }
}
