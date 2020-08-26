package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StorageSource describes the location of the source in an archive file in
  * Google Cloud Storage.
  */
@js.native
trait SchemaStorageSource extends js.Object {
  /**
    * Google Cloud Storage bucket containing source (see [Bucket Name
    * Requirements]
    * (https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage generation for the object.
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage object containing source.
    */
  var `object`: js.UndefOr[String] = js.native
}

object SchemaStorageSource {
  @scala.inline
  def apply(): SchemaStorageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStorageSource]
  }
  @scala.inline
  implicit class SchemaStorageSourceOps[Self <: SchemaStorageSource] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
  }
  
}

