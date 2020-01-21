package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A storage location within Google cloud storage (GCS).
  */
@js.native
trait SchemaGoogleCloudStorage extends js.Object {
  /**
    * Required. The path to a directory in GCS that will eventually contain the
    * results for this test. The requesting user must have write access on the
    * bucket in the supplied path.
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudStorage {
  @scala.inline
  def apply(gcsPath: String = null): SchemaGoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudStorage]
  }
}

