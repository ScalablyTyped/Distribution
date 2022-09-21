package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptions
  extends StObject
     with AllEditorOptions {
  
  var change: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  
  var deserialization: js.UndefOr[EditorDeserialization] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var encoded: js.UndefOr[Boolean] = js.undefined
  
  var execute: js.UndefOr[js.Function1[/* e */ EditorExecuteEvent, Unit]] = js.undefined
  
  var fileBrowser: js.UndefOr[EditorFileBrowser] = js.undefined
  
  var imageBrowser: js.UndefOr[EditorImageBrowser] = js.undefined
  
  var immutables: js.UndefOr[Boolean | EditorImmutables] = js.undefined
  
  var keydown: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  
  var keyup: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  
  var messages: js.UndefOr[EditorMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var paste: js.UndefOr[js.Function1[/* e */ EditorPasteEvent, Unit]] = js.undefined
  
  var pasteCleanup: js.UndefOr[EditorPasteCleanup] = js.undefined
  
  var pdf: js.UndefOr[EditorPdf] = js.undefined
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ EditorPdfExportEvent, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var resizable: js.UndefOr[Boolean | EditorResizable] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.undefined
  
  var serialization: js.UndefOr[EditorSerialization] = js.undefined
  
  var stylesheets: js.UndefOr[Any] = js.undefined
  
  var tools: js.UndefOr[js.Array[EditorTool | String]] = js.undefined
}
object EditorOptions {
  
  inline def apply(): EditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions]
  }
  
  extension [Self <: EditorOptions](x: Self) {
    
    inline def setChange(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDeserialization(value: EditorDeserialization): Self = StObject.set(x, "deserialization", value.asInstanceOf[js.Any])
    
    inline def setDeserializationUndefined: Self = StObject.set(x, "deserialization", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    inline def setExecute(value: /* e */ EditorExecuteEvent => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    inline def setFileBrowser(value: EditorFileBrowser): Self = StObject.set(x, "fileBrowser", value.asInstanceOf[js.Any])
    
    inline def setFileBrowserUndefined: Self = StObject.set(x, "fileBrowser", js.undefined)
    
    inline def setImageBrowser(value: EditorImageBrowser): Self = StObject.set(x, "imageBrowser", value.asInstanceOf[js.Any])
    
    inline def setImageBrowserUndefined: Self = StObject.set(x, "imageBrowser", js.undefined)
    
    inline def setImmutables(value: Boolean | EditorImmutables): Self = StObject.set(x, "immutables", value.asInstanceOf[js.Any])
    
    inline def setImmutablesUndefined: Self = StObject.set(x, "immutables", js.undefined)
    
    inline def setKeydown(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setKeyup(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction1(value))
    
    inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    inline def setMessages(value: EditorMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaste(value: /* e */ EditorPasteEvent => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
    
    inline def setPasteCleanup(value: EditorPasteCleanup): Self = StObject.set(x, "pasteCleanup", value.asInstanceOf[js.Any])
    
    inline def setPasteCleanupUndefined: Self = StObject.set(x, "pasteCleanup", js.undefined)
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setPdf(value: EditorPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfExport(value: /* e */ EditorPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    inline def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setResizable(value: Boolean | EditorResizable): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSelect(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSerialization(value: EditorSerialization): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
    
    inline def setStylesheets(value: Any): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
    
    inline def setStylesheetsUndefined: Self = StObject.set(x, "stylesheets", js.undefined)
    
    inline def setTools(value: js.Array[EditorTool | String]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: (EditorTool | String)*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
