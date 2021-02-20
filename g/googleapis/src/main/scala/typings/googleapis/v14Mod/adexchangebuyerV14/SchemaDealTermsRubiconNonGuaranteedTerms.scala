package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDealTermsRubiconNonGuaranteedTerms extends StObject {
  
  /**
    * Optional price for Rubicon priority access in the auction.
    */
  var priorityPrice: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Optional price for Rubicon standard access in the auction.
    */
  var standardPrice: js.UndefOr[SchemaPrice] = js.native
}
object SchemaDealTermsRubiconNonGuaranteedTerms {
  
  @scala.inline
  def apply(): SchemaDealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsRubiconNonGuaranteedTerms]
  }
  
  @scala.inline
  implicit class SchemaDealTermsRubiconNonGuaranteedTermsMutableBuilder[Self <: SchemaDealTermsRubiconNonGuaranteedTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriorityPrice(value: SchemaPrice): Self = StObject.set(x, "priorityPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityPriceUndefined: Self = StObject.set(x, "priorityPrice", js.undefined)
    
    @scala.inline
    def setStandardPrice(value: SchemaPrice): Self = StObject.set(x, "standardPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardPriceUndefined: Self = StObject.set(x, "standardPrice", js.undefined)
  }
}
