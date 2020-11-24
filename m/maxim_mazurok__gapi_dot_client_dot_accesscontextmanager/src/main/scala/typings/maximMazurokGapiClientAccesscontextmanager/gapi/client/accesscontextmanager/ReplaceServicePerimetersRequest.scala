package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceServicePerimetersRequest extends js.Object {
  
  /**
    * Optional. The etag for the version of the Access Policy that this replace operation is to be performed on. If, at the time of replace, the etag for the Access Policy stored in
    * Access Context Manager is different from the specified etag, then the replace operation will not be performed and the call will fail. This field is not required. If etag is not
    * provided, the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String] = js.native
  
  /** Required. The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy. */
  var servicePerimeters: js.UndefOr[js.Array[ServicePerimeter]] = js.native
}
object ReplaceServicePerimetersRequest {
  
  @scala.inline
  def apply(): ReplaceServicePerimetersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceServicePerimetersRequest]
  }
  
  @scala.inline
  implicit class ReplaceServicePerimetersRequestOps[Self <: ReplaceServicePerimetersRequest] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setServicePerimetersVarargs(value: ServicePerimeter*): Self = this.set("servicePerimeters", js.Array(value :_*))
    
    @scala.inline
    def setServicePerimeters(value: js.Array[ServicePerimeter]): Self = this.set("servicePerimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePerimeters: Self = this.set("servicePerimeters", js.undefined)
  }
}
