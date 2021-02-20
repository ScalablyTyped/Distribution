package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceProvenance extends StObject {
  
  /**
    * Output only. Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated
    * if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the
    * build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
    */
  var fileHashes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.cloudbuild.gapi.client.cloudbuild.FileHashes}
    */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.SourceProvenance with TopLevel[js.Any]
  ] = js.native
  
  /** A copy of the build's `source.repo_source`, if exists, with any revisions resolved. */
  var resolvedRepoSource: js.UndefOr[RepoSource] = js.native
  
  /** A copy of the build's `source.storage_source`, if exists, with any generations resolved. */
  var resolvedStorageSource: js.UndefOr[StorageSource] = js.native
}
object SourceProvenance {
  
  @scala.inline
  def apply(): SourceProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceProvenance]
  }
  
  @scala.inline
  implicit class SourceProvenanceMutableBuilder[Self <: SourceProvenance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileHashes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.cloudbuild.gapi.client.cloudbuild.FileHashes}
      */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.SourceProvenance with TopLevel[js.Any]
    ): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
    
    @scala.inline
    def setResolvedRepoSource(value: RepoSource): Self = StObject.set(x, "resolvedRepoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedRepoSourceUndefined: Self = StObject.set(x, "resolvedRepoSource", js.undefined)
    
    @scala.inline
    def setResolvedStorageSource(value: StorageSource): Self = StObject.set(x, "resolvedStorageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedStorageSourceUndefined: Self = StObject.set(x, "resolvedStorageSource", js.undefined)
  }
}
