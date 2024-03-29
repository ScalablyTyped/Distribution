package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManifest extends StObject {
  
  /**
    * Output only. The YAML configuration for this manifest.
    */
  var config: js.UndefOr[SchemaConfigFile] = js.undefined
  
  /**
    * Output only. The fully-expanded configuration file, including any templates and references.
    */
  var expandedConfig: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The imported files for this manifest.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.undefined
  
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The YAML layout for this manifest.
    */
  var layout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The computed size of the fully expanded manifest.
    */
  var manifestSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The size limit for expanded manifests in the project.
    */
  var manifestSizeLimitBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the manifest.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Self link for the manifest.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaManifest {
  
  inline def apply(): SchemaManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManifest]
  }
  
  extension [Self <: SchemaManifest](x: Self) {
    
    inline def setConfig(value: SchemaConfigFile): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setExpandedConfig(value: String): Self = StObject.set(x, "expandedConfig", value.asInstanceOf[js.Any])
    
    inline def setExpandedConfigNull: Self = StObject.set(x, "expandedConfig", null)
    
    inline def setExpandedConfigUndefined: Self = StObject.set(x, "expandedConfig", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImports(value: js.Array[SchemaImportFile]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: SchemaImportFile*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeNull: Self = StObject.set(x, "insertTime", null)
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutNull: Self = StObject.set(x, "layout", null)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setManifestSizeBytes(value: String): Self = StObject.set(x, "manifestSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setManifestSizeBytesNull: Self = StObject.set(x, "manifestSizeBytes", null)
    
    inline def setManifestSizeBytesUndefined: Self = StObject.set(x, "manifestSizeBytes", js.undefined)
    
    inline def setManifestSizeLimitBytes(value: String): Self = StObject.set(x, "manifestSizeLimitBytes", value.asInstanceOf[js.Any])
    
    inline def setManifestSizeLimitBytesNull: Self = StObject.set(x, "manifestSizeLimitBytes", null)
    
    inline def setManifestSizeLimitBytesUndefined: Self = StObject.set(x, "manifestSizeLimitBytes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
