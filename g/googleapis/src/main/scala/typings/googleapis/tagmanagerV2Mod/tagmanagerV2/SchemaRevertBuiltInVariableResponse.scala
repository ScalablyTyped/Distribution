package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a built-in variable in a workspace.
  */
@js.native
trait SchemaRevertBuiltInVariableResponse extends js.Object {
  /**
    * Whether the built-in variable is enabled after reversion.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaRevertBuiltInVariableResponse {
  @scala.inline
  def apply(): SchemaRevertBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertBuiltInVariableResponse]
  }
  @scala.inline
  implicit class SchemaRevertBuiltInVariableResponseOps[Self <: SchemaRevertBuiltInVariableResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

