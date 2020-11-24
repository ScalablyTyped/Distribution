package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1ListWorkloadsResponse extends js.Object {
  
  /** The next page token. Return empty if reached the last page. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of Workloads under a given parent. */
  var workloads: js.UndefOr[js.Array[GoogleCloudAssuredworkloadsV1Workload]] = js.native
}
object GoogleCloudAssuredworkloadsV1ListWorkloadsResponse {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1ListWorkloadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1ListWorkloadsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1ListWorkloadsResponseOps[Self <: GoogleCloudAssuredworkloadsV1ListWorkloadsResponse] (val x: Self) extends AnyVal {
    
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
    def setWorkloadsVarargs(value: GoogleCloudAssuredworkloadsV1Workload*): Self = this.set("workloads", js.Array(value :_*))
    
    @scala.inline
    def setWorkloads(value: js.Array[GoogleCloudAssuredworkloadsV1Workload]): Self = this.set("workloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkloads: Self = this.set("workloads", js.undefined)
  }
}
