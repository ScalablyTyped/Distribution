package typings.jqueryTypeahead.RunningCoder.Typeahead

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
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (dropdownItem != null) __obj.updateDynamic("dropdownItem")(dropdownItem.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterButton != null) __obj.updateDynamic("filterButton")(filterButton.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelContainer != null) __obj.updateDynamic("labelContainer")(labelContainer.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}

