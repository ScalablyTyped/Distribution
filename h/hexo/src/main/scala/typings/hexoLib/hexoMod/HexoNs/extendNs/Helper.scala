package typings
package hexoLib.hexoMod.HexoNs.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Helper extends js.Object {
  def register(name: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Unit
}

object Helper {
  @scala.inline
  def apply(register: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, _], scala.Unit]): Helper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[Helper]
  }
}

