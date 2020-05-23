package typings.ionicReact.ionTabsMod

import typings.ionicCore.anon.Tab
import typings.react.mod.ReactNode
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typings.ionicCore.componentsMod.LocalJSX.IonTabs {
  var children: ChildFunction | ReactNode
}

object Props {
  @scala.inline
  def apply(
    children: ChildFunction | ReactNode = null,
    onIonTabsDidChange: /* event */ CustomEvent[Tab] => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent[Tab] => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    __obj.asInstanceOf[Props]
  }
}

