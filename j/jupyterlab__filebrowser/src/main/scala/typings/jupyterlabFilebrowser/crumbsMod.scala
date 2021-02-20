package typings.jupyterlabFilebrowser

import typings.jupyterlabFilebrowser.crumbsMod.BreadCrumbs.IOptions
import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crumbsMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/crumbs", "BreadCrumbs")
  @js.native
  class BreadCrumbs protected () extends Widget {
    /**
      * Construct a new file browser crumb widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: IOptions) = this()
    
    var _crumbSeps: js.Any = js.native
    
    var _crumbs: js.Any = js.native
    
    /**
      * Handle the `'click'` event for the widget.
      */
    var _evtClick: js.Any = js.native
    
    /**
      * Handle the `'lm-dragenter'` event for the widget.
      */
    var _evtDragEnter: js.Any = js.native
    
    /**
      * Handle the `'lm-dragleave'` event for the widget.
      */
    var _evtDragLeave: js.Any = js.native
    
    /**
      * Handle the `'lm-dragover'` event for the widget.
      */
    var _evtDragOver: js.Any = js.native
    
    /**
      * Handle the `'lm-drop'` event for the widget.
      */
    var _evtDrop: js.Any = js.native
    
    var _model: js.Any = js.native
    
    /**
      * Handle the DOM events for the bread crumbs.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the panel's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
  }
  object BreadCrumbs {
    
    /**
      * An options object for initializing a bread crumb widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A file browser model instance.
        */
      var model: FileBrowserModel = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(model: FileBrowserModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setModel(value: FileBrowserModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      }
    }
  }
}
