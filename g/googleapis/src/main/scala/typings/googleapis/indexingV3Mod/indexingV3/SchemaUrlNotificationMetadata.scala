package typings.googleapis.indexingV3Mod.indexingV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Summary of the most recent Indexing API notifications successfully
  * received, for a given URL.
  */
@js.native
trait SchemaUrlNotificationMetadata extends js.Object {
  
  /**
    * Latest notification received with type `URL_REMOVED`.
    */
  var latestRemove: js.UndefOr[SchemaUrlNotification] = js.native
  
  /**
    * Latest notification received with type `URL_UPDATED`.
    */
  var latestUpdate: js.UndefOr[SchemaUrlNotification] = js.native
  
  /**
    * URL to which this metadata refers.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaUrlNotificationMetadata {
  
  @scala.inline
  def apply(): SchemaUrlNotificationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlNotificationMetadata]
  }
  
  @scala.inline
  implicit class SchemaUrlNotificationMetadataOps[Self <: SchemaUrlNotificationMetadata] (val x: Self) extends AnyVal {
    
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
    def setLatestRemove(value: SchemaUrlNotification): Self = this.set("latestRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRemove: Self = this.set("latestRemove", js.undefined)
    
    @scala.inline
    def setLatestUpdate(value: SchemaUrlNotification): Self = this.set("latestUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestUpdate: Self = this.set("latestUpdate", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
