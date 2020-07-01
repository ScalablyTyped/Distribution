package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Weight extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double | String] = js.undefined
}

object Weight {
  @scala.inline
  def apply(height: String = null, size: String = null, weight: Double | String = null): Weight = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
}

