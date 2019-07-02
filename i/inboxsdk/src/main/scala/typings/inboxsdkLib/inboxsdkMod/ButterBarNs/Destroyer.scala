package typings
package inboxsdkLib.inboxsdkMod.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroyer extends js.Object {
  def destroy(): scala.Unit
}

object Destroyer {
  @scala.inline
  def apply(destroy: () => scala.Unit): Destroyer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[Destroyer]
  }
}

