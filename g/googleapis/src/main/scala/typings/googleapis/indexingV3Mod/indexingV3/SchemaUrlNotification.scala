package typings.googleapis.indexingV3Mod.indexingV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `UrlNotification` is the resource used in all Indexing API calls. It
  * describes one event in the life cycle of a Web Document.
  */
@js.native
trait SchemaUrlNotification extends js.Object {
  
  /**
    * Creation timestamp for this notification. Users should _not_ specify it,
    * the field is ignored at the request time.
    */
  var notifyTime: js.UndefOr[String] = js.native
  
  /**
    * The URL life cycle event that Google is being notified about.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The object of this notification. The URL must be owned by the publisher
    * of this notification and, in case of `URL_UPDATED` notifications, it
    * _must_ be crawlable by Google.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaUrlNotification {
  
  @scala.inline
  def apply(): SchemaUrlNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlNotification]
  }
  
  @scala.inline
  implicit class SchemaUrlNotificationOps[Self <: SchemaUrlNotification] (val x: Self) extends AnyVal {
    
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
    def setNotifyTime(value: String): Self = this.set("notifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyTime: Self = this.set("notifyTime", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
