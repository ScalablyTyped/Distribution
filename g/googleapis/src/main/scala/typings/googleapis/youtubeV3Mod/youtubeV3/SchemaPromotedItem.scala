package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a single promoted item.
  */
@js.native
trait SchemaPromotedItem extends js.Object {
  
  /**
    * A custom message to display for this promotion. This field is currently
    * ignored unless the promoted item is a website.
    */
  var customMessage: js.UndefOr[String] = js.native
  
  /**
    * Identifies the promoted item.
    */
  var id: js.UndefOr[SchemaPromotedItemId] = js.native
  
  /**
    * If true, the content owner&#39;s name will be used when displaying the
    * promotion. This field can only be set when the update is made on behalf
    * of the content owner.
    */
  var promotedByContentOwner: js.UndefOr[Boolean] = js.native
  
  /**
    * The temporal position within the video where the promoted item will be
    * displayed. If present, it overrides the default timing.
    */
  var timing: js.UndefOr[SchemaInvideoTiming] = js.native
}
object SchemaPromotedItem {
  
  @scala.inline
  def apply(): SchemaPromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotedItem]
  }
  
  @scala.inline
  implicit class SchemaPromotedItemOps[Self <: SchemaPromotedItem] (val x: Self) extends AnyVal {
    
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
    def setCustomMessage(value: String): Self = this.set("customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMessage: Self = this.set("customMessage", js.undefined)
    
    @scala.inline
    def setId(value: SchemaPromotedItemId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPromotedByContentOwner(value: Boolean): Self = this.set("promotedByContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotedByContentOwner: Self = this.set("promotedByContentOwner", js.undefined)
    
    @scala.inline
    def setTiming(value: SchemaInvideoTiming): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
}
