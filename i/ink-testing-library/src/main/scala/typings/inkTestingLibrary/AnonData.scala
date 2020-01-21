package typings.inkTestingLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  def write(data: js.Any): Boolean
}

object AnonData {
  @scala.inline
  def apply(write: js.Any => Boolean): AnonData = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[AnonData]
  }
}

