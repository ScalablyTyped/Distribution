package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a resource which is being promoted.
  */
@js.native
trait SchemaActivityContentDetailsPromotedItem extends js.Object {
  /**
    * The URL the client should fetch to request a promoted item.
    */
  var adTag: js.UndefOr[String] = js.native
  /**
    * The URL the client should ping to indicate that the user clicked through
    * on this promoted item.
    */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  /**
    * The URL the client should ping to indicate that the user was shown this
    * promoted item.
    */
  var creativeViewUrl: js.UndefOr[String] = js.native
  /**
    * The type of call-to-action, a message to the user indicating action that
    * can be taken.
    */
  var ctaType: js.UndefOr[String] = js.native
  /**
    * The custom call-to-action button text. If specified, it will override the
    * default button text for the cta_type.
    */
  var customCtaButtonText: js.UndefOr[String] = js.native
  /**
    * The text description to accompany the promoted item.
    */
  var descriptionText: js.UndefOr[String] = js.native
  /**
    * The URL the client should direct the user to, if the user chooses to
    * visit the advertiser&#39;s website.
    */
  var destinationUrl: js.UndefOr[String] = js.native
  /**
    * The list of forecasting URLs. The client should ping all of these URLs
    * when a promoted item is not available, to indicate that a promoted item
    * could have been shown.
    */
  var forecastingUrl: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of impression URLs. The client should ping all of these URLs to
    * indicate that the user was shown this promoted item.
    */
  var impressionUrl: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the promoted video.
    */
  var videoId: js.UndefOr[String] = js.native
}

object SchemaActivityContentDetailsPromotedItem {
  @scala.inline
  def apply(): SchemaActivityContentDetailsPromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsPromotedItem]
  }
  @scala.inline
  implicit class SchemaActivityContentDetailsPromotedItemOps[Self <: SchemaActivityContentDetailsPromotedItem] (val x: Self) extends AnyVal {
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
    def setAdTag(value: String): Self = this.set("adTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdTag: Self = this.set("adTag", js.undefined)
    @scala.inline
    def setClickTrackingUrl(value: String): Self = this.set("clickTrackingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTrackingUrl: Self = this.set("clickTrackingUrl", js.undefined)
    @scala.inline
    def setCreativeViewUrl(value: String): Self = this.set("creativeViewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeViewUrl: Self = this.set("creativeViewUrl", js.undefined)
    @scala.inline
    def setCtaType(value: String): Self = this.set("ctaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtaType: Self = this.set("ctaType", js.undefined)
    @scala.inline
    def setCustomCtaButtonText(value: String): Self = this.set("customCtaButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCtaButtonText: Self = this.set("customCtaButtonText", js.undefined)
    @scala.inline
    def setDescriptionText(value: String): Self = this.set("descriptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionText: Self = this.set("descriptionText", js.undefined)
    @scala.inline
    def setDestinationUrl(value: String): Self = this.set("destinationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationUrl: Self = this.set("destinationUrl", js.undefined)
    @scala.inline
    def setForecastingUrlVarargs(value: String*): Self = this.set("forecastingUrl", js.Array(value :_*))
    @scala.inline
    def setForecastingUrl(value: js.Array[String]): Self = this.set("forecastingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForecastingUrl: Self = this.set("forecastingUrl", js.undefined)
    @scala.inline
    def setImpressionUrlVarargs(value: String*): Self = this.set("impressionUrl", js.Array(value :_*))
    @scala.inline
    def setImpressionUrl(value: js.Array[String]): Self = this.set("impressionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionUrl: Self = this.set("impressionUrl", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

