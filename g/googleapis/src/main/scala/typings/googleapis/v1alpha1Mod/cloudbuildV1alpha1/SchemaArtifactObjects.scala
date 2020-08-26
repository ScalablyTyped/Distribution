package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Files in the workspace to upload to Cloud Storage upon successful
  * completion of all build steps.
  */
@js.native
trait SchemaArtifactObjects extends js.Object {
  /**
    * Cloud Storage bucket and optional object path, in the form
    * &quot;gs://bucket/path/to/somewhere/&quot;. (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Files in the workspace matching any path pattern will be uploaded to
    * Cloud Storage with this location as a prefix.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Path globs used to match files in the build&#39;s workspace.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. Stores timing information for pushing all artifact objects.
    */
  var timing: js.UndefOr[SchemaTimeSpan] = js.native
}

object SchemaArtifactObjects {
  @scala.inline
  def apply(): SchemaArtifactObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactObjects]
  }
  @scala.inline
  implicit class SchemaArtifactObjectsOps[Self <: SchemaArtifactObjects] (val x: Self) extends AnyVal {
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setTiming(value: SchemaTimeSpan): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
  
}

