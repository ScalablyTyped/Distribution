package typings.googleapis.indexingV3Mod.indexingV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output for PublishUrlNotification
  */
@js.native
trait SchemaPublishUrlNotificationResponse extends js.Object {
  
  /**
    * Description of the notification events received for this URL.
    */
  var urlNotificationMetadata: js.UndefOr[SchemaUrlNotificationMetadata] = js.native
}
object SchemaPublishUrlNotificationResponse {
  
  @scala.inline
  def apply(): SchemaPublishUrlNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishUrlNotificationResponse]
  }
  
  @scala.inline
  implicit class SchemaPublishUrlNotificationResponseOps[Self <: SchemaPublishUrlNotificationResponse] (val x: Self) extends AnyVal {
    
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
    def setUrlNotificationMetadata(value: SchemaUrlNotificationMetadata): Self = this.set("urlNotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlNotificationMetadata: Self = this.set("urlNotificationMetadata", js.undefined)
  }
}
