package typings.keymaster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTagName extends js.Object {
  var tagName: js.UndefOr[String] = js.undefined
}

object AnonTagName {
  @scala.inline
  def apply(tagName: String = null): AnonTagName = {
    val __obj = js.Dynamic.literal()
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTagName]
  }
}

