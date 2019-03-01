package typings
package atIonicDiscoverLib.distPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interface extends js.Object {
  var address: java.lang.String
  var broadcast: java.lang.String
}

object Interface {
  @scala.inline
  def apply(address: java.lang.String, broadcast: java.lang.String): Interface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("broadcast")(broadcast)
    __obj.asInstanceOf[Interface]
  }
}

