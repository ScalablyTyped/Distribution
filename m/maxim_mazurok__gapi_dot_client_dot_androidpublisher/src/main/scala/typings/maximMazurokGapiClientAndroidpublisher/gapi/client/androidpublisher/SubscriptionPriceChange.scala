package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPriceChange extends js.Object {
  
  /** The new price the subscription will renew with if the price change is accepted by the user. */
  var newPrice: js.UndefOr[Price] = js.native
  
  /**
    * The current state of the price change. Possible values are: 0. Outstanding: State for a pending price change waiting for the user to agree. In this state, you can optionally seek
    * confirmation from the user using the In-App API. 1. Accepted: State for an accepted price change that the subscription will renew with unless it's canceled. The price change takes
    * effect on a future date when the subscription renews. Note that the change might not occur when the subscription is renewed next.
    */
  var state: js.UndefOr[Double] = js.native
}
object SubscriptionPriceChange {
  
  @scala.inline
  def apply(): SubscriptionPriceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPriceChange]
  }
  
  @scala.inline
  implicit class SubscriptionPriceChangeOps[Self <: SubscriptionPriceChange] (val x: Self) extends AnyVal {
    
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
    def setNewPrice(value: Price): Self = this.set("newPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPrice: Self = this.set("newPrice", js.undefined)
    
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
