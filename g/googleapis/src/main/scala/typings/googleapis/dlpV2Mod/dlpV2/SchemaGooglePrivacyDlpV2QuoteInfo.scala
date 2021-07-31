package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for infoType-dependent details parsed from quote.
  */
trait SchemaGooglePrivacyDlpV2QuoteInfo extends StObject {
  
  /**
    * The date time indicated by the quote.
    */
  var dateTime: js.UndefOr[SchemaGooglePrivacyDlpV2DateTime] = js.undefined
}
object SchemaGooglePrivacyDlpV2QuoteInfo {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuoteInfo]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2QuoteInfoMutableBuilder[Self <: SchemaGooglePrivacyDlpV2QuoteInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateTime(value: SchemaGooglePrivacyDlpV2DateTime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
