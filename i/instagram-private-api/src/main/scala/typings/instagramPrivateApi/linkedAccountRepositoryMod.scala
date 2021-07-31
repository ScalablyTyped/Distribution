package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedAccountRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/linked-account.repository", "LinkedAccountRepository")
  @js.native
  class LinkedAccountRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def getLinkageStatus(): js.Promise[js.Any] = js.native
  }
}
