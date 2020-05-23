package typings.inkTestingLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Write extends js.Object {
  def write(data: js.Any): Boolean
}

object Write {
  @scala.inline
  def apply(write: js.Any => Boolean): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
}

