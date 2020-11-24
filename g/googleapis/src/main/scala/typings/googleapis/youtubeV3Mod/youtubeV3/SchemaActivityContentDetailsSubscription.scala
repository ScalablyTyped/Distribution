package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a channel that a user subscribed to.
  */
@js.native
trait SchemaActivityContentDetailsSubscription extends js.Object {
  
  /**
    * The resourceId object contains information that identifies the resource
    * that the user subscribed to.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}
object SchemaActivityContentDetailsSubscription {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsSubscription]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsSubscriptionOps[Self <: SchemaActivityContentDetailsSubscription] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: SchemaResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
}
