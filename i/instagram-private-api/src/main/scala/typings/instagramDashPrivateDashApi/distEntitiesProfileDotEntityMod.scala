package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesFriendshipDotRepositoryDotChangeDotResponseMod.FriendshipRepositoryChangeResponseFriendship_status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/profile.entity", JSImport.Namespace)
@js.native
object distEntitiesProfileDotEntityMod extends js.Object {
  @js.native
  class ProfileEntity () extends Repository {
    var pk: String | Double = js.native
    def checkFollow(): js.Promise[FriendshipRepositoryChangeResponseFriendship_status] = js.native
    def checkUnfollow(): js.Promise[FriendshipRepositoryChangeResponseFriendship_status] = js.native
  }
  
}

