package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UICollection extends js.Object {
  def destroy(): scala.Unit
}

object UICollection {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit]): UICollection = {
    val __obj = js.Dynamic.literal(destroy = destroy)
  
    __obj.asInstanceOf[UICollection]
  }
}

