package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zrRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/zr.repository", "ZrRepository")
  @js.native
  class ZrRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def tokenResult(): js.Promise[IgResponse[js.Any]] = js.native
  }
}
