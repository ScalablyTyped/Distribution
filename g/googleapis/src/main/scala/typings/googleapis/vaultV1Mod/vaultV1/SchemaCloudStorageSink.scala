package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export sink for cloud storage files.
  */
@js.native
trait SchemaCloudStorageSink extends js.Object {
  /**
    * Output only. The exported files on cloud storage.
    */
  var files: js.UndefOr[js.Array[SchemaCloudStorageFile]] = js.native
}

object SchemaCloudStorageSink {
  @scala.inline
  def apply(files: js.Array[SchemaCloudStorageFile] = null): SchemaCloudStorageSink = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloudStorageSink]
  }
}

