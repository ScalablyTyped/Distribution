package typings.jestEnvironmentJsdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var Error: AnonStackTraceLimit
}

object AnonError {
  @scala.inline
  def apply(Error: AnonStackTraceLimit): AnonError = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

