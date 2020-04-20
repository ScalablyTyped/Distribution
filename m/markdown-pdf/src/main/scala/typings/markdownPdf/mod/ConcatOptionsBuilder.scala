package typings.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatOptionsBuilder extends js.Object {
  var from: ConcatFromOptionsBuilder
}

object ConcatOptionsBuilder {
  @scala.inline
  def apply(from: ConcatFromOptionsBuilder): ConcatOptionsBuilder = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatOptionsBuilder]
  }
}

