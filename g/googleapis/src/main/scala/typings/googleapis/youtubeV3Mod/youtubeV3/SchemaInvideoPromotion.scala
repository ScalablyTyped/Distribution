package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes an invideo promotion campaign consisting of multiple promoted
  * items. A campaign belongs to a single channel_id.
  */
@js.native
trait SchemaInvideoPromotion extends StObject {
  
  /**
    * The default temporal position within the video where the promoted item
    * will be displayed. Can be overriden by more specific timing in the item.
    */
  var defaultTiming: js.UndefOr[SchemaInvideoTiming] = js.native
  
  /**
    * List of promoted items in decreasing priority.
    */
  var items: js.UndefOr[js.Array[SchemaPromotedItem]] = js.native
  
  /**
    * The spatial position within the video where the promoted item will be
    * displayed.
    */
  var position: js.UndefOr[SchemaInvideoPosition] = js.native
  
  /**
    * Indicates whether the channel&#39;s promotional campaign uses &quot;smart
    * timing.&quot; This feature attempts to show promotions at a point in the
    * video when they are more likely to be clicked and less likely to disrupt
    * the viewing experience. This feature also picks up a single promotion to
    * show on each video.
    */
  var useSmartTiming: js.UndefOr[Boolean] = js.native
}
object SchemaInvideoPromotion {
  
  @scala.inline
  def apply(): SchemaInvideoPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoPromotion]
  }
  
  @scala.inline
  implicit class SchemaInvideoPromotionMutableBuilder[Self <: SchemaInvideoPromotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultTiming(value: SchemaInvideoTiming): Self = StObject.set(x, "defaultTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimingUndefined: Self = StObject.set(x, "defaultTiming", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaPromotedItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaPromotedItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: SchemaInvideoPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setUseSmartTiming(value: Boolean): Self = StObject.set(x, "useSmartTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSmartTimingUndefined: Self = StObject.set(x, "useSmartTiming", js.undefined)
  }
}
