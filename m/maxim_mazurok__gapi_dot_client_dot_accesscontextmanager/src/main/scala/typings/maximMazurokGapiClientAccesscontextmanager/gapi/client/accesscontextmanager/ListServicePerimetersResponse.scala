package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServicePerimetersResponse extends js.Object {
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of the Service Perimeter instances. */
  var servicePerimeters: js.UndefOr[js.Array[ServicePerimeter]] = js.native
}
object ListServicePerimetersResponse {
  
  @scala.inline
  def apply(): ListServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicePerimetersResponse]
  }
  
  @scala.inline
  implicit class ListServicePerimetersResponseOps[Self <: ListServicePerimetersResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setServicePerimetersVarargs(value: ServicePerimeter*): Self = this.set("servicePerimeters", js.Array(value :_*))
    
    @scala.inline
    def setServicePerimeters(value: js.Array[ServicePerimeter]): Self = this.set("servicePerimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePerimeters: Self = this.set("servicePerimeters", js.undefined)
  }
}
