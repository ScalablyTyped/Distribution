package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaGlobalSiteTag extends StObject {
  
  /**
    * Output only. Resource name for this GlobalSiteTag resource. Format: properties/{property_id}/dataStreams/{stream_id}/globalSiteTag Example:
    * "properties/123/dataStreams/456/globalSiteTag"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Immutable. JavaScript code snippet to be pasted as the first item into the head tag of every webpage to measure. */
  var snippet: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaGlobalSiteTag {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaGlobalSiteTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaGlobalSiteTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaGlobalSiteTag] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
