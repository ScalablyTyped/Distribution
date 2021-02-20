package typings.jupyterlabTerminal

import typings.jupyterlabTerminal.tokensMod.ITerminal.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/terminal.@jupyterlab/terminal.ITerminal.IOptions> */
  @js.native
  trait PartialIOptions extends StObject {
    
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
    implicit class PartialIOptionsMutableBuilder[Self <: PartialIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      @scala.inline
      def setCursorBlink(value: Boolean): Self = StObject.set(x, "cursorBlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorBlinkUndefined: Self = StObject.set(x, "cursorBlink", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setInitialCommand(value: String): Self = StObject.set(x, "initialCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialCommandUndefined: Self = StObject.set(x, "initialCommand", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMacOptionIsMeta(value: Boolean): Self = StObject.set(x, "macOptionIsMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacOptionIsMetaUndefined: Self = StObject.set(x, "macOptionIsMeta", js.undefined)
      
      @scala.inline
      def setPasteWithCtrlV(value: Boolean): Self = StObject.set(x, "pasteWithCtrlV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasteWithCtrlVUndefined: Self = StObject.set(x, "pasteWithCtrlV", js.undefined)
      
      @scala.inline
      def setScreenReaderMode(value: Boolean): Self = StObject.set(x, "screenReaderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenReaderModeUndefined: Self = StObject.set(x, "screenReaderMode", js.undefined)
      
      @scala.inline
      def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
      
      @scala.inline
      def setShutdownOnClose(value: Boolean): Self = StObject.set(x, "shutdownOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShutdownOnCloseUndefined: Self = StObject.set(x, "shutdownOnClose", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
