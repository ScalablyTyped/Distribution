package typings.jestDashRunner.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunnerOptions extends js.Object {
  var serial: Boolean
}

object TestRunnerOptions {
  @scala.inline
  def apply(serial: Boolean): TestRunnerOptions = {
    val __obj = js.Dynamic.literal(serial = serial)
  
    __obj.asInstanceOf[TestRunnerOptions]
  }
}

