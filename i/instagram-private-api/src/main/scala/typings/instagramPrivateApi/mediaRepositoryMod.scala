package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.anon.CaptionText
import typings.instagramPrivateApi.anon.MediaType
import typings.instagramPrivateApi.anon.Module
import typings.instagramPrivateApi.anon.Sourcetype
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`2`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaConfigureTimelineOptions
import typings.instagramPrivateApi.mediaConfigureSidecarOptionsMod.MediaConfigureSidecarOptions
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryPhotoOptions
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryVideoOptions
import typings.instagramPrivateApi.mediaConfigureToIgtvOptionsMod.MediaConfigureToIgtvOptions
import typings.instagramPrivateApi.mediaConfigureVideoOptionsMod.MediaConfigureTimelineVideoOptions
import typings.instagramPrivateApi.mediaLikeOptionsMod.LikeRequestOptions
import typings.instagramPrivateApi.mediaLikeOptionsMod.UnlikeRequestOptions
import typings.instagramPrivateApi.mediaRepositoryCheckOffensiveCommentResponseMod.MediaRepositoryCheckOffensiveCommentResponseRootObject
import typings.instagramPrivateApi.mediaRepositoryCommentResponseMod.MediaRepositoryCommentResponseComment
import typings.instagramPrivateApi.mediaRepositoryConfigureResponseMod.MediaRepositoryConfigureResponseRootObject
import typings.instagramPrivateApi.mediaRepositoryInfoResponseMod.MediaEditResponseRootObject
import typings.instagramPrivateApi.mediaRepositoryInfoResponseMod.MediaInfoResponseRootObject
import typings.instagramPrivateApi.mediaRepositoryLikersResponseMod.MediaRepositoryLikersResponseRootObject
import typings.instagramPrivateApi.mediaUpdatedMediaResponseMod.MediaUpdatedMediaResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import typings.instagramPrivateApi.storyResponseOptionsMod.StoryMusicQuestionResponse
import typings.instagramPrivateApi.storyResponseOptionsMod.StoryTextQuestionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/media.repository", "MediaRepository")
  @js.native
  class MediaRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    var applyConfigureDefaults: js.Any = js.native
    
    def blocked(): js.Promise[js.Array[String]] = js.native
    
    def checkOffensiveComment(commentText: String): js.Promise[MediaRepositoryCheckOffensiveCommentResponseRootObject] = js.native
    def checkOffensiveComment(commentText: String, mediaId: String): js.Promise[MediaRepositoryCheckOffensiveCommentResponseRootObject] = js.native
    
    def comment(hasMediaIdTextReplyToCommentIdModule: Module): js.Promise[MediaRepositoryCommentResponseComment] = js.native
    
    def commentsBulkDelete(mediaId: String, commentIds: js.Array[String]): js.Promise[StatusResponse] = js.native
    
    def commentsDisable(mediaId: js.Any): js.Promise[js.Any] = js.native
    
    def commentsEnable(mediaId: js.Any): js.Promise[js.Any] = js.native
    
    def configure(options: MediaConfigureTimelineOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    
    def configureSidecar(options: MediaConfigureSidecarOptions): js.Promise[js.Any] = js.native
    
    def configureToIgtv(options: MediaConfigureToIgtvOptions): js.Promise[js.Any] = js.native
    
    def configureToStory(options: MediaConfigureStoryPhotoOptions): js.Promise[js.Any] = js.native
    
    def configureToStoryVideo(options: MediaConfigureStoryVideoOptions): js.Promise[js.Any] = js.native
    
    def configureVideo(options: MediaConfigureTimelineVideoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    
    def delete(hasMediaIdMediaType: MediaType): js.Promise[js.Any] = js.native
    
    def editMedia(hasMediaIdCaptionText: CaptionText): js.Promise[MediaEditResponseRootObject] = js.native
    
    def info(mediaId: String): js.Promise[MediaInfoResponseRootObject] = js.native
    
    def like(options: LikeRequestOptions): js.Promise[js.Any] = js.native
    
    var likeAction: js.Any = js.native
    
    def likeComment(commentId: String): js.Promise[js.Any] = js.native
    
    def likers(id: String): js.Promise[MediaRepositoryLikersResponseRootObject] = js.native
    
    def onlyMe(mediaId: String): js.Promise[StatusResponse] = js.native
    
    def save(mediaId: String): js.Promise[js.Any] = js.native
    
    def seen(reels: StringDictionary[js.Array[String]]): js.Promise[StatusResponse] = js.native
    def seen(reels: StringDictionary[js.Array[String]], module: IgAppModule): js.Promise[StatusResponse] = js.native
    
    @JSName("storyPollVote")
    def storyPollVote_0(mediaId: String, pollId: String, vote: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_0(mediaId: String, pollId: Double, vote: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_1(mediaId: String, pollId: String, vote: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_1(mediaId: String, pollId: Double, vote: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    
    def storyQuestionResponse(mediaId: String, questionId: String, options: StoryMusicQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: String, options: StoryTextQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: Double, options: StoryMusicQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: Double, options: StoryTextQuestionResponse): js.Promise[StatusResponse] = js.native
    
    def storyQuizAnswer(mediaId: String, quizId: String, answer: String): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storyQuizAnswer(mediaId: String, quizId: Double, answer: String): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_0(mediaId: String, quizId: String, answer: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_0(mediaId: String, quizId: Double, answer: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_1(mediaId: String, quizId: String, answer: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_1(mediaId: String, quizId: Double, answer: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_2(mediaId: String, quizId: String, answer: `2`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_2(mediaId: String, quizId: Double, answer: `2`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_3(mediaId: String, quizId: String, answer: `3`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_3(mediaId: String, quizId: Double, answer: `3`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    
    def storySliderVote(mediaId: String, sliderId: String, vote: Double): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storySliderVote(mediaId: String, sliderId: Double, vote: Double): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    
    def undoOnlyMe(mediaId: String): js.Promise[StatusResponse] = js.native
    
    def unlike(options: UnlikeRequestOptions): js.Promise[js.Any] = js.native
    
    def unlikeComment(commentId: String): js.Promise[js.Any] = js.native
    
    def unsave(mediaId: String): js.Promise[js.Any] = js.native
    
    def uploadFinish(options: Sourcetype): js.Promise[js.Any] = js.native
  }
  /* static members */
  object MediaRepository {
    
    @JSImport("instagram-private-api/dist/repositories/media.repository", "MediaRepository")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("instagram-private-api/dist/repositories/media.repository", "MediaRepository.stringifyStoryStickers")
    @js.native
    def stringifyStoryStickers: js.Any = js.native
    @scala.inline
    def stringifyStoryStickers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringifyStoryStickers")(x.asInstanceOf[js.Any])
  }
}
