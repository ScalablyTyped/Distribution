package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageSource extends StObject {
  
  /** Google Cloud Storage bucket containing the source (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). */
  var bucket: js.UndefOr[String] = js.undefined
  
  /** Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used. */
  var generation: js.UndefOr[String] = js.undefined
  
  /** Google Cloud Storage object containing the source. This object must be a gzipped archive file (`.tar.gz`) containing source to build. */
  var `object`: js.UndefOr[String] = js.undefined
}
object StorageSource {
  
  @scala.inline
  def apply(): StorageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageSource]
  }
  
  @scala.inline
  implicit class StorageSourceMutableBuilder[Self <: StorageSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
