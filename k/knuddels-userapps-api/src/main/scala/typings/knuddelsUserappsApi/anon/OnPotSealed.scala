package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelPot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPotSealed extends js.Object {
  
  var onPotSealed: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Unit]] = js.native
  
  var payoutTimeoutMinutes: js.UndefOr[Double] = js.native
  
  var shouldSealPot: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Boolean]] = js.native
}
object OnPotSealed {
  
  @scala.inline
  def apply(): OnPotSealed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPotSealed]
  }
  
  @scala.inline
  implicit class OnPotSealedOps[Self <: OnPotSealed] (val x: Self) extends AnyVal {
    
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
    def setOnPotSealed(value: /* pot */ KnuddelPot => Unit): Self = this.set("onPotSealed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPotSealed: Self = this.set("onPotSealed", js.undefined)
    
    @scala.inline
    def setPayoutTimeoutMinutes(value: Double): Self = this.set("payoutTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayoutTimeoutMinutes: Self = this.set("payoutTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setShouldSealPot(value: /* pot */ KnuddelPot => Boolean): Self = this.set("shouldSealPot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldSealPot: Self = this.set("shouldSealPot", js.undefined)
  }
}
