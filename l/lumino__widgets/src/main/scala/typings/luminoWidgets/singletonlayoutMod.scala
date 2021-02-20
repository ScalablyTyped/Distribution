package typings.luminoWidgets

import typings.luminoWidgets.layoutMod.Layout
import typings.luminoWidgets.layoutMod.Layout.IOptions
import typings.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singletonlayoutMod {
  
  @JSImport("@lumino/widgets/types/singletonlayout", "SingletonLayout")
  @js.native
  /**
    * Construct a new layout.
    *
    * @param options - The options for initializing the layout.
    */
  class SingletonLayout () extends Layout {
    def this(options: IOptions) = this()
    
    var _widget: js.Any = js.native
    
    /**
      * Attach a widget to the parent's DOM node.
      *
      * @param index - The current index of the widget in the layout.
      *
      * @param widget - The widget to attach to the parent.
      *
      * #### Notes
      * This method is called automatically by the single layout at the
      * appropriate time. It should not be called directly by user code.
      *
      * The default implementation adds the widgets's node to the parent's
      * node at the proper location, and sends the appropriate attach
      * messages to the widget if the parent is attached to the DOM.
      *
      * Subclasses may reimplement this method to control how the widget's
      * node is added to the parent's node.
      */
    /* protected */ def attachWidget(widget: Widget): Unit = js.native
    
    /**
      * Detach a widget from the parent's DOM node.
      *
      * @param widget - The widget to detach from the parent.
      *
      * #### Notes
      * This method is called automatically by the single layout at the
      * appropriate time. It should not be called directly by user code.
      *
      * The default implementation removes the widget's node from the
      * parent's node, and sends the appropriate detach messages to the
      * widget if the parent is attached to the DOM.
      *
      * Subclasses may reimplement this method to control how the widget's
      * node is removed from the parent's node.
      */
    /* protected */ def detachWidget(widget: Widget): Unit = js.native
    
    /**
      * Get the child widget for the layout.
      */
    /**
      * Set the child widget for the layout.
      *
      * #### Notes
      * Setting the child widget will cause the old child widget to be
      * automatically disposed. If that is not desired, set the parent
      * of the old child to `null` before assigning a new child.
      */
    var widget: Widget | Null = js.native
  }
}
