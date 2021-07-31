package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealTermsNonGuaranteedFixedPriceTerms extends StObject {
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
}
object SchemaDealTermsNonGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): SchemaDealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class SchemaDealTermsNonGuaranteedFixedPriceTermsMutableBuilder[Self <: SchemaDealTermsNonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    @scala.inline
    def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
  }
}
