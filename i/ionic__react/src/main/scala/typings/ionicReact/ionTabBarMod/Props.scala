package typings.ionicReact.ionTabBarMod

import typings.ionicCore.mod.Color
import typings.ionicReact.AnonTab
import typings.ionicReact.ionicReactStrings.bottom
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.ionicReact.ionicReactStrings.top
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/core.@ionic/core.JSX.IonTabBar & {onIonTabsDidChange ? (event : std.CustomEvent<{  tab  :string}>): void, onIonTabsWillChange ? (event : std.CustomEvent<{  tab  :string}>): void,   currentPath ? :string,   slot ? :'bottom' | 'top'} */
trait Props extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  var currentPath: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[AnonTab], Unit]] = js.undefined
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[AnonTab], Unit]] = js.undefined
  /**
    * The selected tab component
    */
  var selectedTab: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[bottom | top] = js.undefined
  /**
    * If `true`, the tab bar will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    color: Color = null,
    currentPath: String = null,
    mode: ios | md = null,
    onIonTabsDidChange: /* event */ CustomEvent[AnonTab] => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent[AnonTab] => Unit = null,
    selectedTab: String = null,
    slot: bottom | top = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

