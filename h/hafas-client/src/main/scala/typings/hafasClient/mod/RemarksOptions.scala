package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemarksOptions extends StObject {
  
  var from: js.UndefOr[js.Date | Double] = js.undefined
  
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * return leg shapes? (not supported by all endpoints)
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.undefined
  
  var products: js.UndefOr[Products] = js.undefined
  
  /**
    * maximum number of remarks
    * @default 100
    */
  var results: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[js.Date | Double] = js.undefined
}
object RemarksOptions {
  
  inline def apply(): RemarksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarksOptions]
  }
  
  extension [Self <: RemarksOptions](x: Self) {
    
    inline def setFrom(value: js.Date | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setTo(value: js.Date | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
