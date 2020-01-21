package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hints for splitting a Source into bundles (parts for parallel processing)
  * using SourceSplitRequest.
  */
@js.native
trait SchemaSourceSplitOptions extends js.Object {
  /**
    * The source should be split into a set of bundles where the estimated size
    * of each is approximately this many bytes.
    */
  var desiredBundleSizeBytes: js.UndefOr[String] = js.native
  /**
    * DEPRECATED in favor of desired_bundle_size_bytes.
    */
  var desiredShardSizeBytes: js.UndefOr[String] = js.native
}

object SchemaSourceSplitOptions {
  @scala.inline
  def apply(desiredBundleSizeBytes: String = null, desiredShardSizeBytes: String = null): SchemaSourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    if (desiredBundleSizeBytes != null) __obj.updateDynamic("desiredBundleSizeBytes")(desiredBundleSizeBytes.asInstanceOf[js.Any])
    if (desiredShardSizeBytes != null) __obj.updateDynamic("desiredShardSizeBytes")(desiredShardSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceSplitOptions]
  }
}

