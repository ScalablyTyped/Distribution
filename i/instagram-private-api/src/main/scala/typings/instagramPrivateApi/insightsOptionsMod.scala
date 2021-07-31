package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.ALL
import typings.instagramPrivateApi.instagramPrivateApiStrings.BIO_LINK_CLICK
import typings.instagramPrivateApi.instagramPrivateApiStrings.CALL
import typings.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL_V2
import typings.instagramPrivateApi.instagramPrivateApiStrings.COMMENT_COUNT
import typings.instagramPrivateApi.instagramPrivateApiStrings.EMAIL
import typings.instagramPrivateApi.instagramPrivateApiStrings.ENGAGEMENT_COUNT
import typings.instagramPrivateApi.instagramPrivateApiStrings.FOLLOW
import typings.instagramPrivateApi.instagramPrivateApiStrings.GET_DIRECTIONS
import typings.instagramPrivateApi.instagramPrivateApiStrings.IMAGE
import typings.instagramPrivateApi.instagramPrivateApiStrings.IMPRESSION_COUNT
import typings.instagramPrivateApi.instagramPrivateApiStrings.LIKE_COUNT
import typings.instagramPrivateApi.instagramPrivateApiStrings.ONE_MONTH
import typings.instagramPrivateApi.instagramPrivateApiStrings.ONE_WEEK
import typings.instagramPrivateApi.instagramPrivateApiStrings.ONE_YEAR
import typings.instagramPrivateApi.instagramPrivateApiStrings.PROFILE_VIEW
import typings.instagramPrivateApi.instagramPrivateApiStrings.REACH_COUNT
import typings.instagramPrivateApi.instagramPrivateApiStrings.SAVE_COUNT
import typings.instagramPrivateApi.instagramPrivateApiStrings.SHARE_COUNT
import typings.instagramPrivateApi.instagramPrivateApiStrings.SHOPPING
import typings.instagramPrivateApi.instagramPrivateApiStrings.SIX_MONTHS
import typings.instagramPrivateApi.instagramPrivateApiStrings.TEXT
import typings.instagramPrivateApi.instagramPrivateApiStrings.THREE_MONTHS
import typings.instagramPrivateApi.instagramPrivateApiStrings.TWO_YEARS
import typings.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insightsOptionsMod {
  
  trait AccountInsightsOptions extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var activityTab: js.UndefOr[Boolean] = js.undefined
    
    var audienceTab: js.UndefOr[Boolean] = js.undefined
    
    var contentTab: js.UndefOr[Boolean] = js.undefined
    
    var gridMediaSize: js.UndefOr[Double] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object AccountInsightsOptions {
    
    @scala.inline
    def apply(): AccountInsightsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountInsightsOptions]
    }
    
    @scala.inline
    implicit class AccountInsightsOptionsMutableBuilder[Self <: AccountInsightsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setActivityTab(value: Boolean): Self = StObject.set(x, "activityTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTabUndefined: Self = StObject.set(x, "activityTab", js.undefined)
      
      @scala.inline
      def setAudienceTab(value: Boolean): Self = StObject.set(x, "audienceTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceTabUndefined: Self = StObject.set(x, "audienceTab", js.undefined)
      
      @scala.inline
      def setContentTab(value: Boolean): Self = StObject.set(x, "contentTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTabUndefined: Self = StObject.set(x, "contentTab", js.undefined)
      
      @scala.inline
      def setGridMediaSize(value: Double): Self = StObject.set(x, "gridMediaSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridMediaSizeUndefined: Self = StObject.set(x, "gridMediaSize", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  trait PostsInsightsFeedOptions extends StObject {
    
    var dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK
    
    var postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING
    
    var timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS
  }
  object PostsInsightsFeedOptions {
    
    @scala.inline
    def apply(
      dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK,
      postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING,
      timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS
    ): PostsInsightsFeedOptions = {
      val __obj = js.Dynamic.literal(dataOrdering = dataOrdering.asInstanceOf[js.Any], postType = postType.asInstanceOf[js.Any], timeframe = timeframe.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostsInsightsFeedOptions]
    }
    
    @scala.inline
    implicit class PostsInsightsFeedOptionsMutableBuilder[Self <: PostsInsightsFeedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataOrdering(
        value: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK
      ): Self = StObject.set(x, "dataOrdering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostType(value: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING): Self = StObject.set(x, "postType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeframe(value: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS): Self = StObject.set(x, "timeframe", value.asInstanceOf[js.Any])
    }
  }
}
