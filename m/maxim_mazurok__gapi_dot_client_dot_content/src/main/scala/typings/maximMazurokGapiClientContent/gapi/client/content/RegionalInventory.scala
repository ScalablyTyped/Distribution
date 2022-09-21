package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalInventory extends StObject {
  
  /** The availability of the product. */
  var availability: js.UndefOr[String] = js.undefined
  
  /** A list of custom (merchant-provided) attributes. It can also be used for submitting any attribute of the feed specification in its generic form. */
  var customAttributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#regionalInventory`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The price of the product. */
  var price: js.UndefOr[Price] = js.undefined
  
  /** The ID uniquely identifying each region. */
  var regionId: js.UndefOr[String] = js.undefined
  
  /** The sale price of the product. Mandatory if `sale_price_effective_date` is defined. */
  var salePrice: js.UndefOr[Price] = js.undefined
  
  /** A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash. Both dates might be specified as 'null' if undecided. */
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
}
object RegionalInventory {
  
  inline def apply(): RegionalInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalInventory]
  }
  
  extension [Self <: RegionalInventory](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setCustomAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegionId(value: String): Self = StObject.set(x, "regionId", value.asInstanceOf[js.Any])
    
    inline def setRegionIdUndefined: Self = StObject.set(x, "regionId", js.undefined)
    
    inline def setSalePrice(value: Price): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    inline def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
  }
}
