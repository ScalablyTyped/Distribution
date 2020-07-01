package typings.iconvLite

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncoderStream extends js.Object {
  def end(): js.UndefOr[Buffer]
  def write(str: String): Buffer
}

object EncoderStream {
  @scala.inline
  def apply(end: () => js.UndefOr[Buffer], write: String => Buffer): EncoderStream = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[EncoderStream]
  }
}

