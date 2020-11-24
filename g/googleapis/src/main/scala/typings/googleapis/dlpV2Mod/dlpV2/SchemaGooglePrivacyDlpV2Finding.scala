package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a piece of potentially sensitive content.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Finding extends js.Object {
  
  /**
    * Timestamp when finding was detected.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The type of content that might have been found. Provided if
    * `excluded_types` is false.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  
  /**
    * Confidence of how likely it is that the `info_type` is correct.
    */
  var likelihood: js.UndefOr[String] = js.native
  
  /**
    * Where the content was found.
    */
  var location: js.UndefOr[SchemaGooglePrivacyDlpV2Location] = js.native
  
  /**
    * The content that was found. Even if the content is not textual, it may be
    * converted to a textual representation here. Provided if `include_quote`
    * is true and the finding is less than or equal to 4096 bytes long. If the
    * finding exceeds 4096 bytes in length, the quote may be omitted.
    */
  var quote: js.UndefOr[String] = js.native
  
  /**
    * Contains data parsed from quotes. Only populated if include_quote was set
    * to true and a supported infoType was requested. Currently supported
    * infoTypes: DATE, DATE_OF_BIRTH and TIME.
    */
  var quoteInfo: js.UndefOr[SchemaGooglePrivacyDlpV2QuoteInfo] = js.native
}
object SchemaGooglePrivacyDlpV2Finding {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Finding]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FindingOps[Self <: SchemaGooglePrivacyDlpV2Finding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    
    @scala.inline
    def setLikelihood(value: String): Self = this.set("likelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikelihood: Self = this.set("likelihood", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaGooglePrivacyDlpV2Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuoteInfo(value: SchemaGooglePrivacyDlpV2QuoteInfo): Self = this.set("quoteInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteInfo: Self = this.set("quoteInfo", js.undefined)
  }
}
