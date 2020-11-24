package typings.luminoWidgets.widgetMod.Widget

import typings.luminoMessaging.mod.ConflatableMessage
import typings.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of stateless messages related to widgets.
  */
@JSImport("@lumino/widgets/types/widget", "Widget.Msg")
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
