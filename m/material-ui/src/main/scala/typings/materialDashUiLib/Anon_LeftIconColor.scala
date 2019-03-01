package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeftIconColor extends js.Object {
  var leftIconColor: js.UndefOr[java.lang.String] = js.undefined
  var nestedLevelDepth: js.UndefOr[scala.Double] = js.undefined
  var rightIconColor: js.UndefOr[java.lang.String] = js.undefined
  var secondaryTextColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LeftIconColor {
  @scala.inline
  def apply(
    leftIconColor: java.lang.String = null,
    nestedLevelDepth: scala.Int | scala.Double = null,
    rightIconColor: java.lang.String = null,
    secondaryTextColor: java.lang.String = null
  ): Anon_LeftIconColor = {
    val __obj = js.Dynamic.literal()
    if (leftIconColor != null) __obj.updateDynamic("leftIconColor")(leftIconColor)
    if (nestedLevelDepth != null) __obj.updateDynamic("nestedLevelDepth")(nestedLevelDepth.asInstanceOf[js.Any])
    if (rightIconColor != null) __obj.updateDynamic("rightIconColor")(rightIconColor)
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor)
    __obj.asInstanceOf[Anon_LeftIconColor]
  }
}

