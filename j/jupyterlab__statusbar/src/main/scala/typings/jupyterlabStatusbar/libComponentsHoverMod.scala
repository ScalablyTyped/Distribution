package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left
import typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right
import typings.jupyterlabStatusbar.libComponentsHoverMod.Popup.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHoverMod {
  
  @JSImport("@jupyterlab/statusbar/lib/components/hover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/statusbar/lib/components/hover", "Popup")
  @js.native
  open class Popup protected () extends Widget {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _align: Any = js.native
    
    /* private */ var _anchor: Any = js.native
    
    /* private */ var _body: Any = js.native
    
    /* private */ var _evtClick: Any = js.native
    
    /* private */ var _evtKeydown: Any = js.native
    
    /* private */ var _setGeometry: Any = js.native
    
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
    trait IOptions extends StObject {
      
      /**
        * Whether to align the popup to the left or the right of the anchor.
        */
      var align: js.UndefOr[left | right] = js.undefined
      
      /**
        * The widget to which we are attaching the popup.
        */
      var anchor: Widget
      
      /**
        * The content of the popup.
        */
      var body: Widget
    }
    object IOptions {
      
      inline def apply(anchor: Widget, body: Widget): IOptions = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setAnchor(value: Widget): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        inline def setBody(value: Widget): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def showPopup(options: IOptions): Popup = ^.asInstanceOf[js.Dynamic].applyDynamic("showPopup")(options.asInstanceOf[js.Any]).asInstanceOf[Popup]
}
