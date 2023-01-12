package typings.jupyterlabApputils

import typings.jupyterlabApputils.libCollapseMod.Collapse.IOptions
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCollapseMod {
  
  @JSImport("@jupyterlab/apputils/lib/collapse", "Collapse")
  @js.native
  open class Collapse[T /* <: Widget */] protected () extends Widget {
    def this(options: IOptions[T]) = this()
    
    /* private */ var _collapse: Any = js.native
    
    /* private */ var _collapseChanged: Any = js.native
    
    /* private */ var _collapsed: Any = js.native
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _evtClick: Any = js.native
    
    /* private */ var _header: Any = js.native
    
    /**
      * Handle the `changed` signal of a title object.
      */
    /* private */ var _onTitleChanged: Any = js.native
    
    /* private */ var _setHeader: Any = js.native
    
    /* private */ var _uncollapse: Any = js.native
    
    /* private */ var _widget: Any = js.native
    
    /**
      * A signal for when the widget collapse state changes.
      */
    def collapseChanged: ISignal[Collapse[Widget], Unit] = js.native
    
    /**
      * The collapsed state of the panel.
      */
    def collapsed: Boolean = js.native
    def collapsed_=(value: Boolean): Unit = js.native
    
    /**
      * Handle the DOM events for the Collapse widget.
      *
      * @param event - The DOM event sent to the panel.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the panel's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Toggle the collapse state of the panel.
      */
    def toggle(): Unit = js.native
    
    /**
      * The widget inside the collapse panel.
      */
    def widget: T = js.native
    def widget_=(widget: T): Unit = js.native
  }
  object Collapse {
    
    trait IOptions[T /* <: Widget */]
      extends StObject
         with typings.luminoWidgets.typesWidgetMod.Widget.IOptions {
      
      var collapsed: js.UndefOr[Boolean] = js.undefined
      
      var widget: T
    }
    object IOptions {
      
      inline def apply[T /* <: Widget */](widget: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions[?], T /* <: Widget */] (val x: Self & IOptions[T]) extends AnyVal {
        
        inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
        
        inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
        
        inline def setWidget(value: T): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      }
    }
  }
}
