package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesChallengeDotStateDotResponseMod.ChallengeStateResponse
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`0`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/challenge.repository", JSImport.Namespace)
@js.native
object distRepositoriesChallengeDotRepositoryMod extends js.Object {
  @js.native
  class ChallengeRepository () extends Repository {
    var middleware: js.Any = js.native
    def auto(): js.Promise[ChallengeStateResponse] = js.native
    def auto(reset: Boolean): js.Promise[ChallengeStateResponse] = js.native
    @JSName("deltaLoginReview")
    def deltaLoginReview_0(choice: `0`): js.Promise[ChallengeStateResponse] = js.native
    @JSName("deltaLoginReview")
    def deltaLoginReview_1(choice: `1`): js.Promise[ChallengeStateResponse] = js.native
    def replay(choice: String): js.Promise[ChallengeStateResponse] = js.native
    def reset(): js.Promise[ChallengeStateResponse] = js.native
    def selectVerifyMethod(choice: String): js.Promise[ChallengeStateResponse] = js.native
    def selectVerifyMethod(choice: String, isReplay: Boolean): js.Promise[ChallengeStateResponse] = js.native
    def sendPhoneNumber(phoneNumber: String): js.Promise[ChallengeStateResponse] = js.native
    def sendSecurityCode(code: String): js.Promise[ChallengeStateResponse] = js.native
    def sendSecurityCode(code: Double): js.Promise[ChallengeStateResponse] = js.native
    def state(): js.Promise[ChallengeStateResponse] = js.native
  }
  
}

