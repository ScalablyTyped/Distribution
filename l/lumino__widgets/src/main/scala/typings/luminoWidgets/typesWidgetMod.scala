package typings.luminoWidgets

import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoMessaging.mod.ConflatableMessage
import typings.luminoMessaging.mod.IMessageHandler
import typings.luminoMessaging.mod.Message
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.typesLayoutMod.Layout
import typings.luminoWidgets.typesTitleMod.Title
import typings.luminoWidgets.typesWidgetMod.Widget.ChildMessage
import typings.luminoWidgets.typesWidgetMod.Widget.Flag
import typings.luminoWidgets.typesWidgetMod.Widget.HiddenMode
import typings.luminoWidgets.typesWidgetMod.Widget.IOptions
import typings.luminoWidgets.typesWidgetMod.Widget.ResizeMessage
import typings.std.DOMStringMap
import typings.std.HTMLElement
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWidgetMod {
  
  @JSImport("@lumino/widgets/types/widget", "Widget")
  @js.native
  /**
    * Construct a new widget.
    *
    * @param options - The options for initializing the widget.
    */
  open class Widget ()
    extends StObject
       with IMessageHandler
       with IObservableDisposable {
    def this(options: IOptions) = this()
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _flags: Any = js.native
    
    /* private */ var _hiddenMode: Any = js.native
    
    /* private */ var _layout: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _toggleHidden: Any = js.native
    
    /**
      * Post an `'activate-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for posting the message.
      */
    def activate(): Unit = js.native
    
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
    def addClass(name: String): Unit = js.native
    
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
    def children(): IterableIterator[Widget] = js.native
    
    /**
      * Clear the given widget flag.
      *
      * #### Notes
      * This will not typically be called directly by user code.
      */
    def clearFlag(flag: Flag): Unit = js.native
    
    /**
      * Send a `'close-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for sending the message.
      */
    def close(): Unit = js.native
    
    /**
      * Test whether a widget is a descendant of this widget.
      *
      * @param widget - The descendant widget of interest.
      *
      * @returns `true` if the widget is a descendant, `false` otherwise.
      */
    def contains(widget: Widget): Boolean = js.native
    
    /**
      * The dataset for the widget's DOM node.
      */
    def dataset: DOMStringMap = js.native
    
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
    override def dispose(): Unit = js.native
    
    /**
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the widget is disposed.
      */
    @JSName("disposed")
    def disposed_MWidget: ISignal[this.type, Unit] = js.native
    
    /**
      * Post a `'fit-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for posting the message.
      */
    def fit(): Unit = js.native
    
    /**
      * Test whether the widget's DOM node has the given class name.
      *
      * @param name - The class name of interest.
      *
      * @returns `true` if the node has the class, `false` otherwise.
      */
    def hasClass(name: String): Boolean = js.native
    
    /**
      * Get the method for hiding the widget.
      */
    def hiddenMode: HiddenMode = js.native
    /**
      * Set the method for hiding the widget.
      */
    def hiddenMode_=(value: HiddenMode): Unit = js.native
    
    /**
      * Hide the widget and make it hidden to its parent widget.
      *
      * #### Notes
      * This causes the {@link isHidden} property to be `true`.
      *
      * If the widget is explicitly hidden, this is a no-op.
      */
    def hide(): Unit = js.native
    
    /**
      * Get the id of the widget's DOM node.
      */
    def id: String = js.native
    /**
      * Set the id of the widget's DOM node.
      */
    def id_=(value: String): Unit = js.native
    
    /**
      * Test whether the widget's node is attached to the DOM.
      */
    def isAttached: Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the widget has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MWidget: Boolean = js.native
    
    /**
      * Test whether the widget is explicitly hidden.
      */
    def isHidden: Boolean = js.native
    
    /**
      * Test whether the widget is visible.
      *
      * #### Notes
      * A widget is visible when it is attached to the DOM, is not
      * explicitly hidden, and has no explicitly hidden ancestors.
      */
    def isVisible: Boolean = js.native
    
    /**
      * Get the layout for the widget.
      */
    def layout: Layout | Null = js.native
    /**
      * Set the layout for the widget.
      *
      * #### Notes
      * The layout is single-use only. It cannot be changed after the
      * first assignment.
      *
      * The layout is disposed automatically when the widget is disposed.
      */
    def layout_=(value: Layout | Null): Unit = js.native
    
    /**
      * Get the DOM node owned by the widget.
      */
    val node: HTMLElement = js.native
    
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
    /* protected */ def notifyLayout(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'activate-request'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onActivateRequest(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-attach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterAttach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-detach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterDetach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-hide'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterHide(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-show'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterShow(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-attach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeAttach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-detach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeDetach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-hide'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeHide(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-show'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeShow(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'child-added'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onChildAdded(msg: ChildMessage): Unit = js.native
    
    /**
      * A message handler invoked on a `'child-removed'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onChildRemoved(msg: ChildMessage): Unit = js.native
    
    /**
      * A message handler invoked on a `'close-request'` message.
      *
      * #### Notes
      * The default implementation unparents or detaches the widget.
      */
    /* protected */ def onCloseRequest(msg: Message): Unit = js.native
    
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
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
    
    /**
      * A message handler invoked on an `'update-request'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onUpdateRequest(msg: Message): Unit = js.native
    
    /**
      * Get the parent of the widget.
      */
    def parent: Widget | Null = js.native
    /**
      * Set the parent of the widget.
      *
      * #### Notes
      * Children are typically added to a widget by using a layout, which
      * means user code will not normally set the parent widget directly.
      *
      * The widget will be automatically removed from its old parent.
      *
      * This is a no-op if there is no effective parent change.
      */
    def parent_=(value: Widget | Null): Unit = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* CompleteClass */
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
    def removeClass(name: String): Unit = js.native
    
    /**
      * Set the given widget flag.
      *
      * #### Notes
      * This will not typically be called directly by user code.
      */
    def setFlag(flag: Flag): Unit = js.native
    
    /**
      * Show or hide the widget according to a boolean value.
      *
      * @param hidden - `true` to hide the widget, or `false` to show it.
      *
      * #### Notes
      * This is a convenience method for `hide()` and `show()`.
      */
    def setHidden(hidden: Boolean): Unit = js.native
    
    /**
      * Show the widget and make it visible to its parent widget.
      *
      * #### Notes
      * This causes the {@link isHidden} property to be `false`.
      *
      * If the widget is not explicitly hidden, this is a no-op.
      */
    def show(): Unit = js.native
    
    /**
      * Test whether the given widget flag is set.
      *
      * #### Notes
      * This will not typically be called directly by user code.
      */
    def testFlag(flag: Flag): Boolean = js.native
    
    /**
      * The title object for the widget.
      *
      * #### Notes
      * The title object is used by some container widgets when displaying
      * the widget alongside some title, such as a tab panel or side bar.
      *
      * Since not all widgets will use the title, it is created on demand.
      *
      * The `owner` property of the title is set to this widget.
      */
    def title: Title[Widget] = js.native
    
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
    def toggleClass(name: String): Boolean = js.native
    def toggleClass(name: String, force: Boolean): Boolean = js.native
    
    /**
      * Post an `'update-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for posting the message.
      */
    def update(): Unit = js.native
  }
  object Widget {
    
    @JSImport("@lumino/widgets/types/widget", "Widget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A message class for child related messages.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.ChildMessage")
    @js.native
    open class ChildMessage protected () extends Message {
      /**
        * Construct a new child message.
        *
        * @param type - The message type.
        *
        * @param child - The child widget for the message.
        */
      def this(`type`: String, child: Widget) = this()
      
      /**
        * The child widget for the message.
        */
      val child: Widget = js.native
    }
    
    @js.native
    sealed trait Flag extends StObject
    /**
      * An enum of widget bit flags.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.Flag")
    @js.native
    object Flag extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Flag & Double] = js.native
      
      /**
        * A layout cannot be set on the widget.
        */
      @js.native
      sealed trait DisallowLayout
        extends StObject
           with Flag
      /* 16 */ val DisallowLayout: typings.luminoWidgets.typesWidgetMod.Widget.Flag.DisallowLayout & Double = js.native
      
      /**
        * The widget is attached to the DOM.
        */
      @js.native
      sealed trait IsAttached
        extends StObject
           with Flag
      /* 2 */ val IsAttached: typings.luminoWidgets.typesWidgetMod.Widget.Flag.IsAttached & Double = js.native
      
      /**
        * The widget has been disposed.
        */
      @js.native
      sealed trait IsDisposed
        extends StObject
           with Flag
      /* 1 */ val IsDisposed: typings.luminoWidgets.typesWidgetMod.Widget.Flag.IsDisposed & Double = js.native
      
      /**
        * The widget is hidden.
        */
      @js.native
      sealed trait IsHidden
        extends StObject
           with Flag
      /* 4 */ val IsHidden: typings.luminoWidgets.typesWidgetMod.Widget.Flag.IsHidden & Double = js.native
      
      /**
        * The widget is visible.
        */
      @js.native
      sealed trait IsVisible
        extends StObject
           with Flag
      /* 8 */ val IsVisible: typings.luminoWidgets.typesWidgetMod.Widget.Flag.IsVisible & Double = js.native
    }
    
    @js.native
    sealed trait HiddenMode extends StObject
    /**
      * The method for hiding the widget.
      *
      * The default is Display.
      *
      * Using `Scale` will often increase performance as most browsers will not
      * trigger style computation for the `transform` action. This should be used
      * sparingly and tested, since increasing the number of composition layers
      * may slow things down.
      *
      * To ensure the transformation does not trigger style recomputation, you
      * may need to set the widget CSS style `will-change: transform`. This
      * should be used only when needed as it may overwhelm the browser with a
      * high number of layers. See
      * https://developer.mozilla.org/en-US/docs/Web/CSS/will-change
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.HiddenMode")
    @js.native
    object HiddenMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[HiddenMode & Double] = js.native
      
      /**
        *Hide the widget by setting the `content-visibility` to `'hidden'`.
        */
      @js.native
      sealed trait ContentVisibility
        extends StObject
           with HiddenMode
      /* 2 */ val ContentVisibility: typings.luminoWidgets.typesWidgetMod.Widget.HiddenMode.ContentVisibility & Double = js.native
      
      /**
        * Set a `lm-mod-hidden` CSS class to hide the widget using `display:none`
        * CSS from the standard Lumino CSS.
        */
      @js.native
      sealed trait Display
        extends StObject
           with HiddenMode
      /* 0 */ val Display: typings.luminoWidgets.typesWidgetMod.Widget.HiddenMode.Display & Double = js.native
      
      /**
        * Hide the widget by setting the `transform` to `'scale(0)'`.
        */
      @js.native
      sealed trait Scale
        extends StObject
           with HiddenMode
      /* 1 */ val Scale: typings.luminoWidgets.typesWidgetMod.Widget.HiddenMode.Scale & Double = js.native
    }
    
    /**
      * A collection of stateless messages related to widgets.
      */
    object Msg {
      
      /**
        * A singleton conflatable `'activate-request'` message.
        *
        * #### Notes
        * This message should be dispatched to a widget when it should
        * perform the actions necessary to activate the widget, which
        * may include focusing its node or descendant node.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.ActivateRequest")
      @js.native
      val ActivateRequest: ConflatableMessage = js.native
      
      /**
        * A singleton `'after-attach'` message.
        *
        * #### Notes
        * This message is sent to a widget after it is attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterAttach")
      @js.native
      val AfterAttach: Message = js.native
      
      /**
        * A singleton `'after-detach'` message.
        *
        * #### Notes
        * This message is sent to a widget after it is detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterDetach")
      @js.native
      val AfterDetach: Message = js.native
      
      /**
        * A singleton `'after-hide'` message.
        *
        * #### Notes
        * This message is sent to a widget after it becomes not-visible.
        *
        * This message is **not** sent when the widget is being detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterHide")
      @js.native
      val AfterHide: Message = js.native
      
      /**
        * A singleton `'after-show'` message.
        *
        * #### Notes
        * This message is sent to a widget after it becomes visible.
        *
        * This message is **not** sent when the widget is being attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterShow")
      @js.native
      val AfterShow: Message = js.native
      
      /**
        * A singleton `'before-attach'` message.
        *
        * #### Notes
        * This message is sent to a widget before it is attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeAttach")
      @js.native
      val BeforeAttach: Message = js.native
      
      /**
        * A singleton `'before-detach'` message.
        *
        * #### Notes
        * This message is sent to a widget before it is detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeDetach")
      @js.native
      val BeforeDetach: Message = js.native
      
      /**
        * A singleton `'before-hide'` message.
        *
        * #### Notes
        * This message is sent to a widget before it becomes not-visible.
        *
        * This message is **not** sent when the widget is being detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeHide")
      @js.native
      val BeforeHide: Message = js.native
      
      /**
        * A singleton `'before-show'` message.
        *
        * #### Notes
        * This message is sent to a widget before it becomes visible.
        *
        * This message is **not** sent when the widget is being attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeShow")
      @js.native
      val BeforeShow: Message = js.native
      
      /**
        * A singleton conflatable `'close-request'` message.
        *
        * #### Notes
        * This message should be dispatched to a widget when it should close
        * and remove itself from the widget hierarchy.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.CloseRequest")
      @js.native
      val CloseRequest: ConflatableMessage = js.native
      
      /**
        * A singleton conflatable `'fit-request'` message.
        *
        * #### Notes
        * For widgets with a layout, this message will inform the layout to
        * recalculate its size constraints to fit the space requirements of
        * its child widgets, and to update their position and size. Not all
        * layouts will respond to messages of this type.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.FitRequest")
      @js.native
      val FitRequest: ConflatableMessage = js.native
      
      /**
        * A singleton `'parent-changed'` message.
        *
        * #### Notes
        * This message is sent to a widget when its parent has changed.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.ParentChanged")
      @js.native
      val ParentChanged: Message = js.native
      
      /**
        * A singleton conflatable `'update-request'` message.
        *
        * #### Notes
        * This message can be dispatched to supporting widgets in order to
        * update their content based on the current widget state. Not all
        * widgets will respond to messages of this type.
        *
        * For widgets with a layout, this message will inform the layout to
        * update the position and size of its child widgets.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.UpdateRequest")
      @js.native
      val UpdateRequest: ConflatableMessage = js.native
    }
    
    /**
      * A message class for `'resize'` messages.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.ResizeMessage")
    @js.native
    open class ResizeMessage protected () extends Message {
      /**
        * Construct a new resize message.
        *
        * @param width - The **offset width** of the widget, or `-1` if
        *   the width is not known.
        *
        * @param height - The **offset height** of the widget, or `-1` if
        *   the height is not known.
        */
      def this(width: Double, height: Double) = this()
      
      /**
        * The offset height of the widget.
        *
        * #### Notes
        * This will be `-1` if the height is unknown.
        */
      val height: Double = js.native
      
      /**
        * The offset width of the widget.
        *
        * #### Notes
        * This will be `-1` if the width is unknown.
        */
      val width: Double = js.native
    }
    /**
      * The namespace for the `ResizeMessage` class statics.
      */
    object ResizeMessage {
      
      /**
        * A singleton `'resize'` message with an unknown size.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.ResizeMessage.UnknownSize")
      @js.native
      val UnknownSize: ResizeMessage = js.native
    }
    
    /**
      * Attach a widget to a host DOM node.
      *
      * @param widget - The widget of interest.
      *
      * @param host - The DOM node to use as the widget's host.
      *
      * @param ref - The child of `host` to use as the reference element.
      *   If this is provided, the widget will be inserted before this
      *   node in the host. The default is `null`, which will cause the
      *   widget to be added as the last child of the host.
      *
      * #### Notes
      * This will throw an error if the widget is not a root widget, if
      * the widget is already attached, or if the host is not attached
      * to the DOM.
      */
    inline def attach(widget: Widget, host: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(widget.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def attach(widget: Widget, host: HTMLElement, ref: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(widget.asInstanceOf[js.Any], host.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Detach the widget from its host DOM node.
      *
      * @param widget - The widget of interest.
      *
      * #### Notes
      * This will throw an error if the widget is not a root widget,
      * or if the widget is not attached to the DOM.
      */
    inline def detach(widget: Widget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(widget.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * An options object for initializing a widget.
      */
    trait IOptions extends StObject {
      
      /**
        * The optional node to use for the widget.
        *
        * If a node is provided, the widget will assume full ownership
        * and control of the node, as if it had created the node itself.
        *
        * The default is a new `<div>`.
        */
      var node: js.UndefOr[HTMLElement] = js.undefined
      
      /**
        * The optional element tag, used for constructing the widget's node.
        *
        * If a pre-constructed node is provided via the `node` arg, this
        * value is ignored.
        */
      var tag: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 113, starting with typings.luminoWidgets.luminoWidgetsStrings.a, typings.luminoWidgets.luminoWidgetsStrings.abbr, typings.luminoWidgets.luminoWidgetsStrings.address */ Any
          ] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
        
        inline def setTag(
          value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 113, starting with typings.luminoWidgets.luminoWidgetsStrings.a, typings.luminoWidgets.luminoWidgetsStrings.abbr, typings.luminoWidgets.luminoWidgetsStrings.address */ Any
        ): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
  }
}
