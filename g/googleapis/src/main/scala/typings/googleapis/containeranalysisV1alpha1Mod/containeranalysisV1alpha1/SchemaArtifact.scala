package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Artifact describes a build product.
  */
@js.native
trait SchemaArtifact extends js.Object {
  
  /**
    * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
    * container.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * Artifact ID, if any; for container images, this will be a URL by digest
    * like gcr.io/projectID/imagename@sha256:123456
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the artifact. This may be the path to a binary or jar file, or in
    * the case of a container build, the name used to push the container image
    * to Google Container Registry, as presented to `docker push`.  This field
    * is deprecated in favor of the plural `names` field; it continues to exist
    * here to allow existing BuildProvenance serialized to json in
    * google.devtools.containeranalysis.v1alpha1.BuildDetails.provenance_bytes
    * to deserialize back into proto.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Related artifact names. This may be the path to a binary or jar file, or
    * in the case of a container build, the name used to push the container
    * image to Google Container Registry, as presented to `docker push`. Note
    * that a single Artifact ID can have multiple names, for example if two
    * tags are applied to one image.
    */
  var names: js.UndefOr[js.Array[String]] = js.native
}
object SchemaArtifact {
  
  @scala.inline
  def apply(): SchemaArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifact]
  }
  
  @scala.inline
  implicit class SchemaArtifactOps[Self <: SchemaArtifact] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
  }
}
