package typings.googleapis.v32Mod.dfareportingV32

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
  def apply(): SchemaAdSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdSlot]
  }
  @scala.inline
  implicit class SchemaAdSlotOps[Self <: SchemaAdSlot] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCompatibility(value: String): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLinkedPlacementId(value: String): Self = this.set("linkedPlacementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedPlacementId: Self = this.set("linkedPlacementId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPaymentSourceType(value: String): Self = this.set("paymentSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentSourceType: Self = this.set("paymentSourceType", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

