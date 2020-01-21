package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of setting the project configuration.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse extends js.Object {
  /**
    * Project ID of the relying party.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse {
  @scala.inline
  def apply(projectId: String = null): SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
}

