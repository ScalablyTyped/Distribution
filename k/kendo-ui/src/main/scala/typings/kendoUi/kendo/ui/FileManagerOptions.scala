package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.FileManagerDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerOptions extends js.Object {
  
  var breadcrumb: js.UndefOr[Boolean | FileManagerBreadcrumb] = js.native
  
  var contextMenu: js.UndefOr[Boolean | FileManagerContextMenu] = js.native
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | FileManagerDataSource] = js.native
  
  var dialogs: js.UndefOr[FileManagerDialogs] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var drop: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var execute: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var initialView: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[FileManagerMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigate: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var previewPane: js.UndefOr[FileManagerPreviewPane] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.native
  
  var toolbar: js.UndefOr[Boolean | FileManagerToolbar] = js.native
  
  var upload: js.UndefOr[js.Any] = js.native
  
  var uploadUrl: js.UndefOr[String] = js.native
  
  var views: js.UndefOr[FileManagerViews] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object FileManagerOptions {
  
  @scala.inline
  def apply(): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerOptions]
  }
  
  @scala.inline
  implicit class FileManagerOptionsOps[Self <: FileManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBreadcrumb(value: Boolean | FileManagerBreadcrumb): Self = this.set("breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumb: Self = this.set("breadcrumb", js.undefined)
    
    @scala.inline
    def setContextMenu(value: Boolean | FileManagerContextMenu): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ FileManagerEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ FileManagerEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | FileManagerDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDialogs(value: FileManagerDialogs): Self = this.set("dialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogs: Self = this.set("dialogs", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ FileManagerEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ FileManagerEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExecute(value: /* e */ FileManagerEvent => Unit): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInitialView(value: String): Self = this.set("initialView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialView: Self = this.set("initialView", js.undefined)
    
    @scala.inline
    def setMessages(value: FileManagerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ FileManagerEvent => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ FileManagerEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPreviewPane(value: FileManagerPreviewPane): Self = this.set("previewPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewPane: Self = this.set("previewPane", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ FileManagerEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | FileManagerToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setUpload(value: js.Any): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
    
    @scala.inline
    def setViews(value: FileManagerViews): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
