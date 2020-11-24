package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends js.Object {
  
  /**
    * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will
    * not include the context specified in the context field.
    */
  var additionalContexts: js.UndefOr[js.Array[SourceContext]] = js.native
  
  /** If provided, the input binary artifacts for the build came from this location. */
  var artifactStorageSourceUri: js.UndefOr[String] = js.native
  
  /** If provided, the source code used for the build came from this location. */
  var context: js.UndefOr[SourceContext] = js.native
  
  /**
    * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source
    * and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to
    * that file.
    */
  var fileHashes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.FileHashes}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.Source with TopLevel[js.Any]
  ] = js.native
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalContextsVarargs(value: SourceContext*): Self = this.set("additionalContexts", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalContexts(value: js.Array[SourceContext]): Self = this.set("additionalContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalContexts: Self = this.set("additionalContexts", js.undefined)
    
    @scala.inline
    def setArtifactStorageSourceUri(value: String): Self = this.set("artifactStorageSourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactStorageSourceUri: Self = this.set("artifactStorageSourceUri", js.undefined)
    
    @scala.inline
    def setContext(value: SourceContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setFileHashes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.FileHashes}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.Source with TopLevel[js.Any]
    ): Self = this.set("fileHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileHashes: Self = this.set("fileHashes", js.undefined)
  }
}
