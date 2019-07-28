package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lower extends js.Object {
  var lower: js.UndefOr[String] = js.undefined
  var upper: js.UndefOr[String] = js.undefined
}

object Anon_Lower {
  @scala.inline
  def apply(lower: String = null, upper: String = null): Anon_Lower = {
    val __obj = js.Dynamic.literal()
    if (lower != null) __obj.updateDynamic("lower")(lower)
    if (upper != null) __obj.updateDynamic("upper")(upper)
    __obj.asInstanceOf[Anon_Lower]
  }
}

