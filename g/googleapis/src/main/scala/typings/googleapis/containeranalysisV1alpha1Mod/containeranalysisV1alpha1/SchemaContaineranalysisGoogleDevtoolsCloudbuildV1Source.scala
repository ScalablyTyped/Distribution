package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Source extends StObject {
  
  /**
    * If provided, get the source from this location in a Cloud Source Repository.
    */
  var repoSource: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource] = js.undefined
  
  /**
    * If provided, get the source from this location in Google Cloud Storage.
    */
  var storageSource: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource] = js.undefined
  
  /**
    * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
    */
  var storageSourceManifest: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Source {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Source]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Source](x: Self) {
    
    inline def setRepoSource(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    inline def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    inline def setStorageSource(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifest(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest): Self = StObject.set(x, "storageSourceManifest", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceManifestUndefined: Self = StObject.set(x, "storageSourceManifest", js.undefined)
    
    inline def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
