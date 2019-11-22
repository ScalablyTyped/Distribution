package typings.instagramDashPrivateDashApi.distTypesInsightsDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ALL
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.BIO_LINK_CLICK
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.CALL
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.CAROUSEL_V2
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.COMMENT_COUNT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.EMAIL
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ENGAGEMENT_COUNT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.FOLLOW
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.GET_DIRECTIONS
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.IMAGE
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.IMPRESSION_COUNT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.LIKE_COUNT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_MONTH
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_WEEK
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_YEAR
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.PROFILE_VIEW
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.REACH_COUNT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SAVE_COUNT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SHARE_COUNT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SHOPPING
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.SIX_MONTHS
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.TEXT
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.THREE_MONTHS
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.TWO_YEARS
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedOptions extends js.Object {
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
}

