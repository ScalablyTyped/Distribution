package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCreateBuiltInVariableResponse extends js.Object {
  /**
    * List of created built-in variables.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.native
}

object SchemaCreateBuiltInVariableResponse {
  @scala.inline
  def apply(builtInVariable: js.Array[SchemaBuiltInVariable] = null): SchemaCreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateBuiltInVariableResponse]
  }
}

