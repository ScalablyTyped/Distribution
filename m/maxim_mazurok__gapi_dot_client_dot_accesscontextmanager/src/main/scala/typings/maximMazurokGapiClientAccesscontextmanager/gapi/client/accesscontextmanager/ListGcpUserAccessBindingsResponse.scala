package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGcpUserAccessBindingsResponse extends js.Object {
  
  /** GcpUserAccessBinding */
  var gcpUserAccessBindings: js.UndefOr[js.Array[GcpUserAccessBinding]] = js.native
  
  /** Token to get the next page of items. If blank, there are no more items. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListGcpUserAccessBindingsResponse {
  
  @scala.inline
  def apply(): ListGcpUserAccessBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGcpUserAccessBindingsResponse]
  }
  
  @scala.inline
  implicit class ListGcpUserAccessBindingsResponseOps[Self <: ListGcpUserAccessBindingsResponse] (val x: Self) extends AnyVal {
    
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
    def setGcpUserAccessBindingsVarargs(value: GcpUserAccessBinding*): Self = this.set("gcpUserAccessBindings", js.Array(value :_*))
    
    @scala.inline
    def setGcpUserAccessBindings(value: js.Array[GcpUserAccessBinding]): Self = this.set("gcpUserAccessBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcpUserAccessBindings: Self = this.set("gcpUserAccessBindings", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
