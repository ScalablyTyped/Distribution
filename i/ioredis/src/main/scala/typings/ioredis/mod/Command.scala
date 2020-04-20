package typings.ioredis.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var args: js.Array[ValueType]
  var isCustomCommand: Boolean
  def getKeys(): js.Array[String | Buffer]
  def getSlot(): Double | Null
}

object Command {
  @scala.inline
  def apply(
    args: js.Array[ValueType],
    getKeys: () => js.Array[String | Buffer],
    getSlot: () => Double | Null,
    isCustomCommand: Boolean
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], getKeys = js.Any.fromFunction0(getKeys), getSlot = js.Any.fromFunction0(getSlot), isCustomCommand = isCustomCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

