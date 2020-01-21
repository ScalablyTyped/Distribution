package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Write a Data Access (Gin) log
  */
@js.native
trait SchemaLogConfigDataAccessOptions extends js.Object {
  /**
    * Whether Gin logging should happen in a fail-closed manner at the caller.
    * This is relevant only in the LocalIAM implementation, for now.  NOTE:
    * Logging to Gin in a fail-closed manner is currently unsupported while
    * work is being done to satisfy the requirements of go/345. Currently,
    * setting LOG_FAIL_CLOSED mode will have no effect, but still exists
    * because there is active work being done to support it (b/115874152).
    */
  var logMode: js.UndefOr[String] = js.native
}

object SchemaLogConfigDataAccessOptions {
  @scala.inline
  def apply(logMode: String = null): SchemaLogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    if (logMode != null) __obj.updateDynamic("logMode")(logMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLogConfigDataAccessOptions]
  }
}

