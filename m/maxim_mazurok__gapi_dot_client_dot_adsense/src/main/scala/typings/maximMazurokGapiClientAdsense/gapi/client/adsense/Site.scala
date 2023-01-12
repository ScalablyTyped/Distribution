package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site extends StObject {
  
  /** Whether auto ads is turned on for the site. */
  var autoAdsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Domain (or subdomain) of the site, e.g. "example.com" or "www.example.com". This is used in the `OWNED_SITE_DOMAIN_NAME` reporting dimension. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of a site. Format: accounts/{account}/sites/{site} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Unique ID of the site as used in the `OWNED_SITE_ID` reporting dimension. */
  var reportingDimensionId: js.UndefOr[String] = js.undefined
  
  /** Output only. State of a site. */
  var state: js.UndefOr[String] = js.undefined
}
object Site {
  
  inline def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    inline def setAutoAdsEnabled(value: Boolean): Self = StObject.set(x, "autoAdsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoAdsEnabledUndefined: Self = StObject.set(x, "autoAdsEnabled", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
