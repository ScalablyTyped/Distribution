package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provenance of the source. Ways to find the original source, or verify that
  * some source was used for this build.
  */
@js.native
trait SchemaSourceProvenance extends StObject {
  
  /**
    * Output only. Hash(es) of the build source, which can be used to verify
    * that the original source integrity was maintained in the build. Note that
    * `FileHashes` will only be populated if `BuildOptions` has requested a
    * `SourceProvenanceHash`.  The keys to this map are file paths used as
    * build source and the values contain the hash values for those files.  If
    * the build source came in a single package such as a gzipped tarfile
    * (`.tar.gz`), the `FileHash` will be for the single path to that file.
    */
  var fileHashes: js.UndefOr[StringDictionary[SchemaFileHashes]] = js.native
  
  /**
    * A copy of the build&#39;s `source.repo_source`, if exists, with any
    * revisions resolved.
    */
  var resolvedRepoSource: js.UndefOr[SchemaRepoSource] = js.native
  
  /**
    * A copy of the build&#39;s `source.storage_source`, if exists, with any
    * generations resolved.
    */
  var resolvedStorageSource: js.UndefOr[SchemaStorageSource] = js.native
}
object SchemaSourceProvenance {
  
  @scala.inline
  def apply(): SchemaSourceProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceProvenance]
  }
  
  @scala.inline
  implicit class SchemaSourceProvenanceMutableBuilder[Self <: SchemaSourceProvenance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileHashes(value: StringDictionary[SchemaFileHashes]): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
    
    @scala.inline
    def setResolvedRepoSource(value: SchemaRepoSource): Self = StObject.set(x, "resolvedRepoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedRepoSourceUndefined: Self = StObject.set(x, "resolvedRepoSource", js.undefined)
    
    @scala.inline
    def setResolvedStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "resolvedStorageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedStorageSourceUndefined: Self = StObject.set(x, "resolvedStorageSource", js.undefined)
  }
}
