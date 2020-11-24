package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group&#39;s content details.
  */
@js.native
trait SchemaGroupContentDetails extends js.Object {
  
  /**
    * The number of items in the group.
    */
  var itemCount: js.UndefOr[String] = js.native
  
  /**
    * The type of resources that the group contains.  Valid values for this
    * property are:  * `youtube#channel`  * `youtube#playlist`  *
    * `youtube#video`  * `youtubePartner#asset`
    */
  var itemType: js.UndefOr[String] = js.native
}
object SchemaGroupContentDetails {
  
  @scala.inline
  def apply(): SchemaGroupContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupContentDetails]
  }
  
  @scala.inline
  implicit class SchemaGroupContentDetailsOps[Self <: SchemaGroupContentDetails] (val x: Self) extends AnyVal {
    
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
    def setItemCount(value: String): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
  }
}
