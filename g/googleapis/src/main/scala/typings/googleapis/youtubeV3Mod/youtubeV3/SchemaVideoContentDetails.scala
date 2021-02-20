package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the content of a YouTube Video.
  */
@js.native
trait SchemaVideoContentDetails extends StObject {
  
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
  implicit class SchemaVideoContentDetailsMutableBuilder[Self <: SchemaVideoContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setContentRating(value: SchemaContentRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    @scala.inline
    def setCountryRestriction(value: SchemaAccessPolicy): Self = StObject.set(x, "countryRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryRestrictionUndefined: Self = StObject.set(x, "countryRestriction", js.undefined)
    
    @scala.inline
    def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setHasCustomThumbnail(value: Boolean): Self = StObject.set(x, "hasCustomThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCustomThumbnailUndefined: Self = StObject.set(x, "hasCustomThumbnail", js.undefined)
    
    @scala.inline
    def setLicensedContent(value: Boolean): Self = StObject.set(x, "licensedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensedContentUndefined: Self = StObject.set(x, "licensedContent", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRegionRestriction(value: SchemaVideoContentDetailsRegionRestriction): Self = StObject.set(x, "regionRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionRestrictionUndefined: Self = StObject.set(x, "regionRestriction", js.undefined)
  }
}
