package typings.instagramPrivateApi

import typings.instagramPrivateApi.locationRepositorySearchResponseMod.LocationRepositorySearchResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/location-search.repository", JSImport.Namespace)
@js.native
object locationSearchRepositoryMod extends js.Object {
  @js.native
  class LocationSearch () extends Repository {
    def index(latitude: Double, longitude: Double): js.Promise[LocationRepositorySearchResponseRootObject] = js.native
    def index(latitude: Double, longitude: Double, searchQuery: String): js.Promise[LocationRepositorySearchResponseRootObject] = js.native
  }
  
}

