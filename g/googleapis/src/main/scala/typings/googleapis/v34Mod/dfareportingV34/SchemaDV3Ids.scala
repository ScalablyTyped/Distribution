package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDV3Ids extends StObject {
  
  /**
    * Campaign ID for DV360.
    */
  var dvCampaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creative ID for DV360.
    */
  var dvCreativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Insertion Order ID for DV360.
    */
  var dvInsertionOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line Item ID for DV360.
    */
  var dvLineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Site ID for DV360.
    */
  var dvSiteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#dV3Ids".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDV3Ids {
  
  inline def apply(): SchemaDV3Ids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDV3Ids]
  }
  
  extension [Self <: SchemaDV3Ids](x: Self) {
    
    inline def setDvCampaignId(value: String): Self = StObject.set(x, "dvCampaignId", value.asInstanceOf[js.Any])
    
    inline def setDvCampaignIdNull: Self = StObject.set(x, "dvCampaignId", null)
    
    inline def setDvCampaignIdUndefined: Self = StObject.set(x, "dvCampaignId", js.undefined)
    
    inline def setDvCreativeId(value: String): Self = StObject.set(x, "dvCreativeId", value.asInstanceOf[js.Any])
    
    inline def setDvCreativeIdNull: Self = StObject.set(x, "dvCreativeId", null)
    
    inline def setDvCreativeIdUndefined: Self = StObject.set(x, "dvCreativeId", js.undefined)
    
    inline def setDvInsertionOrderId(value: String): Self = StObject.set(x, "dvInsertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setDvInsertionOrderIdNull: Self = StObject.set(x, "dvInsertionOrderId", null)
    
    inline def setDvInsertionOrderIdUndefined: Self = StObject.set(x, "dvInsertionOrderId", js.undefined)
    
    inline def setDvLineItemId(value: String): Self = StObject.set(x, "dvLineItemId", value.asInstanceOf[js.Any])
    
    inline def setDvLineItemIdNull: Self = StObject.set(x, "dvLineItemId", null)
    
    inline def setDvLineItemIdUndefined: Self = StObject.set(x, "dvLineItemId", js.undefined)
    
    inline def setDvSiteId(value: String): Self = StObject.set(x, "dvSiteId", value.asInstanceOf[js.Any])
    
    inline def setDvSiteIdNull: Self = StObject.set(x, "dvSiteId", null)
    
    inline def setDvSiteIdUndefined: Self = StObject.set(x, "dvSiteId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
