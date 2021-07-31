package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.discoverRepositoryChainingResponseMod.DiscoverRepositoryChainingResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoverRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/discover.repository", "DiscoverRepository")
  @js.native
  class DiscoverRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def chaining(targetId: String): js.Promise[DiscoverRepositoryChainingResponseRootObject] = js.native
    
    def markSuSeen(): js.Promise[js.Any] = js.native
    
    def profileSuBadge(): js.Promise[js.Any] = js.native
    
    def topicalExplore(): js.Promise[js.Any] = js.native
  }
}
