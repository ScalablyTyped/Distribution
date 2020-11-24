package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/consent.repository", JSImport.Namespace)
@js.native
object consentRepositoryMod extends js.Object {
  
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
