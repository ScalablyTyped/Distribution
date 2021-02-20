package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastPhotoOptions
import typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastPhotoStoryOptions
import typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVideoOptions
import typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVideoStoryOptions
import typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVoiceOptions
import typings.instagramPrivateApi.directThreadBroadcastReelOptionsMod.DirectThreadBroadcastReelOptions
import typings.instagramPrivateApi.directThreadRepositoryAddUserResponseMod.DirectThreadRepositoryAddUserResponseRootObject
import typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod.DirectThreadRepositoryBroadcastResponsePayload
import typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod.DirectThreadRepositoryBroadcastResponseRootObject
import typings.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod.DirectThreadRepositoryUpdateTitleResponseRootObject
import typings.instagramPrivateApi.entityMod.Entity
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadEntityMod {
  
  @JSImport("instagram-private-api/dist/entities/direct-thread.entity", "DirectThreadEntity")
  @js.native
  class DirectThreadEntity protected () extends Entity {
    def this(client: IgApiClient) = this()
    
    def addUser(userIds: js.Array[Double | String]): js.Promise[DirectThreadRepositoryAddUserResponseRootObject] = js.native
    
    var broadcast: js.Any = js.native
    
    def broadcastLink(link_text: String, link_urls: js.Array[String]): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastPhoto(options: DirectThreadBroadcastPhotoOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastPost(mediaId: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastProfile(id: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastProfile(id: Double): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastReel(options: DirectThreadBroadcastReelOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastStory(input: DirectThreadBroadcastPhotoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: DirectThreadBroadcastVideoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: Buffer): js.Promise[_] = js.native
    
    def broadcastText(text: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastUserStory(options: DirectThreadBroadcastReelOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastVideo(options: DirectThreadBroadcastVideoOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastVoice(options: DirectThreadBroadcastVoiceOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def deleteItem(itemId: String): js.Promise[StatusResponse] = js.native
    def deleteItem(itemId: Double): js.Promise[StatusResponse] = js.native
    
    def hide(): js.Promise[StatusResponse] = js.native
    
    def leave(): js.Promise[StatusResponse] = js.native
    
    def markItemSeen(threadItemId: String): js.Promise[StatusResponse] = js.native
    
    def mute(): js.Promise[StatusResponse] = js.native
    
    var threadId: String = js.native
    
    def unmute(): js.Promise[StatusResponse] = js.native
    
    def updateTitle(title: String): js.Promise[DirectThreadRepositoryUpdateTitleResponseRootObject] = js.native
    
    var userIds: js.Array[String] = js.native
  }
}
