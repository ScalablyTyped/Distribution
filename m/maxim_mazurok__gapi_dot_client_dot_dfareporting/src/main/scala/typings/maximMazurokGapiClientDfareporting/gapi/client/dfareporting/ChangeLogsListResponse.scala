package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLogsListResponse extends js.Object {
  
  /** Change log collection. */
  var changeLogs: js.UndefOr[js.Array[ChangeLog]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLogsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ChangeLogsListResponse {
  
  @scala.inline
  def apply(): ChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeLogsListResponse]
  }
  
  @scala.inline
  implicit class ChangeLogsListResponseOps[Self <: ChangeLogsListResponse] (val x: Self) extends AnyVal {
    
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
    def setChangeLogsVarargs(value: ChangeLog*): Self = this.set("changeLogs", js.Array(value :_*))
    
    @scala.inline
    def setChangeLogs(value: js.Array[ChangeLog]): Self = this.set("changeLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeLogs: Self = this.set("changeLogs", js.undefined)
    
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
