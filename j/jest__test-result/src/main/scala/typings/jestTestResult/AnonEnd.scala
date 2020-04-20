package typings.jestTestResult

import typings.jestTestResult.typesMod.Milliseconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: Milliseconds
  var start: Milliseconds
}

object AnonEnd {
  @scala.inline
  def apply(end: Milliseconds, start: Milliseconds): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

