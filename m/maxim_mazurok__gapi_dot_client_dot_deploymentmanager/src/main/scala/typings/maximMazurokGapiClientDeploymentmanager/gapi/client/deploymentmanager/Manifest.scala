package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
  /** Output only. The YAML configuration for this manifest. */
  var config: js.UndefOr[ConfigFile] = js.undefined
  
  /** Output only. The fully-expanded configuration file, including any templates and references. */
  var expandedConfig: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /** Output only. The imported files for this manifest. */
  var imports: js.UndefOr[js.Array[ImportFile]] = js.undefined
  
  /** Output only. Creation timestamp in RFC3339 text format. */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The YAML layout for this manifest. */
  var layout: js.UndefOr[String] = js.undefined
  
  /** Output only. The computed size of the fully expanded manifest. */
  var manifestSizeBytes: js.UndefOr[String] = js.undefined
  
  /** Output only. The size limit for expanded manifests in the project. */
  var manifestSizeLimitBytes: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the manifest. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Self link for the manifest. */
  var selfLink: js.UndefOr[String] = js.undefined
}
object Manifest {
  
  inline def apply(): Manifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manifest]
  }
  
  extension [Self <: Manifest](x: Self) {
    
    inline def setConfig(value: ConfigFile): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setExpandedConfig(value: String): Self = StObject.set(x, "expandedConfig", value.asInstanceOf[js.Any])
    
    inline def setExpandedConfigUndefined: Self = StObject.set(x, "expandedConfig", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImports(value: js.Array[ImportFile]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: ImportFile*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setManifestSizeBytes(value: String): Self = StObject.set(x, "manifestSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setManifestSizeBytesUndefined: Self = StObject.set(x, "manifestSizeBytes", js.undefined)
    
    inline def setManifestSizeLimitBytes(value: String): Self = StObject.set(x, "manifestSizeLimitBytes", value.asInstanceOf[js.Any])
    
    inline def setManifestSizeLimitBytesUndefined: Self = StObject.set(x, "manifestSizeLimitBytes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
