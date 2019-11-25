package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderSize extends js.Object {
  var borderSize: js.UndefOr[Anon_LargeMedium] = js.undefined
  var edgeSize: js.UndefOr[Anon_Hair] = js.undefined
  var size: js.UndefOr[Anon_FullLarge] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_BorderSize {
  @scala.inline
  def apply(
    borderSize: Anon_LargeMedium = null,
    edgeSize: Anon_Hair = null,
    size: Anon_FullLarge = null,
    value: Int | Double = null
  ): Anon_BorderSize = {
    val __obj = js.Dynamic.literal()
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (edgeSize != null) __obj.updateDynamic("edgeSize")(edgeSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderSize]
  }
}

