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
  def apply(bucket: String = null, generation: String = null, `object`: String = null): SchemaStorageSource = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStorageSource]
  }
}

