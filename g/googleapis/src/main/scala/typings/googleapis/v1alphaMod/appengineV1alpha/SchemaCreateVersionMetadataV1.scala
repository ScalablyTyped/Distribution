package typings.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.longrunning.Operation during a
  * google.appengine.v1.CreateVersionRequest.
  */
@js.native
trait SchemaCreateVersionMetadataV1 extends js.Object {
  /**
    * The Cloud Build ID if one was created as part of the version create.
    * @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String] = js.native
}

object SchemaCreateVersionMetadataV1 {
  @scala.inline
  def apply(cloudBuildId: String = null): SchemaCreateVersionMetadataV1 = {
    val __obj = js.Dynamic.literal()
    if (cloudBuildId != null) __obj.updateDynamic("cloudBuildId")(cloudBuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1]
  }
}

