package typings.luminoWidgets.mod

import typings.luminoMessaging.mod.ConflatableMessage
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.widgetMod.Widget.IOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "Widget")
@js.native
/**
  * Construct a new widget.
  *
  * @param options - The options for initializing the widget.
  */
open class Widget ()
  extends typings.luminoWidgets.widgetMod.Widget {
  def this(options: IOptions) = this()
}
object Widget {
  
  @JSImport("@lumino/widgets", "Widget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A message class for child related messages.
    */
  @JSImport("@lumino/widgets", "Widget.ChildMessage")
  @js.native
  open class ChildMessage protected ()
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
    * An enum of widget bit flags.
    */
  @JSImport("@lumino/widgets", "Widget.Flag")
  @js.native
  object Flag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.luminoWidgets.widgetMod.Widget.Flag & Double] = js.native
    
    /* 16 */ val DisallowLayout: typings.luminoWidgets.widgetMod.Widget.Flag.DisallowLayout & Double = js.native
    
    /* 2 */ val IsAttached: typings.luminoWidgets.widgetMod.Widget.Flag.IsAttached & Double = js.native
    
    /* 1 */ val IsDisposed: typings.luminoWidgets.widgetMod.Widget.Flag.IsDisposed & Double = js.native
    
    /* 4 */ val IsHidden: typings.luminoWidgets.widgetMod.Widget.Flag.IsHidden & Double = js.native
    
    /* 8 */ val IsVisible: typings.luminoWidgets.widgetMod.Widget.Flag.IsVisible & Double = js.native
  }
  
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
  @JSImport("@lumino/widgets", "Widget.HiddenMode")
  @js.native
  object HiddenMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.luminoWidgets.widgetMod.Widget.HiddenMode & Double] = js.native
    
    /* 0 */ val Display: typings.luminoWidgets.widgetMod.Widget.HiddenMode.Display & Double = js.native
    
    /* 1 */ val Scale: typings.luminoWidgets.widgetMod.Widget.HiddenMode.Scale & Double = js.native
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
    @JSImport("@lumino/widgets", "Widget.Msg.ActivateRequest")
    @js.native
    val ActivateRequest: ConflatableMessage = js.native
    
    /**
      * A singleton `'after-attach'` message.
      *
      * #### Notes
      * This message is sent to a widget after it is attached.
      */
    @JSImport("@lumino/widgets", "Widget.Msg.AfterAttach")
    @js.native
    val AfterAttach: Message = js.native
    
    /**
      * A singleton `'after-detach'` message.
      *
      * #### Notes
      * This message is sent to a widget after it is detached.
      */
    @JSImport("@lumino/widgets", "Widget.Msg.AfterDetach")
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
    @JSImport("@lumino/widgets", "Widget.Msg.AfterHide")
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
    @JSImport("@lumino/widgets", "Widget.Msg.AfterShow")
    @js.native
    val AfterShow: Message = js.native
    
    /**
      * A singleton `'before-attach'` message.
      *
      * #### Notes
      * This message is sent to a widget before it is attached.
      */
    @JSImport("@lumino/widgets", "Widget.Msg.BeforeAttach")
    @js.native
    val BeforeAttach: Message = js.native
    
    /**
      * A singleton `'before-detach'` message.
      *
      * #### Notes
      * This message is sent to a widget before it is detached.
      */
    @JSImport("@lumino/widgets", "Widget.Msg.BeforeDetach")
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
    @JSImport("@lumino/widgets", "Widget.Msg.BeforeHide")
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
    @JSImport("@lumino/widgets", "Widget.Msg.BeforeShow")
    @js.native
    val BeforeShow: Message = js.native
    
    /**
      * A singleton conflatable `'close-request'` message.
      *
      * #### Notes
      * This message should be dispatched to a widget when it should close
      * and remove itself from the widget hierarchy.
      */
    @JSImport("@lumino/widgets", "Widget.Msg.CloseRequest")
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
    @JSImport("@lumino/widgets", "Widget.Msg.FitRequest")
    @js.native
    val FitRequest: ConflatableMessage = js.native
    
    /**
      * A singleton `'parent-changed'` message.
      *
      * #### Notes
      * This message is sent to a widget when its parent has changed.
      */
    @JSImport("@lumino/widgets", "Widget.Msg.ParentChanged")
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
    @JSImport("@lumino/widgets", "Widget.Msg.UpdateRequest")
    @js.native
    val UpdateRequest: ConflatableMessage = js.native
  }
  
  /**
    * A message class for `'resize'` messages.
    */
  @JSImport("@lumino/widgets", "Widget.ResizeMessage")
  @js.native
  open class ResizeMessage protected ()
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
    * The namespace for the `ResizeMessage` class statics.
    */
  object ResizeMessage {
    
    /**
      * A singleton `'resize'` message with an unknown size.
      */
    @JSImport("@lumino/widgets", "Widget.ResizeMessage.UnknownSize")
    @js.native
    val UnknownSize: typings.luminoWidgets.widgetMod.Widget.ResizeMessage = js.native
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
  inline def attach(widget: typings.luminoWidgets.widgetMod.Widget, host: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(widget.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def attach(widget: typings.luminoWidgets.widgetMod.Widget, host: HTMLElement, ref: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(widget.asInstanceOf[js.Any], host.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Detach the widget from its host DOM node.
    *
    * @param widget - The widget of interest.
    *
    * #### Notes
    * This will throw an error if the widget is not a root widget,
    * or if the widget is not attached to the DOM.
    */
  inline def detach(widget: typings.luminoWidgets.widgetMod.Widget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(widget.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
