package typings.kiwicomOrbitDesignTokens.mod

import typings.kiwicomOrbitDesignTokens.anon.PartialCloudColor
import typings.kiwicomOrbitDesignTokens.anon.PartialInkColor
import typings.kiwicomOrbitDesignTokens.anon.PartialProductColor
import typings.kiwicomOrbitDesignTokens.anon.PartialSocialColor
import typings.kiwicomOrbitDesignTokens.anon.PartialStatusColor
import typings.kiwicomOrbitDesignTokens.anon.PartialWhiteColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPalette extends js.Object {
  var blue: js.UndefOr[PartialStatusColor] = js.undefined
  var cloud: js.UndefOr[PartialCloudColor] = js.undefined
  var green: js.UndefOr[PartialStatusColor] = js.undefined
  var ink: js.UndefOr[PartialInkColor] = js.undefined
  var orange: js.UndefOr[PartialStatusColor] = js.undefined
  var product: js.UndefOr[PartialProductColor] = js.undefined
  var red: js.UndefOr[PartialStatusColor] = js.undefined
  var social: js.UndefOr[PartialSocialColor] = js.undefined
  var white: js.UndefOr[PartialWhiteColor] = js.undefined
}

object CustomPalette {
  @scala.inline
  def apply(
    blue: PartialStatusColor = null,
    cloud: PartialCloudColor = null,
    green: PartialStatusColor = null,
    ink: PartialInkColor = null,
    orange: PartialStatusColor = null,
    product: PartialProductColor = null,
    red: PartialStatusColor = null,
    social: PartialSocialColor = null,
    white: PartialWhiteColor = null
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

