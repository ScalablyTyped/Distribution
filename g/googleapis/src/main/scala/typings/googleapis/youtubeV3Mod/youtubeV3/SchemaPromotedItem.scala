package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a single promoted item.
  */
@js.native
trait SchemaPromotedItem extends StObject {
  
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
  implicit class SchemaPromotedItemMutableBuilder[Self <: SchemaPromotedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    @scala.inline
    def setId(value: SchemaPromotedItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPromotedByContentOwner(value: Boolean): Self = StObject.set(x, "promotedByContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotedByContentOwnerUndefined: Self = StObject.set(x, "promotedByContentOwner", js.undefined)
    
    @scala.inline
    def setTiming(value: SchemaInvideoTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
