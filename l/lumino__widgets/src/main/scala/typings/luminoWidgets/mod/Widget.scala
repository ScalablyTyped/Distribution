package typings.luminoWidgets.mod

import typings.luminoMessaging.mod.ConflatableMessage
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.widgetMod.Widget.IOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/widgets", "Widget")
@js.native
/**
  * Construct a new widget.
  *
  * @param options - The options for initializing the widget.
  */
class Widget ()
  extends typings.luminoWidgets.widgetMod.Widget {
  def this(options: IOptions) = this()
}

@JSImport("@lumino/widgets", "Widget")
@js.native
object Widget extends js.Object {
  /**
    * A message class for child related messages.
    */
  @js.native
  class ChildMessage protected ()
    extends typings.luminoWidgets.widgetMod.Widget.ChildMessage {
    /**
      * Construct a new child message.
      *
      * @param type - The message type.
      *
      * @param child - The child widget for the message.
      */
    def this(`type`: String, child: typings.luminoWidgets.widgetMod.Widget) = this()
  }
  
  /**
    * A message class for `'resize'` messages.
    */
  @js.native
  class ResizeMessage protected ()
    extends typings.luminoWidgets.widgetMod.Widget.ResizeMessage {
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
  def attach(widget: typings.luminoWidgets.widgetMod.Widget, host: HTMLElement): Unit = js.native
  def attach(widget: typings.luminoWidgets.widgetMod.Widget, host: HTMLElement, ref: HTMLElement): Unit = js.native
  /**
    * Detach the widget from its host DOM node.
    *
    * @param widget - The widget of interest.
    *
    * #### Notes
    * This will throw an error if the widget is not a root widget,
    * or if the widget is not attached to the DOM.
    */
  def detach(widget: typings.luminoWidgets.widgetMod.Widget): Unit = js.native
  /**
    * An enum of widget bit flags.
    */
  @js.native
  object Flag extends js.Object {
    /* 16 */ val DisallowLayout: typings.luminoWidgets.widgetMod.Widget.Flag.DisallowLayout with Double = js.native
    /* 2 */ val IsAttached: typings.luminoWidgets.widgetMod.Widget.Flag.IsAttached with Double = js.native
    /* 1 */ val IsDisposed: typings.luminoWidgets.widgetMod.Widget.Flag.IsDisposed with Double = js.native
    /* 4 */ val IsHidden: typings.luminoWidgets.widgetMod.Widget.Flag.IsHidden with Double = js.native
    /* 8 */ val IsVisible: typings.luminoWidgets.widgetMod.Widget.Flag.IsVisible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.luminoWidgets.widgetMod.Widget.Flag with Double] = js.native
  }
  
  /**
    * A collection of stateless messages related to widgets.
    */
  @js.native
  object Msg extends js.Object {
    /**
      * A singleton conflatable `'activate-request'` message.
      *
      * #### Notes
      * This message should be dispatched to a widget when it should
      * perform the actions necessary to activate the widget, which
      * may include focusing its node or descendant node.
      */
    val ActivateRequest: ConflatableMessage = js.native
    /**
      * A singleton `'after-attach'` message.
      *
      * #### Notes
      * This message is sent to a widget after it is attached.
      */
    val AfterAttach: Message = js.native
    /**
      * A singleton `'after-detach'` message.
      *
      * #### Notes
      * This message is sent to a widget after it is detached.
      */
    val AfterDetach: Message = js.native
    /**
      * A singleton `'after-hide'` message.
      *
      * #### Notes
      * This message is sent to a widget after it becomes not-visible.
      *
      * This message is **not** sent when the widget is being detached.
      */
    val AfterHide: Message = js.native
    /**
      * A singleton `'after-show'` message.
      *
      * #### Notes
      * This message is sent to a widget after it becomes visible.
      *
      * This message is **not** sent when the widget is being attached.
      */
    val AfterShow: Message = js.native
    /**
      * A singleton `'before-attach'` message.
      *
      * #### Notes
      * This message is sent to a widget before it is attached.
      */
    val BeforeAttach: Message = js.native
    /**
      * A singleton `'before-detach'` message.
      *
      * #### Notes
      * This message is sent to a widget before it is detached.
      */
    val BeforeDetach: Message = js.native
    /**
      * A singleton `'before-hide'` message.
      *
      * #### Notes
      * This message is sent to a widget before it becomes not-visible.
      *
      * This message is **not** sent when the widget is being detached.
      */
    val BeforeHide: Message = js.native
    /**
      * A singleton `'before-show'` message.
      *
      * #### Notes
      * This message is sent to a widget before it becomes visible.
      *
      * This message is **not** sent when the widget is being attached.
      */
    val BeforeShow: Message = js.native
    /**
      * A singleton conflatable `'close-request'` message.
      *
      * #### Notes
      * This message should be dispatched to a widget when it should close
      * and remove itself from the widget hierarchy.
      */
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
    val FitRequest: ConflatableMessage = js.native
    /**
      * A singleton `'parent-changed'` message.
      *
      * #### Notes
      * This message is sent to a widget when its parent has changed.
      */
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
    val UpdateRequest: ConflatableMessage = js.native
  }
  
  /**
    * The namespace for the `ResizeMessage` class statics.
    */
  @js.native
  object ResizeMessage extends js.Object {
    /**
      * A singleton `'resize'` message with an unknown size.
      */
    val UnknownSize: typings.luminoWidgets.widgetMod.Widget.ResizeMessage = js.native
  }
  
}

