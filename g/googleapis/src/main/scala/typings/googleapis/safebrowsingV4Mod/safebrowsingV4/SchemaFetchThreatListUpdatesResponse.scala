package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFetchThreatListUpdatesResponse extends js.Object {
  
  /**
    * The list updates requested by the clients.
    */
  var listUpdateResponses: js.UndefOr[js.Array[SchemaListUpdateResponse]] = js.native
  
  /**
    * The minimum duration the client must wait before issuing any update
    * request. If this field is not set clients may update as soon as they
    * want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
}
object SchemaFetchThreatListUpdatesResponse {
  
  @scala.inline
  def apply(): SchemaFetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchThreatListUpdatesResponse]
  }
  
  @scala.inline
  implicit class SchemaFetchThreatListUpdatesResponseOps[Self <: SchemaFetchThreatListUpdatesResponse] (val x: Self) extends AnyVal {
    
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
    def setListUpdateResponsesVarargs(value: SchemaListUpdateResponse*): Self = this.set("listUpdateResponses", js.Array(value :_*))
    
    @scala.inline
    def setListUpdateResponses(value: js.Array[SchemaListUpdateResponse]): Self = this.set("listUpdateResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListUpdateResponses: Self = this.set("listUpdateResponses", js.undefined)
    
    @scala.inline
    def setMinimumWaitDuration(value: String): Self = this.set("minimumWaitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumWaitDuration: Self = this.set("minimumWaitDuration", js.undefined)
  }
}
