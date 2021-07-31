package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSearchList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The channelId parameter indicates that the API response should only
    * contain resources created by the channel
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The channelType parameter lets you restrict a search to a particular type
    * of channel.
    */
  var channelType: js.UndefOr[String] = js.undefined
  
  /**
    * The eventType parameter restricts a search to broadcast events. If you
    * specify a value for this parameter, you must also set the type
    * parameter's value to video.
    */
  var eventType: js.UndefOr[String] = js.undefined
  
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The forContentOwner parameter restricts the search to only
    * retrieve resources owned by the content owner specified by the
    * onBehalfOfContentOwner parameter. The user must be authenticated using a
    * CMS account linked to the specified content owner and
    * onBehalfOfContentOwner must be provided.
    */
  var forContentOwner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The forDeveloper parameter restricts the search to only retrieve videos
    * uploaded via the developer's application or website. The API server uses
    * the request's authorization credentials to identify the developer.
    * Therefore, a developer can restrict results to videos uploaded through
    * the developer's own app or website but not to videos uploaded through
    * other apps or sites.
    */
  var forDeveloper: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The forMine parameter restricts the search to only retrieve videos owned
    * by the authenticated user. If you set this parameter to true, then the
    * type parameter's value must also be set to video.
    */
  var forMine: js.UndefOr[Boolean] = js.undefined
  
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
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The locationRadius parameter, in conjunction with the location parameter,
    * defines a circular geographic area.  The parameter value must be a
    * floating point number followed by a measurement unit. Valid measurement
    * units are m, km, ft, and mi. For example, valid parameter values include
    * 1500m, 5km, 10000ft, and 0.75mi. The API does not support locationRadius
    * parameter values larger than 1000 kilometers.  Note: See the definition
    * of the location parameter for more information.
    */
  var locationRadius: js.UndefOr[String] = js.undefined
  
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
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
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The order parameter specifies the method that will be used to order
    * resources in the API response.
    */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken and
    * prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter specifies a comma-separated list of one or more search
    * resource properties that the API response will include. Set the parameter
    * value to snippet.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * The publishedAfter parameter indicates that the API response should only
    * contain resources created after the specified time. The value is an RFC
    * 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedAfter: js.UndefOr[String] = js.undefined
  
  /**
    * The publishedBefore parameter indicates that the API response should only
    * contain resources created before the specified time. The value is an RFC
    * 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedBefore: js.UndefOr[String] = js.undefined
  
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
  var q: js.UndefOr[String] = js.undefined
  
  /**
    * The regionCode parameter instructs the API to return search results for
    * the specified country. The parameter value is an ISO 3166-1 alpha-2
    * country code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * The relatedToVideoId parameter retrieves a list of videos that are
    * related to the video that the parameter value identifies. The parameter
    * value must be set to a YouTube video ID and, if you are using this
    * parameter, the type parameter must be set to video.
    */
  var relatedToVideoId: js.UndefOr[String] = js.undefined
  
  /**
    * The relevanceLanguage parameter instructs the API to return search
    * results that are most relevant to the specified language. The parameter
    * value is typically an ISO 639-1 two-letter language code. However, you
    * should use the values zh-Hans for simplified Chinese and zh-Hant for
    * traditional Chinese. Please note that results in other languages will
    * still be returned if they are highly relevant to the search query term.
    */
  var relevanceLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The safeSearch parameter indicates whether the search results should
    * include restricted content as well as standard content.
    */
  var safeSearch: js.UndefOr[String] = js.undefined
  
  /**
    * The topicId parameter indicates that the API response should only contain
    * resources associated with the specified topic. The value identifies a
    * Freebase topic ID.
    */
  var topicId: js.UndefOr[String] = js.undefined
  
  /**
    * The type parameter restricts a search query to only retrieve a particular
    * type of resource. The value is a comma-separated list of resource types.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The videoCaption parameter indicates whether the API should filter video
    * search results based on whether they have captions. If you specify a
    * value for this parameter, you must also set the type parameter's value to
    * video.
    */
  var videoCaption: js.UndefOr[String] = js.undefined
  
  /**
    * The videoCategoryId parameter filters video search results based on their
    * category. If you specify a value for this parameter, you must also set
    * the type parameter's value to video.
    */
  var videoCategoryId: js.UndefOr[String] = js.undefined
  
  /**
    * The videoDefinition parameter lets you restrict a search to only include
    * either high definition (HD) or standard definition (SD) videos. HD videos
    * are available for playback in at least 720p, though higher resolutions,
    * like 1080p, might also be available. If you specify a value for this
    * parameter, you must also set the type parameter's value to video.
    */
  var videoDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * The videoDimension parameter lets you restrict a search to only retrieve
    * 2D or 3D videos. If you specify a value for this parameter, you must also
    * set the type parameter's value to video.
    */
  var videoDimension: js.UndefOr[String] = js.undefined
  
  /**
    * The videoDuration parameter filters video search results based on their
    * duration. If you specify a value for this parameter, you must also set
    * the type parameter's value to video.
    */
  var videoDuration: js.UndefOr[String] = js.undefined
  
  /**
    * The videoEmbeddable parameter lets you to restrict a search to only
    * videos that can be embedded into a webpage. If you specify a value for
    * this parameter, you must also set the type parameter's value to video.
    */
  var videoEmbeddable: js.UndefOr[String] = js.undefined
  
  /**
    * The videoLicense parameter filters search results to only include videos
    * with a particular license. YouTube lets video uploaders choose to attach
    * either the Creative Commons license or the standard YouTube license to
    * each of their videos. If you specify a value for this parameter, you must
    * also set the type parameter's value to video.
    */
  var videoLicense: js.UndefOr[String] = js.undefined
  
  /**
    * The videoSyndicated parameter lets you to restrict a search to only
    * videos that can be played outside youtube.com. If you specify a value for
    * this parameter, you must also set the type parameter's value to video.
    */
  var videoSyndicated: js.UndefOr[String] = js.undefined
  
  /**
    * The videoType parameter lets you restrict a search to a particular type
    * of videos. If you specify a value for this parameter, you must also set
    * the type parameter's value to video.
    */
  var videoType: js.UndefOr[String] = js.undefined
}
object ParamsResourceSearchList {
  
