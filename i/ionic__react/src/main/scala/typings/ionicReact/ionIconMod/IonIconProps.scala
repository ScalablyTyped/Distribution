package typings.ionicReact.ionIconMod

import typings.ionicReact.AnonIos
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonIconProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var flipRtl: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[AnonIos] = js.undefined
  var ios: js.UndefOr[AnonIos] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var md: js.UndefOr[AnonIos] = js.undefined
  var mode: js.UndefOr[ios | md] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object IonIconProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    color: String = null,
    flipRtl: js.UndefOr[Boolean] = js.undefined,
    icon: AnonIos = null,
    ios: AnonIos = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    md: AnonIos = null,
    mode: ios | md = null,
    name: String = null,
    size: String = null,
    src: String = null
  ): IonIconProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(flipRtl)) __obj.updateDynamic("flipRtl")(flipRtl.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonIconProps]
  }
}

