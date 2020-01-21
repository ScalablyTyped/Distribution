package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirebaseRulesService.UpdateReleasePatch.
  */
@js.native
trait SchemaUpdateReleaseRequest extends js.Object {
  /**
    * `Release` to update.
    */
  var release: js.UndefOr[SchemaRelease] = js.native
  /**
    * Specifies which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateReleaseRequest {
  @scala.inline
  def apply(release: SchemaRelease = null, updateMask: String = null): SchemaUpdateReleaseRequest = {
    val __obj = js.Dynamic.literal()
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateReleaseRequest]
  }
}

