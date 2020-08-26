package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content of a YouTube Video.
  */
@js.native
trait SchemaVideoContentDetails extends js.Object {
  /**
    * The value of captions indicates whether the video has captions or not.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * Specifies the ratings that the video received under various rating
    * schemes.
    */
  var contentRating: js.UndefOr[SchemaContentRating] = js.native
  /**
    * The countryRestriction object contains information about the countries
    * where a video is (or is not) viewable.
    */
  var countryRestriction: js.UndefOr[SchemaAccessPolicy] = js.native
  /**
    * The value of definition indicates whether the video is available in high
    * definition or only in standard definition.
    */
  var definition: js.UndefOr[String] = js.native
  /**
    * The value of dimension indicates whether the video is available in 3D or
    * in 2D.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The length of the video. The tag value is an ISO 8601 duration in the
    * format PT#M#S, in which the letters PT indicate that the value specifies
    * a period of time, and the letters M and S refer to length in minutes and
    * seconds, respectively. The # characters preceding the M and S letters are
    * both integers that specify the number of minutes (or seconds) of the
    * video. For example, a value of PT15M51S indicates that the video is 15
    * minutes and 51 seconds long.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Indicates whether the video uploader has provided a custom thumbnail
    * image for the video. This property is only visible to the video uploader.
    */
  var hasCustomThumbnail: js.UndefOr[Boolean] = js.native
  /**
    * The value of is_license_content indicates whether the video is licensed
    * content.
    */
  var licensedContent: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the projection format of the video.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * The regionRestriction object contains information about the countries
    * where a video is (or is not) viewable. The object will contain either the
    * contentDetails.regionRestriction.allowed property or the
    * contentDetails.regionRestriction.blocked property.
    */
  var regionRestriction: js.UndefOr[SchemaVideoContentDetailsRegionRestriction] = js.native
}

object SchemaVideoContentDetails {
  @scala.inline
  def apply(): SchemaVideoContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoContentDetails]
  }
  @scala.inline
  implicit class SchemaVideoContentDetailsOps[Self <: SchemaVideoContentDetails] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setContentRating(value: SchemaContentRating): Self = this.set("contentRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentRating: Self = this.set("contentRating", js.undefined)
    @scala.inline
    def setCountryRestriction(value: SchemaAccessPolicy): Self = this.set("countryRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryRestriction: Self = this.set("countryRestriction", js.undefined)
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setHasCustomThumbnail(value: Boolean): Self = this.set("hasCustomThumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCustomThumbnail: Self = this.set("hasCustomThumbnail", js.undefined)
    @scala.inline
    def setLicensedContent(value: Boolean): Self = this.set("licensedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicensedContent: Self = this.set("licensedContent", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRegionRestriction(value: SchemaVideoContentDetailsRegionRestriction): Self = this.set("regionRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionRestriction: Self = this.set("regionRestriction", js.undefined)
  }
  
}

