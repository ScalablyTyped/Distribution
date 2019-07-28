package typings.atIonicAngular.atIonicAngularMod

import typings.atAngularCommon.atAngularCommonMod.Location
import typings.atAngularRouter.atAngularRouterMod.Router
import typings.atAngularRouter.atAngularRouterMod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "NavController")
@js.native
class NavController protected ()
  extends typings.atIonicAngular.distMod.NavController {
  def this(
    platform: typings.atIonicAngular.distProvidersPlatformMod.Platform,
    location: Location,
    serializer: UrlSerializer
  ) = this()
  def this(
    platform: typings.atIonicAngular.distProvidersPlatformMod.Platform,
    location: Location,
    serializer: UrlSerializer,
    router: Router
  ) = this()
}

