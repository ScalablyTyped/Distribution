package typings.jupyterlabTerminal.tokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the terminal widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Whether to auto-fit the terminal to its host element size.
    */
  var autoFit: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to blink the cursor.  Can only be set at startup.
    */
  var cursorBlink: Boolean = js.native
  
  /**
    * The font family used to render text.
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * The font size of the terminal in pixels.
    */
  var fontSize: Double = js.native
  
  /**
    * An optional command to run when the session starts.
    */
  var initialCommand: String = js.native
  
  /**
    * The line height used to render text.
    */
  var lineHeight: js.UndefOr[Double] = js.native
  
  /**
    * Treat option as meta key on macOS.
    */
  var macOptionIsMeta: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable using Ctrl+V to paste.
    *
    * This setting has no effect on macOS, where Cmd+V is available.
    */
  var pasteWithCtrlV: Boolean = js.native
  
  /**
    * Whether to enable screen reader support.
    */
  var screenReaderMode: Boolean = js.native
  
  /**
    * The amount of buffer scrollback to be used
    * with the terminal
    */
  var scrollback: js.UndefOr[Double] = js.native
  
  /**
    * Whether to shut down the session when closing a terminal or not.
    */
  var shutdownOnClose: Boolean = js.native
  
  /**
    * The theme of the terminal.
    */
  var theme: Theme = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    cursorBlink: Boolean,
    fontSize: Double,
    initialCommand: String,
    pasteWithCtrlV: Boolean,
    screenReaderMode: Boolean,
    shutdownOnClose: Boolean,
    theme: Theme
  ): IOptions = {
    val __obj = js.Dynamic.literal(cursorBlink = cursorBlink.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], initialCommand = initialCommand.asInstanceOf[js.Any], pasteWithCtrlV = pasteWithCtrlV.asInstanceOf[js.Any], screenReaderMode = screenReaderMode.asInstanceOf[js.Any], shutdownOnClose = shutdownOnClose.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setCursorBlink(value: Boolean): Self = this.set("cursorBlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialCommand(value: String): Self = this.set("initialCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteWithCtrlV(value: Boolean): Self = this.set("pasteWithCtrlV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenReaderMode(value: Boolean): Self = this.set("screenReaderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownOnClose(value: Boolean): Self = this.set("shutdownOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFit(value: Boolean): Self = this.set("autoFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFit: Self = this.set("autoFit", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMacOptionIsMeta(value: Boolean): Self = this.set("macOptionIsMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacOptionIsMeta: Self = this.set("macOptionIsMeta", js.undefined)
    
    @scala.inline
    def setScrollback(value: Double): Self = this.set("scrollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollback: Self = this.set("scrollback", js.undefined)
  }
}
