package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditNegativeKeywordsResponse extends js.Object {
  
  /** The list of negative keywords that have been successfully created. This list will be absent if empty. */
  var negativeKeywords: js.UndefOr[js.Array[NegativeKeyword]] = js.native
}
object BulkEditNegativeKeywordsResponse {
  
  @scala.inline
  def apply(): BulkEditNegativeKeywordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditNegativeKeywordsResponse]
  }
  
  @scala.inline
  implicit class BulkEditNegativeKeywordsResponseOps[Self <: BulkEditNegativeKeywordsResponse] (val x: Self) extends AnyVal {
    
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
    def setNegativeKeywordsVarargs(value: NegativeKeyword*): Self = this.set("negativeKeywords", js.Array(value :_*))
    
    @scala.inline
    def setNegativeKeywords(value: js.Array[NegativeKeyword]): Self = this.set("negativeKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeKeywords: Self = this.set("negativeKeywords", js.undefined)
  }
}
