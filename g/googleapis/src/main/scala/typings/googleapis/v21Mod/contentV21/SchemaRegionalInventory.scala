package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Regional inventory resource. contains the regional name and all attributes
  * which are overridden for the specified region.
  */
@js.native
trait SchemaRegionalInventory extends StObject {
  
  /**
    * The availability of the product.
    */
  var availability: js.UndefOr[String] = js.native
  
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for
    * submitting any attribute of the feed specification in its generic form.
    */
  var customAttributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#regionalInventory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The price of the product.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The ID (name) of the region.
    */
  var regionId: js.UndefOr[String] = js.native
  
  /**
    * The sale price of the product. Mandatory if sale_price_effective_date is
    * defined.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a
    * space, comma, or slash. Both dates might be specified as &#39;null&#39;
    * if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
}
object SchemaRegionalInventory {
  
  @scala.inline
  def apply(): SchemaRegionalInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalInventory]
  }
  
  @scala.inline
  implicit class SchemaRegionalInventoryMutableBuilder[Self <: SchemaRegionalInventory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: js.Array[SchemaCustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setCustomAttributesVarargs(value: SchemaCustomAttribute*): Self = StObject.set(x, "customAttributes", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setRegionId(value: String): Self = StObject.set(x, "regionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionIdUndefined: Self = StObject.set(x, "regionId", js.undefined)
    
    @scala.inline
    def setSalePrice(value: SchemaPrice): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    @scala.inline
    def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
  }
}
