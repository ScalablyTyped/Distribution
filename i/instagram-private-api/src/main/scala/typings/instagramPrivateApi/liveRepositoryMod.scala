package typings.instagramPrivateApi

import typings.instagramPrivateApi.liveAddToPostResponseMod.LiveAddToPostResponse
import typings.instagramPrivateApi.liveCommentsResponseMod.LiveCommentsResponseRootObject
import typings.instagramPrivateApi.liveCreateBroadcastResponseMod.LiveCreateBroadcastResponseRootObject
import typings.instagramPrivateApi.liveFinalViewersResponseMod.LiveFinalViewersResponseRootObject
import typings.instagramPrivateApi.liveGetQuestionsResponseMod.LiveGetQuestionsResponseRootObject
import typings.instagramPrivateApi.liveHeartbeatViewerCountResponseMod.LiveHeartbeatViewerCountResponseRootObject
import typings.instagramPrivateApi.liveInfoResponseMod.LiveInfoResponseRootObject
import typings.instagramPrivateApi.liveJoinRequestCountsResponseMod.LiveJoinRequestCountsResponseRootObject
import typings.instagramPrivateApi.liveLikeCountResponseMod.LiveLikeCountResponseRootObject
import typings.instagramPrivateApi.liveLikeResponseMod.LiveLikeResponseRootObject
import typings.instagramPrivateApi.liveStartBroadcastResponseMod.LiveStartBroadcastResponseRootObject
import typings.instagramPrivateApi.liveSwitchCommentsResponseMod.LiveSwitchCommentsResponseRootObject
import typings.instagramPrivateApi.liveViewerListResponseMod.LiveViewerListResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/live.repository", JSImport.Namespace)
@js.native
object liveRepositoryMod extends js.Object {
  @js.native
  class LiveRepository () extends Repository {
    def activateQuestion(broadcastId: String, questionId: String): js.Promise[_] = js.native
    def addToPostLive(broadcastId: String): js.Promise[LiveAddToPostResponse] = js.native
    def comment(broadcastId: String, message: String): js.Promise[_] = js.native
    def create(hasPreviewHeightPreviewWidthMessage: AnonMessage): js.Promise[LiveCreateBroadcastResponseRootObject] = js.native
    def createQuestion(broadcastId: String, question: String): js.Promise[_] = js.native
    def deactivateQuestion(broadcastId: String, questionId: String): js.Promise[_] = js.native
    def endBroadcast(broadcastId: String): js.Promise[_] = js.native
    def endBroadcast(broadcastId: String, endAfterCopyrightWarning: Boolean): js.Promise[_] = js.native
    def getComment(hasBroadcastIdCommentsRequestedLastCommentTs: Anon_BroadcastId): js.Promise[LiveCommentsResponseRootObject] = js.native
    def getFinalViewerList(broadcastId: String): js.Promise[LiveFinalViewersResponseRootObject] = js.native
    def getJoinRequestCounts(hasBroadcastIdLastTotalCountLastSeenTsLastFetchTs: AnonBroadcastIdLastFetchTs): js.Promise[LiveJoinRequestCountsResponseRootObject] = js.native
    def getLikeCount(broadcastId: String): js.Promise[LiveLikeCountResponseRootObject] = js.native
    def getLikeCount(broadcastId: String, likeTs: String): js.Promise[LiveLikeCountResponseRootObject] = js.native
    def getLikeCount(broadcastId: String, likeTs: Double): js.Promise[LiveLikeCountResponseRootObject] = js.native
    def getLivePresence(): js.Promise[_] = js.native
    def getLiveQuestions(broadcastId: String): js.Promise[_] = js.native
    def getQuestions(): js.Promise[LiveGetQuestionsResponseRootObject] = js.native
    def getViewerList(broadcastId: String): js.Promise[LiveViewerListResponseRootObject] = js.native
    def heartbeatAndGetViewerCount(broadcastId: String): js.Promise[LiveHeartbeatViewerCountResponseRootObject] = js.native
    def info(broadcastId: String): js.Promise[LiveInfoResponseRootObject] = js.native
    def like(broadcastId: String): js.Promise[LiveLikeResponseRootObject] = js.native
    def like(broadcastId: String, likeCount: Double): js.Promise[LiveLikeResponseRootObject] = js.native
    def muteComment(broadcastId: String): js.Promise[LiveSwitchCommentsResponseRootObject] = js.native
    def pinComment(broadcastId: String, commentId: String): js.Promise[_] = js.native
    def resumeBroadcastAfterContentMatch(broadcastId: String): js.Promise[_] = js.native
    def start(broadcastId: String): js.Promise[LiveStartBroadcastResponseRootObject] = js.native
    def start(broadcastId: String, sendNotifications: Boolean): js.Promise[LiveStartBroadcastResponseRootObject] = js.native
    def unmuteComment(broadcastId: String): js.Promise[LiveSwitchCommentsResponseRootObject] = js.native
    def unpinComment(broadcastId: String, commentId: String): js.Promise[_] = js.native
    def wave(broadcastId: String, viewerId: String): js.Promise[_] = js.native
  }
  
}

