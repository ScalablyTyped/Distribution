package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResetSearchApplicationRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
}

object SchemaResetSearchApplicationRequest {
  @scala.inline
  def apply(debugOptions: SchemaDebugOptions = null): SchemaResetSearchApplicationRequest = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResetSearchApplicationRequest]
  }
}

