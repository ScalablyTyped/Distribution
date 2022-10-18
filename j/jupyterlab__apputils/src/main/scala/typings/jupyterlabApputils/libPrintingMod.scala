package typings.jupyterlabApputils

import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPrintingMod {
  
  object Printing {
    
    @JSImport("@jupyterlab/apputils/lib/printing", "Printing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the print function for an object, or null if it does not provide a handler.
      */
    inline def getPrintFunction(`val`: Any): OptionalAsyncThunk = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrintFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[OptionalAsyncThunk]
    
    /**
      * Returns whether an object implements a print method.
      */
    inline def isPrintable(a: Any): /* is @jupyterlab/apputils.@jupyterlab/apputils/lib/printing.Printing.IPrintable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrintable")(a.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/apputils.@jupyterlab/apputils/lib/printing.Printing.IPrintable */ Boolean]
    
    /**
      * Prints a URL by loading it into an iframe.
      *
      * @param url URL to load into an iframe.
      */
    inline def printURL(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("printURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Prints a widget by copying it's DOM node
      * to a hidden iframe and printing that iframe.
      */
    inline def printWidget(widget: Widget): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("printWidget")(widget.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Symbol to use for a method that returns a function to print an object.
      */
    @JSImport("@jupyterlab/apputils/lib/printing", "Printing.symbol")
    @js.native
    val symbol: js.Symbol = js.native
    
    /**
      * Objects who provide a custom way of printing themselves
      * should implement this interface.
      */
    @js.native
    trait IPrintable extends StObject
    
    /**
      * Function that takes no arguments and when invoked prints out some object or null if printing is not defined.
      */
    type OptionalAsyncThunk = js.Function0[js.Promise[Unit]] | Null
  }
}
