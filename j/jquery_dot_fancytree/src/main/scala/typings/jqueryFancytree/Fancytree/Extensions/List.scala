package typings.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends /* extension */ StringDictionary[js.Any] {
  var dnd5: js.UndefOr[DragAndDrop5] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
}

object List {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    dnd5: DragAndDrop5 = null,
    filter: Filter = null,
    table: Table = null
  ): List = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dnd5 != null) __obj.updateDynamic("dnd5")(dnd5.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

