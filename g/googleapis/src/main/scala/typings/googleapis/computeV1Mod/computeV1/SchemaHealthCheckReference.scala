package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A full or valid partial URL to a health check. For example, the following
  * are valid URLs:   -
  * https://www.googleapis.com/compute/beta/projects/project-id/global/httpHealthChecks/health-check
  * - projects/project-id/global/httpHealthChecks/health-check  -
  * global/httpHealthChecks/health-check
  */
@js.native
trait SchemaHealthCheckReference extends js.Object {
  var healthCheck: js.UndefOr[String] = js.native
}

object SchemaHealthCheckReference {
  @scala.inline
  def apply(healthCheck: String = null): SchemaHealthCheckReference = {
    val __obj = js.Dynamic.literal()
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHealthCheckReference]
  }
}

