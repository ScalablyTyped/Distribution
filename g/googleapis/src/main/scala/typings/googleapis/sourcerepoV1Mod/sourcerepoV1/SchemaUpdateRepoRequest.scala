package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for UpdateRepo.
  */
@js.native
trait SchemaUpdateRepoRequest extends js.Object {
  /**
    * The new configuration for the repository.
    */
  var repo: js.UndefOr[SchemaRepo] = js.native
  /**
    * A FieldMask specifying which fields of the repo to modify. Only the
    * fields in the mask will be modified. If no mask is provided, this request
    * is no-op.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateRepoRequest {
  @scala.inline
  def apply(repo: SchemaRepo = null, updateMask: String = null): SchemaUpdateRepoRequest = {
    val __obj = js.Dynamic.literal()
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateRepoRequest]
  }
}

