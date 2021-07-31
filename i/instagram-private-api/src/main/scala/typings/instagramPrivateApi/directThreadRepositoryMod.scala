package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.directThreadBroadcastOptionsMod.DirectThreadBroadcastOptions
import typings.instagramPrivateApi.directThreadRepositoryAddUserResponseMod.DirectThreadRepositoryAddUserResponseRootObject
import typings.instagramPrivateApi.directThreadRepositoryApproveParticipantRequestResponseMod.DirectThreadRepositoryApproveParticipantRequestResponseRootObject
import typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod.DirectThreadRepositoryBroadcastResponseRootObject
import typings.instagramPrivateApi.directThreadRepositoryGetByParticipantsResponseMod.DirectThreadRepositoryGetByParticipantsResponseRootObject
import typings.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod.DirectThreadRepositoryUpdateTitleResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/direct-thread.repository", "DirectThreadRepository")
  @js.native
  class DirectThreadRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
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
