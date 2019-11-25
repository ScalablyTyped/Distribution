package typings.jestDashMessageDashUtil.jestDashMessageDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTraceOptions extends js.Object {
  var noStackTrace: Boolean
}

object StackTraceOptions {
  @scala.inline
  def apply(noStackTrace: Boolean): StackTraceOptions = {
    val __obj = js.Dynamic.literal(noStackTrace = noStackTrace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StackTraceOptions]
  }
}

