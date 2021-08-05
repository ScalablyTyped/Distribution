package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaGlobalSiteTag extends StObject {
  
  /** Immutable. JavaScript code snippet to be pasted as the first item into the head tag of every webpage to measure. */
  var snippet: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaGlobalSiteTag {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaGlobalSiteTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaGlobalSiteTag]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaGlobalSiteTag](x: Self) {
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
