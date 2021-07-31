package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  /** Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container. */
  var checksum: js.UndefOr[String] = js.undefined
  
  /** Artifact ID, if any; for container images, this will be a URL by digest like `gcr.io/projectID/imagename@sha256:123456`. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as
    * presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object Artifact {
  
  @scala.inline
  def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  @scala.inline
  implicit class ArtifactMutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
