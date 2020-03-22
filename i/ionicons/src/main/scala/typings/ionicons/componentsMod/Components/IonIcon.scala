package typings.ionicons.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonIcon extends js.Object {
  /**
    * Specifies the label to use for accessibility. Defaults to the icon name.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The color to use for the background of the item.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the icon should horizontally flip when `dir` is `"rtl"`.
    */
  var flipRtl: js.UndefOr[Boolean] = js.undefined
  /**
    * A combination of both `name` and `src`. If a `src` url is detected it will set the `src` property. Otherwise it assumes it's a built-in named SVG and set the `name` property.
    */
  var icon: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies which icon to use on `ios` mode.
    */
  var ios: js.UndefOr[String] = js.undefined
  /**
    * If enabled, ion-icon will be loaded lazily when it's visible in the viewport. Default, `false`.
    */
  var `lazy`: Boolean
  /**
    * Specifies which icon to use on `md` mode.
    */
  var md: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: String
  /**
    * Specifies which icon to use from the built-in set of icons.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The size of the icon. Available options are: `"small"` and `"large"`.
    */
  var size: js.UndefOr[String] = js.undefined
  /**
    * Specifies the exact `src` of an SVG file to use.
    */
  var src: js.UndefOr[String] = js.undefined
}

object IonIcon {
  @scala.inline
  def apply(
    `lazy`: Boolean,
    mode: String,
    ariaLabel: String = null,
    color: String = null,
    flipRtl: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any = null,
    ios: String = null,
    md: String = null,
    name: String = null,
    size: String = null,
    src: String = null
  ): IonIcon = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(flipRtl)) __obj.updateDynamic("flipRtl")(flipRtl.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonIcon]
  }
}

