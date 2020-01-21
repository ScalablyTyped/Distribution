package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In a GcsData resource, an object&#39;s name is the Google Cloud Storage
  * object&#39;s name and its `lastModificationTime` refers to the object&#39;s
  * updated time, which changes when the content or the metadata of the object
  * is updated.
  */
@js.native
trait SchemaGcsData extends js.Object {
  /**
    * Google Cloud Storage bucket name (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/naming#requirements)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.native
}

object SchemaGcsData {
  @scala.inline
  def apply(bucketName: String = null): SchemaGcsData = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGcsData]
  }
}

