package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditNegativeKeywordsRequest extends js.Object {
  
  /** The negative keywords to create in batch, specified as a list of NegativeKeywords. */
  var createdNegativeKeywords: js.UndefOr[js.Array[NegativeKeyword]] = js.native
  
  /** The negative keywords to delete in batch, specified as a list of keyword_values. */
  var deletedNegativeKeywords: js.UndefOr[js.Array[String]] = js.native
}
object BulkEditNegativeKeywordsRequest {
  
  @scala.inline
  def apply(): BulkEditNegativeKeywordsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditNegativeKeywordsRequest]
  }
  
  @scala.inline
  implicit class BulkEditNegativeKeywordsRequestOps[Self <: BulkEditNegativeKeywordsRequest] (val x: Self) extends AnyVal {
    
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
    def setCreatedNegativeKeywordsVarargs(value: NegativeKeyword*): Self = this.set("createdNegativeKeywords", js.Array(value :_*))
    
    @scala.inline
    def setCreatedNegativeKeywords(value: js.Array[NegativeKeyword]): Self = this.set("createdNegativeKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedNegativeKeywords: Self = this.set("createdNegativeKeywords", js.undefined)
    
    @scala.inline
    def setDeletedNegativeKeywordsVarargs(value: String*): Self = this.set("deletedNegativeKeywords", js.Array(value :_*))
    
    @scala.inline
    def setDeletedNegativeKeywords(value: js.Array[String]): Self = this.set("deletedNegativeKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedNegativeKeywords: Self = this.set("deletedNegativeKeywords", js.undefined)
  }
}
