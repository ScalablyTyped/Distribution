package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source describes the location of the source used for the build.
  */
trait SchemaSource extends StObject {
  
  /**
    * If provided, some of the source code used for the build may be found in
    * these locations, in the case where the source repository had multiple
    * remotes or submodules. This list will not include the context specified
    * in the context field.
    */
  var additionalContexts: js.UndefOr[js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]] = js.undefined
  
  /**
    * If provided, the input binary artifacts for the build came from this
    * location.
    */
  var artifactStorageSource: js.UndefOr[SchemaStorageSource] = js.undefined
  
  /**
    * If provided, the source code used for the build came from this location.
    */
  var context: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext] = js.undefined
  
  /**
    * Hash(es) of the build source, which can be used to verify that the
    * original source integrity was maintained in the build.  The keys to this
    * map are file paths used as build source and the values contain the hash
    * values for those files.  If the build source came in a single package
    * such as a gzipped tarfile (.tar.gz), the FileHash will be for the single
    * path to that file.
    */
  var fileHashes: js.UndefOr[StringDictionary[SchemaFileHashes]] = js.undefined
  
  /**
    * If provided, get source from this location in a Cloud Repo.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.undefined
  
  /**
    * If provided, get the source from this location in in Google Cloud
    * Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.undefined
}
object SchemaSource {
  
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  @scala.inline
  implicit class SchemaSourceMutableBuilder[Self <: SchemaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalContexts(value: js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]): Self = StObject.set(x, "additionalContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalContextsUndefined: Self = StObject.set(x, "additionalContexts", js.undefined)
    
    @scala.inline
    def setAdditionalContextsVarargs(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext*): Self = StObject.set(x, "additionalContexts", js.Array(value :_*))
    
    @scala.inline
    def setArtifactStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "artifactStorageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactStorageSourceUndefined: Self = StObject.set(x, "artifactStorageSource", js.undefined)
    
    @scala.inline
    def setContext(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setFileHashes(value: StringDictionary[SchemaFileHashes]): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
    
    @scala.inline
    def setRepoSource(value: SchemaRepoSource): Self = StObject.set(x, "repoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoSourceUndefined: Self = StObject.set(x, "repoSource", js.undefined)
    
    @scala.inline
    def setStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
  }
}
