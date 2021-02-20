package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for subscription seats.
  */
@js.native
trait SchemaSeats extends StObject {
  
  /**
    * Identifies the resource as a subscription seat setting. Value:
    * subscriptions#seats
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Read-only field containing the current number of users that are assigned
    * a license for the product defined in skuId. This field&#39;s value is
    * equivalent to the numerical count of users returned by the Enterprise
    * License Manager API method: listForProductAndSku
    */
  var licensedNumberOfSeats: js.UndefOr[Double] = js.native
  
  /**
    * This is a required property and is exclusive to subscriptions with
    * FLEXIBLE or TRIAL plans. This property sets the maximum number of
    * licensed users allowed on a subscription. This quantity can be increased
    * up to the maximum limit defined in the reseller&#39;s contract. The
    * minimum quantity is the current number of users in the customer account.
    * Note: G Suite subscriptions automatically assign a license to every user.
    */
  var maximumNumberOfSeats: js.UndefOr[Double] = js.native
  
  /**
    * This is a required property and is exclusive to subscriptions with
    * ANNUAL_MONTHLY_PAY and ANNUAL_YEARLY_PAY plans. This property sets the
    * maximum number of licenses assignable to users on a subscription. The
    * reseller can add more licenses, but once set, the numberOfSeats cannot be
    * reduced until renewal. The reseller is invoiced based on the
    * numberOfSeats value regardless of how many of these user licenses are
    * assigned. Note: G Suite subscriptions automatically assign a license to
    * every user.
    */
  var numberOfSeats: js.UndefOr[Double] = js.native
}
object SchemaSeats {
  
  @scala.inline
  def apply(): SchemaSeats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeats]
  }
  
  @scala.inline
  implicit class SchemaSeatsMutableBuilder[Self <: SchemaSeats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLicensedNumberOfSeats(value: Double): Self = StObject.set(x, "licensedNumberOfSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensedNumberOfSeatsUndefined: Self = StObject.set(x, "licensedNumberOfSeats", js.undefined)
    
    @scala.inline
    def setMaximumNumberOfSeats(value: Double): Self = StObject.set(x, "maximumNumberOfSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNumberOfSeatsUndefined: Self = StObject.set(x, "maximumNumberOfSeats", js.undefined)
    
    @scala.inline
    def setNumberOfSeats(value: Double): Self = StObject.set(x, "numberOfSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfSeatsUndefined: Self = StObject.set(x, "numberOfSeats", js.undefined)
  }
}
