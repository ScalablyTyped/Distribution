package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/zr.repository", JSImport.Namespace)
@js.native
object distRepositoriesZrDotRepositoryMod extends js.Object {
  @js.native
  class ZrRepository () extends Repository {
    def tokenResult(): js.Promise[IgResponse[_]] = js.native
  }
  
}

