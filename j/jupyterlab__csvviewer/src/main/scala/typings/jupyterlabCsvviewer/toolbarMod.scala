package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@jupyterlab/csvviewer/lib/toolbar", "CSVDelimiter")
  @js.native
  class CSVDelimiter protected () extends Widget {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
    
    var _delimiterChanged: js.Any = js.native
    
    /**
      * A signal emitted when the delimiter selection has changed.
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The initially selected delimiter.
        */
      var selected: String = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(selected: String): IOptions = {
        val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      }
    }
  }
}
