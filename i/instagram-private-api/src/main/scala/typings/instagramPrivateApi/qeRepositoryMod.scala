package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qeRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/qe.repository", "QeRepository")
  @js.native
  class QeRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def sync(experiments: js.Any): js.Promise[_] = js.native
    
    def syncExperiments(): js.Promise[_] = js.native
    
    def syncLoginExperiments(): js.Promise[_] = js.native
  }
}
