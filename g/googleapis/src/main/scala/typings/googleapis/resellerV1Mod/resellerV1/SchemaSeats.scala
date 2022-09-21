package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeats extends StObject {
  
  /**
    * Identifies the resource as a subscription seat setting. Value: `subscriptions#seats`
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Read-only field containing the current number of users that are assigned a license for the product defined in `skuId`. This field's value is equivalent to the numerical count of users returned by the Enterprise License Manager API method: [`listForProductAndSku`](/admin-sdk/licensing/v1/reference/licenseAssignments/listForProductAndSku).
    */
  var licensedNumberOfSeats: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * This is a required property and is exclusive to subscriptions with `FLEXIBLE` or `TRIAL` plans. This property sets the maximum number of licensed users allowed on a subscription. This quantity can be increased up to the maximum limit defined in the reseller's contract. The minimum quantity is the current number of users in the customer account. *Note: *G Suite subscriptions automatically assign a license to every user.
    */
  var maximumNumberOfSeats: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * This is a required property and is exclusive to subscriptions with `ANNUAL_MONTHLY_PAY` and `ANNUAL_YEARLY_PAY` plans. This property sets the maximum number of licenses assignable to users on a subscription. The reseller can add more licenses, but once set, the `numberOfSeats` cannot be reduced until renewal. The reseller is invoiced based on the `numberOfSeats` value regardless of how many of these user licenses are assigned. *Note: *Google Workspace subscriptions automatically assign a license to every user.
    */
  var numberOfSeats: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSeats {
  
  inline def apply(): SchemaSeats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeats]
  }
  
  extension [Self <: SchemaSeats](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLicensedNumberOfSeats(value: Double): Self = StObject.set(x, "licensedNumberOfSeats", value.asInstanceOf[js.Any])
    
    inline def setLicensedNumberOfSeatsNull: Self = StObject.set(x, "licensedNumberOfSeats", null)
    
    inline def setLicensedNumberOfSeatsUndefined: Self = StObject.set(x, "licensedNumberOfSeats", js.undefined)
    
    inline def setMaximumNumberOfSeats(value: Double): Self = StObject.set(x, "maximumNumberOfSeats", value.asInstanceOf[js.Any])
    
    inline def setMaximumNumberOfSeatsNull: Self = StObject.set(x, "maximumNumberOfSeats", null)
    
    inline def setMaximumNumberOfSeatsUndefined: Self = StObject.set(x, "maximumNumberOfSeats", js.undefined)
    
    inline def setNumberOfSeats(value: Double): Self = StObject.set(x, "numberOfSeats", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSeatsNull: Self = StObject.set(x, "numberOfSeats", null)
    
    inline def setNumberOfSeatsUndefined: Self = StObject.set(x, "numberOfSeats", js.undefined)
  }
}
