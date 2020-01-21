package typings.ionicReact

import typings.ionicReact.ionicReactStrings.bottom
import typings.ionicReact.ionicReactStrings.top
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var currentPath: js.UndefOr[String] = js.undefined
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[AnonTab], Unit]] = js.undefined
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[AnonTab], Unit]] = js.undefined
  var slot: js.UndefOr[bottom | top] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(
    currentPath: String = null,
    onIonTabsDidChange: /* event */ CustomEvent[AnonTab] => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent[AnonTab] => Unit = null,
    slot: bottom | top = null
  ): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

