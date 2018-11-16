package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExpectationResult extends Result {
  var actual: js.Any
  var expected: js.Any
  var matcherName: java.lang.String
  var message: java.lang.String
  var trace: Trace
  def passed(): scala.Boolean
}

