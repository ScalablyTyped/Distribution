package typings.ioredis.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  def setArgumentTransformer(name: String, fn: js.Function1[/* args */ js.Array[_], js.Array[_]]): Unit
  def setReplyTransformer(name: String, fn: js.Function1[/* result */ js.Any, _]): Unit
}

object Command {
  @scala.inline
  def apply(
    setArgumentTransformer: (String, js.Function1[/* args */ js.Array[_], js.Array[_]]) => Unit,
    setReplyTransformer: (String, js.Function1[/* result */ js.Any, _]) => Unit
  ): Command = {
    val __obj = js.Dynamic.literal(setArgumentTransformer = js.Any.fromFunction2(setArgumentTransformer), setReplyTransformer = js.Any.fromFunction2(setReplyTransformer))
  
    __obj.asInstanceOf[Command]
  }
}

