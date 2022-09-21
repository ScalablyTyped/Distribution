package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentPageTable extends StObject {
  
  /**
    * Body rows of the table.
    */
  var bodyRows: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow]] = js.undefined
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * Header rows of the table.
    */
  var headerRows: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow]] = js.undefined
  
  /**
    * Layout for Table.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2DocumentPageLayout] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentPageTable {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentPageTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTable]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentPageTable](x: Self) {
    
    inline def setBodyRows(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow]): Self = StObject.set(x, "bodyRows", value.asInstanceOf[js.Any])
    
    inline def setBodyRowsUndefined: Self = StObject.set(x, "bodyRows", js.undefined)
    
    inline def setBodyRowsVarargs(value: SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow*): Self = StObject.set(x, "bodyRows", js.Array(value*))
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setHeaderRows(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow]): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
    
    inline def setHeaderRowsVarargs(value: SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow*): Self = StObject.set(x, "headerRows", js.Array(value*))
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1beta2DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
