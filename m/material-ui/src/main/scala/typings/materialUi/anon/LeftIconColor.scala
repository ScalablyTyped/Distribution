package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftIconColor extends js.Object {
  var leftIconColor: js.UndefOr[String] = js.undefined
  var nestedLevelDepth: js.UndefOr[Double] = js.undefined
  var rightIconColor: js.UndefOr[String] = js.undefined
  var secondaryTextColor: js.UndefOr[String] = js.undefined
}

object LeftIconColor {
  @scala.inline
  def apply(
    leftIconColor: String = null,
    nestedLevelDepth: js.UndefOr[Double] = js.undefined,
    rightIconColor: String = null,
    secondaryTextColor: String = null
  ): LeftIconColor = {
    val __obj = js.Dynamic.literal()
    if (leftIconColor != null) __obj.updateDynamic("leftIconColor")(leftIconColor.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedLevelDepth)) __obj.updateDynamic("nestedLevelDepth")(nestedLevelDepth.get.asInstanceOf[js.Any])
    if (rightIconColor != null) __obj.updateDynamic("rightIconColor")(rightIconColor.asInstanceOf[js.Any])
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftIconColor]
  }
}

