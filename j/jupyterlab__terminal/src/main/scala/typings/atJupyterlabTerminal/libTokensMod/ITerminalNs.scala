package typings.atJupyterlabTerminal.libTokensMod

import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.ISession
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.cursorBlink
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.fontFamily
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.fontSize
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.initialCommand
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.lineHeight
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.pasteWithCtrlV
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.screenReaderMode
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.scrollback
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.shutdownOnClose
import typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.theme
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.IOptions
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.Theme
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal/lib/tokens", "ITerminal")
@js.native
object ITerminalNs extends js.Object {
  /**
    * Options for the terminal widget.
    */
  trait IOptions extends js.Object {
    /**
      * Whether to blink the cursor.  Can only be set at startup.
      */
    var cursorBlink: Boolean
    /**
      * The font family used to render text.
      */
    var fontFamily: String | Null
    /**
      * The font size of the terminal in pixels.
      */
    var fontSize: Double
    /**
      * An optional command to run when the session starts.
      */
    var initialCommand: String
    /**
      * The line height used to render text.
      */
    var lineHeight: Double | Null
    /**
      * Whether to enable using Ctrl+V to paste.
      *
      * This setting has no effect on macOS, where Cmd+V is available.
      */
    var pasteWithCtrlV: Boolean
    /**
      * Whether to enable screen reader support.
      */
    var screenReaderMode: Boolean
    /**
      * The amount of buffer scrollback to be used
      * with the terminal
      */
    var scrollback: Double | Null
    /**
      * Whether to shut down the session when closing a terminal or not.
      */
    var shutdownOnClose: Boolean
    /**
      * The theme of the terminal.
      */
    var theme: Theme
  }
  
  @js.native
  trait ITerminal extends Widget {
    /**
      * The terminal session associated with the widget.
      */
    var session: ISession = js.native
    @JSName("getOption")
    def getOption_cursorBlink(option: cursorBlink): Boolean = js.native
    /**
      * Get a config option for the terminal.
      */
    @JSName("getOption")
    def getOption_fontFamily(option: fontFamily): String | Null = js.native
    @JSName("getOption")
    def getOption_fontSize(option: fontSize): Double = js.native
    @JSName("getOption")
    def getOption_initialCommand(option: initialCommand): String = js.native
    @JSName("getOption")
    def getOption_lineHeight(option: lineHeight): Double | Null = js.native
    @JSName("getOption")
    def getOption_pasteWithCtrlV(option: pasteWithCtrlV): Boolean = js.native
    @JSName("getOption")
    def getOption_screenReaderMode(option: screenReaderMode): Boolean = js.native
    @JSName("getOption")
    def getOption_scrollback(option: scrollback): Double | Null = js.native
    @JSName("getOption")
    def getOption_shutdownOnClose(option: shutdownOnClose): Boolean = js.native
    @JSName("getOption")
    def getOption_theme(option: theme): Theme = js.native
    /**
      * Refresh the terminal session.
      */
    def refresh(): js.Promise[Unit] = js.native
    @JSName("setOption")
    def setOption_cursorBlink(option: cursorBlink, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily): Unit = js.native
    /**
      * Set a config option for the terminal.
      */
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_initialCommand(option: initialCommand, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: lineHeight): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: lineHeight, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_pasteWithCtrlV(option: pasteWithCtrlV, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_screenReaderMode(option: screenReaderMode, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_scrollback(option: scrollback): Unit = js.native
    @JSName("setOption")
    def setOption_scrollback(option: scrollback, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_shutdownOnClose(option: shutdownOnClose, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_theme(option: theme, value: Theme): Unit = js.native
  }
  
  /**
    * A type for the terminal theme.
    */
  trait IThemeObject extends js.Object {
    var background: String
    var cursor: String
    var cursorAccent: String
    var foreground: String
    var selection: String
  }
  
  /**
    * A type for the terminal theme.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.light
    - typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.dark
    - typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.inherit
  */
  trait Theme extends js.Object
  
  /**
    * The default options used for creating terminals.
    */
  val defaultOptions: IOptions = js.native
}

