package typings.logfmt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStream extends js.Object {
  def write(data: String): Unit
}

object WritableStream {
  @scala.inline
  def apply(write: String => Unit): WritableStream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[WritableStream]
  }
}

