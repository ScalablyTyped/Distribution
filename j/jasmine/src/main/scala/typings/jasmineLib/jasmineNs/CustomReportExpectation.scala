package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomReportExpectation extends js.Object {
  var matcherName: java.lang.String
  var message: java.lang.String
  var passed: scala.Boolean
  var stack: java.lang.String
}

object CustomReportExpectation {
  @scala.inline
  def apply(
    matcherName: java.lang.String,
    message: java.lang.String,
    passed: scala.Boolean,
    stack: java.lang.String
  ): CustomReportExpectation = {
    val __obj = js.Dynamic.literal(matcherName = matcherName, message = message, passed = passed, stack = stack)
  
    __obj.asInstanceOf[CustomReportExpectation]
  }
}

