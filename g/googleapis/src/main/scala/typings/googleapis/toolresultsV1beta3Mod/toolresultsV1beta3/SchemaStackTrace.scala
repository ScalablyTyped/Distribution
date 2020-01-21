package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stacktrace.
  */
@js.native
trait SchemaStackTrace extends js.Object {
  /**
    * The stack trace message.  Required
    */
  var exception: js.UndefOr[String] = js.native
}

object SchemaStackTrace {
  @scala.inline
  def apply(exception: String = null): SchemaStackTrace = {
    val __obj = js.Dynamic.literal()
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStackTrace]
  }
}

