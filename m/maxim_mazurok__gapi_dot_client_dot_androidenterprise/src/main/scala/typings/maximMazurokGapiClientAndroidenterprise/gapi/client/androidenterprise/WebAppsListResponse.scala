package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAppsListResponse extends js.Object {
  
  /** The manifest describing a web app. */
  var webApp: js.UndefOr[js.Array[WebApp]] = js.native
}
object WebAppsListResponse {
  
  @scala.inline
  def apply(): WebAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAppsListResponse]
  }
  
  @scala.inline
  implicit class WebAppsListResponseOps[Self <: WebAppsListResponse] (val x: Self) extends AnyVal {
    
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
    def setWebAppVarargs(value: WebApp*): Self = this.set("webApp", js.Array(value :_*))
    
    @scala.inline
    def setWebApp(value: js.Array[WebApp]): Self = this.set("webApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebApp: Self = this.set("webApp", js.undefined)
  }
}
