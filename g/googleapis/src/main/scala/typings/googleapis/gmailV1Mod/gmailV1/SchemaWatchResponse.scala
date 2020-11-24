package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Push notification watch response.
  */
@js.native
trait SchemaWatchResponse extends js.Object {
  
  /**
    * When Gmail will stop sending notifications for mailbox updates (epoch
    * millis). Call watch again before this time to renew the watch.
    */
  var expiration: js.UndefOr[String] = js.native
  
  /**
    * The ID of the mailbox&#39;s current history record.
    */
  var historyId: js.UndefOr[String] = js.native
}
object SchemaWatchResponse {
  
  @scala.inline
  def apply(): SchemaWatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchResponse]
  }
  
  @scala.inline
  implicit class SchemaWatchResponseOps[Self <: SchemaWatchResponse] (val x: Self) extends AnyVal {
    
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
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
  }
}
