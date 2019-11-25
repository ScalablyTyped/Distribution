package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[js.Object] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(message: String = null, regexp: js.Object = null): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Message]
  }
}

