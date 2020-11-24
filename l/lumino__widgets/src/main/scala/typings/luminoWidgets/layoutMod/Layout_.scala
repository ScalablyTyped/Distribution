package typings.luminoWidgets.layoutMod

import typings.luminoAlgorithm.iterMod.IIterable
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.layoutMod.Layout.FitPolicy
import typings.luminoWidgets.layoutMod.Layout.IOptions
import typings.luminoWidgets.widgetMod.Widget
import typings.luminoWidgets.widgetMod.Widget.ChildMessage
import typings.luminoWidgets.widgetMod.Widget.ResizeMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/layout", "Layout")
@js.native
/**
  * Construct a new layout.
  *
  * @param options - The options for initializing the layout.
  */
abstract class Layout_ ()
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
