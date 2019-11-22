package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/launcher.repository", JSImport.Namespace)
@js.native
object distRepositoriesLauncherDotRepositoryMod extends js.Object {
  @js.native
  class LauncherRepository () extends Repository {
    def postLoginSync(): js.Promise[_] = js.native
    def preLoginSync(): js.Promise[_] = js.native
    def sync(data: js.Object): js.Promise[_] = js.native
  }
  
}

