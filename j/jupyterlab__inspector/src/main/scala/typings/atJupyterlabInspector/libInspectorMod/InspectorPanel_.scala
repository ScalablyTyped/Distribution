package typings.atJupyterlabInspector.libInspectorMod

import typings.atJupyterlabApputils.libPrintingMod.Printing.IPrintable
import typings.atJupyterlabInspector.libInspectorMod.InspectorPanel.IOptions
import typings.atJupyterlabInspector.libTokensMod.IInspector
import typings.atJupyterlabInspector.libTokensMod.IInspector.IInspectable
import typings.atJupyterlabInspector.libTokensMod.IInspector.IInspectorUpdate
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Panel
import typings.atPhosphorWidgets.libWidgetMod.Widget
import typings.atPhosphorWidgets.libWidgetMod.Widget.ChildMessage
import typings.atPhosphorWidgets.libWidgetMod.Widget.Flag
import typings.atPhosphorWidgets.libWidgetMod.Widget.ResizeMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel")
@js.native
/**
  * Construct an inspector.
  */
class InspectorPanel_ ()
  extends Panel
     with IInspector
     with IPrintable {
  def this(options: IOptions) = this()
  var _content: js.Any = js.native
  var _source: js.Any = js.native
  /**
    * The source of events the inspector listens for.
    */
  /* CompleteClass */
  override var source: IInspectable | Null = js.native
  /**
    * Post an `'activate-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for posting the message.
    */
  /* InferMemberOverrides */
  override def activate(): Unit = js.native
  /**
    * Add a class name to the widget's DOM node.
    *
    * @param name - The class name to add to the node.
    *
    * #### Notes
    * If the class name is already added to the node, this is a no-op.
    *
    * The class name must not contain whitespace.
    */
  /* InferMemberOverrides */
  override def addClass(name: String): Unit = js.native
  /**
    * Add a widget to the end of the panel.
    *
    * @param widget - The widget to add to the panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    */
  /* InferMemberOverrides */
  override def addWidget(widget: Widget): Unit = js.native
  /**
    * Create an iterator over the widget's children.
    *
    * @returns A new iterator over the children of the widget.
    *
    * #### Notes
    * The widget must have a populated layout in order to have children.
    *
    * If a layout is not installed, the returned iterator will be empty.
    */
  /* InferMemberOverrides */
  override def children(): IIterator[Widget] = js.native
  /**
    * Clear the given widget flag.
    *
    * #### Notes
    * This will not typically be called directly by user code.
    */
  /* InferMemberOverrides */
  override def clearFlag(flag: Flag): Unit = js.native
  /**
    * Send a `'close-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for sending the message.
    */
  /* InferMemberOverrides */
  override def close(): Unit = js.native
  /**
    * Test whether a widget is a descendant of this widget.
    *
    * @param widget - The descendant widget of interest.
    *
    * @returns `true` if the widget is a descendant, `false` otherwise.
    */
  /* InferMemberOverrides */
  override def contains(widget: Widget): Boolean = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Post a `'fit-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for posting the message.
    */
  /* InferMemberOverrides */
  override def fit(): Unit = js.native
  /**
    * Test whether the widget's DOM node has the given class name.
    *
    * @param name - The class name of interest.
    *
    * @returns `true` if the node has the class, `false` otherwise.
    */
  /* InferMemberOverrides */
  override def hasClass(name: String): Boolean = js.native
  /**
    * Hide the widget and make it hidden to its parent widget.
    *
    * #### Notes
    * This causes the [[isHidden]] property to be `true`.
    *
    * If the widget is explicitly hidden, this is a no-op.
    */
  /* InferMemberOverrides */
  override def hide(): Unit = js.native
  /**
    * Insert a widget at the specified index.
    *
    * @param index - The index at which to insert the widget.
    *
    * @param widget - The widget to insert into to the panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    */
  /* InferMemberOverrides */
  override def insertWidget(index: Double, widget: Widget): Unit = js.native
  /**
    * Invoke the message processing routine of the widget's layout.
    *
    * @param msg - The message to dispatch to the layout.
    *
    * #### Notes
    * This is a no-op if the widget does not have a layout.
    *
    * This will not typically be called directly by user code.
    */
  /* InferMemberOverrides */
  /* protected */ override def notifyLayout(msg: Message): Unit = js.native
  /**
    * A message handler invoked on an `'activate-request'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onActivateRequest(msg: Message): Unit = js.native
  /**
    * A message handler invoked on an `'after-attach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onAfterAttach(msg: Message): Unit = js.native
  /**
    * A message handler invoked on an `'after-detach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onAfterDetach(msg: Message): Unit = js.native
  /**
    * A message handler invoked on an `'after-hide'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onAfterHide(msg: Message): Unit = js.native
  /**
    * A message handler invoked on an `'after-show'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onAfterShow(msg: Message): Unit = js.native
  /**
    * A message handler invoked on a `'before-attach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onBeforeAttach(msg: Message): Unit = js.native
  /**
    * A message handler invoked on a `'before-detach'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onBeforeDetach(msg: Message): Unit = js.native
  /**
    * A message handler invoked on a `'before-hide'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onBeforeHide(msg: Message): Unit = js.native
  /**
    * A message handler invoked on a `'before-show'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onBeforeShow(msg: Message): Unit = js.native
  /**
    * A message handler invoked on a `'child-added'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onChildAdded(msg: ChildMessage): Unit = js.native
  /**
    * A message handler invoked on a `'child-removed'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onChildRemoved(msg: ChildMessage): Unit = js.native
  /**
    * A message handler invoked on a `'close-request'` message.
    *
    * #### Notes
    * The default implementation unparents or detaches the widget.
    */
  /* InferMemberOverrides */
  /* protected */ override def onCloseRequest(msg: Message): Unit = js.native
  /**
    * A message handler invoked on a `'fit-request'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onFitRequest(msg: Message): Unit = js.native
  /**
    * Handle inspector update signals.
    */
  /* protected */ def onInspectorUpdate(sender: js.Any, args: IInspectorUpdate): Unit = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onResize(msg: ResizeMessage): Unit = js.native
  /**
    * Handle source disposed signals.
    */
  /* protected */ def onSourceDisposed(sender: js.Any, args: Unit): Unit = js.native
  /**
    * A message handler invoked on an `'update-request'` message.
    *
    * #### Notes
    * The default implementation of this handler is a no-op.
    */
  /* InferMemberOverrides */
  /* protected */ override def onUpdateRequest(msg: Message): Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: Message): Unit = js.native
  /**
    * Remove a class name from the widget's DOM node.
    *
    * @param name - The class name to remove from the node.
    *
    * #### Notes
    * If the class name is not yet added to the node, this is a no-op.
    *
    * The class name must not contain whitespace.
    */
  /* InferMemberOverrides */
  override def removeClass(name: String): Unit = js.native
  /**
    * Set the given widget flag.
    *
    * #### Notes
    * This will not typically be called directly by user code.
    */
  /* InferMemberOverrides */
  override def setFlag(flag: Flag): Unit = js.native
  /**
    * Show or hide the widget according to a boolean value.
    *
    * @param hidden - `true` to hide the widget, or `false` to show it.
    *
    * #### Notes
    * This is a convenience method for `hide()` and `show()`.
    */
  /* InferMemberOverrides */
  override def setHidden(hidden: Boolean): Unit = js.native
  /**
    * Show the widget and make it visible to its parent widget.
    *
    * #### Notes
    * This causes the [[isHidden]] property to be `false`.
    *
    * If the widget is not explicitly hidden, this is a no-op.
    */
  /* InferMemberOverrides */
  override def show(): Unit = js.native
  /**
    * Test whether the given widget flag is set.
    *
    * #### Notes
    * This will not typically be called directly by user code.
    */
  /* InferMemberOverrides */
  override def testFlag(flag: Flag): Boolean = js.native
  /**
    * Toggle a class name on the widget's DOM node.
    *
    * @param name - The class name to toggle on the node.
    *
    * @param force - Whether to force add the class (`true`) or force
    *   remove the class (`false`). If not provided, the presence of
    *   the class will be toggled from its current state.
    *
    * @returns `true` if the class is now present, `false` otherwise.
    *
    * #### Notes
    * The class name must not contain whitespace.
    */
  /* InferMemberOverrides */
  override def toggleClass(name: String): Boolean = js.native
  /* InferMemberOverrides */
  override def toggleClass(name: String, force: Boolean): Boolean = js.native
  /**
    * Post an `'update-request'` message to the widget.
    *
    * #### Notes
    * This is a simple convenience method for posting the message.
    */
  /* InferMemberOverrides */
  override def update(): Unit = js.native
}

