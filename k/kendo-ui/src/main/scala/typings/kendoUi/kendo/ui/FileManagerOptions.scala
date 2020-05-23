package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.FileManagerDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerOptions extends js.Object {
  var breadcrumb: js.UndefOr[Boolean | FileManagerBreadcrumb] = js.undefined
  var contextMenu: js.UndefOr[Boolean | FileManagerContextMenu] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | FileManagerDataSource] = js.undefined
  var dialogs: js.UndefOr[FileManagerDialogs] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var execute: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var initialView: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[FileManagerMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var previewPane: js.UndefOr[FileManagerPreviewPane] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var toolbar: js.UndefOr[Boolean | FileManagerToolbar] = js.undefined
  var upload: js.UndefOr[js.Any] = js.undefined
  var uploadUrl: js.UndefOr[String] = js.undefined
  var views: js.UndefOr[FileManagerViews] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object FileManagerOptions {
  @scala.inline
  def apply(
    breadcrumb: Boolean | FileManagerBreadcrumb = null,
    contextMenu: Boolean | FileManagerContextMenu = null,
    dataBinding: /* e */ FileManagerEvent => Unit = null,
    dataBound: /* e */ FileManagerEvent => Unit = null,
    dataSource: js.Any | FileManagerDataSource = null,
    dialogs: FileManagerDialogs = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    drop: /* e */ FileManagerEvent => Unit = null,
    error: /* e */ FileManagerEvent => Unit = null,
    execute: /* e */ FileManagerEvent => Unit = null,
    height: Double | String = null,
    initialView: String = null,
    messages: FileManagerMessages = null,
    name: String = null,
    navigate: /* e */ FileManagerEvent => Unit = null,
    open: /* e */ FileManagerEvent => Unit = null,
    previewPane: FileManagerPreviewPane = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ FileManagerEvent => Unit = null,
    toolbar: Boolean | FileManagerToolbar = null,
    upload: js.Any = null,
    uploadUrl: String = null,
    views: FileManagerViews = null,
    width: Double | String = null
  ): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dialogs != null) __obj.updateDynamic("dialogs")(dialogs.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction1(execute))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (previewPane != null) __obj.updateDynamic("previewPane")(previewPane.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerOptions]
  }
}

