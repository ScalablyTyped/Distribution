package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
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
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The selected tab component
    */
  var selectedTab: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the tab bar will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: Boolean
}

object IonTabBar {
  @scala.inline
  def apply(
    translucent: Boolean,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    mode: ios | md = null,
    selectedTab: String = null
  ): IonTabBar = {
    val __obj = js.Dynamic.literal(translucent = translucent.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTabBar]
  }
}

