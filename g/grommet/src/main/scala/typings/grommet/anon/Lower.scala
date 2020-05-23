package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lower extends js.Object {
  var lower: js.UndefOr[String] = js.undefined
  var upper: js.UndefOr[String] = js.undefined
}

object Lower {
  @scala.inline
  def apply(lower: String = null, upper: String = null): Lower = {
    val __obj = js.Dynamic.literal()
    if (lower != null) __obj.updateDynamic("lower")(lower.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lower]
  }
}

