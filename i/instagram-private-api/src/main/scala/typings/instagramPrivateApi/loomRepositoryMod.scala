package typings.instagramPrivateApi

import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/loom.repository", JSImport.Namespace)
@js.native
object loomRepositoryMod extends js.Object {
  @js.native
  class LoomRepository () extends Repository {
    def fetchConfig(): js.Promise[_] = js.native
  }
  
}

