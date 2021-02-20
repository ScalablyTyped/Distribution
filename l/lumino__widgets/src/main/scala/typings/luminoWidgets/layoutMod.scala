package typings.luminoWidgets

import typings.luminoAlgorithm.iterMod.IIterable
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.layoutMod.Layout.FitPolicy
import typings.luminoWidgets.layoutMod.Layout.IOptions
import typings.luminoWidgets.widgetMod.Widget
import typings.luminoWidgets.widgetMod.Widget.ChildMessage
import typings.luminoWidgets.widgetMod.Widget.ResizeMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @JSImport("@lumino/widgets/types/layout", "Layout")
  @js.native
  /**
    * Construct a new layout.
    *
    * @param options - The options for initializing the layout.
    */
  abstract class Layout ()
    extends IIterable[Widget]
       with IDisposable {
    def this(options: IOptions) = this()
    
    var _disposed: js.Any = js.native
    
    var _fitPolicy: js.Any = js.native
    
    var _parent: js.Any = js.native
    
    /**
      * Get the fit policy for the layout.
      *
      * #### Notes
      * The fit policy controls the computed size constraints which are
      * applied to the parent widget by the layout.
      *
      * Some layout implementations may ignore the fit policy.
      */
    /**
      * Set the fit policy for the layout.
      *
      * #### Notes
      * The fit policy controls the computed size constraints which are
      * applied to the parent widget by the layout.
      *
      * Some layout implementations may ignore the fit policy.
      *
      * Changing the fit policy will clear the current size constraint
      * for the parent widget and then re-fit the parent.
      */
    var fitPolicy: FitPolicy = js.native
    
    /**
      * Perform layout initialization which requires the parent widget.
      *
      * #### Notes
      * This method is invoked immediately after the layout is installed
      * on the parent widget.
      *
      * The default implementation reparents all of the widgets to the
      * layout parent widget.
      *
      * Subclasses should reimplement this method and attach the child
      * widget nodes to the parent widget's node.
      */
    /* protected */ def init(): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-attach'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message
      * to all widgets. It assumes all widget nodes are attached to the
      * parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onAfterAttach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-detach'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message
      * to all widgets. It assumes all widget nodes are attached to the
      * parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onAfterDetach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-hide'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message to
      * all non-hidden widgets. It assumes all widget nodes are attached
      * to the parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onAfterHide(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-show'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message to
      * all non-hidden widgets. It assumes all widget nodes are attached
      * to the parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onAfterShow(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-attach'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message
      * to all widgets. It assumes all widget nodes are attached to the
      * parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onBeforeAttach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-detach'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message
      * to all widgets. It assumes all widget nodes are attached to the
      * parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onBeforeDetach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-hide'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message to
      * all non-hidden widgets. It assumes all widget nodes are attached
      * to the parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onBeforeHide(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-show'` message.
      *
      * #### Notes
      * The default implementation of this method forwards the message to
      * all non-hidden widgets. It assumes all widget nodes are attached
      * to the parent widget node.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onBeforeShow(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'child-hidden'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onChildHidden(msg: ChildMessage): Unit = js.native
    
    /**
      * A message handler invoked on a `'child-removed'` message.
      *
      * #### Notes
      * This will remove the child widget from the layout.
      *
      * Subclasses should **not** typically reimplement this method.
      */
    /* protected */ def onChildRemoved(msg: ChildMessage): Unit = js.native
    
    /**
      * A message handler invoked on a `'child-shown'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onChildShown(msg: ChildMessage): Unit = js.native
    
    /**
      * A message handler invoked on a `'fit-request'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onFitRequest(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'resize'` message.
      *
      * #### Notes
      * The layout should ensure that its widgets are resized according
      * to the specified layout space, and that they are sent a `'resize'`
      * message if appropriate.
      *
      * The default implementation of this method sends an `UnknownSize`
      * resize message to all widgets.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
    
    /**
      * A message handler invoked on an `'update-request'` message.
      *
      * #### Notes
      * The layout should ensure that its widgets are resized according
      * to the available layout space, and that they are sent a `'resize'`
      * message if appropriate.
      *
      * The default implementation of this method sends an `UnknownSize`
      * resize message to all widgets.
      *
      * This may be reimplemented by subclasses as needed.
      */
    /* protected */ def onUpdateRequest(msg: Message): Unit = js.native
    
    /**
      * Get the parent widget of the layout.
      */
    /**
      * Set the parent widget of the layout.
      *
      * #### Notes
      * This is set automatically when installing the layout on the parent
      * widget. The parent widget should not be set directly by user code.
      */
    var parent: Widget | Null = js.native
    
    /**
      * Process a message sent to the parent widget.
      *
      * @param msg - The message sent to the parent widget.
      *
      * #### Notes
      * This method is called by the parent widget to process a message.
      *
      * Subclasses may reimplement this method as needed.
      */
    def processParentMessage(msg: Message): Unit = js.native
    
    /**
      * Remove a widget from the layout.
      *
      * @param widget - The widget to remove from the layout.
      *
      * #### Notes
      * A widget is automatically removed from the layout when its `parent`
      * is set to `null`. This method should only be invoked directly when
      * removing a widget from a layout which has yet to be installed on a
      * parent widget.
      *
      * This method should *not* modify the widget's `parent`.
      */
    def removeWidget(widget: Widget): Unit = js.native
  }
  object Layout {
    
    /**
      * Get the horizontal alignment for a widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The horizontal alignment for the widget.
      *
      * #### Notes
      * If the layout width allocated to a widget is larger than its max
      * width, the horizontal alignment controls how the widget is placed
      * within the extra horizontal space.
      *
      * If the allocated width is less than the widget's max width, the
      * horizontal alignment has no effect.
      *
      * Some layout implementations may ignore horizontal alignment.
      */
    @JSImport("@lumino/widgets/types/layout", "Layout.getHorizontalAlignment")
    @js.native
    def getHorizontalAlignment(widget: Widget): HorizontalAlignment = js.native
    
    /**
      * Get the vertical alignment for a widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The vertical alignment for the widget.
      *
      * #### Notes
      * If the layout height allocated to a widget is larger than its max
      * height, the vertical alignment controls how the widget is placed
      * within the extra vertical space.
      *
      * If the allocated height is less than the widget's max height, the
      * vertical alignment has no effect.
      *
      * Some layout implementations may ignore vertical alignment.
      */
    @JSImport("@lumino/widgets/types/layout", "Layout.getVerticalAlignment")
    @js.native
    def getVerticalAlignment(widget: Widget): VerticalAlignment = js.native
    
    /**
      * Set the horizontal alignment for a widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the horizontal alignment.
      *
      * #### Notes
      * If the layout width allocated to a widget is larger than its max
      * width, the horizontal alignment controls how the widget is placed
      * within the extra horizontal space.
      *
      * If the allocated width is less than the widget's max width, the
      * horizontal alignment has no effect.
      *
      * Some layout implementations may ignore horizontal alignment.
      *
      * Changing the horizontal alignment will post an `update-request`
      * message to widget's parent, provided the parent has a layout
      * installed.
      */
    @JSImport("@lumino/widgets/types/layout", "Layout.setHorizontalAlignment")
    @js.native
    def setHorizontalAlignment(widget: Widget, value: HorizontalAlignment): Unit = js.native
    
    /**
      * Set the vertical alignment for a widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the vertical alignment.
      *
      * #### Notes
      * If the layout height allocated to a widget is larger than its max
      * height, the vertical alignment controls how the widget is placed
      * within the extra vertical space.
      *
      * If the allocated height is less than the widget's max height, the
      * vertical alignment has no effect.
      *
      * Some layout implementations may ignore vertical alignment.
      *
      * Changing the horizontal alignment will post an `update-request`
      * message to widget's parent, provided the parent has a layout
      * installed.
      */
    @JSImport("@lumino/widgets/types/layout", "Layout.setVerticalAlignment")
    @js.native
    def setVerticalAlignment(widget: Widget, value: VerticalAlignment): Unit = js.native
    
    /**
      * A type alias for the layout fit policy.
      *
      * #### Notes
      * The fit policy controls the computed size constraints which are
      * applied to the parent widget by the layout.
      *
      * Some layout implementations may ignore the fit policy.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.`set-no-constraint`
      - typings.luminoWidgets.luminoWidgetsStrings.`set-min-size`
    */
    trait FitPolicy extends StObject
    object FitPolicy {
      
      @scala.inline
      def `set-min-size`: typings.luminoWidgets.luminoWidgetsStrings.`set-min-size` = "set-min-size".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`set-min-size`]
      
      @scala.inline
      def `set-no-constraint`: typings.luminoWidgets.luminoWidgetsStrings.`set-no-constraint` = "set-no-constraint".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`set-no-constraint`]
    }
    
    /**
      * A type alias for the horizontal alignment of a widget.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.left
      - typings.luminoWidgets.luminoWidgetsStrings.center
      - typings.luminoWidgets.luminoWidgetsStrings.right
    */
    trait HorizontalAlignment extends StObject
    object HorizontalAlignment {
      
      @scala.inline
      def center: typings.luminoWidgets.luminoWidgetsStrings.center = "center".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.center]
      
      @scala.inline
      def left: typings.luminoWidgets.luminoWidgetsStrings.left = "left".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.left]
      
      @scala.inline
      def right: typings.luminoWidgets.luminoWidgetsStrings.right = "right".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.right]
    }
    
    /**
      * An options object for initializing a layout.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The fit policy for the layout.
        *
        * The default is `'set-min-size'`.
        */
      var fitPolicy: js.UndefOr[FitPolicy] = js.native
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
        def setFitPolicy(value: FitPolicy): Self = StObject.set(x, "fitPolicy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFitPolicyUndefined: Self = StObject.set(x, "fitPolicy", js.undefined)
      }
    }
    
    /**
      * A type alias for the vertical alignment of a widget.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.top
      - typings.luminoWidgets.luminoWidgetsStrings.center
      - typings.luminoWidgets.luminoWidgetsStrings.bottom
    */
    trait VerticalAlignment extends StObject
    object VerticalAlignment {
      
      @scala.inline
      def bottom: typings.luminoWidgets.luminoWidgetsStrings.bottom = "bottom".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.bottom]
      
      @scala.inline
      def center: typings.luminoWidgets.luminoWidgetsStrings.center = "center".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.center]
      
      @scala.inline
      def top: typings.luminoWidgets.luminoWidgetsStrings.top = "top".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.top]
    }
  }
  
  @JSImport("@lumino/widgets/types/layout", "LayoutItem")
  @js.native
  class LayoutItem protected () extends IDisposable {
    /**
      * Construct a new layout item.
      *
      * @param widget - The widget to be managed by the item.
      *
      * #### Notes
      * The widget will be set to absolute positioning.
      */
    def this(widget: Widget) = this()
    
    var _disposed: js.Any = js.native
    
    var _height: js.Any = js.native
    
    var _left: js.Any = js.native
    
    var _maxHeight: js.Any = js.native
    
    var _maxWidth: js.Any = js.native
    
    var _minHeight: js.Any = js.native
    
    var _minWidth: js.Any = js.native
    
    var _top: js.Any = js.native
    
    var _width: js.Any = js.native
    
    /**
      * Update the computed size limits of the managed widget.
      */
    def fit(): Unit = js.native
    
    /**
      * Whether the managed widget is attached.
      */
    val isAttached: Boolean = js.native
    
    /**
      * Whether the managed widget is hidden.
      */
    val isHidden: Boolean = js.native
    
    /**
      * Whether the managed widget is visible.
      */
    val isVisible: Boolean = js.native
    
    /**
      * The computed maximum height of the widget.
      *
      * #### Notes
      * This value can be updated by calling the `fit` method.
      */
    val maxHeight: Double = js.native
    
    /**
      * The computed maximum width of the widget.
      *
      * #### Notes
      * This value can be updated by calling the `fit` method.
      */
    val maxWidth: Double = js.native
    
    /**
      * The computed minimum height of the widget.
      *
      * #### Notes
      * This value can be updated by calling the `fit` method.
      */
    val minHeight: Double = js.native
    
    /**
      * The computed minimum width of the widget.
      *
      * #### Notes
      * This value can be updated by calling the `fit` method.
      */
    val minWidth: Double = js.native
    
    /**
      * Update the position and size of the managed widget.
      *
      * @param left - The left edge position of the layout box.
      *
      * @param top - The top edge position of the layout box.
      *
      * @param width - The width of the layout box.
      *
      * @param height - The height of the layout box.
      */
    def update(left: Double, top: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * The widget managed by the layout item.
      */
    val widget: Widget = js.native
  }
}
