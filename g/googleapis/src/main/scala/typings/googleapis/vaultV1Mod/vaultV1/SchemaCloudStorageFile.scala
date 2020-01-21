package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An export file on cloud storage
  */
@js.native
trait SchemaCloudStorageFile extends js.Object {
  /**
    * The cloud storage bucket name of this export file. Can be used in cloud
    * storage JSON/XML API.
    */
  var bucketName: js.UndefOr[String] = js.native
  /**
    * The md5 hash of the file.
    */
  var md5Hash: js.UndefOr[String] = js.native
  /**
    * The cloud storage object name of this export file. Can be used in cloud
    * storage JSON/XML API.
    */
  var objectName: js.UndefOr[String] = js.native
  /**
    * The size of the export file.
    */
  var size: js.UndefOr[String] = js.native
}

object SchemaCloudStorageFile {
  @scala.inline
  def apply(bucketName: String = null, md5Hash: String = null, objectName: String = null, size: String = null): SchemaCloudStorageFile = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    if (objectName != null) __obj.updateDynamic("objectName")(objectName.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloudStorageFile]
  }
}

