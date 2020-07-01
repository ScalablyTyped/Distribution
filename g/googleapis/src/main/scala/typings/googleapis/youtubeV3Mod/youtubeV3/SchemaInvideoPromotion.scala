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
  def apply(
    defaultTiming: SchemaInvideoTiming = null,
    items: js.Array[SchemaPromotedItem] = null,
    position: SchemaInvideoPosition = null,
    useSmartTiming: js.UndefOr[Boolean] = js.undefined
  ): SchemaInvideoPromotion = {
    val __obj = js.Dynamic.literal()
    if (defaultTiming != null) __obj.updateDynamic("defaultTiming")(defaultTiming.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(useSmartTiming)) __obj.updateDynamic("useSmartTiming")(useSmartTiming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInvideoPromotion]
  }
}

