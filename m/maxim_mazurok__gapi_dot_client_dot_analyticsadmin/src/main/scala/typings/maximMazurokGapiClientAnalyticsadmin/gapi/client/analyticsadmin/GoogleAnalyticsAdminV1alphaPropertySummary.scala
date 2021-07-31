package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaPropertySummary extends StObject {
  
  /** Display name for the property referred to in this account summary. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Resource name of property referred to by this property summary Format: properties/{property_id} Example: "properties/1000" */
  var property: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaPropertySummary {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaPropertySummary]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaPropertySummaryMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaPropertySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
