package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a piece of potentially sensitive content.
  */
trait SchemaGooglePrivacyDlpV2Finding extends StObject {
  
  /**
    * Timestamp when finding was detected.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The type of content that might have been found. Provided if
    * `excluded_types` is false.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.undefined
  
  /**
    * Confidence of how likely it is that the `info_type` is correct.
    */
  var likelihood: js.UndefOr[String] = js.undefined
  
  /**
    * Where the content was found.
    */
  var location: js.UndefOr[SchemaGooglePrivacyDlpV2Location] = js.undefined
  
  /**
    * The content that was found. Even if the content is not textual, it may be
    * converted to a textual representation here. Provided if `include_quote`
    * is true and the finding is less than or equal to 4096 bytes long. If the
    * finding exceeds 4096 bytes in length, the quote may be omitted.
    */
  var quote: js.UndefOr[String] = js.undefined
  
  /**
    * Contains data parsed from quotes. Only populated if include_quote was set
    * to true and a supported infoType was requested. Currently supported
    * infoTypes: DATE, DATE_OF_BIRTH and TIME.
    */
  var quoteInfo: js.UndefOr[SchemaGooglePrivacyDlpV2QuoteInfo] = js.undefined
}
object SchemaGooglePrivacyDlpV2Finding {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Finding]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FindingMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Finding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setLikelihood(value: String): Self = StObject.set(x, "likelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikelihoodUndefined: Self = StObject.set(x, "likelihood", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaGooglePrivacyDlpV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteInfo(value: SchemaGooglePrivacyDlpV2QuoteInfo): Self = StObject.set(x, "quoteInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteInfoUndefined: Self = StObject.set(x, "quoteInfo", js.undefined)
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
