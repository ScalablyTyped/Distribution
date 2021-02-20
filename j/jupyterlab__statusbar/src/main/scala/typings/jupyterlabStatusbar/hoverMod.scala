package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.hoverMod.Popup.IOptions
import typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left
import typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverMod {
  
  @JSImport("@jupyterlab/statusbar/lib/components/hover", "Popup")
  @js.native
  class Popup protected () extends Widget {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
    
    var _align: js.Any = js.native
    
    var _anchor: js.Any = js.native
    
    var _body: js.Any = js.native
    
    var _evtClick: js.Any = js.native
    
    var _evtKeydown: js.Any = js.native
    
    var _setGeometry: js.Any = js.native
    
    /**
      * Handle DOM events for the widget.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Attach the popup widget to the page.
      */
    def launch(): Unit = js.native
    
    /**
      * Handle `'resize'` messages for the widget.
      */
    /* protected */ def onResize(): Unit = js.native
  }
  object Popup {
    
    /**
      * Options for creating a Popup widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Whether to align the popup to the left or the right of the anchor.
        */
      var align: js.UndefOr[left | right] = js.native
      
      /**
        * The widget to which we are attaching the popup.
        */
      var anchor: Widget = js.native
      
      /**
        * The content of the popup.
        */
      var body: Widget = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(anchor: Widget, body: Widget): IOptions = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setAnchor(value: Widget): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBody(value: Widget): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/statusbar/lib/components/hover", "showPopup")
  @js.native
  def showPopup(options: IOptions): Popup = js.native
}
