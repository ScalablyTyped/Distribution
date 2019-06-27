package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTabButton extends js.Object {
  /**
    * If `true`, the user cannot interact with the tab button.
    */
  var disabled: scala.Boolean
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the layout of the text and icon in the tab bar. It defaults to `'icon-top'`.
    */
  var layout: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The selected tab component
    */
  var selected: scala.Boolean
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object IonTabButton {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    selected: scala.Boolean,
    download: java.lang.String = null,
    href: java.lang.String = null,
    layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.Any = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null,
    rel: java.lang.String = null,
    tab: java.lang.String = null,
    target: java.lang.String = null
  ): IonTabButton = {
    val __obj = js.Dynamic.literal(disabled = disabled, selected = selected)
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IonTabButton]
  }
}

