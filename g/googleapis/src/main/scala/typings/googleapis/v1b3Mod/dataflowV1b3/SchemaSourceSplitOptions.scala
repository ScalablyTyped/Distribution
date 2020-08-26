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
  def apply(): SchemaSourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitOptions]
  }
  @scala.inline
  implicit class SchemaSourceSplitOptionsOps[Self <: SchemaSourceSplitOptions] (val x: Self) extends AnyVal {
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
    def setDesiredBundleSizeBytes(value: String): Self = this.set("desiredBundleSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredBundleSizeBytes: Self = this.set("desiredBundleSizeBytes", js.undefined)
    @scala.inline
    def setDesiredShardSizeBytes(value: String): Self = this.set("desiredShardSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredShardSizeBytes: Self = this.set("desiredShardSizeBytes", js.undefined)
  }
  
}

