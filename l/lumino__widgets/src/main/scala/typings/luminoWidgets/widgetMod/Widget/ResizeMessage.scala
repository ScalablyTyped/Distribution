package typings.luminoWidgets.widgetMod.Widget

import typings.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message class for `'resize'` messages.
  */
@JSImport("@lumino/widgets/lib/widget", "Widget.ResizeMessage")
@js.native
class ResizeMessage protected () extends Message {
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
@JSImport("@lumino/widgets/lib/widget", "Widget.ResizeMessage")
@js.native
object ResizeMessage extends js.Object {
  /**
    * A singleton `'resize'` message with an unknown size.
    */
  val UnknownSize: ResizeMessage = js.native
}

