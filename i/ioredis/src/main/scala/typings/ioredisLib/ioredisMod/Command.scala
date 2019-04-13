package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  def setArgumentTransformer(name: java.lang.String, fn: js.Function1[/* args */ js.Array[_], js.Array[_]]): scala.Unit
  def setReplyTransformer(name: java.lang.String, fn: js.Function1[/* result */ js.Any, _]): scala.Unit
}

object Command {
  @scala.inline
  def apply(
    setArgumentTransformer: (java.lang.String, js.Function1[/* args */ js.Array[_], js.Array[_]]) => scala.Unit,
    setReplyTransformer: (java.lang.String, js.Function1[/* result */ js.Any, _]) => scala.Unit
  ): Command = {
    val __obj = js.Dynamic.literal(setArgumentTransformer = js.Any.fromFunction2(setArgumentTransformer), setReplyTransformer = js.Any.fromFunction2(setReplyTransformer))
  
    __obj.asInstanceOf[Command]
  }
}

