package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutSubscription extends StObject {
  
  var deferUpdates: Boolean
}
object KnockoutSubscription {
  
  @scala.inline
  def apply(deferUpdates: Boolean): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscription]
  }
  
  @scala.inline
  implicit class KnockoutSubscriptionMutableBuilder[Self <: KnockoutSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferUpdates(value: Boolean): Self = StObject.set(x, "deferUpdates", value.asInstanceOf[js.Any])
  }
}
