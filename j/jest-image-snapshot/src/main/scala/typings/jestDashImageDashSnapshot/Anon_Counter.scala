package typings.jestDashImageDashSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Counter extends js.Object {
  var counter: Double
  var currentTestName: String
  var defaultIdentifier: String
  var testPath: String
}

object Anon_Counter {
  @scala.inline
  def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): Anon_Counter = {
    val __obj = js.Dynamic.literal(counter = counter, currentTestName = currentTestName, defaultIdentifier = defaultIdentifier, testPath = testPath)
  
    __obj.asInstanceOf[Anon_Counter]
  }
}

