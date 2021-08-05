package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Download response.
  */
trait SchemaDownloadResponse extends StObject {
  
  /**
    * Retrieved ad groups in SDF format.
    */
  var adGroups: js.UndefOr[String] = js.undefined
  
  /**
    * Retrieved ads in SDF format.
    */
  var ads: js.UndefOr[String] = js.undefined
  
  /**
    * Retrieved campaigns in SDF format.
    */
  var campaigns: js.UndefOr[String] = js.undefined
  
  /**
    * Retrieved insertion orders in SDF format.
    */
  var insertionOrders: js.UndefOr[String] = js.undefined
  
  var inventorySources: js.UndefOr[String] = js.undefined
  
  /**
    * Retrieved line items in SDF format.
    */
  var lineItems: js.UndefOr[String] = js.undefined
}
object SchemaDownloadResponse {
  
  inline def apply(): SchemaDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadResponse]
  }
  
  extension [Self <: SchemaDownloadResponse](x: Self) {
    
    inline def setAdGroups(value: String): Self = StObject.set(x, "adGroups", value.asInstanceOf[js.Any])
    
    inline def setAdGroupsUndefined: Self = StObject.set(x, "adGroups", js.undefined)
    
    inline def setAds(value: String): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    inline def setAdsUndefined: Self = StObject.set(x, "ads", js.undefined)
    
    inline def setCampaigns(value: String): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    inline def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    inline def setInsertionOrders(value: String): Self = StObject.set(x, "insertionOrders", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrdersUndefined: Self = StObject.set(x, "insertionOrders", js.undefined)
    
    inline def setInventorySources(value: String): Self = StObject.set(x, "inventorySources", value.asInstanceOf[js.Any])
    
    inline def setInventorySourcesUndefined: Self = StObject.set(x, "inventorySources", js.undefined)
    
    inline def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
