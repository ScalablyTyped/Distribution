package typings.instagramDashPrivateDashApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/consent.repository", JSImport.Namespace)
@js.native
object distRepositoriesConsentDotRepositoryMod extends js.Object {
  @js.native
  class ConsentRepository () extends Repository {
    def auto(): js.Promise[_] = js.native
    def existingUserFlow(): js.Promise[_] = js.native
    def existingUserFlow(data: StringDictionary[js.Any]): js.Promise[_] = js.native
    def existingUserFlowDob(year: String, month: String, day: String): js.Promise[_] = js.native
    def existingUserFlowDob(year: String, month: String, day: Double): js.Promise[_] = js.native
    def existingUserFlowDob(year: String, month: Double, day: String): js.Promise[_] = js.native
    def existingUserFlowDob(year: String, month: Double, day: Double): js.Promise[_] = js.native
    def existingUserFlowDob(year: Double, month: String, day: String): js.Promise[_] = js.native
    def existingUserFlowDob(year: Double, month: String, day: Double): js.Promise[_] = js.native
    def existingUserFlowDob(year: Double, month: Double, day: String): js.Promise[_] = js.native
    def existingUserFlowDob(year: Double, month: Double, day: Double): js.Promise[_] = js.native
    def existingUserFlowIntro(): js.Promise[_] = js.native
    def existingUserFlowTosAndTwoAgeButton(): js.Promise[_] = js.native
  }
  
}

