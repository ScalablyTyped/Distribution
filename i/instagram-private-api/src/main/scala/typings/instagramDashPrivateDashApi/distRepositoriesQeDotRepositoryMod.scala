package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/qe.repository", JSImport.Namespace)
@js.native
object distRepositoriesQeDotRepositoryMod extends js.Object {
  @js.native
  class QeRepository () extends Repository {
    def sync(experiments: js.Any): js.Promise[_] = js.native
    def syncExperiments(): js.Promise[_] = js.native
    def syncLoginExperiments(): js.Promise[_] = js.native
  }
  
}

