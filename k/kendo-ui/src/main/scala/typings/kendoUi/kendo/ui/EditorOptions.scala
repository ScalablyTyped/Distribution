package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorOptions extends js.Object {
  
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
  implicit class EditorOptionsOps[Self <: EditorOptions] (val x: Self) extends AnyVal {
    
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
    def setChange(value: /* e */ EditorEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setDeserialization(value: EditorDeserialization): Self = this.set("deserialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeserialization: Self = this.set("deserialization", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEncoded(value: Boolean): Self = this.set("encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoded: Self = this.set("encoded", js.undefined)
    
    @scala.inline
    def setExecute(value: /* e */ EditorExecuteEvent => Unit): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    
    @scala.inline
    def setFileBrowser(value: EditorFileBrowser): Self = this.set("fileBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileBrowser: Self = this.set("fileBrowser", js.undefined)
    
    @scala.inline
    def setImageBrowser(value: EditorImageBrowser): Self = this.set("imageBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBrowser: Self = this.set("imageBrowser", js.undefined)
    
    @scala.inline
    def setImmutables(value: Boolean | EditorImmutables): Self = this.set("immutables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutables: Self = this.set("immutables", js.undefined)
    
    @scala.inline
    def setKeydown(value: /* e */ EditorEvent => Unit): Self = this.set("keydown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setKeyup(value: /* e */ EditorEvent => Unit): Self = this.set("keyup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    
    @scala.inline
    def setMessages(value: EditorMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPaste(value: /* e */ EditorPasteEvent => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPasteCleanup(value: EditorPasteCleanup): Self = this.set("pasteCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteCleanup: Self = this.set("pasteCleanup", js.undefined)
    
    @scala.inline
    def setPdf(value: EditorPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPdfExport(value: /* e */ EditorPdfExportEvent => Unit): Self = this.set("pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePdfExport: Self = this.set("pdfExport", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean | EditorResizable): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ EditorEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSerialization(value: EditorSerialization): Self = this.set("serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialization: Self = this.set("serialization", js.undefined)
    
    @scala.inline
    def setStylesheets(value: js.Any): Self = this.set("stylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheets: Self = this.set("stylesheets", js.undefined)
    
    @scala.inline
    def setToolsVarargs(value: (EditorTool | String)*): Self = this.set("tools", js.Array(value :_*))
    
    @scala.inline
    def setTools(value: js.Array[EditorTool | String]): Self = this.set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
}
