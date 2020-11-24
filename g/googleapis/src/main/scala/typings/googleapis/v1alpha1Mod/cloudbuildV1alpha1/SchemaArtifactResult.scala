package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaArtifactResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactResult]
  }
  
  @scala.inline
  implicit class SchemaArtifactResultOps[Self <: SchemaArtifactResult] (val x: Self) extends AnyVal {
    
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
    def setFileHashVarargs(value: SchemaFileHashes*): Self = this.set("fileHash", js.Array(value :_*))
    
    @scala.inline
    def setFileHash(value: js.Array[SchemaFileHashes]): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileHash: Self = this.set("fileHash", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
