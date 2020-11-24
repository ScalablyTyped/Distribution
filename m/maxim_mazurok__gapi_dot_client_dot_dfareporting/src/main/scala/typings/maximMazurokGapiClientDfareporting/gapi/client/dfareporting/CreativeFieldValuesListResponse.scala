package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeFieldValuesListResponse extends js.Object {
  
  /** Creative field value collection. */
  var creativeFieldValues: js.UndefOr[js.Array[CreativeFieldValue]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldValuesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object CreativeFieldValuesListResponse {
  
  @scala.inline
  def apply(): CreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldValuesListResponse]
  }
  
  @scala.inline
  implicit class CreativeFieldValuesListResponseOps[Self <: CreativeFieldValuesListResponse] (val x: Self) extends AnyVal {
    
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
    def setCreativeFieldValuesVarargs(value: CreativeFieldValue*): Self = this.set("creativeFieldValues", js.Array(value :_*))
    
    @scala.inline
    def setCreativeFieldValues(value: js.Array[CreativeFieldValue]): Self = this.set("creativeFieldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeFieldValues: Self = this.set("creativeFieldValues", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
