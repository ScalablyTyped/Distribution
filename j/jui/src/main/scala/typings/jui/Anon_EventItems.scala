package typings.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItems extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
   // name, group, type
  var viewport: js.UndefOr[String] = js.undefined
}

object Anon_EventItems {
  @scala.inline
  def apply(
    event: js.Any = null,
    items: js.Array[_] = null,
    sort: String = null,
    tpl: js.Any = null,
    viewport: String = null
  ): Anon_EventItems = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventItems]
  }
}

