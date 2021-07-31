package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.FileManagerDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerOptions extends StObject {
  
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
  def apply(): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerOptions]
  }
  
  @scala.inline
  implicit class FileManagerOptionsMutableBuilder[Self <: FileManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumb(value: Boolean | FileManagerBreadcrumb): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
    
    @scala.inline
    def setContextMenu(value: Boolean | FileManagerContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | FileManagerDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDialogs(value: FileManagerDialogs): Self = StObject.set(x, "dialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogsUndefined: Self = StObject.set(x, "dialogs", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExecute(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInitialView(value: String): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialViewUndefined: Self = StObject.set(x, "initialView", js.undefined)
    
    @scala.inline
    def setMessages(value: FileManagerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPreviewPane(value: FileManagerPreviewPane): Self = StObject.set(x, "previewPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewPaneUndefined: Self = StObject.set(x, "previewPane", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | FileManagerToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setUpload(value: js.Any): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    
    @scala.inline
    def setViews(value: FileManagerViews): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
