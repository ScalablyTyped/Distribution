package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a variable in a workspace.
  */
@js.native
trait SchemaRevertVariableResponse extends js.Object {
  /**
    * Variable as it appears in the latest container version since the last
    * workspace synchronization operation. If no variable is present, that
    * means the variable was deleted in the latest container version.
    */
  var variable: js.UndefOr[SchemaVariable] = js.native
}

object SchemaRevertVariableResponse {
  @scala.inline
  def apply(variable: SchemaVariable = null): SchemaRevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevertVariableResponse]
  }
}

