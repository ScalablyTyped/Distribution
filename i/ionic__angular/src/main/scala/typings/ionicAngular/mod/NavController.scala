package typings.ionicAngular.mod

import typings.angularCommon.mod.Location
import typings.angularRouter.mod.Router
import typings.angularRouter.mod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "NavController")
@js.native
class NavController protected ()
  extends typings.ionicAngular.navControllerMod.NavController {
  def this(platform: typings.ionicAngular.platformMod.Platform, location: Location, serializer: UrlSerializer) = this()
  def this(
    platform: typings.ionicAngular.platformMod.Platform,
    location: Location,
    serializer: UrlSerializer,
    router: Router
  ) = this()
}

