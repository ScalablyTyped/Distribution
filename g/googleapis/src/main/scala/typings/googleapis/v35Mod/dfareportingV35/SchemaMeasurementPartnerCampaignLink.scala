package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMeasurementPartnerCampaignLink extends StObject {
  
  /**
    * .
    */
  var linkStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Measurement partner used for tag wrapping.
    */
  var measurementPartner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Partner campaign ID needed for establishing linking with Measurement partner.
    */
  var partnerCampaignId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMeasurementPartnerCampaignLink {
  
  inline def apply(): SchemaMeasurementPartnerCampaignLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMeasurementPartnerCampaignLink]
  }
  
  extension [Self <: SchemaMeasurementPartnerCampaignLink](x: Self) {
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusNull: Self = StObject.set(x, "linkStatus", null)
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
    
    inline def setMeasurementPartner(value: String): Self = StObject.set(x, "measurementPartner", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPartnerNull: Self = StObject.set(x, "measurementPartner", null)
    
    inline def setMeasurementPartnerUndefined: Self = StObject.set(x, "measurementPartner", js.undefined)
    
    inline def setPartnerCampaignId(value: String): Self = StObject.set(x, "partnerCampaignId", value.asInstanceOf[js.Any])
    
    inline def setPartnerCampaignIdNull: Self = StObject.set(x, "partnerCampaignId", null)
    
    inline def setPartnerCampaignIdUndefined: Self = StObject.set(x, "partnerCampaignId", js.undefined)
  }
}
