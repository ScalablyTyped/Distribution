package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelPot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPotSealed extends StObject {
  
  var onPotSealed: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Unit]] = js.undefined
  
  var payoutTimeoutMinutes: js.UndefOr[Double] = js.undefined
  
  var shouldSealPot: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Boolean]] = js.undefined
}
object OnPotSealed {
  
  @scala.inline
  def apply(): OnPotSealed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPotSealed]
  }
  
  @scala.inline
  implicit class OnPotSealedMutableBuilder[Self <: OnPotSealed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPotSealed(value: /* pot */ KnuddelPot => Unit): Self = StObject.set(x, "onPotSealed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPotSealedUndefined: Self = StObject.set(x, "onPotSealed", js.undefined)
    
    @scala.inline
    def setPayoutTimeoutMinutes(value: Double): Self = StObject.set(x, "payoutTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayoutTimeoutMinutesUndefined: Self = StObject.set(x, "payoutTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setShouldSealPot(value: /* pot */ KnuddelPot => Boolean): Self = StObject.set(x, "shouldSealPot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldSealPotUndefined: Self = StObject.set(x, "shouldSealPot", js.undefined)
  }
}
