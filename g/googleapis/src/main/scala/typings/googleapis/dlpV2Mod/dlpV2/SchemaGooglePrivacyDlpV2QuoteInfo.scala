package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2QuoteInfo extends StObject {
  
  /**
    * The date time indicated by the quote.
    */
  var dateTime: js.UndefOr[SchemaGooglePrivacyDlpV2DateTime] = js.undefined
}
object SchemaGooglePrivacyDlpV2QuoteInfo {
  
  inline def apply(): SchemaGooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuoteInfo]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2QuoteInfo](x: Self) {
    
    inline def setDateTime(value: SchemaGooglePrivacyDlpV2DateTime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
