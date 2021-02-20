package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DV3Ids extends StObject {
  
  /** Campaign ID for DV360. */
  var dvCampaignId: js.UndefOr[String] = js.native
  
  /** Creative ID for DV360. */
  var dvCreativeId: js.UndefOr[String] = js.native
  
  /** Insertion Order ID for DV360. */
  var dvInsertionOrderId: js.UndefOr[String] = js.native
  
  /** Line Item ID for DV360. */
  var dvLineItemId: js.UndefOr[String] = js.native
  
  /** Site ID for DV360. */
  var dvSiteId: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dV3Ids". */
  var kind: js.UndefOr[String] = js.native
}
object DV3Ids {
  
  @scala.inline
  def apply(): DV3Ids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DV3Ids]
  }
  
  @scala.inline
  implicit class DV3IdsMutableBuilder[Self <: DV3Ids] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDvCampaignId(value: String): Self = StObject.set(x, "dvCampaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvCampaignIdUndefined: Self = StObject.set(x, "dvCampaignId", js.undefined)
    
    @scala.inline
    def setDvCreativeId(value: String): Self = StObject.set(x, "dvCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvCreativeIdUndefined: Self = StObject.set(x, "dvCreativeId", js.undefined)
    
    @scala.inline
    def setDvInsertionOrderId(value: String): Self = StObject.set(x, "dvInsertionOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvInsertionOrderIdUndefined: Self = StObject.set(x, "dvInsertionOrderId", js.undefined)
    
    @scala.inline
    def setDvLineItemId(value: String): Self = StObject.set(x, "dvLineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvLineItemIdUndefined: Self = StObject.set(x, "dvLineItemId", js.undefined)
    
    @scala.inline
    def setDvSiteId(value: String): Self = StObject.set(x, "dvSiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvSiteIdUndefined: Self = StObject.set(x, "dvSiteId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
