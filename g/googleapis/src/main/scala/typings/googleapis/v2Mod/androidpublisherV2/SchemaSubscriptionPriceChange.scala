package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the price change information for a subscription that can be used
  * to control the user journey for the price change in the app. This can be in
  * the form of seeking confirmation from the user or tailoring the experience
  * for a successful conversion.
  */
trait SchemaSubscriptionPriceChange extends StObject {
  
  /**
    * The new price the subscription will renew with if the price change is
    * accepted by the user.
    */
  var newPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The current state of the price change. Possible values are:   -
    * Outstanding: State for a pending price change waiting for the user to
    * agree. In this state, you can optionally seek confirmation from the user
    * using the In-App API.  - Accepted: State for an accepted price change
    * that the subscription will renew with unless it&#39;s canceled. The price
    * change takes effect on a future date when the subscription renews. Note
    * that the change might not occur when the subscription is renewed next.
    */
  var state: js.UndefOr[Double] = js.undefined
}
object SchemaSubscriptionPriceChange {
  
  inline def apply(): SchemaSubscriptionPriceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPriceChange]
  }
  
  extension [Self <: SchemaSubscriptionPriceChange](x: Self) {
    
    inline def setNewPrice(value: SchemaPrice): Self = StObject.set(x, "newPrice", value.asInstanceOf[js.Any])
    
    inline def setNewPriceUndefined: Self = StObject.set(x, "newPrice", js.undefined)
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
