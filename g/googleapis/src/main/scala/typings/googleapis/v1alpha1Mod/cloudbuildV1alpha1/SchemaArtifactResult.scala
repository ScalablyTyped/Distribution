package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An artifact that was uploaded during a build. This is a single record in
  * the artifact manifest JSON file.
  */
@js.native
trait SchemaArtifactResult extends js.Object {
  /**
    * The file hash of the artifact.
    */
  var fileHash: js.UndefOr[js.Array[SchemaFileHashes]] = js.native
  /**
    * The path of an artifact in a Google Cloud Storage bucket, with the
    * generation number. For example,
    * `gs://mybucket/path/to/output.jar#generation`.
    */
  var location: js.UndefOr[String] = js.native
}

object SchemaArtifactResult {
  @scala.inline
  def apply(fileHash: js.Array[SchemaFileHashes] = null, location: String = null): SchemaArtifactResult = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaArtifactResult]
  }
}

