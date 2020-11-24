package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaService extends js.Object {
  
  /**
    * A boolean exposing the active status of the shipping service. Required.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * The CLDR code of the currency to which this service applies. Must match
    * that of the prices in rate groups.
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * The CLDR territory code of the country to which the service applies.
    * Required.
    */
  var deliveryCountry: js.UndefOr[String] = js.native
  
  /**
    * Time spent in various aspects from order to the delivery of the product.
    * Required.
    */
  var deliveryTime: js.UndefOr[SchemaDeliveryTime] = js.native
  
  /**
    * Eligibility for this service.
    */
  var eligibility: js.UndefOr[String] = js.native
  
  /**
    * Minimum order value for this service. If set, indicates that customers
    * will have to spend at least this amount. All prices within a service must
    * have the same currency.
    */
  var minimumOrderValue: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Free-form name of the service. Must be unique within target account.
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Shipping rate group definitions. Only the last one is allowed to have an
    * empty applicableShippingLabels, which means &quot;everything else&quot;.
    * The other applicableShippingLabels must not overlap.
    */
  var rateGroups: js.UndefOr[js.Array[SchemaRateGroup]] = js.native
}
object SchemaService {
  
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  @scala.inline
  implicit class SchemaServiceOps[Self <: SchemaService] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDeliveryCountry(value: String): Self = this.set("deliveryCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryCountry: Self = this.set("deliveryCountry", js.undefined)
    
    @scala.inline
    def setDeliveryTime(value: SchemaDeliveryTime): Self = this.set("deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryTime: Self = this.set("deliveryTime", js.undefined)
    
    @scala.inline
    def setEligibility(value: String): Self = this.set("eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibility: Self = this.set("eligibility", js.undefined)
    
    @scala.inline
    def setMinimumOrderValue(value: SchemaPrice): Self = this.set("minimumOrderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumOrderValue: Self = this.set("minimumOrderValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRateGroupsVarargs(value: SchemaRateGroup*): Self = this.set("rateGroups", js.Array(value :_*))
    
    @scala.inline
    def setRateGroups(value: js.Array[SchemaRateGroup]): Self = this.set("rateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateGroups: Self = this.set("rateGroups", js.undefined)
  }
}
