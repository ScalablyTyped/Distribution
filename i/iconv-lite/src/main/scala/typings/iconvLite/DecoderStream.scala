package typings.iconvLite

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoderStream extends js.Object {
  def end(): js.UndefOr[String]
  def write(buf: Buffer): String
}

object DecoderStream {
  @scala.inline
  def apply(end: () => js.UndefOr[String], write: Buffer => String): DecoderStream = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DecoderStream]
  }
}

