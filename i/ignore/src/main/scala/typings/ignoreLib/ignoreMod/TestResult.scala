package typings
package ignoreLib.ignoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var ignored: scala.Boolean
  var unignored: scala.Boolean
}

object TestResult {
  @scala.inline
  def apply(ignored: scala.Boolean, unignored: scala.Boolean): TestResult = {
    val __obj = js.Dynamic.literal(ignored = ignored, unignored = unignored)
  
    __obj.asInstanceOf[TestResult]
  }
}

