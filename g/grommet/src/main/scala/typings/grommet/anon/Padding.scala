package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  var padding: js.UndefOr[String | Vertical] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object Padding {
  @scala.inline
  def apply(padding: String | Vertical = null, weight: js.UndefOr[Double] = js.undefined): Padding = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

