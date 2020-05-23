package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hint extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var text: String
  var tripId: js.UndefOr[String] = js.undefined
  var `type`: hint
}

object Hint {
  @scala.inline
  def apply(text: String, `type`: hint, code: String = null, summary: String = null, tripId: String = null): Hint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (tripId != null) __obj.updateDynamic("tripId")(tripId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
}

