package typings.jestImageSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounter extends js.Object {
  var counter: Double
  var currentTestName: String
  var defaultIdentifier: String
  var testPath: String
}

object AnonCounter {
  @scala.inline
  def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): AnonCounter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], defaultIdentifier = defaultIdentifier.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounter]
  }
}

