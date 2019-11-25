package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import typings.atPhosphorCoreutils.libJsonMod.JSONPrimitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message from the terminal session.
  */
trait IMessage extends js.Object {
  /**
    * The content of the message.
    */
  val content: js.UndefOr[js.Array[JSONPrimitive]] = js.undefined
  /**
    * The type of the message.
    */
  val `type`: MessageType
}

object IMessage {
  @scala.inline
  def apply(`type`: MessageType, content: js.Array[JSONPrimitive] = null): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

