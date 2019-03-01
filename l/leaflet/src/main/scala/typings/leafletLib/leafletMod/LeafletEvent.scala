package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletEvent extends js.Object {
  var target: js.Any
  var `type`: java.lang.String
}

object LeafletEvent {
  @scala.inline
  def apply(target: js.Any, `type`: java.lang.String): LeafletEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LeafletEvent]
  }
}

