package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Terms for Preferred Deals. Note that Preferred Deals cannot be created via
  * the API at this time, but can be returned in a get or list request.
  */
trait SchemaNonGuaranteedFixedPriceTerms extends StObject {
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
}
object SchemaNonGuaranteedFixedPriceTerms {
  
  inline def apply(): SchemaNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonGuaranteedFixedPriceTerms]
  }
  
  extension [Self <: SchemaNonGuaranteedFixedPriceTerms](x: Self) {
    
    inline def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    inline def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    inline def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
  }
}
