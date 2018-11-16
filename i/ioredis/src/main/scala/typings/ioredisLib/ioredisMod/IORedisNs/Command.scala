package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Command extends js.Object {
  def setArgumentTransformer(name: java.lang.String, fn: js.Function1[/* args */ js.Array[_], js.Array[_]]): scala.Unit
  def setReplyTransformer(name: java.lang.String, fn: js.Function1[/* result */ js.Any, _]): scala.Unit
}

