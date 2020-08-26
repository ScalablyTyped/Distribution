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
  def apply(): SchemaCloudStorageFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageFile]
  }
  @scala.inline
  implicit class SchemaCloudStorageFileOps[Self <: SchemaCloudStorageFile] (val x: Self) extends AnyVal {
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
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    @scala.inline
    def setObjectName(value: String): Self = this.set("objectName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectName: Self = this.set("objectName", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

