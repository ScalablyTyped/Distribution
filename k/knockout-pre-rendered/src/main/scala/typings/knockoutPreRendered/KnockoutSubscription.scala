package typings.knockoutPreRendered

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutSubscription extends StObject {
  
  def dispose(): Unit = js.native
}
object KnockoutSubscription {
  
  @scala.inline
  def apply(dispose: () => Unit): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[KnockoutSubscription]
  }
  
  @scala.inline
  implicit class KnockoutSubscriptionMutableBuilder[Self <: KnockoutSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
