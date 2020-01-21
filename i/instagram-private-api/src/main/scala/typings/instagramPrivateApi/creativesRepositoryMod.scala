package typings.instagramPrivateApi

import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/creatives.repository", JSImport.Namespace)
@js.native
object creativesRepositoryMod extends js.Object {
  @js.native
  class CreativesRepository () extends Repository {
    def writeSupportedCapabilities(): js.Promise[_] = js.native
  }
  
}

