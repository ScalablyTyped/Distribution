package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ad Slot
  */
@js.native
trait SchemaAdSlot extends js.Object {
  /**
    * Comment for this ad slot.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Ad slot compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to
    * rendering either on desktop, mobile devices or in mobile apps for regular
    * or interstitial ads respectively. APP and APP_INTERSTITIAL are for
    * rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in
    * in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.native
  /**
    * Height of this ad slot.
    */
  var height: js.UndefOr[String] = js.native
  /**
    * ID of the placement from an external platform that is linked to this ad
    * slot.
    */
  var linkedPlacementId: js.UndefOr[String] = js.native
  /**
    * Name of this ad slot.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Payment source type of this ad slot.
    */
  var paymentSourceType: js.UndefOr[String] = js.native
  /**
    * Primary ad slot of a roadblock inventory item.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Width of this ad slot.
    */
  var width: js.UndefOr[String] = js.native
}

object SchemaAdSlot {
  @scala.inline
  def apply(
    comment: String = null,
    compatibility: String = null,
    height: String = null,
    linkedPlacementId: String = null,
    name: String = null,
    paymentSourceType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): SchemaAdSlot = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (linkedPlacementId != null) __obj.updateDynamic("linkedPlacementId")(linkedPlacementId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paymentSourceType != null) __obj.updateDynamic("paymentSourceType")(paymentSourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdSlot]
  }
}

