package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUpdateDataSourceRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  var source: js.UndefOr[SchemaDataSource] = js.native
}

object SchemaUpdateDataSourceRequest {
  @scala.inline
  def apply(debugOptions: SchemaDebugOptions = null, source: SchemaDataSource = null): SchemaUpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateDataSourceRequest]
  }
}

