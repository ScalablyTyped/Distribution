package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2Barcode extends StObject {
  
  /**
    * Format of a barcode. The supported formats are: CODE_128: Code 128 type. CODE_39: Code 39 type. CODE_93: Code 93 type. CODABAR: Codabar type. DATA_MATRIX: 2D Data Matrix type. ITF: ITF type. EAN_13: EAN-13 type. EAN_8: EAN-8 type. QR_CODE: 2D QR code type. UPC_A: UPC-A type. UPC_E: UPC-E type. PDF417: PDF417 type. AZTEC: 2D Aztec code type. DATABAR: GS1 DataBar code type.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Raw value encoded in the barcode. For example, 'MEBKM:TITLE:Google;URL:https://www.google.com;;'.
    */
  var rawValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value format describes the format of the value that a barcode encodes. The supported formats are: CONTACT_INFO: Contact information. EMAIL: Email address. ISBN: ISBN identifier. PHONE: Phone number. PRODUCT: Product. SMS: SMS message. TEXT: Text string. URL: URL address. WIFI: Wifi information. GEO: Geo-localization. CALENDAR_EVENT: Calendar event. DRIVER_LICENSE: Driver's license.
    */
  var valueFormat: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2Barcode {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2Barcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2Barcode]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2Barcode](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setRawValueNull: Self = StObject.set(x, "rawValue", null)
    
    inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    
    inline def setValueFormat(value: String): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatNull: Self = StObject.set(x, "valueFormat", null)
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
  }
}
