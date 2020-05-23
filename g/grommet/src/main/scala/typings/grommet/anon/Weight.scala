package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Weight extends js.Object {
  var weight: js.UndefOr[String] = js.undefined
}

object Weight {
  @scala.inline
  def apply(weight: String = null): Weight = {
    val __obj = js.Dynamic.literal()
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
}

