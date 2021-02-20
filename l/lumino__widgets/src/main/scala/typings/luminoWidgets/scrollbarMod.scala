package typings.luminoWidgets

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.luminoWidgetsStrings.decrement
import typings.luminoWidgets.luminoWidgetsStrings.increment
import typings.luminoWidgets.scrollbarMod.ScrollBar.IOptions
import typings.luminoWidgets.scrollbarMod.ScrollBar.Orientation
import typings.luminoWidgets.widgetMod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollbarMod {
  
  @JSImport("@lumino/widgets/types/scrollbar", "ScrollBar")
  @js.native
  /**
    * Construct a new scroll bar.
    *
    * @param options - The options for initializing the scroll bar.
    */
  class ScrollBar () extends Widget {
    def this(options: IOptions) = this()
    
    /**
      * Handle the `'keydown'` event for the scroll bar.
      */
    var _evtKeyDown: js.Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the scroll bar.
      */
    var _evtMouseDown: js.Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the scroll bar.
      */
    var _evtMouseMove: js.Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the scroll bar.
      */
    var _evtMouseUp: js.Any = js.native
    
    var _maximum: js.Any = js.native
    
    /**
      * Move the thumb to the specified position.
      */
    var _moveThumb: js.Any = js.native
    
    /**
      * A timeout callback for repeating the mouse press.
      */
    var _onRepeat: js.Any = js.native
    
    var _orientation: js.Any = js.native
    
    var _page: js.Any = js.native
    
    var _pageRequested: js.Any = js.native
    
    var _pressData: js.Any = js.native
    
    /**
      * Release the mouse and restore the node states.
      */
    var _releaseMouse: js.Any = js.native
    
    var _repeatTimer: js.Any = js.native
    
    var _stepRequested: js.Any = js.native
    
    var _thumbMoved: js.Any = js.native
    
    var _value: js.Any = js.native
    
    /**
      * The scroll bar decrement button node.
      *
      * #### Notes
      * Modifying this node directly can lead to undefined behavior.
      */
    val decrementNode: HTMLDivElement = js.native
    
    /**
      * Handle the DOM events for the scroll bar.
      *
      * @param event - The DOM event sent to the scroll bar.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the scroll bar's DOM node.
      *
      * This should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The scroll bar increment button node.
      *
      * #### Notes
      * Modifying this node directly can lead to undefined behavior.
      */
    val incrementNode: HTMLDivElement = js.native
    
    /**
      * Get the maximum value of the scroll bar.
      */
    /**
      * Set the maximum value of the scroll bar.
      *
      * #### Notes
      * The max size will be clamped to the range `[0, Infinity]`.
      */
    var maximum: Double = js.native
    
    /**
      * Get the orientation of the scroll bar.
      */
    /**
      * Set the orientation of the scroll bar.
      */
    var orientation: Orientation = js.native
    
    /**
      * Get the page size of the scroll bar.
      *
      * #### Notes
      * The page size is the amount of visible content in the scrolled
      * region, expressed in data units. It determines the size of the
      * scroll bar thumb.
      */
    /**
      * Set the page size of the scroll bar.
      *
      * #### Notes
      * The page size will be clamped to the range `[0, Infinity]`.
      */
    var page: Double = js.native
    
    /**
      * A signal emitted when the user clicks the scroll track.
      *
      * #### Notes
      * The payload is whether a decrease or increase is requested.
      */
    val pageRequested: ISignal[this.type, decrement | increment] = js.native
    
    /**
      * A signal emitted when the user clicks a step button.
      *
      * #### Notes
      * The payload is whether a decrease or increase is requested.
      */
    val stepRequested: ISignal[this.type, decrement | increment] = js.native
    
    /**
      * A signal emitted when the user moves the scroll thumb.
      *
      * #### Notes
      * The payload is the current value of the scroll bar.
      */
    val thumbMoved: ISignal[this.type, Double] = js.native
    
    /**
      * The scroll bar thumb node.
      *
      * #### Notes
      * Modifying this node directly can lead to undefined behavior.
      */
    val thumbNode: HTMLDivElement = js.native
    
    /**
      * The scroll bar track node.
      *
      * #### Notes
      * Modifying this node directly can lead to undefined behavior.
      */
    val trackNode: HTMLDivElement = js.native
    
    /**
      * Get the current value of the scroll bar.
      */
    /**
      * Set the current value of the scroll bar.
      *
      * #### Notes
      * The value will be clamped to the range `[0, maximum]`.
      */
    var value: Double = js.native
  }
  object ScrollBar {
    
    /**
      * An options object for creating a scroll bar.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The maximum value for the scroll bar.
        *
        * The default is `100`.
        */
      var maximum: js.UndefOr[Double] = js.native
      
      /**
        * The orientation of the scroll bar.
        *
        * The default is `'vertical'`.
        */
      var orientation: js.UndefOr[Orientation] = js.native
      
      /**
        * The page size for the scroll bar.
        *
        * The default is `10`.
        */
      var page: js.UndefOr[Double] = js.native
      
      /**
        * The value for the scroll bar.
        *
        * The default is `0`.
        */
      var value: js.UndefOr[Double] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
        
        @scala.inline
        def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        @scala.inline
        def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /**
      * A type alias for a scroll bar orientation.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.horizontal
      - typings.luminoWidgets.luminoWidgetsStrings.vertical
    */
    trait Orientation extends StObject
    object Orientation {
      
      @scala.inline
      def horizontal: typings.luminoWidgets.luminoWidgetsStrings.horizontal = "horizontal".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.horizontal]
      
      @scala.inline
      def vertical: typings.luminoWidgets.luminoWidgetsStrings.vertical = "vertical".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.vertical]
    }
  }
}
