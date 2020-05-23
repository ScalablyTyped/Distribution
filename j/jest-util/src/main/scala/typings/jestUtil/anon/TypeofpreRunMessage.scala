package typings.jestUtil.anon

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpreRunMessage extends js.Object {
  def print(stream: WritableStream): Unit
  def remove(stream: WritableStream): Unit
}

object TypeofpreRunMessage {
  @scala.inline
  def apply(print: WritableStream => Unit, remove: WritableStream => Unit): TypeofpreRunMessage = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction1(print), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[TypeofpreRunMessage]
  }
}

