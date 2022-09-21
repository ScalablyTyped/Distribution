package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedBarcode extends StObject {
  
  /**
    * Detailed barcode information of the DetectedBarcode.
    */
  var barcode: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2Barcode] = js.undefined
  
  /**
    * Layout for DetectedBarcode.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2DocumentPageLayout] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedBarcode {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedBarcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedBarcode]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentPageDetectedBarcode](x: Self) {
    
    inline def setBarcode(value: SchemaGoogleCloudDocumentaiV1beta2Barcode): Self = StObject.set(x, "barcode", value.asInstanceOf[js.Any])
    
    inline def setBarcodeUndefined: Self = StObject.set(x, "barcode", js.undefined)
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1beta2DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
