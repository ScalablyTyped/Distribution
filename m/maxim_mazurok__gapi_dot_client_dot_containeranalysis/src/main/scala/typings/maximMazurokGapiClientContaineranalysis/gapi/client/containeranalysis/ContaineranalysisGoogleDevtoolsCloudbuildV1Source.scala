package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1Source extends StObject {
  
  /** If provided, get the source from this location in a Cloud Source Repository. */
  var repoSource: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource] = js.undefined
  
  /** If provided, get the source from this location in Google Cloud Storage. */
  var storageSource: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource] = js.undefined
  
  /**
    * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description
    * [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
    */
  var storageSourceManifest: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1Source {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1Source] (val x: Self) extends AnyVal {
    
    inline def setRepoSource(value: ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    inline def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    inline def setStorageSource(value: ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifest(value: ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest): Self = StObject.set(x, "storageSourceManifest", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifestUndefined: Self = StObject.set(x, "storageSourceManifest", js.undefined)
    
    inline def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
