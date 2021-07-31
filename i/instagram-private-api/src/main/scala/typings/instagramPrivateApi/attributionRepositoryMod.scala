package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributionRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/attribution.repository", "AttributionRepository")
  @js.native
  class AttributionRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def logAttribution(): js.Promise[js.Any] = js.native
    
    def logResurrectAttribution(): js.Promise[js.Any] = js.native
  }
}
