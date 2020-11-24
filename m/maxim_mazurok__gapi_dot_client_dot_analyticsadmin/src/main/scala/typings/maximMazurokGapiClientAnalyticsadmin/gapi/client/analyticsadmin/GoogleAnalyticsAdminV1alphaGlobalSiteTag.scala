package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaGlobalSiteTag extends js.Object {
  
  /** Immutable. JavaScript code snippet to be pasted as the first item into the head tag of every webpage to measure. */
  var snippet: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaGlobalSiteTag {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaGlobalSiteTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaGlobalSiteTag]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaGlobalSiteTagOps[Self <: GoogleAnalyticsAdminV1alphaGlobalSiteTag] (val x: Self) extends AnyVal {
    
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
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
}
