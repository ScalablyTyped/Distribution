package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTabButton extends js.Object {
  /**
    * The selected tab component
    */
  var disabled: scala.Boolean
  /**
    * The URL which will be used as the `href` within this tab's button anchor.
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
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * The selected tab component
    */
  var selected: scala.Boolean
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: js.UndefOr[java.lang.String] = js.undefined
}

object IonTabButton {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    selected: scala.Boolean,
    href: java.lang.String = null,
    layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.Any = null,
    tab: java.lang.String = null
  ): IonTabButton = {
    val __obj = js.Dynamic.literal(disabled = disabled, mode = mode, selected = selected)
    if (href != null) __obj.updateDynamic("href")(href)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[IonTabButton]
  }
}

