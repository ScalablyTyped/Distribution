package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A static content file that is part of a version.
  */
@js.native
trait SchemaVersionFile extends js.Object {
  /**
    * The SHA256 content hash of the file.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The URI at which the file&#39;s content should display.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Output only. The current status of a particular file in the specified
    * version. &lt;br&gt;The value will be either `pending upload` or
    * `uploaded`.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaVersionFile {
  @scala.inline
  def apply(hash: String = null, path: String = null, status: String = null): SchemaVersionFile = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVersionFile]
  }
}

