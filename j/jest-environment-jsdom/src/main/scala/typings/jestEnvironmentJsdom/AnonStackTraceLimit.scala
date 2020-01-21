package typings.jestEnvironmentJsdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStackTraceLimit extends js.Object {
  var stackTraceLimit: Double
}

object AnonStackTraceLimit {
  @scala.inline
  def apply(stackTraceLimit: Double): AnonStackTraceLimit = {
    val __obj = js.Dynamic.literal(stackTraceLimit = stackTraceLimit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStackTraceLimit]
  }
}

