package typings.ignore.ignoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var ignored: Boolean
  var unignored: Boolean
}

object TestResult {
  @scala.inline
  def apply(ignored: Boolean, unignored: Boolean): TestResult = {
    val __obj = js.Dynamic.literal(ignored = ignored, unignored = unignored)
  
    __obj.asInstanceOf[TestResult]
  }
}

