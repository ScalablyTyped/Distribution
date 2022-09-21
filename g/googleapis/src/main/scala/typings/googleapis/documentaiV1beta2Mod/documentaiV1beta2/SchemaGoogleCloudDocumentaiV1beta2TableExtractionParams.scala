package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2TableExtractionParams extends StObject {
  
  /**
    * Whether to enable table extraction.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Reserved for future use.
    */
  var headerHints: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Model version of the table extraction system. Default is "builtin/stable". Specify "builtin/latest" for the latest model.
    */
  var modelVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Table bounding box hints that can be provided to complex cases which our algorithm cannot locate the table(s) in.
    */
  var tableBoundHints: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2TableBoundHint]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2TableExtractionParams {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2TableExtractionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2TableExtractionParams]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2TableExtractionParams](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeaderHints(value: js.Array[String]): Self = StObject.set(x, "headerHints", value.asInstanceOf[js.Any])
    
    inline def setHeaderHintsNull: Self = StObject.set(x, "headerHints", null)
    
    inline def setHeaderHintsUndefined: Self = StObject.set(x, "headerHints", js.undefined)
    
    inline def setHeaderHintsVarargs(value: String*): Self = StObject.set(x, "headerHints", js.Array(value*))
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionNull: Self = StObject.set(x, "modelVersion", null)
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "modelVersion", js.undefined)
    
    inline def setTableBoundHints(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2TableBoundHint]): Self = StObject.set(x, "tableBoundHints", value.asInstanceOf[js.Any])
    
    inline def setTableBoundHintsUndefined: Self = StObject.set(x, "tableBoundHints", js.undefined)
    
    inline def setTableBoundHintsVarargs(value: SchemaGoogleCloudDocumentaiV1beta2TableBoundHint*): Self = StObject.set(x, "tableBoundHints", js.Array(value*))
  }
}
