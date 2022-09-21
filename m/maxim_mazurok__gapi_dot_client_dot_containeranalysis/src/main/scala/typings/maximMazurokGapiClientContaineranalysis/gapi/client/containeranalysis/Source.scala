package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will
    * not include the context specified in the context field.
    */
  var additionalContexts: js.UndefOr[js.Array[SourceContext]] = js.undefined
  
  /** If provided, the input binary artifacts for the build came from this location. */
  var artifactStorageSourceUri: js.UndefOr[String] = js.undefined
  
  /** If provided, the source code used for the build came from this location. */
  var context: js.UndefOr[SourceContext] = js.undefined
  
  /**
    * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source
    * and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to
    * that file.
    */
  var fileHashes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.FileHashes}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.Source & TopLevel[Any]
  ] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setAdditionalContexts(value: js.Array[SourceContext]): Self = StObject.set(x, "additionalContexts", value.asInstanceOf[js.Any])
    
    inline def setAdditionalContextsUndefined: Self = StObject.set(x, "additionalContexts", js.undefined)
    
    inline def setAdditionalContextsVarargs(value: SourceContext*): Self = StObject.set(x, "additionalContexts", js.Array(value*))
    
    inline def setArtifactStorageSourceUri(value: String): Self = StObject.set(x, "artifactStorageSourceUri", value.asInstanceOf[js.Any])
    
    inline def setArtifactStorageSourceUriUndefined: Self = StObject.set(x, "artifactStorageSourceUri", js.undefined)
    
    inline def setContext(value: SourceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setFileHashes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.FileHashes}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.Source & TopLevel[Any]
    ): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
    
    inline def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
  }
}
