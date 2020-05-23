package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmoticonsEnabled extends js.Object {
  var emoticonsEnabled: Boolean
}

object EmoticonsEnabled {
  @scala.inline
  def apply(emoticonsEnabled: Boolean): EmoticonsEnabled = {
    val __obj = js.Dynamic.literal(emoticonsEnabled = emoticonsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmoticonsEnabled]
  }
}

