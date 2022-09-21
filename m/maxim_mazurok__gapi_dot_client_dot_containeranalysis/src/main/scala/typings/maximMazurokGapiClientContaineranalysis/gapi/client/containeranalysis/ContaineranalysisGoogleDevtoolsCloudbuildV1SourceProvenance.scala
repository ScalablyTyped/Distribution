package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance extends StObject {
  
  /**
    * Output only. Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated
    * if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the
    * build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
    */
  var fileHashes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance & TopLevel[Any]
  ] = js.undefined
  
  /** A copy of the build's `source.repo_source`, if exists, with any revisions resolved. */
  var resolvedRepoSource: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource] = js.undefined
  
  /** A copy of the build's `source.storage_source`, if exists, with any generations resolved. */
  var resolvedStorageSource: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource] = js.undefined
  
  /** A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview. */
  var resolvedStorageSourceManifest: js.UndefOr[ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance]
  }
  
  extension [Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance](x: Self) {
    
    inline def setFileHashes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance & TopLevel[Any]
    ): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
    
    inline def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
    
    inline def setResolvedRepoSource(value: ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource): Self = StObject.set(x, "resolvedRepoSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedRepoSourceUndefined: Self = StObject.set(x, "resolvedRepoSource", js.undefined)
    
    inline def setResolvedStorageSource(value: ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource): Self = StObject.set(x, "resolvedStorageSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedStorageSourceManifest(value: ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest): Self = StObject.set(x, "resolvedStorageSourceManifest", value.asInstanceOf[js.Any])
    
    inline def setResolvedStorageSourceManifestUndefined: Self = StObject.set(x, "resolvedStorageSourceManifest", js.undefined)
    
    inline def setResolvedStorageSourceUndefined: Self = StObject.set(x, "resolvedStorageSource", js.undefined)
  }
}
