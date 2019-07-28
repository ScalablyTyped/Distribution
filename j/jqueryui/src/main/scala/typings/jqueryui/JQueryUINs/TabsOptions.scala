package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tabs //////////////////////////////////////////////////
trait TabsOptions extends TabsEvents {
  var active: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var classes: js.UndefOr[TabClasses] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[js.Any] = js.undefined
   // boolean or []
  var event: js.UndefOr[String] = js.undefined
  var heightStyle: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var show: js.UndefOr[js.Any] = js.undefined
}

object TabsOptions {
  @scala.inline
  def apply(
    activate: TabsEvent[TabsActivationUIParams] = null,
    active: js.Any = null,
    beforeActivate: TabsEvent[TabsActivationUIParams] = null,
    beforeLoad: TabsEvent[TabsBeforeLoadUIParams] = null,
    classes: TabClasses = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    create: TabsEvent[TabsCreateOrLoadUIParams] = null,
    disabled: js.Any = null,
    event: String = null,
    heightStyle: String = null,
    hide: js.Any = null,
    load: TabsEvent[TabsCreateOrLoadUIParams] = null,
    show: js.Any = null
  ): TabsOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (active != null) __obj.updateDynamic("active")(active)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(beforeActivate)
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(beforeLoad)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (create != null) __obj.updateDynamic("create")(create)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (event != null) __obj.updateDynamic("event")(event)
    if (heightStyle != null) __obj.updateDynamic("heightStyle")(heightStyle)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (load != null) __obj.updateDynamic("load")(load)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[TabsOptions]
  }
}

