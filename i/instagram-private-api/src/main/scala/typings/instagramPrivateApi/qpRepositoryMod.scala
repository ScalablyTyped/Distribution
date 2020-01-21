package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/qp.repository", JSImport.Namespace)
@js.native
object qpRepositoryMod extends js.Object {
  @js.native
  class QpRepository () extends Repository {
    var surfacesToQueries: String = js.native
    var surfacesToTriggers: String = js.native
    def batchFetch(): js.Promise[IgResponse[_]] = js.native
    def getCooldowns(): js.Promise[IgResponse[_]] = js.native
  }
  
}

