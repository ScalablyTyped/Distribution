package typings.atIonicReact

import typings.atIonicReact.atIonicReactStrings.bottom
import typings.atIonicReact.atIonicReactStrings.top
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var currentPath: js.UndefOr[String] = js.undefined
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Anon_Tab], Unit]] = js.undefined
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Anon_Tab], Unit]] = js.undefined
  var slot: js.UndefOr[bottom | top] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    currentPath: String = null,
    onIonTabsDidChange: /* event */ CustomEvent[Anon_Tab] => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent[Anon_Tab] => Unit = null,
    slot: bottom | top = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath)
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

