package typings.ionicAngular.mod

import typings.angularCore.mod.ModuleWithProviders
import typings.ionicCore.utilsConfigMod.IonicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "IonicModule")
@js.native
class IonicModule ()
  extends typings.ionicAngular.distMod.IonicModule

/* static members */
@JSImport("@ionic/angular", "IonicModule")
@js.native
object IonicModule extends js.Object {
  def forRoot(): ModuleWithProviders[_] = js.native
  def forRoot(config: IonicConfig): ModuleWithProviders[_] = js.native
}

