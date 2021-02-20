package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.PartialPickAccountFollowe
import typings.instagramPrivateApi.anon.PartialPickAccountFollowi
import typings.instagramPrivateApi.anon.PartialPickTopicalExplore
import typings.instagramPrivateApi.anon.PickDirectInboxFeedRespon
import typings.instagramPrivateApi.anon.Source
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedsMod.AccountFollowersFeed
import typings.instagramPrivateApi.feedsMod.AccountFollowingFeed
import typings.instagramPrivateApi.feedsMod.BestiesFeed
import typings.instagramPrivateApi.feedsMod.BlockedUsersFeed
import typings.instagramPrivateApi.feedsMod.DirectInboxFeed
import typings.instagramPrivateApi.feedsMod.DirectPendingInboxFeed
import typings.instagramPrivateApi.feedsMod.DirectThreadFeed
import typings.instagramPrivateApi.feedsMod.DiscoverFeed
import typings.instagramPrivateApi.feedsMod.IgtvBrowseFeed
import typings.instagramPrivateApi.feedsMod.IgtvChannelFeed
import typings.instagramPrivateApi.feedsMod.LikedFeed
import typings.instagramPrivateApi.feedsMod.LocationFeed
import typings.instagramPrivateApi.feedsMod.MediaCommentsFeed
import typings.instagramPrivateApi.feedsMod.MusicGenreFeed
import typings.instagramPrivateApi.feedsMod.MusicMoodFeed
import typings.instagramPrivateApi.feedsMod.MusicSearchFeed
import typings.instagramPrivateApi.feedsMod.MusicTrendingFeed
import typings.instagramPrivateApi.feedsMod.NewsFeed
import typings.instagramPrivateApi.feedsMod.PendingFriendshipsFeed
import typings.instagramPrivateApi.feedsMod.PostsInsightsFeed
import typings.instagramPrivateApi.feedsMod.ReelsMediaFeed
import typings.instagramPrivateApi.feedsMod.ReelsTrayFeed
import typings.instagramPrivateApi.feedsMod.SavedFeed
import typings.instagramPrivateApi.feedsMod.StoriesInsightsFeed
import typings.instagramPrivateApi.feedsMod.TagFeed
import typings.instagramPrivateApi.feedsMod.TagsFeed
import typings.instagramPrivateApi.feedsMod.TimelineFeed
import typings.instagramPrivateApi.feedsMod.TopicalExploreFeed
import typings.instagramPrivateApi.feedsMod.UserFeed
import typings.instagramPrivateApi.feedsMod.UsertagsFeed
import typings.instagramPrivateApi.insightsOptionsMod.PostsInsightsFeedOptions
import typings.instagramPrivateApi.instagramPrivateApiStrings.ONE_DAY
import typings.instagramPrivateApi.instagramPrivateApiStrings.ONE_WEEK
import typings.instagramPrivateApi.instagramPrivateApiStrings.TWO_WEEKS
import typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start
import typings.instagramPrivateApi.instagramPrivateApiStrings.places
import typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
import typings.instagramPrivateApi.instagramPrivateApiStrings.ranked
import typings.instagramPrivateApi.instagramPrivateApiStrings.recent
import typings.instagramPrivateApi.instagramPrivateApiStrings.top
import typings.instagramPrivateApi.listReelMediaViewerFeedMod.ListReelMediaViewerFeed
import typings.instagramPrivateApi.mediaInlineChildCommentsFeedMod.MediaInlineChildCommentsFeed
import typings.instagramPrivateApi.mediaStickerResponsesFeedMod.MediaStickerResponsesFeed
import typings.instagramPrivateApi.storyPollVotersFeedResponseMod.StoryPollVotersFeedResponseRootObject
import typings.instagramPrivateApi.storyPollVotersFeedResponseMod.StoryPollVotersFeedResponseVotersItem
import typings.instagramPrivateApi.storyQuestionResponsesFeedResponseMod.StoryQuestionResponsesFeedResponseRespondersItem
import typings.instagramPrivateApi.storyQuestionResponsesFeedResponseMod.StoryQuestionResponsesFeedResponseRootObject
import typings.instagramPrivateApi.storyQuizParticipantsFeedResponseMod.StoryQuizParticipantsFeedResponseParticipantsItem
import typings.instagramPrivateApi.storyQuizParticipantsFeedResponseMod.StoryQuizParticipantsFeedResponseRootObject
import typings.instagramPrivateApi.storySliderVotersFeedResponseResponseMod.StorySliderVotersFeedResponseResponseRootObject
import typings.instagramPrivateApi.storySliderVotersFeedResponseResponseMod.StorySliderVotersFeedResponseResponseVotersItem
import typings.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedReason
import typings.instagramPrivateApi.userStoryFeedMod.UserStoryFeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedFactoryMod {
  
  @JSImport("instagram-private-api/dist/core/feed.factory", "FeedFactory")
  @js.native
  class FeedFactory protected () extends StObject {
    def this(client: IgApiClient) = this()
    
    def accountFollowers(): AccountFollowersFeed = js.native
    def accountFollowers(options: String): AccountFollowersFeed = js.native
    def accountFollowers(options: Double): AccountFollowersFeed = js.native
    def accountFollowers(options: PartialPickAccountFollowe): AccountFollowersFeed = js.native
    
    def accountFollowing(): AccountFollowingFeed = js.native
    def accountFollowing(options: String): AccountFollowingFeed = js.native
    def accountFollowing(options: Double): AccountFollowingFeed = js.native
    def accountFollowing(options: PartialPickAccountFollowi): AccountFollowingFeed = js.native
    
    def bestFriendships(): BestiesFeed = js.native
    
    def blockedUsers(): BlockedUsersFeed = js.native
    
    var client: js.Any = js.native
    
    def directInbox(): DirectInboxFeed = js.native
    
    def directPending(): DirectPendingInboxFeed = js.native
    
    def directThread(options: PickDirectInboxFeedRespon): DirectThreadFeed = js.native
    def directThread(options: PickDirectInboxFeedRespon, seqId: Double): DirectThreadFeed = js.native
    
    def discover(): DiscoverFeed = js.native
    
    def igtvBrowse(): IgtvBrowseFeed = js.native
    def igtvBrowse(isPrefetch: Boolean): IgtvBrowseFeed = js.native
    
    def igtvChaining(id: String): IgtvChannelFeed = js.native
    def igtvChaining(id: Double): IgtvChannelFeed = js.native
    
    def igtvChannel(id: String): IgtvChannelFeed = js.native
    def igtvChannel(id: Double): IgtvChannelFeed = js.native
    
    def liked(): LikedFeed = js.native
    
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
    
    def reelsMedia(options: Source): ReelsMediaFeed = js.native
    
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
    
    def topicalExplore(): TopicalExploreFeed = js.native
    def topicalExplore(options: PartialPickTopicalExplore): TopicalExploreFeed = js.native
    
    def user(id: String): UserFeed = js.native
    def user(id: Double): UserFeed = js.native
    
    def userStory(userId: String): UserStoryFeed = js.native
    def userStory(userId: Double): UserStoryFeed = js.native
    
    def usertags(id: String): UsertagsFeed = js.native
    def usertags(id: Double): UsertagsFeed = js.native
  }
}
