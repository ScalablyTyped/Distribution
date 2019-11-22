package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesDiscoverDotRepositoryDotChainingDotResponseMod.DiscoverRepositoryChainingResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/discover.repository", JSImport.Namespace)
@js.native
object distRepositoriesDiscoverDotRepositoryMod extends js.Object {
  @js.native
  class DiscoverRepository () extends Repository {
    def chaining(targetId: String): js.Promise[DiscoverRepositoryChainingResponseRootObject] = js.native
    def markSuSeen(): js.Promise[_] = js.native
    def profileSuBadge(): js.Promise[_] = js.native
    def topicalExplore(): js.Promise[_] = js.native
  }
  
}

