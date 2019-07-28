package typings.listr.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrEvent extends js.Object {
  var `type`: String
}

object ListrEvent {
  @scala.inline
  def apply(`type`: String): ListrEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListrEvent]
  }
}

