package typings.jqueryui.JQueryUINs

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
    activate: TabsEvent[TabsActivationUIParams] = null,
    beforeActivate: TabsEvent[TabsActivationUIParams] = null,
    beforeLoad: TabsEvent[TabsBeforeLoadUIParams] = null,
    create: TabsEvent[TabsCreateOrLoadUIParams] = null,
    load: TabsEvent[TabsCreateOrLoadUIParams] = null
  ): TabsEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(beforeActivate)
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(beforeLoad)
    if (create != null) __obj.updateDynamic("create")(create)
    if (load != null) __obj.updateDynamic("load")(load)
    __obj.asInstanceOf[TabsEvents]
  }
}

