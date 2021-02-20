package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launcherRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/launcher.repository", "LauncherRepository")
  @js.native
  class LauncherRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def postLoginSync(): js.Promise[_] = js.native
    
    def preLoginSync(): js.Promise[_] = js.native
    
    def sync(data: js.Object): js.Promise[_] = js.native
  }
}
