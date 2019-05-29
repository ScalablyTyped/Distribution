package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTabBar extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * The selected tab component
    */
  var selectedTab: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `true`, the tab bar will be translucent.
    */
  var translucent: scala.Boolean
}

object IonTabBar {
  @scala.inline
  def apply(
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    translucent: scala.Boolean,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    selectedTab: java.lang.String = null
  ): IonTabBar = {
    val __obj = js.Dynamic.literal(mode = mode, translucent = translucent)
    if (color != null) __obj.updateDynamic("color")(color)
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab)
    __obj.asInstanceOf[IonTabBar]
  }
}

