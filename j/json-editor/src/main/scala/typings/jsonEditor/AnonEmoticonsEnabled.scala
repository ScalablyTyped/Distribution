package typings.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmoticonsEnabled extends js.Object {
  var emoticonsEnabled: Boolean
}

object AnonEmoticonsEnabled {
  @scala.inline
  def apply(emoticonsEnabled: Boolean): AnonEmoticonsEnabled = {
    val __obj = js.Dynamic.literal(emoticonsEnabled = emoticonsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmoticonsEnabled]
  }
}

