package typings
package ircLib.ircMod.NodeIRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  /** Command arguments */
  var args: js.Array[java.lang.String]
  /** Mapped IRC command */
  var command: java.lang.String
  /** Command type */
  var commandType: CommandType
  /** Prefix */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** Raw IRC command */
  var rawCommand: java.lang.String
}

object IMessage {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    command: java.lang.String,
    commandType: CommandType,
    rawCommand: java.lang.String,
    prefix: java.lang.String = null
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("commandType")(commandType)
    __obj.updateDynamic("rawCommand")(rawCommand)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[IMessage]
  }
}

