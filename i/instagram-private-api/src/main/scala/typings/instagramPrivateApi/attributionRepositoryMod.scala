package typings.instagramPrivateApi

import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/attribution.repository", JSImport.Namespace)
@js.native
object attributionRepositoryMod extends js.Object {
  @js.native
  class AttributionRepository () extends Repository {
    def logAttribution(): js.Promise[_] = js.native
    def logResurrectAttribution(): js.Promise[_] = js.native
  }
  
}

