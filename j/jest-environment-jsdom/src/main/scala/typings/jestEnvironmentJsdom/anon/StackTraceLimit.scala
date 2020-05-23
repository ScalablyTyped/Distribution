package typings.jestEnvironmentJsdom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTraceLimit extends js.Object {
  var stackTraceLimit: Double
}

object StackTraceLimit {
  @scala.inline
  def apply(stackTraceLimit: Double): StackTraceLimit = {
    val __obj = js.Dynamic.literal(stackTraceLimit = stackTraceLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceLimit]
  }
}

