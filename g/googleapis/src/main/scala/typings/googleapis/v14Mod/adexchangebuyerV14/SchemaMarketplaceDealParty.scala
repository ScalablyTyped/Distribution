package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaMarketplaceDealParty extends StObject {
  
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal-party.
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal party.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
}
object SchemaMarketplaceDealParty {
  
  @scala.inline
  def apply(): SchemaMarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceDealParty]
  }
  
  @scala.inline
  implicit class SchemaMarketplaceDealPartyMutableBuilder[Self <: SchemaMarketplaceDealParty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    @scala.inline
    def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
  }
}
