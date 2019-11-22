package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotAddDashUserDotResponseMod.DirectThreadRepositoryAddUserResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotApproveDashParticipantDashRequestDotResponseMod.DirectThreadRepositoryApproveParticipantRequestResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotBroadcastDotResponseMod.DirectThreadRepositoryBroadcastResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotGetDashByDashParticipantsDotResponseMod.DirectThreadRepositoryGetByParticipantsResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotUpdateDashTitleDotResponseMod.DirectThreadRepositoryUpdateTitleResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDotOptionsMod.DirectThreadBroadcastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/direct-thread.repository", JSImport.Namespace)
@js.native
object distRepositoriesDirectDashThreadDotRepositoryMod extends js.Object {
  @js.native
  class DirectThreadRepository () extends Repository {
    def addUser(threadId: String, userIds: js.Array[Double | String]): js.Promise[DirectThreadRepositoryAddUserResponseRootObject] = js.native
    def addUser(threadId: Double, userIds: js.Array[Double | String]): js.Promise[DirectThreadRepositoryAddUserResponseRootObject] = js.native
    def approve(threadId: String): js.Promise[StatusResponse] = js.native
    def approve(threadId: Double): js.Promise[StatusResponse] = js.native
    def approveMultiple(threadIds: js.Array[Double | String]): js.Promise[StatusResponse] = js.native
    def approveParticipantRequests(threadId: String, userIds: js.Array[String]): js.Promise[DirectThreadRepositoryApproveParticipantRequestResponseRootObject] = js.native
    def approveParticipantRequests(threadId: Double, userIds: js.Array[String]): js.Promise[DirectThreadRepositoryApproveParticipantRequestResponseRootObject] = js.native
    def broadcast(options: DirectThreadBroadcastOptions): js.Promise[DirectThreadRepositoryBroadcastResponseRootObject] = js.native
    def decline(threadId: String): js.Promise[StatusResponse] = js.native
    def decline(threadId: Double): js.Promise[StatusResponse] = js.native
    def declineAll(): js.Promise[StatusResponse] = js.native
    def declineMultiple(threadIds: js.Array[Double | String]): js.Promise[StatusResponse] = js.native
    def deleteItem(threadId: String, itemId: String): js.Promise[StatusResponse] = js.native
    def deleteItem(threadId: String, itemId: Double): js.Promise[StatusResponse] = js.native
    def deleteItem(threadId: Double, itemId: String): js.Promise[StatusResponse] = js.native
    def deleteItem(threadId: Double, itemId: Double): js.Promise[StatusResponse] = js.native
    def getByParticipants(recipientUsers: js.Array[Double | String]): js.Promise[DirectThreadRepositoryGetByParticipantsResponseRootObject] = js.native
    def hide(threadId: String): js.Promise[StatusResponse] = js.native
    def leave(threadId: String): js.Promise[StatusResponse] = js.native
    def markItemSeen(threadId: String, threadItemId: String): js.Promise[StatusResponse] = js.native
    def mute(threadId: String): js.Promise[StatusResponse] = js.native
    def mute(threadId: Double): js.Promise[StatusResponse] = js.native
    def unmute(threadId: String): js.Promise[StatusResponse] = js.native
    def unmute(threadId: Double): js.Promise[StatusResponse] = js.native
    def updateTitle(threadId: String, title: String): js.Promise[DirectThreadRepositoryUpdateTitleResponseRootObject] = js.native
    def updateTitle(threadId: Double, title: String): js.Promise[DirectThreadRepositoryUpdateTitleResponseRootObject] = js.native
  }
  
}

