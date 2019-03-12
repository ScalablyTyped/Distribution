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
  def apply(userForId: js.Any => js.Any, userForName: java.lang.String => js.Any): Brain = {
    val __obj = js.Dynamic.literal(userForId = js.Any.fromFunction1(userForId), userForName = js.Any.fromFunction1(userForName))
  
    __obj.asInstanceOf[Brain]
  }
}

