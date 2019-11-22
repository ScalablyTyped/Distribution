package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotAddDashUserDotResponseMod.DirectThreadRepositoryAddUserResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotBroadcastDotResponseMod.DirectThreadRepositoryBroadcastResponsePayload
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotUpdateDashTitleDotResponseMod.DirectThreadRepositoryUpdateTitleResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashMediaDotOptionsMod.DirectThreadBroadcastPhotoOptions
import typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashMediaDotOptionsMod.DirectThreadBroadcastPhotoStoryOptions
import typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashMediaDotOptionsMod.DirectThreadBroadcastVideoOptions
import typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashMediaDotOptionsMod.DirectThreadBroadcastVideoStoryOptions
import typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashReelDotOptionsMod.DirectThreadBroadcastReelOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/direct-thread.entity", JSImport.Namespace)
@js.native
object distEntitiesDirectDashThreadDotEntityMod extends js.Object {
  @js.native
  class DirectThreadEntity () extends Repository {
    var broadcast: js.Any = js.native
    var threadId: String = js.native
    var userIds: js.Array[String] = js.native
    def addUser(userIds: js.Array[Double | String]): js.Promise[DirectThreadRepositoryAddUserResponseRootObject] = js.native
    def broadcastLink(link_text: String, link_urls: js.Array[String]): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def broadcastPhoto(options: DirectThreadBroadcastPhotoOptions): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def broadcastProfile(id: String): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def broadcastProfile(id: Double): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def broadcastReel(options: DirectThreadBroadcastReelOptions): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def broadcastStory(input: DirectThreadBroadcastPhotoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: DirectThreadBroadcastVideoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: Buffer): js.Promise[_] = js.native
    def broadcastText(text: String): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def broadcastUserStory(options: DirectThreadBroadcastReelOptions): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def broadcastVideo(options: DirectThreadBroadcastVideoOptions): js.Promise[DirectThreadRepositoryBroadcastResponsePayload] = js.native
    def deleteItem(itemId: String): js.Promise[StatusResponse] = js.native
    def deleteItem(itemId: Double): js.Promise[StatusResponse] = js.native
    def hide(): js.Promise[StatusResponse] = js.native
    def leave(): js.Promise[StatusResponse] = js.native
    def markItemSeen(threadItemId: String): js.Promise[StatusResponse] = js.native
    def mute(): js.Promise[StatusResponse] = js.native
    def unmute(): js.Promise[StatusResponse] = js.native
    def updateTitle(title: String): js.Promise[DirectThreadRepositoryUpdateTitleResponseRootObject] = js.native
  }
  
}

