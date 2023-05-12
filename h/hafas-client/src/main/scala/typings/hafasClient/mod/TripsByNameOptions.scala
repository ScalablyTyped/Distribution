package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripsByNameOptions extends StObject {
  
  var additionalFilters: js.UndefOr[js.Array[Filter]] = js.undefined
  
  var currentlyStoppingAt: js.UndefOr[String] = js.undefined
  
  var fromWhen: js.UndefOr[js.Date] = js.undefined
  
  var lineName: js.UndefOr[String] = js.undefined
  
  var onlyCurrentlyRunning: js.UndefOr[Boolean] = js.undefined
  
  var operatorNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var products: js.UndefOr[Products] = js.undefined
  
  var untilWhen: js.UndefOr[js.Date] = js.undefined
  
  /**
    * departure date, undefined corresponds to Date.Now
    * @default undefined
    */
  var when: js.UndefOr[js.Date] = js.undefined
}
object TripsByNameOptions {
  
  inline def apply(): TripsByNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripsByNameOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TripsByNameOptions] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFilters(value: js.Array[Filter]): Self = StObject.set(x, "additionalFilters", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFiltersUndefined: Self = StObject.set(x, "additionalFilters", js.undefined)
    
    inline def setAdditionalFiltersVarargs(value: Filter*): Self = StObject.set(x, "additionalFilters", js.Array(value*))
    
    inline def setCurrentlyStoppingAt(value: String): Self = StObject.set(x, "currentlyStoppingAt", value.asInstanceOf[js.Any])
    
    inline def setCurrentlyStoppingAtUndefined: Self = StObject.set(x, "currentlyStoppingAt", js.undefined)
    
    inline def setFromWhen(value: js.Date): Self = StObject.set(x, "fromWhen", value.asInstanceOf[js.Any])
    
    inline def setFromWhenUndefined: Self = StObject.set(x, "fromWhen", js.undefined)
    
    inline def setLineName(value: String): Self = StObject.set(x, "lineName", value.asInstanceOf[js.Any])
    
    inline def setLineNameUndefined: Self = StObject.set(x, "lineName", js.undefined)
    
    inline def setOnlyCurrentlyRunning(value: Boolean): Self = StObject.set(x, "onlyCurrentlyRunning", value.asInstanceOf[js.Any])
    
    inline def setOnlyCurrentlyRunningUndefined: Self = StObject.set(x, "onlyCurrentlyRunning", js.undefined)
    
    inline def setOperatorNames(value: js.Array[String]): Self = StObject.set(x, "operatorNames", value.asInstanceOf[js.Any])
    
    inline def setOperatorNamesUndefined: Self = StObject.set(x, "operatorNames", js.undefined)
    
    inline def setOperatorNamesVarargs(value: String*): Self = StObject.set(x, "operatorNames", js.Array(value*))
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setUntilWhen(value: js.Date): Self = StObject.set(x, "untilWhen", value.asInstanceOf[js.Any])
    
    inline def setUntilWhenUndefined: Self = StObject.set(x, "untilWhen", js.undefined)
    
    inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
