package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSearchList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The channelId parameter indicates that the API response should only
    * contain resources created by the channel
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The channelType parameter lets you restrict a search to a particular type
    * of channel.
    */
  var channelType: js.UndefOr[String] = js.native
  /**
    * The eventType parameter restricts a search to broadcast events. If you
    * specify a value for this parameter, you must also set the type
    * parameter's value to video.
    */
  var eventType: js.UndefOr[String] = js.native
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The forContentOwner parameter restricts the search to only
    * retrieve resources owned by the content owner specified by the
    * onBehalfOfContentOwner parameter. The user must be authenticated using a
    * CMS account linked to the specified content owner and
    * onBehalfOfContentOwner must be provided.
    */
  var forContentOwner: js.UndefOr[Boolean] = js.native
  /**
    * The forDeveloper parameter restricts the search to only retrieve videos
    * uploaded via the developer's application or website. The API server uses
    * the request's authorization credentials to identify the developer.
    * Therefore, a developer can restrict results to videos uploaded through
    * the developer's own app or website but not to videos uploaded through
    * other apps or sites.
    */
  var forDeveloper: js.UndefOr[Boolean] = js.native
  /**
    * The forMine parameter restricts the search to only retrieve videos owned
    * by the authenticated user. If you set this parameter to true, then the
    * type parameter's value must also be set to video.
    */
  var forMine: js.UndefOr[Boolean] = js.native
  /**
    * The location parameter, in conjunction with the locationRadius parameter,
    * defines a circular geographic area and also restricts a search to videos
    * that specify, in their metadata, a geographic location that falls within
    * that area. The parameter value is a string that specifies
    * latitude/longitude coordinates e.g. (37.42307,-122.08427).   - The
    * location parameter value identifies the point at the center of the area.
    * - The locationRadius parameter specifies the maximum distance that the
    * location associated with a video can be from that point for the video to
    * still be included in the search results.The API returns an error if your
    * request specifies a value for the location parameter but does not also
    * specify a value for the locationRadius parameter.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The locationRadius parameter, in conjunction with the location parameter,
    * defines a circular geographic area.  The parameter value must be a
    * floating point number followed by a measurement unit. Valid measurement
    * units are m, km, ft, and mi. For example, valid parameter values include
    * 1500m, 5km, 10000ft, and 0.75mi. The API does not support locationRadius
    * parameter values larger than 1000 kilometers.  Note: See the definition
    * of the location parameter for more information.
    */
  var locationRadius: js.UndefOr[String] = js.native
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The onBehalfOfContentOwner parameter indicates that the
    * request's authorization credentials identify a YouTube CMS user who is
    * acting on behalf of the content owner specified in the parameter value.
    * This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The CMS account that the user authenticates with must be linked
    * to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * The order parameter specifies the method that will be used to order
    * resources in the API response.
    */
  var order: js.UndefOr[String] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken and
    * prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more search
    * resource properties that the API response will include. Set the parameter
    * value to snippet.
    */
  var part: js.UndefOr[String] = js.native
  /**
    * The publishedAfter parameter indicates that the API response should only
    * contain resources created after the specified time. The value is an RFC
    * 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedAfter: js.UndefOr[String] = js.native
  /**
    * The publishedBefore parameter indicates that the API response should only
    * contain resources created before the specified time. The value is an RFC
    * 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedBefore: js.UndefOr[String] = js.native
  /**
    * The q parameter specifies the query term to search for.  Your request can
    * also use the Boolean NOT (-) and OR (|) operators to exclude videos or to
    * find videos that are associated with one of several search terms. For
    * example, to search for videos matching either "boating" or "sailing", set
    * the q parameter value to boating|sailing. Similarly, to search for videos
    * matching either "boating" or "sailing" but not "fishing", set the q
    * parameter value to boating|sailing -fishing. Note that the pipe character
    * must be URL-escaped when it is sent in your API request. The URL-escaped
    * value for the pipe character is %7C.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * The regionCode parameter instructs the API to return search results for
    * the specified country. The parameter value is an ISO 3166-1 alpha-2
    * country code.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * The relatedToVideoId parameter retrieves a list of videos that are
    * related to the video that the parameter value identifies. The parameter
    * value must be set to a YouTube video ID and, if you are using this
    * parameter, the type parameter must be set to video.
    */
  var relatedToVideoId: js.UndefOr[String] = js.native
  /**
    * The relevanceLanguage parameter instructs the API to return search
    * results that are most relevant to the specified language. The parameter
    * value is typically an ISO 639-1 two-letter language code. However, you
    * should use the values zh-Hans for simplified Chinese and zh-Hant for
    * traditional Chinese. Please note that results in other languages will
    * still be returned if they are highly relevant to the search query term.
    */
  var relevanceLanguage: js.UndefOr[String] = js.native
  /**
    * The safeSearch parameter indicates whether the search results should
    * include restricted content as well as standard content.
    */
  var safeSearch: js.UndefOr[String] = js.native
  /**
    * The topicId parameter indicates that the API response should only contain
    * resources associated with the specified topic. The value identifies a
    * Freebase topic ID.
    */
  var topicId: js.UndefOr[String] = js.native
  /**
    * The type parameter restricts a search query to only retrieve a particular
    * type of resource. The value is a comma-separated list of resource types.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The videoCaption parameter indicates whether the API should filter video
    * search results based on whether they have captions. If you specify a
    * value for this parameter, you must also set the type parameter's value to
    * video.
    */
  var videoCaption: js.UndefOr[String] = js.native
  /**
    * The videoCategoryId parameter filters video search results based on their
    * category. If you specify a value for this parameter, you must also set
    * the type parameter's value to video.
    */
  var videoCategoryId: js.UndefOr[String] = js.native
  /**
    * The videoDefinition parameter lets you restrict a search to only include
    * either high definition (HD) or standard definition (SD) videos. HD videos
    * are available for playback in at least 720p, though higher resolutions,
    * like 1080p, might also be available. If you specify a value for this
    * parameter, you must also set the type parameter's value to video.
    */
  var videoDefinition: js.UndefOr[String] = js.native
  /**
    * The videoDimension parameter lets you restrict a search to only retrieve
    * 2D or 3D videos. If you specify a value for this parameter, you must also
    * set the type parameter's value to video.
    */
  var videoDimension: js.UndefOr[String] = js.native
  /**
    * The videoDuration parameter filters video search results based on their
    * duration. If you specify a value for this parameter, you must also set
    * the type parameter's value to video.
    */
  var videoDuration: js.UndefOr[String] = js.native
  /**
    * The videoEmbeddable parameter lets you to restrict a search to only
    * videos that can be embedded into a webpage. If you specify a value for
    * this parameter, you must also set the type parameter's value to video.
    */
  var videoEmbeddable: js.UndefOr[String] = js.native
  /**
    * The videoLicense parameter filters search results to only include videos
    * with a particular license. YouTube lets video uploaders choose to attach
    * either the Creative Commons license or the standard YouTube license to
    * each of their videos. If you specify a value for this parameter, you must
    * also set the type parameter's value to video.
    */
  var videoLicense: js.UndefOr[String] = js.native
  /**
    * The videoSyndicated parameter lets you to restrict a search to only
    * videos that can be played outside youtube.com. If you specify a value for
    * this parameter, you must also set the type parameter's value to video.
    */
  var videoSyndicated: js.UndefOr[String] = js.native
  /**
    * The videoType parameter lets you restrict a search to a particular type
    * of videos. If you specify a value for this parameter, you must also set
    * the type parameter's value to video.
    */
  var videoType: js.UndefOr[String] = js.native
}

