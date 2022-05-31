package typings.jupyterlabTooltip

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabTooltip.widgetMod.Tooltip.IOptions
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/tooltip/lib/widget", "Tooltip")
  @js.native
  class Tooltip protected () extends Widget {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _content: js.Any = js.native
    
    /* private */ var _editor: js.Any = js.native
    
    /**
      * Handle scroll events for the widget
      */
    /* private */ var _evtScroll: js.Any = js.native
    
    /* private */ var _rendermime: js.Any = js.native
    
    /**
      * Set the geometry of the tooltip widget.
      */
    /* private */ var _setGeometry: js.Any = js.native
    
    /**
      * The anchor widget that the tooltip widget tracks.
      */
    val anchor: Widget = js.native
    
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
  }
  object Tooltip {
    
    /**
      * Instantiation options for a tooltip widget.
      */
    trait IOptions extends StObject {
      
      /**
        * The anchor widget that the tooltip widget tracks.
        */
      var anchor: Widget
      
      /**
        * The data that populates the tooltip widget.
        */
      var bundle: JSONObject
      
      /**
        * The editor referent of the tooltip model.
        */
      var editor: IEditor
      
      /**
        * The rendermime instance used by the tooltip model.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(anchor: Widget, bundle: JSONObject, editor: IEditor, rendermime: IRenderMimeRegistry): IOptions = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAnchor(value: Widget): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        inline def setBundle(value: JSONObject): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
        
        inline def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
}