  @scala.inline
  def apply(): ParamsResourceSearchList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSearchList]
  }
  
  @scala.inline
  implicit class ParamsResourceSearchListMutableBuilder[Self <: ParamsResourceSearchList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    @scala.inline
    def setForContentOwner(value: Boolean): Self = StObject.set(x, "forContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForContentOwnerUndefined: Self = StObject.set(x, "forContentOwner", js.undefined)
    
    @scala.inline
    def setForDeveloper(value: Boolean): Self = StObject.set(x, "forDeveloper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForDeveloperUndefined: Self = StObject.set(x, "forDeveloper", js.undefined)
    
    @scala.inline
    def setForMine(value: Boolean): Self = StObject.set(x, "forMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForMineUndefined: Self = StObject.set(x, "forMine", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationRadius(value: String): Self = StObject.set(x, "locationRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationRadiusUndefined: Self = StObject.set(x, "locationRadius", js.undefined)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setPublishedAfter(value: String): Self = StObject.set(x, "publishedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAfterUndefined: Self = StObject.set(x, "publishedAfter", js.undefined)
    
    @scala.inline
    def setPublishedBefore(value: String): Self = StObject.set(x, "publishedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedBeforeUndefined: Self = StObject.set(x, "publishedBefore", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setRelatedToVideoId(value: String): Self = StObject.set(x, "relatedToVideoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedToVideoIdUndefined: Self = StObject.set(x, "relatedToVideoId", js.undefined)
    
    @scala.inline
    def setRelevanceLanguage(value: String): Self = StObject.set(x, "relevanceLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceLanguageUndefined: Self = StObject.set(x, "relevanceLanguage", js.undefined)
    
    @scala.inline
    def setSafeSearch(value: String): Self = StObject.set(x, "safeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeSearchUndefined: Self = StObject.set(x, "safeSearch", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVideoCaption(value: String): Self = StObject.set(x, "videoCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCaptionUndefined: Self = StObject.set(x, "videoCaption", js.undefined)
    
    @scala.inline
    def setVideoCategoryId(value: String): Self = StObject.set(x, "videoCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCategoryIdUndefined: Self = StObject.set(x, "videoCategoryId", js.undefined)
    
    @scala.inline
    def setVideoDefinition(value: String): Self = StObject.set(x, "videoDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDefinitionUndefined: Self = StObject.set(x, "videoDefinition", js.undefined)
    
    @scala.inline
    def setVideoDimension(value: String): Self = StObject.set(x, "videoDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDimensionUndefined: Self = StObject.set(x, "videoDimension", js.undefined)
    
    @scala.inline
    def setVideoDuration(value: String): Self = StObject.set(x, "videoDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDurationUndefined: Self = StObject.set(x, "videoDuration", js.undefined)
    
    @scala.inline
    def setVideoEmbeddable(value: String): Self = StObject.set(x, "videoEmbeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEmbeddableUndefined: Self = StObject.set(x, "videoEmbeddable", js.undefined)
    
    @scala.inline
    def setVideoLicense(value: String): Self = StObject.set(x, "videoLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoLicenseUndefined: Self = StObject.set(x, "videoLicense", js.undefined)
    
    @scala.inline
    def setVideoSyndicated(value: String): Self = StObject.set(x, "videoSyndicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSyndicatedUndefined: Self = StObject.set(x, "videoSyndicated", js.undefined)
    
    @scala.inline
    def setVideoType(value: String): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoTypeUndefined: Self = StObject.set(x, "videoType", js.undefined)
  }
}
