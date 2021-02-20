package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaGlobalSiteTag extends StObject {
  
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
  implicit class GoogleAnalyticsAdminV1alphaGlobalSiteTagMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaGlobalSiteTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
