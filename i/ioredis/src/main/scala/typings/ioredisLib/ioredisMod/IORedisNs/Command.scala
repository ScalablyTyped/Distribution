package typings
package ioredisLib.ioredisMod.IORedisNs

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
    setArgumentTransformer: js.Function2[java.lang.String, js.Function1[/* args */ js.Array[_], js.Array[_]], scala.Unit],
    setReplyTransformer: js.Function2[java.lang.String, js.Function1[/* result */ js.Any, _], scala.Unit]
  ): Command = {
    val __obj = js.Dynamic.literal(setArgumentTransformer = setArgumentTransformer, setReplyTransformer = setReplyTransformer)
  
    __obj.asInstanceOf[Command]
  }
}

