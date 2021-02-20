package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consentRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/consent.repository", "ConsentRepository")
  @js.native
  class ConsentRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
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
