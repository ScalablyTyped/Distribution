package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketplaceLabel extends StObject {
  
  /** The accountId of the party that created the label. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The creation time (in ms since epoch) for the label. */
  var createTimeMs: js.UndefOr[String] = js.undefined
  
  /** Information about the party that created the label. */
  var deprecatedMarketplaceDealParty: js.UndefOr[MarketplaceDealParty] = js.undefined
  
  /** The label to use. */
  var label: js.UndefOr[String] = js.undefined
}
object MarketplaceLabel {
  
  @scala.inline
  def apply(): MarketplaceLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceLabel]
  }
  
  @scala.inline
  implicit class MarketplaceLabelMutableBuilder[Self <: MarketplaceLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCreateTimeMs(value: String): Self = StObject.set(x, "createTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeMsUndefined: Self = StObject.set(x, "createTimeMs", js.undefined)
    
    @scala.inline
    def setDeprecatedMarketplaceDealParty(value: MarketplaceDealParty): Self = StObject.set(x, "deprecatedMarketplaceDealParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedMarketplaceDealPartyUndefined: Self = StObject.set(x, "deprecatedMarketplaceDealParty", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
