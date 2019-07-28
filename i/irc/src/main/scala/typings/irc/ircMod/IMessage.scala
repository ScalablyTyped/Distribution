package typings.irc.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  /** Command arguments */
  var args: js.Array[String]
  /** Mapped IRC command */
  var command: String
  /** Command type */
  var commandType: CommandType
  /** Prefix */
  var prefix: js.UndefOr[String] = js.undefined
  /** Raw IRC command */
  var rawCommand: String
}

object IMessage {
  @scala.inline
  def apply(
    args: js.Array[String],
    command: String,
    commandType: CommandType,
    rawCommand: String,
    prefix: String = null
  ): IMessage = {
    val __obj = js.Dynamic.literal(args = args, command = command, commandType = commandType, rawCommand = rawCommand)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[IMessage]
  }
}

