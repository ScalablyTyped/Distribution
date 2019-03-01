package typings
package hubotLib.hubotMod.HubotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brain extends js.Object {
  def userForId(id: js.Any): js.Any
  def userForName(name: java.lang.String): js.Any
}

object Brain {
  @scala.inline
  def apply(userForId: js.Function1[js.Any, js.Any], userForName: js.Function1[java.lang.String, js.Any]): Brain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userForId")(userForId)
    __obj.updateDynamic("userForName")(userForName)
    __obj.asInstanceOf[Brain]
  }
}

