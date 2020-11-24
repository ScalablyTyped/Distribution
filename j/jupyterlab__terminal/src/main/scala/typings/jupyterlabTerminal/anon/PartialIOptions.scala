package typings.jupyterlabTerminal.anon

import typings.jupyterlabTerminal.tokensMod.ITerminal.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/terminal.@jupyterlab/terminal.ITerminal.IOptions> */
@js.native
trait PartialIOptions extends js.Object {
  
  var autoFit: js.UndefOr[Boolean] = js.native
  
  var cursorBlink: js.UndefOr[Boolean] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var initialCommand: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var macOptionIsMeta: js.UndefOr[Boolean] = js.native
  
  var pasteWithCtrlV: js.UndefOr[Boolean] = js.native
  
  var screenReaderMode: js.UndefOr[Boolean] = js.native
  
  var scrollback: js.UndefOr[Double] = js.native
  
  var shutdownOnClose: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[Theme] = js.native
}
object PartialIOptions {
  
  @scala.inline
  def apply(): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOptions]
  }
  
  @scala.inline
  implicit class PartialIOptionsOps[Self <: PartialIOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoFit(value: Boolean): Self = this.set("autoFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFit: Self = this.set("autoFit", js.undefined)
    
    @scala.inline
    def setCursorBlink(value: Boolean): Self = this.set("cursorBlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorBlink: Self = this.set("cursorBlink", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setInitialCommand(value: String): Self = this.set("initialCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialCommand: Self = this.set("initialCommand", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMacOptionIsMeta(value: Boolean): Self = this.set("macOptionIsMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacOptionIsMeta: Self = this.set("macOptionIsMeta", js.undefined)
    
    @scala.inline
    def setPasteWithCtrlV(value: Boolean): Self = this.set("pasteWithCtrlV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteWithCtrlV: Self = this.set("pasteWithCtrlV", js.undefined)
    
    @scala.inline
    def setScreenReaderMode(value: Boolean): Self = this.set("screenReaderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenReaderMode: Self = this.set("screenReaderMode", js.undefined)
    
    @scala.inline
    def setScrollback(value: Double): Self = this.set("scrollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollback: Self = this.set("scrollback", js.undefined)
    
    @scala.inline
    def setShutdownOnClose(value: Boolean): Self = this.set("shutdownOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutdownOnClose: Self = this.set("shutdownOnClose", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
