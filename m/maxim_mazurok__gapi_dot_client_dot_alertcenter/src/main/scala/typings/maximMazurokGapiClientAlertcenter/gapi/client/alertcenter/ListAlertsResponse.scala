package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlertsResponse extends js.Object {
  
  /** The list of alerts. */
  var alerts: js.UndefOr[js.Array[Alert]] = js.native
  
  /**
    * The token for the next page. If not empty, indicates that there may be more alerts that match the listing request; this value can be used in a subsequent ListAlertsRequest to get
    * alerts continuing from last result of the current list call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAlertsResponse {
  
  @scala.inline
  def apply(): ListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertsResponse]
  }
  
  @scala.inline
  implicit class ListAlertsResponseOps[Self <: ListAlertsResponse] (val x: Self) extends AnyVal {
    
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
    def setAlertsVarargs(value: Alert*): Self = this.set("alerts", js.Array(value :_*))
    
    @scala.inline
    def setAlerts(value: js.Array[Alert]): Self = this.set("alerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlerts: Self = this.set("alerts", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
