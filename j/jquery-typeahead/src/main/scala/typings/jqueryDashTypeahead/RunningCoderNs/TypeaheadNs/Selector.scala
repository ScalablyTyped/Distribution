package typings.jqueryDashTypeahead.RunningCoderNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selector extends js.Object {
  var backdrop: js.UndefOr[String] = js.undefined
  var button: js.UndefOr[String] = js.undefined
  var cancelButton: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var dropdown: js.UndefOr[String] = js.undefined
  var dropdownItem: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filterButton: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var hint: js.UndefOr[String] = js.undefined
  var item: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelContainer: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var result: js.UndefOr[String] = js.undefined
}

object Selector {
  @scala.inline
  def apply(
    backdrop: String = null,
    button: String = null,
    cancelButton: String = null,
    container: String = null,
    display: String = null,
    dropdown: String = null,
    dropdownItem: String = null,
    empty: String = null,
    filter: String = null,
    filterButton: String = null,
    group: String = null,
    hint: String = null,
    item: String = null,
    label: String = null,
    labelContainer: String = null,
    list: String = null,
    query: String = null,
    result: String = null
  ): Selector = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop)
    if (button != null) __obj.updateDynamic("button")(button)
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton)
    if (container != null) __obj.updateDynamic("container")(container)
    if (display != null) __obj.updateDynamic("display")(display)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    if (dropdownItem != null) __obj.updateDynamic("dropdownItem")(dropdownItem)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterButton != null) __obj.updateDynamic("filterButton")(filterButton)
    if (group != null) __obj.updateDynamic("group")(group)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (item != null) __obj.updateDynamic("item")(item)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelContainer != null) __obj.updateDynamic("labelContainer")(labelContainer)
    if (list != null) __obj.updateDynamic("list")(list)
    if (query != null) __obj.updateDynamic("query")(query)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Selector]
  }
}

