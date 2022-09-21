package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMarketplaceDealParty extends StObject {
  
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is specified for a deal-party.
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is specified for a deal party.
    */
  var seller: js.UndefOr[SchemaSeller] = js.undefined
}
object SchemaMarketplaceDealParty {
  
  inline def apply(): SchemaMarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceDealParty]
  }
  
  extension [Self <: SchemaMarketplaceDealParty](x: Self) {
    
    inline def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
  }
}
