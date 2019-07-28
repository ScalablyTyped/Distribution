package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewOptions extends js.Object {
  var altTemplate: js.UndefOr[js.Function] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ ListViewCancelEvent, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ ListViewEditEvent, Unit]] = js.undefined
  var editTemplate: js.UndefOr[js.Function] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigatable: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ ListViewRemoveEvent, Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ ListViewSaveEvent, Unit]] = js.undefined
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  var template: js.UndefOr[js.Function] = js.undefined
}

object ListViewOptions {
  @scala.inline
  def apply(
    altTemplate: js.Function = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    cancel: /* e */ ListViewCancelEvent => Unit = null,
    change: /* e */ ListViewEvent => Unit = null,
    dataBinding: /* e */ ListViewEvent => Unit = null,
    dataBound: /* e */ ListViewEvent => Unit = null,
    dataSource: js.Any | DataSource = null,
    edit: /* e */ ListViewEditEvent => Unit = null,
    editTemplate: js.Function = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    remove: /* e */ ListViewRemoveEvent => Unit = null,
    save: /* e */ ListViewSaveEvent => Unit = null,
    selectable: Boolean | String = null,
    template: js.Function = null
  ): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    if (altTemplate != null) __obj.updateDynamic("altTemplate")(altTemplate)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (editTemplate != null) __obj.updateDynamic("editTemplate")(editTemplate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ListViewOptions]
  }
}

