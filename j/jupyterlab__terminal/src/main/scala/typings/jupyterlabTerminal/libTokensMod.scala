package typings.jupyterlabTerminal

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabServices.libTerminalTerminalMod.ITerminalConnection
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.autoFit
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.closeOnExit
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.cursorBlink
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.fontFamily
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.fontSize
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.initialCommand
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.lineHeight
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.macOptionIsMeta
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.pasteWithCtrlV
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.screenReaderMode
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.scrollback
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.shutdownOnClose
import typings.jupyterlabTerminal.jupyterlabTerminalStrings.theme
import typings.jupyterlabTerminal.libTokensMod.ITerminal.ITerminal
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  object ITerminal {
    
    /**
      * The default options used for creating terminals.
      */
    @JSImport("@jupyterlab/terminal/lib/tokens", "ITerminal.defaultOptions")
    @js.native
    val defaultOptions: IOptions = js.native
    
    /**
      * Options for the terminal widget.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether to auto-fit the terminal to its host element size.
        */
      var autoFit: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether to close the widget when exiting a terminal or not.
        */
      var closeOnExit: Boolean
      
      /**
        * Whether to blink the cursor.  Can only be set at startup.
        */
      var cursorBlink: Boolean
      
      /**
        * The font family used to render text.
        */
      var fontFamily: js.UndefOr[String] = js.undefined
      
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
      var lineHeight: js.UndefOr[Double] = js.undefined
      
      /**
        * Treat option as meta key on macOS.
        */
      var macOptionIsMeta: js.UndefOr[Boolean] = js.undefined
      
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
      var scrollback: js.UndefOr[Double] = js.undefined
      
      /**
        * Whether to shut down the session when closing a terminal or not.
        */
      var shutdownOnClose: Boolean
      
      /**
        * The theme of the terminal.
        */
      var theme: Theme
    }
    object IOptions {
      
      inline def apply(
        closeOnExit: Boolean,
        cursorBlink: Boolean,
        fontSize: Double,
        initialCommand: String,
        pasteWithCtrlV: Boolean,
        screenReaderMode: Boolean,
        shutdownOnClose: Boolean,
        theme: Theme
      ): IOptions = {
        val __obj = js.Dynamic.literal(closeOnExit = closeOnExit.asInstanceOf[js.Any], cursorBlink = cursorBlink.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], initialCommand = initialCommand.asInstanceOf[js.Any], pasteWithCtrlV = pasteWithCtrlV.asInstanceOf[js.Any], screenReaderMode = screenReaderMode.asInstanceOf[js.Any], shutdownOnClose = shutdownOnClose.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
        
        inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
        
        inline def setCloseOnExit(value: Boolean): Self = StObject.set(x, "closeOnExit", value.asInstanceOf[js.Any])
        
        inline def setCursorBlink(value: Boolean): Self = StObject.set(x, "cursorBlink", value.asInstanceOf[js.Any])
        
        inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        inline def setInitialCommand(value: String): Self = StObject.set(x, "initialCommand", value.asInstanceOf[js.Any])
        
        inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
        
        inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
        
        inline def setMacOptionIsMeta(value: Boolean): Self = StObject.set(x, "macOptionIsMeta", value.asInstanceOf[js.Any])
        
        inline def setMacOptionIsMetaUndefined: Self = StObject.set(x, "macOptionIsMeta", js.undefined)
        
        inline def setPasteWithCtrlV(value: Boolean): Self = StObject.set(x, "pasteWithCtrlV", value.asInstanceOf[js.Any])
        
        inline def setScreenReaderMode(value: Boolean): Self = StObject.set(x, "screenReaderMode", value.asInstanceOf[js.Any])
        
        inline def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
        
        inline def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
        
        inline def setShutdownOnClose(value: Boolean): Self = StObject.set(x, "shutdownOnClose", value.asInstanceOf[js.Any])
        
        inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ITerminal extends Widget {
      
      @JSName("getOption")
      def getOption_autoFit(option: autoFit): js.UndefOr[Boolean] = js.native
      @JSName("getOption")
      def getOption_closeOnExit(option: closeOnExit): Boolean = js.native
      @JSName("getOption")
      def getOption_cursorBlink(option: cursorBlink): Boolean = js.native
      /**
        * Get a config option for the terminal.
        */
      @JSName("getOption")
      def getOption_fontFamily(option: fontFamily): js.UndefOr[String] = js.native
      @JSName("getOption")
      def getOption_fontSize(option: fontSize): Double = js.native
      @JSName("getOption")
      def getOption_initialCommand(option: initialCommand): String = js.native
      @JSName("getOption")
      def getOption_lineHeight(option: lineHeight): js.UndefOr[Double] = js.native
      @JSName("getOption")
      def getOption_macOptionIsMeta(option: macOptionIsMeta): js.UndefOr[Boolean] = js.native
      @JSName("getOption")
      def getOption_pasteWithCtrlV(option: pasteWithCtrlV): Boolean = js.native
      @JSName("getOption")
      def getOption_screenReaderMode(option: screenReaderMode): Boolean = js.native
      @JSName("getOption")
      def getOption_scrollback(option: scrollback): js.UndefOr[Double] = js.native
      @JSName("getOption")
      def getOption_shutdownOnClose(option: shutdownOnClose): Boolean = js.native
      @JSName("getOption")
      def getOption_theme(option: theme): Theme = js.native
      
      /**
        * Refresh the terminal session.
        */
      def refresh(): js.Promise[Unit] = js.native
      
      /**
        * The terminal session associated with the widget.
        */
      var session: ITerminalConnection = js.native
      
      @JSName("setOption")
      def setOption_autoFit(option: autoFit): Unit = js.native
      @JSName("setOption")
      def setOption_autoFit(option: autoFit, value: Boolean): Unit = js.native
      @JSName("setOption")
      def setOption_closeOnExit(option: closeOnExit, value: Boolean): Unit = js.native
      @JSName("setOption")
      def setOption_cursorBlink(option: cursorBlink, value: Boolean): Unit = js.native
      /**
        * Set a config option for the terminal.
        */
      @JSName("setOption")
      def setOption_fontFamily(option: fontFamily): Unit = js.native
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
      def setOption_macOptionIsMeta(option: macOptionIsMeta): Unit = js.native
      @JSName("setOption")
      def setOption_macOptionIsMeta(option: macOptionIsMeta, value: Boolean): Unit = js.native
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
    trait IThemeObject extends StObject {
      
      var background: String
      
      var cursor: String
      
      var cursorAccent: String
      
      var foreground: String
      
      var selection: String
    }
    object IThemeObject {
      
      inline def apply(background: String, cursor: String, cursorAccent: String, foreground: String, selection: String): IThemeObject = {
        val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], cursorAccent = cursorAccent.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
        __obj.asInstanceOf[IThemeObject]
      }
      
      extension [Self <: IThemeObject](x: Self) {
        
        inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
        
        inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
        
        inline def setCursorAccent(value: String): Self = StObject.set(x, "cursorAccent", value.asInstanceOf[js.Any])
        
        inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
        
        inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type for the terminal theme.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabTerminal.jupyterlabTerminalStrings.light
      - typings.jupyterlabTerminal.jupyterlabTerminalStrings.dark
      - typings.jupyterlabTerminal.jupyterlabTerminalStrings.inherit
    */
    trait Theme extends StObject
    object Theme {
      
      inline def dark: typings.jupyterlabTerminal.jupyterlabTerminalStrings.dark = "dark".asInstanceOf[typings.jupyterlabTerminal.jupyterlabTerminalStrings.dark]
      
      inline def inherit: typings.jupyterlabTerminal.jupyterlabTerminalStrings.inherit = "inherit".asInstanceOf[typings.jupyterlabTerminal.jupyterlabTerminalStrings.inherit]
      
      inline def light: typings.jupyterlabTerminal.jupyterlabTerminalStrings.light = "light".asInstanceOf[typings.jupyterlabTerminal.jupyterlabTerminalStrings.light]
    }
  }
  
  @JSImport("@jupyterlab/terminal/lib/tokens", "ITerminalTracker")
  @js.native
  val ITerminalTracker: Token[typings.jupyterlabTerminal.libTokensMod.ITerminalTracker] = js.native
  type ITerminalTracker = IWidgetTracker[MainAreaWidget[ITerminal]]
}
