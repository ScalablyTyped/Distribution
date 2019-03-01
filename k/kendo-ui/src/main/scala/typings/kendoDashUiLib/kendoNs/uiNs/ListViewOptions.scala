package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewOptions extends js.Object {
  var altTemplate: js.UndefOr[js.Function] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ ListViewCancelEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ ListViewEditEvent, scala.Unit]] = js.undefined
  var editTemplate: js.UndefOr[js.Function] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ ListViewRemoveEvent, scala.Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ ListViewSaveEvent, scala.Unit]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var template: js.UndefOr[js.Function] = js.undefined
}

object ListViewOptions {
  @scala.inline
  def apply(
    altTemplate: js.Function = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: js.Function1[/* e */ ListViewCancelEvent, scala.Unit] = null,
    change: js.Function1[/* e */ ListViewEvent, scala.Unit] = null,
    dataBinding: js.Function1[/* e */ ListViewEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ ListViewEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    edit: js.Function1[/* e */ ListViewEditEvent, scala.Unit] = null,
    editTemplate: js.Function = null,
    name: java.lang.String = null,
    navigatable: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.Function1[/* e */ ListViewRemoveEvent, scala.Unit] = null,
    save: js.Function1[/* e */ ListViewSaveEvent, scala.Unit] = null,
    selectable: scala.Boolean | java.lang.String = null,
    template: js.Function = null
  ): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    if (altTemplate != null) __obj.updateDynamic("altTemplate")(altTemplate)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (change != null) __obj.updateDynamic("change")(change)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (editTemplate != null) __obj.updateDynamic("editTemplate")(editTemplate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (save != null) __obj.updateDynamic("save")(save)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ListViewOptions]
  }
}

