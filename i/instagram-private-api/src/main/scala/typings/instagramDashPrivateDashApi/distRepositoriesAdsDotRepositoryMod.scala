package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distTypesGraphqlDashRequestDotOptionsMod.GraphQLRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/ads.repository", JSImport.Namespace)
@js.native
object distRepositoriesAdsDotRepositoryMod extends js.Object {
  @js.native
  class AdsRepository () extends Repository {
    def graphQL[T /* <: Anon_Data */](options: GraphQLRequestOptions): js.Promise[T] = js.native
  }
  
}

