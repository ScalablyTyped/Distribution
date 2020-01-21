package typings.instagramPrivateApi

import typings.instagramPrivateApi.locationRepositoryInfoResponseMod.LocationRepositoryInfoResponseRootObject
import typings.instagramPrivateApi.locationRepositoryStoryResponseMod.LocationRepositoryStoryResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/location.repository", JSImport.Namespace)
@js.native
object locationRepositoryMod extends js.Object {
  @js.native
  class LocationRepository () extends Repository {
    def info(id: String): js.Promise[LocationRepositoryInfoResponseRootObject] = js.native
    def info(id: Double): js.Promise[LocationRepositoryInfoResponseRootObject] = js.native
    def story(id: String): js.Promise[LocationRepositoryStoryResponseRootObject] = js.native
    def story(id: Double): js.Promise[LocationRepositoryStoryResponseRootObject] = js.native
  }
  
}

