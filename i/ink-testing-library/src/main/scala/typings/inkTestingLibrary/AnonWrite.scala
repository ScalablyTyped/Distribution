package typings.inkTestingLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrite extends js.Object {
  def write(data: js.Any): Boolean
}

object AnonWrite {
  @scala.inline
  def apply(write: js.Any => Boolean): AnonWrite = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[AnonWrite]
  }
}

