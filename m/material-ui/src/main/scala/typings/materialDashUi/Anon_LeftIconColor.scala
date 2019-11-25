package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeftIconColor extends js.Object {
  var leftIconColor: js.UndefOr[String] = js.undefined
  var nestedLevelDepth: js.UndefOr[Double] = js.undefined
  var rightIconColor: js.UndefOr[String] = js.undefined
  var secondaryTextColor: js.UndefOr[String] = js.undefined
}

object Anon_LeftIconColor {
  @scala.inline
  def apply(
    leftIconColor: String = null,
    nestedLevelDepth: Int | Double = null,
    rightIconColor: String = null,
    secondaryTextColor: String = null
  ): Anon_LeftIconColor = {
    val __obj = js.Dynamic.literal()
    if (leftIconColor != null) __obj.updateDynamic("leftIconColor")(leftIconColor.asInstanceOf[js.Any])
    if (nestedLevelDepth != null) __obj.updateDynamic("nestedLevelDepth")(nestedLevelDepth.asInstanceOf[js.Any])
    if (rightIconColor != null) __obj.updateDynamic("rightIconColor")(rightIconColor.asInstanceOf[js.Any])
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LeftIconColor]
  }
}

