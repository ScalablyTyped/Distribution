package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomReportExpectation extends js.Object {
  var matcherName: String
  var message: String
  var passed: Boolean
  var stack: String
}

object CustomReportExpectation {
  @scala.inline
  def apply(matcherName: String, message: String, passed: Boolean, stack: String): CustomReportExpectation = {
    val __obj = js.Dynamic.literal(matcherName = matcherName, message = message, passed = passed, stack = stack)
  
    __obj.asInstanceOf[CustomReportExpectation]
  }
}

