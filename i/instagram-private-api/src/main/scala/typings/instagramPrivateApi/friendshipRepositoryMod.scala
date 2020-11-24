package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.MediaId
import typings.instagramPrivateApi.anon.TargetPostsAuthorId
import typings.instagramPrivateApi.friendshipRepositoryBestiesResponseMod.FriendshipRepositorySetBestiesResponseRootObjectStatus
import typings.instagramPrivateApi.friendshipRepositoryChangeResponseMod.FriendshipRepositoryChangeResponseFriendshipStatus
import typings.instagramPrivateApi.friendshipRepositoryChangeResponseMod.FriendshipRepositoryChangeResponseRootObject
import typings.instagramPrivateApi.friendshipRepositoryShowResponseMod.FriendshipRepositoryShowResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.setBestiesInputMod.SetBestiesInput
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/friendship.repository", JSImport.Namespace)
@js.native
object friendshipRepositoryMod extends js.Object {
  
  @js.native
  class FriendshipRepository () extends Repository {
    
    def approve(id: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def approve(id: String, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def approve(id: Double): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def approve(id: Double, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    def block(id: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def block(id: String, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def block(id: Double): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def block(id: Double, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    var change: js.Any = js.native
    
    var changeMuteFromFollow: js.Any = js.native
    
    def create(id: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def create(id: String, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def create(id: Double): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def create(id: Double, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    def deny(id: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def deny(id: String, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def deny(id: Double): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def deny(id: Double, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    def destroy(id: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def destroy(id: String, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def destroy(id: Double): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def destroy(id: Double, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    def mutePostsOrStoryFromFollow(options: MediaId): js.Promise[FriendshipRepositoryChangeResponseRootObject] = js.native
    
    def removeFollower(id: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def removeFollower(id: Double): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    def setBesties(): js.Promise[Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus]] = js.native
    def setBesties(input: SetBestiesInput): js.Promise[Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus]] = js.native
    
    def show(id: String): js.Promise[FriendshipRepositoryShowResponseRootObject] = js.native
    def show(id: Double): js.Promise[FriendshipRepositoryShowResponseRootObject] = js.native
    
    def showMany(userIds: js.Array[Double | String]): js.Promise[_] = js.native
    
    def unblock(id: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def unblock(id: String, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def unblock(id: Double): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def unblock(id: Double, mediaIdAttribution: String): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    def unmutePostsOrStoryFromFollow(options: TargetPostsAuthorId): js.Promise[FriendshipRepositoryChangeResponseRootObject] = js.native
  }
}
