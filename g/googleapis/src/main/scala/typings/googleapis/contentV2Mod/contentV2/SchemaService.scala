package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaService extends StObject {
  
  /**
    * A boolean exposing the active status of the shipping service. Required.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The CLDR code of the currency to which this service applies. Must match
    * that of the prices in rate groups.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * The CLDR territory code of the country to which the service applies.
    * Required.
    */
  var deliveryCountry: js.UndefOr[String] = js.undefined
  
  /**
    * Time spent in various aspects from order to the delivery of the product.
    * Required.
    */
  var deliveryTime: js.UndefOr[SchemaDeliveryTime] = js.undefined
  
  /**
    * Eligibility for this service.
    */
  var eligibility: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum order value for this service. If set, indicates that customers
    * will have to spend at least this amount. All prices within a service must
    * have the same currency.
    */
  var minimumOrderValue: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Free-form name of the service. Must be unique within target account.
    * Required.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Shipping rate group definitions. Only the last one is allowed to have an
    * empty applicableShippingLabels, which means &quot;everything else&quot;.
    * The other applicableShippingLabels must not overlap.
    */
  var rateGroups: js.UndefOr[js.Array[SchemaRateGroup]] = js.undefined
}
object SchemaService {
  
  inline def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  extension [Self <: SchemaService](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDeliveryCountry(value: String): Self = StObject.set(x, "deliveryCountry", value.asInstanceOf[js.Any])
    
    inline def setDeliveryCountryUndefined: Self = StObject.set(x, "deliveryCountry", js.undefined)
    
    inline def setDeliveryTime(value: SchemaDeliveryTime): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
    
    inline def setEligibility(value: String): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setMinimumOrderValue(value: SchemaPrice): Self = StObject.set(x, "minimumOrderValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumOrderValueUndefined: Self = StObject.set(x, "minimumOrderValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRateGroups(value: js.Array[SchemaRateGroup]): Self = StObject.set(x, "rateGroups", value.asInstanceOf[js.Any])
    
    inline def setRateGroupsUndefined: Self = StObject.set(x, "rateGroups", js.undefined)
    
    inline def setRateGroupsVarargs(value: SchemaRateGroup*): Self = StObject.set(x, "rateGroups", js.Array(value :_*))
  }
}
