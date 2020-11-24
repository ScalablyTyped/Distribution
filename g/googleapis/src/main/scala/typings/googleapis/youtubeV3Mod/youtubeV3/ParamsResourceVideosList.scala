package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceVideosList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The chart parameter identifies the chart that you want to retrieve.
    */
  var chart: js.UndefOr[String] = js.native
  
  /**
    * The hl parameter instructs the API to retrieve localized resource
    * metadata for a specific application language that the YouTube website
    * supports. The parameter value must be a language code included in the
    * list returned by the i18nLanguages.list method.  If localized resource
    * details are available in that language, the resource's snippet.localized
    * object will contain the localized values. However, if localized details
    * are not available, the snippet.localized object will contain resource
    * details in the resource's default language.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * The id parameter specifies a comma-separated list of the YouTube video
    * ID(s) for the resource(s) that are being retrieved. In a video resource,
    * the id property specifies the video's ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * DEPRECATED
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The maxHeight parameter specifies a maximum height of the embedded
    * player. If maxWidth is provided, maxHeight may not be reached in order to
    * not violate the width request.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.  Note: This parameter is supported
    * for use in conjunction with the myRating and chart parameters, but it is
    * not supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The maxWidth parameter specifies a maximum width of the embedded player.
    * If maxHeight is provided, maxWidth may not be reached in order to not
    * violate the height request.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Set this parameter's value to like or dislike to instruct the API to only
    * return videos liked or disliked by the authenticated user.
    */
  var myRating: js.UndefOr[String] = js.native
  
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
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken and
    * prevPageToken properties identify other pages that could be retrieved.
    * Note: This parameter is supported for use in conjunction with the
    * myRating and chart parameters, but it is not supported for use in
    * conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies a comma-separated list of one or more video
    * resource properties that the API response will include.  If the parameter
    * identifies a property that contains child properties, the child
    * properties will be included in the response. For example, in a video
    * resource, the snippet property contains the channelId, title,
    * description, tags, and categoryId properties. As such, if you set
    * part=snippet, the API response will contain all of those properties.
    */
  var part: js.UndefOr[String] = js.native
  
  /**
    * The regionCode parameter instructs the API to select a video chart
    * available in the specified region. This parameter can only be used in
    * conjunction with the chart parameter. The parameter value is an ISO
    * 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * The videoCategoryId parameter identifies the video category for which the
    * chart should be retrieved. This parameter can only be used in conjunction
    * with the chart parameter. By default, charts are not restricted to a
    * particular category.
    */
  var videoCategoryId: js.UndefOr[String] = js.native
}
object ParamsResourceVideosList {
  
  @scala.inline
  def apply(): ParamsResourceVideosList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideosList]
  }
  
  @scala.inline
  implicit class ParamsResourceVideosListOps[Self <: ParamsResourceVideosList] (val x: Self) extends AnyVal {
    
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
    def setChart(value: String): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMyRating(value: String): Self = this.set("myRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMyRating: Self = this.set("myRating", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setVideoCategoryId(value: String): Self = this.set("videoCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCategoryId: Self = this.set("videoCategoryId", js.undefined)
  }
}
