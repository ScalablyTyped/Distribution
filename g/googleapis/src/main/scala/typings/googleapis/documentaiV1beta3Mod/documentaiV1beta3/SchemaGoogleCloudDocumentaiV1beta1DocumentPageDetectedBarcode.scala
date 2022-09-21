package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedBarcode extends StObject {
  
  /**
    * Detailed barcode information of the DetectedBarcode.
    */
  var barcode: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1Barcode] = js.undefined
  
  /**
    * Layout for DetectedBarcode.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1DocumentPageLayout] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedBarcode {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedBarcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedBarcode]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedBarcode](x: Self) {
    
    inline def setBarcode(value: SchemaGoogleCloudDocumentaiV1beta1Barcode): Self = StObject.set(x, "barcode", value.asInstanceOf[js.Any])
    
    inline def setBarcodeUndefined: Self = StObject.set(x, "barcode", js.undefined)
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1beta1DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
