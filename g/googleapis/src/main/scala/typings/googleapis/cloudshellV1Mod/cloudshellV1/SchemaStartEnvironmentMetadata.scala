package typings.googleapis.cloudshellV1Mod.cloudshellV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message included in the metadata field of operations returned from
  * StartEnvironment.
  */
@js.native
trait SchemaStartEnvironmentMetadata extends js.Object {
  /**
    * Current state of the environment being started.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaStartEnvironmentMetadata {
  @scala.inline
  def apply(state: String = null): SchemaStartEnvironmentMetadata = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStartEnvironmentMetadata]
  }
}

