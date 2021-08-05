package typings.luminoDatagrid

import typings.luminoDatagrid.notificationMod.Notification.IOptions
import typings.luminoDatagrid.notificationMod.Notification.Placement
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("@lumino/datagrid/lib/notification", "Notification")
  @js.native
  class Notification protected () extends Widget {
    /**
      * Construct a new notification.
      *
      * @param options - The options for initializing the notification.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle the `'mousedown'` event for the notification.
      */
    /* private */ var _evtMouseDown: js.Any = js.native
    
    /* private */ var _message: js.Any = js.native
    
    /* private */ var _placement: js.Any = js.native
    
    /* private */ var _target: js.Any = js.native
    
    /**
      * Handle the DOM events for the notification.
      *
      * @param event - The DOM event sent to the notification.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notification's DOM node.
      *
      * This should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Get the current value of the message.
      */
    /**
      * Set the current value of the message.
      *
      */
    var message: String = js.native
    
    /**
      * Get the node presenting the message.
      */
    val messageNode: HTMLSpanElement = js.native
    
    /**
      * Get the placement of the notification.
      */
    /**
      * Set the placement of the notification.
      */
    var placement: Placement = js.native
  }
  object Notification {
    
    /**
      * An options object for creating a notification.
      */
    trait IOptions extends StObject {
      
      /**
        * The message to show on notification.
        */
      var message: js.UndefOr[String] = js.undefined
      
      /**
        * The placement of the notification.
        *
        * The default is `'bottom'`.
        */
      var placement: js.UndefOr[Placement] = js.undefined
      
      /**
        * Target element to attach notification to.
        *
        */
      var target: HTMLElement
      
      /**
        * Duration in ms after which to close notification popup.
        *
        * The default is undefined, and notification is kept visible
        * Timeout value needs to be greater than zero
        */
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(target: HTMLElement): IOptions = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    /**
      * A type alias for a notification placement.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.top
      - typings.luminoDatagrid.luminoDatagridStrings.bottom
      - typings.luminoDatagrid.luminoDatagridStrings.left
      - typings.luminoDatagrid.luminoDatagridStrings.right
    */
    trait Placement extends StObject
    object Placement {
      
      inline def bottom: typings.luminoDatagrid.luminoDatagridStrings.bottom = "bottom".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.bottom]
      
      inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
      
      inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
      
      inline def top: typings.luminoDatagrid.luminoDatagridStrings.top = "top".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.top]
    }
  }
}
