package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode extends StObject {
  
  /**
    * Detailed barcode information of the DetectedBarcode.
    */
  var barcode: js.UndefOr[SchemaGoogleCloudDocumentaiV1Barcode] = js.undefined
  
  /**
    * Layout for DetectedBarcode.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageLayout] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode](x: Self) {
    
    inline def setBarcode(value: SchemaGoogleCloudDocumentaiV1Barcode): Self = StObject.set(x, "barcode", value.asInstanceOf[js.Any])
    
    inline def setBarcodeUndefined: Self = StObject.set(x, "barcode", js.undefined)
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
