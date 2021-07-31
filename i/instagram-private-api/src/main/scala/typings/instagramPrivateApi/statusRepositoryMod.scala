package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/status.repository", "StatusRepository")
  @js.native
  class StatusRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def getViewableStatuses(): js.Promise[js.Any] = js.native
  }
}
