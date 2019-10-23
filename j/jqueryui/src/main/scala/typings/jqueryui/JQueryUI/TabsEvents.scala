package typings.jqueryui.JQueryUI

import typings.jquery.JQuery.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsEvents extends js.Object {
  var activate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.undefined
  var beforeActivate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.undefined
  var beforeLoad: js.UndefOr[TabsEvent[TabsBeforeLoadUIParams]] = js.undefined
  var create: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.undefined
  var load: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.undefined
}

object TabsEvents {
  @scala.inline
  def apply(
    activate: (/* event */ Event, TabsActivationUIParams) => Unit = null,
    beforeActivate: (/* event */ Event, TabsActivationUIParams) => Unit = null,
    beforeLoad: (/* event */ Event, TabsBeforeLoadUIParams) => Unit = null,
    create: (/* event */ Event, TabsCreateOrLoadUIParams) => Unit = null,
    load: (/* event */ Event, TabsCreateOrLoadUIParams) => Unit = null
  ): TabsEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2(beforeActivate))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction2(beforeLoad))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2(load))
    __obj.asInstanceOf[TabsEvents]
  }
}

