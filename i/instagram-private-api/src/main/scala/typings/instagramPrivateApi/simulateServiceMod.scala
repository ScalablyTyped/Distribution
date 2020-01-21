package typings.instagramPrivateApi

import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/simulate.service", JSImport.Namespace)
@js.native
object simulateServiceMod extends js.Object {
  @js.native
  class SimulateService () extends Repository {
    var facebookOta: js.Any = js.native
    def postLoginFlow(): js.Promise[Unit] = js.native
    def postLoginFlow(concurrency: Double): js.Promise[Unit] = js.native
    def postLoginFlow(concurrency: Double, toShuffle: Boolean): js.Promise[Unit] = js.native
    /* private */ def postLoginFlowRequests(): js.Any = js.native
    def preLoginFlow(): js.Promise[Unit] = js.native
    def preLoginFlow(concurrency: Double): js.Promise[Unit] = js.native
    def preLoginFlow(concurrency: Double, toShuffle: Boolean): js.Promise[Unit] = js.native
    /* private */ def preLoginFlowRequests(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SimulateService extends js.Object {
    var executeRequestsFlow: js.Any = js.native
  }
  
}

