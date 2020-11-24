package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedStatus extends js.Object {
  
  /** The country for which the status is reported, represented as a CLDR territory code. */
  var country: js.UndefOr[String] = js.native
  
  /** The ID of the feed for which the status is reported. */
  var datafeedId: js.UndefOr[String] = js.native
  
  /** The list of errors occurring in the feed. */
  var errors: js.UndefOr[js.Array[DatafeedStatusError]] = js.native
  
  /** The number of items in the feed that were processed. */
  var itemsTotal: js.UndefOr[String] = js.native
  
  /** The number of items in the feed that were valid. */
  var itemsValid: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#datafeedStatus`" */
  var kind: js.UndefOr[String] = js.native
  
  /** The two-letter ISO 639-1 language for which the status is reported. */
  var language: js.UndefOr[String] = js.native
  
  /** The last date at which the feed was uploaded. */
  var lastUploadDate: js.UndefOr[String] = js.native
  
  /**
    * The processing status of the feed. Acceptable values are: - "`"`failure`": The feed could not be processed or all items had errors.`" - "`in progress`": The feed is being processed.
    * - "`none`": The feed has not yet been processed. For example, a feed that has never been uploaded will have this processing status. - "`success`": The feed was processed
    * successfully, though some items might have had errors.
    */
  var processingStatus: js.UndefOr[String] = js.native
  
  /** The list of errors occurring in the feed. */
  var warnings: js.UndefOr[js.Array[DatafeedStatusError]] = js.native
}
object DatafeedStatus {
  
  @scala.inline
  def apply(): DatafeedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedStatus]
  }
  
  @scala.inline
  implicit class DatafeedStatusOps[Self <: DatafeedStatus] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDatafeedId(value: String): Self = this.set("datafeedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatafeedId: Self = this.set("datafeedId", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: DatafeedStatusError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[DatafeedStatusError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setItemsTotal(value: String): Self = this.set("itemsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsTotal: Self = this.set("itemsTotal", js.undefined)
    
    @scala.inline
    def setItemsValid(value: String): Self = this.set("itemsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsValid: Self = this.set("itemsValid", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLastUploadDate(value: String): Self = this.set("lastUploadDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUploadDate: Self = this.set("lastUploadDate", js.undefined)
    
    @scala.inline
    def setProcessingStatus(value: String): Self = this.set("processingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingStatus: Self = this.set("processingStatus", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: DatafeedStatusError*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[DatafeedStatusError]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
