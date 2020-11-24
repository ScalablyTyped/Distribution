package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInfo extends js.Object {
  
  /** List of app developers who triggered notifications for above application. */
  var appDeveloperEmail: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The application that requires the SQL setup. */
  var appKey: js.UndefOr[String] = js.native
  
  /** Required. Number of requests sent for this application to set up default SQL instance. */
  var numberOfRequests: js.UndefOr[String] = js.native
}
object RequestInfo {
  
  @scala.inline
  def apply(): RequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInfo]
  }
  
  @scala.inline
  implicit class RequestInfoOps[Self <: RequestInfo] (val x: Self) extends AnyVal {
    
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
    def setAppDeveloperEmailVarargs(value: String*): Self = this.set("appDeveloperEmail", js.Array(value :_*))
    
    @scala.inline
    def setAppDeveloperEmail(value: js.Array[String]): Self = this.set("appDeveloperEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDeveloperEmail: Self = this.set("appDeveloperEmail", js.undefined)
    
    @scala.inline
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppKey: Self = this.set("appKey", js.undefined)
    
    @scala.inline
    def setNumberOfRequests(value: String): Self = this.set("numberOfRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRequests: Self = this.set("numberOfRequests", js.undefined)
  }
}
