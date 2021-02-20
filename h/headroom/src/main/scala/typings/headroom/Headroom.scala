package typings.headroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headroom extends StObject {
  
  /** destroy the headroom instance, removing event listeners and any classes added */
  def destroy(): Unit = js.native
  
  /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
  def freeze(): Unit = js.native
  
  /** initialise */
  def init(): Unit = js.native
  
  /** forcibly set the headroom instance's state to pinned */
  def pin(): Unit = js.native
  
  /** resume responding to scroll events */
  def unfreeze(): Unit = js.native
  
  /** forcibly set the headroom instance's state to unpinned */
  def unpin(): Unit = js.native
}
object Headroom {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    freeze: () => Unit,
    init: () => Unit,
    pin: () => Unit,
    unfreeze: () => Unit,
    unpin: () => Unit
  ): Headroom = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), freeze = js.Any.fromFunction0(freeze), init = js.Any.fromFunction0(init), pin = js.Any.fromFunction0(pin), unfreeze = js.Any.fromFunction0(unfreeze), unpin = js.Any.fromFunction0(unpin))
    __obj.asInstanceOf[Headroom]
  }
  
  @scala.inline
  implicit class HeadroomMutableBuilder[Self <: Headroom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFreeze(value: () => Unit): Self = StObject.set(x, "freeze", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPin(value: () => Unit): Self = StObject.set(x, "pin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnfreeze(value: () => Unit): Self = StObject.set(x, "unfreeze", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnpin(value: () => Unit): Self = StObject.set(x, "unpin", js.Any.fromFunction0(value))
  }
}
