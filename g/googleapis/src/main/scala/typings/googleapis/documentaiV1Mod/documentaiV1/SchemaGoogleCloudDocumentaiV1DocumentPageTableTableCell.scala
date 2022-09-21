package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell extends StObject {
  
  /**
    * How many columns this cell spans.
    */
  var colSpan: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * Layout for TableCell.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageLayout] = js.undefined
  
  /**
    * How many rows this cell spans.
    */
  var rowSpan: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell](x: Self) {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanNull: Self = StObject.set(x, "colSpan", null)
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanNull: Self = StObject.set(x, "rowSpan", null)
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
