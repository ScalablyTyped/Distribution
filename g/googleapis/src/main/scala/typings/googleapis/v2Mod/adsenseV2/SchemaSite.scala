package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSite extends StObject {
  
  /**
    * Whether auto ads is turned on for the site.
    */
  var autoAdsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Domain (or subdomain) of the site, e.g. "example.com" or "www.example.com". This is used in the `OWNED_SITE_DOMAIN_NAME` reporting dimension.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of a site. Format: accounts/{account\}/sites/{site\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique ID of the site as used in the `OWNED_SITE_ID` reporting dimension.
    */
  var reportingDimensionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of a site.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaSite {
  
  inline def apply(): SchemaSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSite]
  }
  
  extension [Self <: SchemaSite](x: Self) {
    
    inline def setAutoAdsEnabled(value: Boolean): Self = StObject.set(x, "autoAdsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoAdsEnabledNull: Self = StObject.set(x, "autoAdsEnabled", null)
    
    inline def setAutoAdsEnabledUndefined: Self = StObject.set(x, "autoAdsEnabled", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdNull: Self = StObject.set(x, "reportingDimensionId", null)
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
