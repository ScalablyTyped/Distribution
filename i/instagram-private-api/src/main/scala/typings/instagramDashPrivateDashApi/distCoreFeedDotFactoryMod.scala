package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreClientMod.IgApiClient
import typings.instagramDashPrivateDashApi.distFeedsListDashReelDashMediaDashViewerDotFeedMod.ListReelMediaViewerFeed
import typings.instagramDashPrivateDashApi.distFeedsMediaDotInlineDashChildDashCommentsDotFeedMod.MediaInlineChildCommentsFeed
import typings.instagramDashPrivateDashApi.distFeedsMediaDotStickerDashResponsesDotFeedMod.MediaStickerResponsesFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.AccountFollowersFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.AccountFollowingFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.BlockedUsersFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.DirectInboxFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.DirectPendingInboxFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.DirectThreadFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.DiscoverFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.IgtvBrowseFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.IgtvChannelFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.LocationFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.MediaCommentsFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.MusicGenreFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.MusicMoodFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.MusicSearchFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.MusicTrendingFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.NewsFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.PendingFriendshipsFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.PostsInsightsFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.ReelsMediaFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.ReelsTrayFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.SavedFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.StoriesInsightsFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.TagFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.TagsFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.TimelineFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.UserFeed
import typings.instagramDashPrivateDashApi.distFeedsMod.UsertagsFeed
import typings.instagramDashPrivateDashApi.distFeedsUserDashStoryDotFeedMod.UserStoryFeed
import typings.instagramDashPrivateDashApi.distResponsesStoryDashPollDashVotersDotFeedDotResponseMod.StoryPollVotersFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStoryDashPollDashVotersDotFeedDotResponseMod.StoryPollVotersFeedResponseVotersItem
import typings.instagramDashPrivateDashApi.distResponsesStoryDashQuestionDashResponsesDotFeedDotResponseMod.StoryQuestionResponsesFeedResponseRespondersItem
import typings.instagramDashPrivateDashApi.distResponsesStoryDashQuestionDashResponsesDotFeedDotResponseMod.StoryQuestionResponsesFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStoryDashQuizDashParticipantsDotFeedDotResponseMod.StoryQuizParticipantsFeedResponseParticipantsItem
import typings.instagramDashPrivateDashApi.distResponsesStoryDashQuizDashParticipantsDotFeedDotResponseMod.StoryQuizParticipantsFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStoryDashSliderDashVotersDotFeedDotResponseDotResponseMod.StorySliderVotersFeedResponseResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStoryDashSliderDashVotersDotFeedDotResponseDotResponseMod.StorySliderVotersFeedResponseResponseVotersItem
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import typings.instagramDashPrivateDashApi.distTypesInsightsDotOptionsMod.PostsInsightsFeedOptions
import typings.instagramDashPrivateDashApi.distTypesTimelineDashFeedDotTypesMod.TimelineFeedReason
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_DAY
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_WEEK
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.TWO_WEEKS
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.cold_start
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.places
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.pull_to_refresh
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ranked
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.recent
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/feed.factory", JSImport.Namespace)
@js.native
object distCoreFeedDotFactoryMod extends js.Object {
  @js.native
  class FeedFactory protected () extends js.Object {
    def this(client: IgApiClient) = this()
    var client: js.Any = js.native
    def accountFollowers(): AccountFollowersFeed = js.native
    def accountFollowers(id: String): AccountFollowersFeed = js.native
    def accountFollowers(id: Double): AccountFollowersFeed = js.native
    def accountFollowing(): AccountFollowingFeed = js.native
    def accountFollowing(id: String): AccountFollowingFeed = js.native
    def accountFollowing(id: Double): AccountFollowingFeed = js.native
    def blockedUsers(): BlockedUsersFeed = js.native
    def directInbox(): DirectInboxFeed = js.native
    def directPending(): DirectPendingInboxFeed = js.native
    def directThread(options: PickDirectInboxFeedResponseThreadsItemthreadidolde): DirectThreadFeed = js.native
    def directThread(options: PickDirectInboxFeedResponseThreadsItemthreadidolde, seqId: Double): DirectThreadFeed = js.native
    def discover(): DiscoverFeed = js.native
    def igtvBrowse(): IgtvBrowseFeed = js.native
    def igtvBrowse(isPrefetch: Boolean): IgtvBrowseFeed = js.native
    def igtvChaining(id: String): IgtvChannelFeed = js.native
    def igtvChaining(id: Double): IgtvChannelFeed = js.native
    def igtvChannel(id: String): IgtvChannelFeed = js.native
    def igtvChannel(id: Double): IgtvChannelFeed = js.native
    def listReelMediaViewers(mediaId: String): ListReelMediaViewerFeed = js.native
    def location(id: String): LocationFeed = js.native
    def location(id: Double): LocationFeed = js.native
    @JSName("location")
    def location_ranked(id: String, tab: ranked): LocationFeed = js.native
    @JSName("location")
    def location_ranked(id: Double, tab: ranked): LocationFeed = js.native
    @JSName("location")
    def location_recent(id: String, tab: recent): LocationFeed = js.native
    @JSName("location")
    def location_recent(id: Double, tab: recent): LocationFeed = js.native
    def mediaComments(id: String): MediaCommentsFeed = js.native
    def mediaInlineChildComments(mediaId: String, commentId: String): MediaInlineChildCommentsFeed = js.native
    def mediaInlineChildComments(mediaId: String, commentId: String, minId: String): MediaInlineChildCommentsFeed = js.native
    def musicGenre(id: String): MusicGenreFeed = js.native
    def musicGenre(id: String, product: IgAppModule): MusicGenreFeed = js.native
    def musicGenre(id: Double): MusicGenreFeed = js.native
    def musicGenre(id: Double, product: IgAppModule): MusicGenreFeed = js.native
    def musicMood(id: String): MusicMoodFeed = js.native
    def musicMood(id: String, product: IgAppModule): MusicMoodFeed = js.native
    def musicMood(id: Double): MusicMoodFeed = js.native
    def musicMood(id: Double, product: IgAppModule): MusicMoodFeed = js.native
    def musicSearch(query: String): MusicSearchFeed = js.native
    def musicSearch(query: String, product: IgAppModule): MusicSearchFeed = js.native
    def musicTrending(): MusicTrendingFeed = js.native
    def musicTrending(product: IgAppModule): MusicTrendingFeed = js.native
    def news(): NewsFeed = js.native
    def pendingFriendships(): PendingFriendshipsFeed = js.native
    def postsInsightsFeed(options: PostsInsightsFeedOptions): PostsInsightsFeed = js.native
    def reelsMedia(options: Anon_Source): ReelsMediaFeed = js.native
    def reelsTray(): ReelsTrayFeed = js.native
    @JSName("reelsTray")
    def reelsTray_coldstart(reason: cold_start): ReelsTrayFeed = js.native
    @JSName("reelsTray")
    def reelsTray_pulltorefresh(reason: pull_to_refresh): ReelsTrayFeed = js.native
    def saved(): SavedFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_ONEDAY(timeframe: ONE_DAY): StoriesInsightsFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_ONEWEEK(timeframe: ONE_WEEK): StoriesInsightsFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_TWOWEEKS(timeframe: TWO_WEEKS): StoriesInsightsFeed = js.native
    def storyPollVoters(mediaId: String, stickerId: String): MediaStickerResponsesFeed[StoryPollVotersFeedResponseRootObject, StoryPollVotersFeedResponseVotersItem] = js.native
    def storyPollVoters(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[StoryPollVotersFeedResponseRootObject, StoryPollVotersFeedResponseVotersItem] = js.native
    def storyQuestionResponses(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StoryQuestionResponsesFeedResponseRootObject, 
        StoryQuestionResponsesFeedResponseRespondersItem
      ] = js.native
    def storyQuestionResponses(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StoryQuestionResponsesFeedResponseRootObject, 
        StoryQuestionResponsesFeedResponseRespondersItem
      ] = js.native
    def storyQuizParticipants(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StoryQuizParticipantsFeedResponseRootObject, 
        StoryQuizParticipantsFeedResponseParticipantsItem
      ] = js.native
    def storyQuizParticipants(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StoryQuizParticipantsFeedResponseRootObject, 
        StoryQuizParticipantsFeedResponseParticipantsItem
      ] = js.native
    def storySliderVoters(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StorySliderVotersFeedResponseResponseRootObject, 
        StorySliderVotersFeedResponseResponseVotersItem
      ] = js.native
    def storySliderVoters(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StorySliderVotersFeedResponseResponseRootObject, 
        StorySliderVotersFeedResponseResponseVotersItem
      ] = js.native
    def tag(tag: String): TagFeed = js.native
    def tags(tag: String): TagsFeed = js.native
    @JSName("tags")
    def tags_places(tag: String, tab: places): TagsFeed = js.native
    @JSName("tags")
    def tags_recent(tag: String, tab: recent): TagsFeed = js.native
    @JSName("tags")
    def tags_top(tag: String, tab: top): TagsFeed = js.native
    def timeline(): TimelineFeed = js.native
    def timeline(reason: TimelineFeedReason): TimelineFeed = js.native
    def user(id: String): UserFeed = js.native
    def user(id: Double): UserFeed = js.native
    def userStory(userId: String): UserStoryFeed = js.native
    def userStory(userId: Double): UserStoryFeed = js.native
    def usertags(id: String): UsertagsFeed = js.native
    def usertags(id: Double): UsertagsFeed = js.native
  }
  
}

