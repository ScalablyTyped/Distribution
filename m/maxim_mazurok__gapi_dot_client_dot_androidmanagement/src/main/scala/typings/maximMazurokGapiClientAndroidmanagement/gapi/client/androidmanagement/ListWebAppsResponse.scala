package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebAppsResponse extends js.Object {
  
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of web apps. */
  var webApps: js.UndefOr[js.Array[WebApp]] = js.native
}
object ListWebAppsResponse {
  
  @scala.inline
  def apply(): ListWebAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebAppsResponse]
  }
  
  @scala.inline
  implicit class ListWebAppsResponseOps[Self <: ListWebAppsResponse] (val x: Self) extends AnyVal {
    
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
    def setWebAppsVarargs(value: WebApp*): Self = this.set("webApps", js.Array(value :_*))
    
    @scala.inline
    def setWebApps(value: js.Array[WebApp]): Self = this.set("webApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebApps: Self = this.set("webApps", js.undefined)
  }
}
