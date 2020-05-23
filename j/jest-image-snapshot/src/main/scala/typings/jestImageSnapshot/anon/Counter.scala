package typings.jestImageSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  var counter: Double
  var currentTestName: String
  var defaultIdentifier: String
  var testPath: String
}

object Counter {
  @scala.inline
  def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], defaultIdentifier = defaultIdentifier.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

