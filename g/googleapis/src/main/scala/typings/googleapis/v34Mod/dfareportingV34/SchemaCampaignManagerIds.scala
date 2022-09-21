package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCampaignManagerIds extends StObject {
  
  /**
    * Ad ID for Campaign Manager.
    */
  var adId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Campaign ID for Campaign Manager.
    */
  var campaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creative ID for Campaign Manager.
    */
  var creativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignManagerIds".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Placement ID for Campaign Manager.
    */
  var placementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Site ID for Campaign Manager.
    */
  var siteId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCampaignManagerIds {
  
  inline def apply(): SchemaCampaignManagerIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignManagerIds]
  }
  
  extension [Self <: SchemaCampaignManagerIds](x: Self) {
    
    inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    inline def setAdIdNull: Self = StObject.set(x, "adId", null)
    
    inline def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdNull: Self = StObject.set(x, "placementId", null)
    
    inline def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
  }
}
