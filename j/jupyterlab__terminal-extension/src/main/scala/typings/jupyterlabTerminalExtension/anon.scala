package typings.jupyterlabTerminalExtension

import typings.jupyterlabTerminal.tokensMod.ITerminal.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/terminal.@jupyterlab/terminal.ITerminal.IOptions> */
  trait PartialIOptions extends StObject {
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    var cursorBlink: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var initialCommand: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var macOptionIsMeta: js.UndefOr[Boolean] = js.undefined
    
    var pasteWithCtrlV: js.UndefOr[Boolean] = js.undefined
    
    var screenReaderMode: js.UndefOr[Boolean] = js.undefined
    
    var scrollback: js.UndefOr[Double] = js.undefined
    
    var shutdownOnClose: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object PartialIOptions {
    
    inline def apply(): PartialIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIOptions]
    }
    
    extension [Self <: PartialIOptions](x: Self) {
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setCursorBlink(value: Boolean): Self = StObject.set(x, "cursorBlink", value.asInstanceOf[js.Any])
      
      inline def setCursorBlinkUndefined: Self = StObject.set(x, "cursorBlink", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setInitialCommand(value: String): Self = StObject.set(x, "initialCommand", value.asInstanceOf[js.Any])
      
      inline def setInitialCommandUndefined: Self = StObject.set(x, "initialCommand", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMacOptionIsMeta(value: Boolean): Self = StObject.set(x, "macOptionIsMeta", value.asInstanceOf[js.Any])
      
      inline def setMacOptionIsMetaUndefined: Self = StObject.set(x, "macOptionIsMeta", js.undefined)
      
      inline def setPasteWithCtrlV(value: Boolean): Self = StObject.set(x, "pasteWithCtrlV", value.asInstanceOf[js.Any])
      
      inline def setPasteWithCtrlVUndefined: Self = StObject.set(x, "pasteWithCtrlV", js.undefined)
      
      inline def setScreenReaderMode(value: Boolean): Self = StObject.set(x, "screenReaderMode", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderModeUndefined: Self = StObject.set(x, "screenReaderMode", js.undefined)
      
      inline def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
      
      inline def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
      
      inline def setShutdownOnClose(value: Boolean): Self = StObject.set(x, "shutdownOnClose", value.asInstanceOf[js.Any])
      
      inline def setShutdownOnCloseUndefined: Self = StObject.set(x, "shutdownOnClose", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
