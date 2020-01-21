package typings.googleapis.cloudshellV1Mod.cloudshellV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message included in the response field of operations returned from
  * StartEnvironment once the operation is complete.
  */
@js.native
trait SchemaStartEnvironmentResponse extends js.Object {
  /**
    * Environment that was started.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.native
}

object SchemaStartEnvironmentResponse {
  @scala.inline
  def apply(environment: SchemaEnvironment = null): SchemaStartEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStartEnvironmentResponse]
  }
}

