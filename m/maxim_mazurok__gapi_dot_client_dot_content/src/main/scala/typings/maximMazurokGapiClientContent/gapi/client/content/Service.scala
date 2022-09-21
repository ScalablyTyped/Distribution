package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /** A boolean exposing the active status of the shipping service. Required. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** The CLDR code of the currency to which this service applies. Must match that of the prices in rate groups. */
  var currency: js.UndefOr[String] = js.undefined
  
  /** The CLDR territory code of the country to which the service applies. Required. */
  var deliveryCountry: js.UndefOr[String] = js.undefined
  
  /** Time spent in various aspects from order to the delivery of the product. Required. */
  var deliveryTime: js.UndefOr[DeliveryTime] = js.undefined
  
  /** Eligibility for this service. Acceptable values are: - "`All scenarios`" - "`All scenarios except Shopping Actions`" - "`Shopping Actions`" */
  var eligibility: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum order value for this service. If set, indicates that customers will have to spend at least this amount. All prices within a service must have the same currency. Cannot be
    * set together with minimum_order_value_table.
    */
  var minimumOrderValue: js.UndefOr[Price] = js.undefined
  
  /** Table of per store minimum order values for the pickup fulfillment type. Cannot be set together with minimum_order_value. */
  var minimumOrderValueTable: js.UndefOr[MinimumOrderValueTable] = js.undefined
  
  /** Free-form name of the service. Must be unique within target account. Required. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The carrier-service pair delivering items to collection points. The list of supported pickup services can be retrieved through the `getSupportedPickupServices` method. Required if
    * and only if the service delivery type is `pickup`.
    */
  var pickupService: js.UndefOr[PickupCarrierService] = js.undefined
  
  /**
    * Shipping rate group definitions. Only the last one is allowed to have an empty `applicableShippingLabels`, which means "everything else". The other `applicableShippingLabels` must
    * not overlap.
    */
  var rateGroups: js.UndefOr[js.Array[RateGroup]] = js.undefined
  
  /** Type of locations this service ships orders to. Acceptable values are: - "`delivery`" - "`pickup`" */
  var shipmentType: js.UndefOr[String] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDeliveryCountry(value: String): Self = StObject.set(x, "deliveryCountry", value.asInstanceOf[js.Any])
    
    inline def setDeliveryCountryUndefined: Self = StObject.set(x, "deliveryCountry", js.undefined)
    
    inline def setDeliveryTime(value: DeliveryTime): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
    
    inline def setEligibility(value: String): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setMinimumOrderValue(value: Price): Self = StObject.set(x, "minimumOrderValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumOrderValueTable(value: MinimumOrderValueTable): Self = StObject.set(x, "minimumOrderValueTable", value.asInstanceOf[js.Any])
    
    inline def setMinimumOrderValueTableUndefined: Self = StObject.set(x, "minimumOrderValueTable", js.undefined)
    
    inline def setMinimumOrderValueUndefined: Self = StObject.set(x, "minimumOrderValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPickupService(value: PickupCarrierService): Self = StObject.set(x, "pickupService", value.asInstanceOf[js.Any])
    
    inline def setPickupServiceUndefined: Self = StObject.set(x, "pickupService", js.undefined)
    
    inline def setRateGroups(value: js.Array[RateGroup]): Self = StObject.set(x, "rateGroups", value.asInstanceOf[js.Any])
    
    inline def setRateGroupsUndefined: Self = StObject.set(x, "rateGroups", js.undefined)
    
    inline def setRateGroupsVarargs(value: RateGroup*): Self = StObject.set(x, "rateGroups", js.Array(value*))
    
    inline def setShipmentType(value: String): Self = StObject.set(x, "shipmentType", value.asInstanceOf[js.Any])
    
    inline def setShipmentTypeUndefined: Self = StObject.set(x, "shipmentType", js.undefined)
  }
}
