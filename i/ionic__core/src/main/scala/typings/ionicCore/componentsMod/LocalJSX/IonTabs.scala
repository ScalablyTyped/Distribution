package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.anon.Tab
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTabs extends js.Object {
  /**
    * Emitted when the navigation has finished transitioning to a new component.
    */
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Tab], Unit]] = js.undefined
  /**
    * Emitted when the navigation is about to transition to a new component.
    */
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Tab], Unit]] = js.undefined
}

object IonTabs {
  @scala.inline
  def apply(
    onIonTabsDidChange: /* event */ CustomEvent[Tab] => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent[Tab] => Unit = null
  ): IonTabs = {
    val __obj = js.Dynamic.literal()
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    __obj.asInstanceOf[IonTabs]
  }
}

