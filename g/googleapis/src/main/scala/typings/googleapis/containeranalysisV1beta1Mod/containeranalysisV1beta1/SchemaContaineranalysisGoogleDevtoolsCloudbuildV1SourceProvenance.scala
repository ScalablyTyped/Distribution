package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance extends StObject {
  
  /**
    * Output only. Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
    */
  var fileHashes: js.UndefOr[
    StringDictionary[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes] | Null
  ] = js.undefined
  
  /**
    * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
    */
  var resolvedRepoSource: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource] = js.undefined
  
  /**
    * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
    */
  var resolvedStorageSource: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource] = js.undefined
  
  /**
    * A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview.
    */
  var resolvedStorageSourceManifest: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance](x: Self) {
    
    inline def setFileHashes(value: StringDictionary[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes]): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
    
    inline def setFileHashesNull: Self = StObject.set(x, "fileHashes", null)
    
    inline def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
    
    inline def setResolvedRepoSource(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource): Self = StObject.set(x, "resolvedRepoSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedRepoSourceUndefined: Self = StObject.set(x, "resolvedRepoSource", js.undefined)
    
    inline def setResolvedStorageSource(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource): Self = StObject.set(x, "resolvedStorageSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedStorageSourceManifest(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest): Self = StObject.set(x, "resolvedStorageSourceManifest", value.asInstanceOf[js.Any])
    
    inline def setResolvedStorageSourceManifestUndefined: Self = StObject.set(x, "resolvedStorageSourceManifest", js.undefined)
    
    inline def setResolvedStorageSourceUndefined: Self = StObject.set(x, "resolvedStorageSource", js.undefined)
  }
}
