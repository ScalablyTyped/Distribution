package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** If provided, get the source from this location in a Cloud Source Repository. */
  var repoSource: js.UndefOr[RepoSource] = js.undefined
  
  /** If provided, get the source from this location in Google Cloud Storage. */
  var storageSource: js.UndefOr[StorageSource] = js.undefined
  
  /**
    * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description
    * [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
    */
  var storageSourceManifest: js.UndefOr[StorageSourceManifest] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setRepoSource(value: RepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    inline def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    inline def setStorageSource(value: StorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifest(value: StorageSourceManifest): Self = StObject.set(x, "storageSourceManifest", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifestUndefined: Self = StObject.set(x, "storageSourceManifest", js.undefined)
    
    inline def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
