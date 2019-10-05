package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.submit
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemOption extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the item option.
    */
  var disabled: Boolean
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the option will expand to take up the available width and cover any other options.
    */
  var expandable: Boolean
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button
}

object IonItemOption {
  @scala.inline
  def apply(
    disabled: Boolean,
    expandable: Boolean,
    `type`: submit | reset | button,
    color: Color = null,
    download: String = null,
    href: String = null,
    mode: ios | md = null,
    rel: String = null,
    target: String = null
  ): IonItemOption = {
    val __obj = js.Dynamic.literal(disabled = disabled, expandable = expandable)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IonItemOption]
  }
}

