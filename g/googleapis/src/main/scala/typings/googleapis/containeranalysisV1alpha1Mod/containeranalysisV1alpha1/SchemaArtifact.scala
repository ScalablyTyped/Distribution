package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Artifact describes a build product.
  */
trait SchemaArtifact extends StObject {
  
  /**
    * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
    * container.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * Artifact ID, if any; for container images, this will be a URL by digest
    * like gcr.io/projectID/imagename@sha256:123456
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the artifact. This may be the path to a binary or jar file, or in
    * the case of a container build, the name used to push the container image
    * to Google Container Registry, as presented to `docker push`.  This field
    * is deprecated in favor of the plural `names` field; it continues to exist
    * here to allow existing BuildProvenance serialized to json in
    * google.devtools.containeranalysis.v1alpha1.BuildDetails.provenance_bytes
    * to deserialize back into proto.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Related artifact names. This may be the path to a binary or jar file, or
    * in the case of a container build, the name used to push the container
    * image to Google Container Registry, as presented to `docker push`. Note
    * that a single Artifact ID can have multiple names, for example if two
    * tags are applied to one image.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaArtifact {
  
  @scala.inline
  def apply(): SchemaArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifact]
  }
  
  @scala.inline
  implicit class SchemaArtifactMutableBuilder[Self <: SchemaArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
