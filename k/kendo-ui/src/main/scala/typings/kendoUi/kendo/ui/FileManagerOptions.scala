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
  
  var dataSource: js.UndefOr[Any | FileManagerDataSource] = js.undefined
  
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
  
  var upload: js.UndefOr[Any] = js.undefined
  
  var uploadUrl: js.UndefOr[String] = js.undefined
  
  var views: js.UndefOr[FileManagerViews] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object FileManagerOptions {
  
  inline def apply(): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerOptions]
  }
  
  extension [Self <: FileManagerOptions](x: Self) {
    
    inline def setBreadcrumb(value: Boolean | FileManagerBreadcrumb): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
    
    inline def setContextMenu(value: Boolean | FileManagerContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setDataBinding(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any | FileManagerDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDialogs(value: FileManagerDialogs): Self = StObject.set(x, "dialogs", value.asInstanceOf[js.Any])
    
    inline def setDialogsUndefined: Self = StObject.set(x, "dialogs", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDrop(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setError(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExecute(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInitialView(value: String): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
    
    inline def setInitialViewUndefined: Self = StObject.set(x, "initialView", js.undefined)
    
    inline def setMessages(value: FileManagerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigate(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    inline def setOpen(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPreviewPane(value: FileManagerPreviewPane): Self = StObject.set(x, "previewPane", value.asInstanceOf[js.Any])
    
    inline def setPreviewPaneUndefined: Self = StObject.set(x, "previewPane", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSelect(value: /* e */ FileManagerEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setToolbar(value: Boolean | FileManagerToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setUpload(value: Any): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    
    inline def setViews(value: FileManagerViews): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
