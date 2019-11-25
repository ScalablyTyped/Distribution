package typings.atKiwicomOrbitDashDesignDashTokens.atKiwicomOrbitDashDesignDashTokensMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPalette extends js.Object {
  var blue: js.UndefOr[Partial[StatusColor]] = js.undefined
  var cloud: js.UndefOr[Partial[CloudColor]] = js.undefined
  var green: js.UndefOr[Partial[StatusColor]] = js.undefined
  var ink: js.UndefOr[Partial[InkColor]] = js.undefined
  var orange: js.UndefOr[Partial[StatusColor]] = js.undefined
  var product: js.UndefOr[Partial[ProductColor]] = js.undefined
  var red: js.UndefOr[Partial[StatusColor]] = js.undefined
  var social: js.UndefOr[Partial[SocialColor]] = js.undefined
  var white: js.UndefOr[Partial[WhiteColor]] = js.undefined
}

object CustomPalette {
  @scala.inline
  def apply(
    blue: Partial[StatusColor] = null,
    cloud: Partial[CloudColor] = null,
    green: Partial[StatusColor] = null,
    ink: Partial[InkColor] = null,
    orange: Partial[StatusColor] = null,
    product: Partial[ProductColor] = null,
    red: Partial[StatusColor] = null,
    social: Partial[SocialColor] = null,
    white: Partial[WhiteColor] = null
  ): CustomPalette = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (cloud != null) __obj.updateDynamic("cloud")(cloud.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (ink != null) __obj.updateDynamic("ink")(ink.asInstanceOf[js.Any])
    if (orange != null) __obj.updateDynamic("orange")(orange.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    if (social != null) __obj.updateDynamic("social")(social.asInstanceOf[js.Any])
    if (white != null) __obj.updateDynamic("white")(white.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPalette]
  }
}

