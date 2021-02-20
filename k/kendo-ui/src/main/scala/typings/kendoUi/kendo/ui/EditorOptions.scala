package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  
  var deserialization: js.UndefOr[EditorDeserialization] = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var encoded: js.UndefOr[Boolean] = js.native
  
  var execute: js.UndefOr[js.Function1[/* e */ EditorExecuteEvent, Unit]] = js.native
  
  var fileBrowser: js.UndefOr[EditorFileBrowser] = js.native
  
  var imageBrowser: js.UndefOr[EditorImageBrowser] = js.native
  
  var immutables: js.UndefOr[Boolean | EditorImmutables] = js.native
  
  var keydown: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  
  var keyup: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  
  var messages: js.UndefOr[EditorMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var paste: js.UndefOr[js.Function1[/* e */ EditorPasteEvent, Unit]] = js.native
  
  var pasteCleanup: js.UndefOr[EditorPasteCleanup] = js.native
  
  var pdf: js.UndefOr[EditorPdf] = js.native
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ EditorPdfExportEvent, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var resizable: js.UndefOr[Boolean | EditorResizable] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  
  var serialization: js.UndefOr[EditorSerialization] = js.native
  
  var stylesheets: js.UndefOr[js.Any] = js.native
  
  var tools: js.UndefOr[js.Array[EditorTool | String]] = js.native
}
object EditorOptions {
  
  @scala.inline
  def apply(): EditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions]
  }
  
  @scala.inline
  implicit class EditorOptionsMutableBuilder[Self <: EditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDeserialization(value: EditorDeserialization): Self = StObject.set(x, "deserialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserializationUndefined: Self = StObject.set(x, "deserialization", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    @scala.inline
    def setExecute(value: /* e */ EditorExecuteEvent => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    @scala.inline
    def setFileBrowser(value: EditorFileBrowser): Self = StObject.set(x, "fileBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileBrowserUndefined: Self = StObject.set(x, "fileBrowser", js.undefined)
    
    @scala.inline
    def setImageBrowser(value: EditorImageBrowser): Self = StObject.set(x, "imageBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBrowserUndefined: Self = StObject.set(x, "imageBrowser", js.undefined)
    
    @scala.inline
    def setImmutables(value: Boolean | EditorImmutables): Self = StObject.set(x, "immutables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmutablesUndefined: Self = StObject.set(x, "immutables", js.undefined)
    
    @scala.inline
    def setKeydown(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    @scala.inline
    def setKeyup(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    @scala.inline
    def setMessages(value: EditorMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPaste(value: /* e */ EditorPasteEvent => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPasteCleanup(value: EditorPasteCleanup): Self = StObject.set(x, "pasteCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteCleanupUndefined: Self = StObject.set(x, "pasteCleanup", js.undefined)
    
    @scala.inline
    def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    @scala.inline
    def setPdf(value: EditorPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfExport(value: /* e */ EditorPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean | EditorResizable): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ EditorEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSerialization(value: EditorSerialization): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
    
    @scala.inline
    def setStylesheets(value: js.Any): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetsUndefined: Self = StObject.set(x, "stylesheets", js.undefined)
    
    @scala.inline
    def setTools(value: js.Array[EditorTool | String]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    @scala.inline
    def setToolsVarargs(value: (EditorTool | String)*): Self = StObject.set(x, "tools", js.Array(value :_*))
  }
}
