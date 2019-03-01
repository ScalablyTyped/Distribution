package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ ListBoxAddEvent, scala.Unit]] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ListBoxEvent, scala.Unit]] = js.undefined
  var connectWith: js.UndefOr[java.lang.String] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListBoxEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var dataValueField: js.UndefOr[java.lang.String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ ListBoxDragEvent, scala.Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ ListBoxDragendEvent, scala.Unit]] = js.undefined
  var draggable: js.UndefOr[scala.Boolean | ListBoxDraggable] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ ListBoxDragstartEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ ListBoxDropEvent, scala.Unit]] = js.undefined
  var dropSources: js.UndefOr[js.Any] = js.undefined
  var messages: js.UndefOr[ListBoxMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ ListBoxRemoveEvent, scala.Unit]] = js.undefined
  var reorder: js.UndefOr[js.Function1[/* e */ ListBoxReorderEvent, scala.Unit]] = js.undefined
  var selectable: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var toolbar: js.UndefOr[ListBoxToolbar] = js.undefined
}

object ListBoxOptions {
  @scala.inline
  def apply(
    add: js.Function1[/* e */ ListBoxAddEvent, scala.Unit] = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ ListBoxEvent, scala.Unit] = null,
    connectWith: java.lang.String = null,
    dataBound: js.Function1[/* e */ ListBoxEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataTextField: java.lang.String = null,
    dataValueField: java.lang.String = null,
    drag: js.Function1[/* e */ ListBoxDragEvent, scala.Unit] = null,
    dragend: js.Function1[/* e */ ListBoxDragendEvent, scala.Unit] = null,
    draggable: scala.Boolean | ListBoxDraggable = null,
    dragstart: js.Function1[/* e */ ListBoxDragstartEvent, scala.Unit] = null,
    drop: js.Function1[/* e */ ListBoxDropEvent, scala.Unit] = null,
    dropSources: js.Any = null,
    messages: ListBoxMessages = null,
    name: java.lang.String = null,
    navigatable: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.Function1[/* e */ ListBoxRemoveEvent, scala.Unit] = null,
    reorder: js.Function1[/* e */ ListBoxReorderEvent, scala.Unit] = null,
    selectable: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    toolbar: ListBoxToolbar = null
  ): ListBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (change != null) __obj.updateDynamic("change")(change)
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragend != null) __obj.updateDynamic("dragend")(dragend)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dragstart != null) __obj.updateDynamic("dragstart")(dragstart)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (dropSources != null) __obj.updateDynamic("dropSources")(dropSources)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (reorder != null) __obj.updateDynamic("reorder")(reorder)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[ListBoxOptions]
  }
}

