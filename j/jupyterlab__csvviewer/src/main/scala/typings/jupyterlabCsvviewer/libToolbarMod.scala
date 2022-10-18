package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.libToolbarMod.CSVToolbar.IOptions
import typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolbarMod {
  
  @JSImport("@jupyterlab/csvviewer/lib/toolbar", "CSVDelimiter")
  @js.native
  open class CSVDelimiter protected () extends Widget {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _delimiterChanged: Any = js.native
    
    /* protected */ var _widget: CSVViewer = js.native
    
    /**
      * A signal emitted when the delimiter selection has changed.
      *
      * @deprecated since v3.2
      * This is dead code now.
      */
    def delimiterChanged: ISignal[this.type, String] = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the dock panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The delimiter dropdown menu.
      */
    def selectNode: HTMLSelectElement = js.native
  }
  
  object CSVToolbar {
    
    /**
      * The instantiation options for a CSV toolbar.
      */
    trait IOptions extends StObject {
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
      
      /**
        * Document widget for this toolbar
        */
      var widget: CSVViewer
    }
    object IOptions {
      
      inline def apply(widget: CSVViewer): IOptions = {
        val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
        
        inline def setWidget(value: CSVViewer): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      }
    }
  }
}
