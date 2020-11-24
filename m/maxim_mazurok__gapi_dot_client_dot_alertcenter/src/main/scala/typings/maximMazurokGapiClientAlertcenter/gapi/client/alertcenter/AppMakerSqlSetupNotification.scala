package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppMakerSqlSetupNotification extends js.Object {
  
  /** List of applications with requests for default SQL set up. */
  var requestInfo: js.UndefOr[js.Array[RequestInfo]] = js.native
}
object AppMakerSqlSetupNotification {
  
  @scala.inline
  def apply(): AppMakerSqlSetupNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppMakerSqlSetupNotification]
  }
  
  @scala.inline
  implicit class AppMakerSqlSetupNotificationOps[Self <: AppMakerSqlSetupNotification] (val x: Self) extends AnyVal {
    
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
    def setRequestInfoVarargs(value: RequestInfo*): Self = this.set("requestInfo", js.Array(value :_*))
    
    @scala.inline
    def setRequestInfo(value: js.Array[RequestInfo]): Self = this.set("requestInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestInfo: Self = this.set("requestInfo", js.undefined)
  }
}