object ParamsResourceSearchList {
  @scala.inline
  def apply(): ParamsResourceSearchList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSearchList]
  }
  @scala.inline
  implicit class ParamsResourceSearchListOps[Self <: ParamsResourceSearchList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setChannelType(value: String): Self = this.set("channelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelType: Self = this.set("channelType", js.undefined)
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    @scala.inline
    def setForContentOwner(value: Boolean): Self = this.set("forContentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForContentOwner: Self = this.set("forContentOwner", js.undefined)
    @scala.inline
    def setForDeveloper(value: Boolean): Self = this.set("forDeveloper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForDeveloper: Self = this.set("forDeveloper", js.undefined)
    @scala.inline
    def setForMine(value: Boolean): Self = this.set("forMine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForMine: Self = this.set("forMine", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationRadius(value: String): Self = this.set("locationRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationRadius: Self = this.set("locationRadius", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    @scala.inline
    def setPublishedAfter(value: String): Self = this.set("publishedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAfter: Self = this.set("publishedAfter", js.undefined)
    @scala.inline
    def setPublishedBefore(value: String): Self = this.set("publishedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedBefore: Self = this.set("publishedBefore", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    @scala.inline
    def setRelatedToVideoId(value: String): Self = this.set("relatedToVideoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedToVideoId: Self = this.set("relatedToVideoId", js.undefined)
    @scala.inline
    def setRelevanceLanguage(value: String): Self = this.set("relevanceLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelevanceLanguage: Self = this.set("relevanceLanguage", js.undefined)
    @scala.inline
    def setSafeSearch(value: String): Self = this.set("safeSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeSearch: Self = this.set("safeSearch", js.undefined)
    @scala.inline
    def setTopicId(value: String): Self = this.set("topicId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicId: Self = this.set("topicId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVideoCaption(value: String): Self = this.set("videoCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCaption: Self = this.set("videoCaption", js.undefined)
    @scala.inline
    def setVideoCategoryId(value: String): Self = this.set("videoCategoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCategoryId: Self = this.set("videoCategoryId", js.undefined)
    @scala.inline
    def setVideoDefinition(value: String): Self = this.set("videoDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoDefinition: Self = this.set("videoDefinition", js.undefined)
    @scala.inline
    def setVideoDimension(value: String): Self = this.set("videoDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoDimension: Self = this.set("videoDimension", js.undefined)
    @scala.inline
    def setVideoDuration(value: String): Self = this.set("videoDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoDuration: Self = this.set("videoDuration", js.undefined)
    @scala.inline
    def setVideoEmbeddable(value: String): Self = this.set("videoEmbeddable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoEmbeddable: Self = this.set("videoEmbeddable", js.undefined)
    @scala.inline
    def setVideoLicense(value: String): Self = this.set("videoLicense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoLicense: Self = this.set("videoLicense", js.undefined)
    @scala.inline
    def setVideoSyndicated(value: String): Self = this.set("videoSyndicated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSyndicated: Self = this.set("videoSyndicated", js.undefined)
    @scala.inline
    def setVideoType(value: String): Self = this.set("videoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoType: Self = this.set("videoType", js.undefined)
  }
  
}

