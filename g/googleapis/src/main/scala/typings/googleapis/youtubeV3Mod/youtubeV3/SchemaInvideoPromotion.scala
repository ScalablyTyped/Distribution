package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an invideo promotion campaign consisting of multiple promoted
  * items. A campaign belongs to a single channel_id.
  */
@js.native
trait SchemaInvideoPromotion extends js.Object {
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
  implicit class SchemaInvideoPromotionOps[Self <: SchemaInvideoPromotion] (val x: Self) extends AnyVal {
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
    def setDefaultTiming(value: SchemaInvideoTiming): Self = this.set("defaultTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTiming: Self = this.set("defaultTiming", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaPromotedItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaPromotedItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPosition(value: SchemaInvideoPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setUseSmartTiming(value: Boolean): Self = this.set("useSmartTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSmartTiming: Self = this.set("useSmartTiming", js.undefined)
  }
  
}

