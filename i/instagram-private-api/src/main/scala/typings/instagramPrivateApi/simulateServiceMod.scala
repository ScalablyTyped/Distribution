package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simulateServiceMod {
  
  @JSImport("instagram-private-api/dist/services/simulate.service", "SimulateService")
  @js.native
  class SimulateService protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    var facebookOta: js.Any = js.native
    
    def postLoginFlow(): js.Promise[Unit] = js.native
    def postLoginFlow(concurrency: js.UndefOr[scala.Nothing], toShuffle: Boolean): js.Promise[Unit] = js.native
    def postLoginFlow(concurrency: Double): js.Promise[Unit] = js.native
    def postLoginFlow(concurrency: Double, toShuffle: Boolean): js.Promise[Unit] = js.native
    
    /* private */ def postLoginFlowRequests: js.Any = js.native
    
    def preLoginFlow(): js.Promise[Unit] = js.native
    def preLoginFlow(concurrency: js.UndefOr[scala.Nothing], toShuffle: Boolean): js.Promise[Unit] = js.native
    def preLoginFlow(concurrency: Double): js.Promise[Unit] = js.native
    def preLoginFlow(concurrency: Double, toShuffle: Boolean): js.Promise[Unit] = js.native
    
    /* private */ def preLoginFlowRequests: js.Any = js.native
  }
  /* static members */
  object SimulateService {
    
    @JSImport("instagram-private-api/dist/services/simulate.service", "SimulateService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("instagram-private-api/dist/services/simulate.service", "SimulateService.executeRequestsFlow")
    @js.native
    def executeRequestsFlow: js.Any = js.native
    @scala.inline
    def executeRequestsFlow_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeRequestsFlow")(x.asInstanceOf[js.Any])
  }
}
