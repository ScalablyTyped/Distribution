package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaService extends StObject {
  
  /**
    * A boolean exposing the active status of the shipping service. Required.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The CLDR code of the currency to which this service applies. Must match that of the prices in rate groups.
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CLDR territory code of the country to which the service applies. Required.
    */
  var deliveryCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time spent in various aspects from order to the delivery of the product. Required.
    */
  var deliveryTime: js.UndefOr[SchemaDeliveryTime] = js.undefined
  
  /**
    * Eligibility for this service. Acceptable values are: - "`All scenarios`" - "`All scenarios except Shopping Actions`" - "`Shopping Actions`"
    */
  var eligibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum order value for this service. If set, indicates that customers will have to spend at least this amount. All prices within a service must have the same currency. Cannot be set together with minimum_order_value_table.
    */
  var minimumOrderValue: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Table of per store minimum order values for the pickup fulfillment type. Cannot be set together with minimum_order_value.
    */
  var minimumOrderValueTable: js.UndefOr[SchemaMinimumOrderValueTable] = js.undefined
  
  /**
    * Free-form name of the service. Must be unique within target account. Required.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The carrier-service pair delivering items to collection points. The list of supported pickup services can be retrieved through the `getSupportedPickupServices` method. Required if and only if the service delivery type is `pickup`.
    */
  var pickupService: js.UndefOr[SchemaPickupCarrierService] = js.undefined
  
  /**
    * Shipping rate group definitions. Only the last one is allowed to have an empty `applicableShippingLabels`, which means "everything else". The other `applicableShippingLabels` must not overlap.
    */
  var rateGroups: js.UndefOr[js.Array[SchemaRateGroup]] = js.undefined
  
  /**
    * Type of locations this service ships orders to. Acceptable values are: - "`delivery`" - "`pickup`"
    */
  var shipmentType: js.UndefOr[String | Null] = js.undefined
}
object SchemaService {
  
  inline def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  extension [Self <: SchemaService](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDeliveryCountry(value: String): Self = StObject.set(x, "deliveryCountry", value.asInstanceOf[js.Any])
    
    inline def setDeliveryCountryNull: Self = StObject.set(x, "deliveryCountry", null)
    
    inline def setDeliveryCountryUndefined: Self = StObject.set(x, "deliveryCountry", js.undefined)
    
    inline def setDeliveryTime(value: SchemaDeliveryTime): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
    
    inline def setEligibility(value: String): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityNull: Self = StObject.set(x, "eligibility", null)
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setMinimumOrderValue(value: SchemaPrice): Self = StObject.set(x, "minimumOrderValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumOrderValueTable(value: SchemaMinimumOrderValueTable): Self = StObject.set(x, "minimumOrderValueTable", value.asInstanceOf[js.Any])
    
    inline def setMinimumOrderValueTableUndefined: Self = StObject.set(x, "minimumOrderValueTable", js.undefined)
    
    inline def setMinimumOrderValueUndefined: Self = StObject.set(x, "minimumOrderValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPickupService(value: SchemaPickupCarrierService): Self = StObject.set(x, "pickupService", value.asInstanceOf[js.Any])
    
    inline def setPickupServiceUndefined: Self = StObject.set(x, "pickupService", js.undefined)
    
    inline def setRateGroups(value: js.Array[SchemaRateGroup]): Self = StObject.set(x, "rateGroups", value.asInstanceOf[js.Any])
    
    inline def setRateGroupsUndefined: Self = StObject.set(x, "rateGroups", js.undefined)
    
    inline def setRateGroupsVarargs(value: SchemaRateGroup*): Self = StObject.set(x, "rateGroups", js.Array(value*))
    
    inline def setShipmentType(value: String): Self = StObject.set(x, "shipmentType", value.asInstanceOf[js.Any])
    
    inline def setShipmentTypeNull: Self = StObject.set(x, "shipmentType", null)
    
    inline def setShipmentTypeUndefined: Self = StObject.set(x, "shipmentType", js.undefined)
  }
}
