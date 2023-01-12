package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerImage extends StObject {
  
  /**
    * The time this image was built. This field is returned as the 'metadata.buildTime' field in the Version resource. The build time is returned to the client as an RFC 3339 string,
    * which can be easily used with the JavaScript Date constructor.
    */
  var buildTime: js.UndefOr[String] = js.undefined
  
  /** Calculated size of the image. This field is returned as the 'metadata.imageSizeBytes' field in the Version resource. */
  var imageSizeBytes: js.UndefOr[String] = js.undefined
  
  /** Media type of this image, e.g. "application/vnd.docker.distribution.manifest.v2+json". This field is returned as the 'metadata.mediaType' field in the Version resource. */
  var mediaType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. registry_location, project_id, repository_name and image id forms a unique image name:`projects//locations//repository//dockerImages/`. For example,
    * "projects/test-project/locations/us-west4/repositories/test-repo/dockerImages/ nginx@sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf", where "us-west4" is
    * the registry_location, "test-project" is the project_id, "test-repo" is the repository_name and "nginx@sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf" is
    * the image's digest.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Tags attached to this image. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The time when the docker image was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Time the image was uploaded. */
  var uploadTime: js.UndefOr[String] = js.undefined
  
  /** Required. URL to access the image. Example: us-west4-docker.pkg.dev/test-project/test-repo/nginx@sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf */
  var uri: js.UndefOr[String] = js.undefined
}
object DockerImage {
  
  inline def apply(): DockerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockerImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DockerImage] (val x: Self) extends AnyVal {
    
    inline def setBuildTime(value: String): Self = StObject.set(x, "buildTime", value.asInstanceOf[js.Any])
    
    inline def setBuildTimeUndefined: Self = StObject.set(x, "buildTime", js.undefined)
    
    inline def setImageSizeBytes(value: String): Self = StObject.set(x, "imageSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setImageSizeBytesUndefined: Self = StObject.set(x, "imageSizeBytes", js.undefined)
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUploadTime(value: String): Self = StObject.set(x, "uploadTime", value.asInstanceOf[js.Any])
    
    inline def setUploadTimeUndefined: Self = StObject.set(x, "uploadTime", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
