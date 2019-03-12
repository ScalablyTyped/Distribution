package typings
package atMaterialBaseLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFoundation[A] extends js.Object {
  // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
  def destroy(): scala.Unit
  // Subclasses should override this method to perform initialization routines (registering events, etc.)
  def init(): scala.Unit
}

object MDCFoundation {
  @scala.inline
  def apply[A](destroy: () => scala.Unit, init: () => scala.Unit): MDCFoundation[A] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
  
    __obj.asInstanceOf[MDCFoundation[A]]
  }
}

