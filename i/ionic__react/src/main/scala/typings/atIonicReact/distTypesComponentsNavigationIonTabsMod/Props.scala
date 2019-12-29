package typings.atIonicReact.distTypesComponentsNavigationIonTabsMod

import typings.atIonicCore.Anon_Tab
import typings.react.reactMod.ReactNode
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typings.atIonicCore.distTypesComponentsMod.LocalJSX.IonTabs {
  var children: ReactNode
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    onIonTabsDidChange: /* event */ CustomEvent[Anon_Tab] => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent[Anon_Tab] => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    __obj.asInstanceOf[Props]
  }
}

