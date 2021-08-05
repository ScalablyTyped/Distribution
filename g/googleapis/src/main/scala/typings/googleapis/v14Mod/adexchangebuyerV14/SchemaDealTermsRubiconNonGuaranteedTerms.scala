package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealTermsRubiconNonGuaranteedTerms extends StObject {
  
  /**
    * Optional price for Rubicon priority access in the auction.
    */
  var priorityPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Optional price for Rubicon standard access in the auction.
    */
  var standardPrice: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaDealTermsRubiconNonGuaranteedTerms {
  
  inline def apply(): SchemaDealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsRubiconNonGuaranteedTerms]
  }
  
  extension [Self <: SchemaDealTermsRubiconNonGuaranteedTerms](x: Self) {
    
    inline def setPriorityPrice(value: SchemaPrice): Self = StObject.set(x, "priorityPrice", value.asInstanceOf[js.Any])
    
    inline def setPriorityPriceUndefined: Self = StObject.set(x, "priorityPrice", js.undefined)
    
    inline def setStandardPrice(value: SchemaPrice): Self = StObject.set(x, "standardPrice", value.asInstanceOf[js.Any])
    
    inline def setStandardPriceUndefined: Self = StObject.set(x, "standardPrice", js.undefined)
  }
}
