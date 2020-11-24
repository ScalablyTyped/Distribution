package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Regional inventory resource. contains the regional name and all attributes
  * which are overridden for the specified region.
  */
@js.native
trait SchemaRegionalInventory extends js.Object {
  
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
  implicit class SchemaRegionalInventoryOps[Self <: SchemaRegionalInventory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setCustomAttributesVarargs(value: SchemaCustomAttribute*): Self = this.set("customAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttributes(value: js.Array[SchemaCustomAttribute]): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setRegionId(value: String): Self = this.set("regionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionId: Self = this.set("regionId", js.undefined)
    
    @scala.inline
    def setSalePrice(value: SchemaPrice): Self = this.set("salePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePrice: Self = this.set("salePrice", js.undefined)
    
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = this.set("salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePriceEffectiveDate: Self = this.set("salePriceEffectiveDate", js.undefined)
  }
}
