package typings.luminoWidgets.widgetMod.Widget

import typings.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message class for child related messages.
  */
@JSImport("@lumino/widgets/types/widget", "Widget.ChildMessage")
@js.native
class ChildMessage protected () extends Message {
  /**
    * Construct a new child message.
    *
    * @param type - The message type.
    *
    * @param child - The child widget for the message.
    */
  def this(`type`: String, child: typings.luminoWidgets.widgetMod.Widget) = this()
  /**
    * The child widget for the message.
    */
  val child: typings.luminoWidgets.widgetMod.Widget = js.native
}

