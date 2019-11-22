package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotSearchDotResponseMod.LocationRepositorySearchResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/location-search.repository", JSImport.Namespace)
@js.native
object distRepositoriesLocationDashSearchDotRepositoryMod extends js.Object {
  @js.native
  class LocationSearch () extends Repository {
    def index(latitude: Double, longitude: Double): js.Promise[LocationRepositorySearchResponseRootObject] = js.native
    def index(latitude: Double, longitude: Double, searchQuery: String): js.Promise[LocationRepositorySearchResponseRootObject] = js.native
  }
  
}

