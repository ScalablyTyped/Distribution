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
  def apply[A](destroy: js.Function0[scala.Unit], init: js.Function0[scala.Unit]): MDCFoundation[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[MDCFoundation[A]]
  }
}

