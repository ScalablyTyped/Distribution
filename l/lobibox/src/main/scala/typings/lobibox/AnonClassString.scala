package typings.lobibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassString extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
}

object AnonClassString {
  @scala.inline
  def apply(`class`: String = null): AnonClassString = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassString]
  }
}

