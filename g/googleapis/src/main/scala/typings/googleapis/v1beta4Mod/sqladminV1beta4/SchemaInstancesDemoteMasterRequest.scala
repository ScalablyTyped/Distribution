package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database demote master request.
  */
@js.native
trait SchemaInstancesDemoteMasterRequest extends js.Object {
  /**
    * Contains details about the demoteMaster operation.
    */
  var demoteMasterContext: js.UndefOr[SchemaDemoteMasterContext] = js.native
}

object SchemaInstancesDemoteMasterRequest {
  @scala.inline
  def apply(demoteMasterContext: SchemaDemoteMasterContext = null): SchemaInstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    if (demoteMasterContext != null) __obj.updateDynamic("demoteMasterContext")(demoteMasterContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesDemoteMasterRequest]
  }
}

