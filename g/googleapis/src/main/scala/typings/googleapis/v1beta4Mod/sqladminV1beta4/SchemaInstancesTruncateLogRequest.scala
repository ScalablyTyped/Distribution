package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance truncate log request.
  */
@js.native
trait SchemaInstancesTruncateLogRequest extends js.Object {
  /**
    * Contains details about the truncate log operation.
    */
  var truncateLogContext: js.UndefOr[SchemaTruncateLogContext] = js.native
}

object SchemaInstancesTruncateLogRequest {
  @scala.inline
  def apply(truncateLogContext: SchemaTruncateLogContext = null): SchemaInstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    if (truncateLogContext != null) __obj.updateDynamic("truncateLogContext")(truncateLogContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesTruncateLogRequest]
  }
}

