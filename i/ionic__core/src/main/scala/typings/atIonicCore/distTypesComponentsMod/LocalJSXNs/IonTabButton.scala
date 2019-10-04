package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsTabDashBarTabDashBarDashInterfaceMod.TabButtonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTabButton extends js.Object {
  /**
    * If `true`, the user cannot interact with the tab button.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[String] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * Set the layout of the text and icon in the tab bar. It defaults to `'icon-top'`.
    */
  var layout: js.UndefOr[TabButtonLayout] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  /**
    * The selected tab component
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: js.UndefOr[String] = js.undefined
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.undefined
}

object IonTabButton {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    download: String = null,
    href: String = null,
    layout: TabButtonLayout = null,
    mode: ios | md = null,
    rel: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tab: String = null,
    target: String = null
  ): IonTabButton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IonTabButton]
  }
}

