package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializer[T] extends js.Object {
  def decode(buffer: nodeLib.Buffer): T
  def encode(value: T): nodeLib.Buffer
}

object ISerializer {
  @scala.inline
  def apply[T](decode: nodeLib.Buffer => T, encode: T => nodeLib.Buffer): ISerializer[T] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[ISerializer[T]]
  }
}

