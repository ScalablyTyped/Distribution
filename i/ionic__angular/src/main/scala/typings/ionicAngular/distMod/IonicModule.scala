package typings.ionicAngular.distMod

import typings.angularCore.mod.ModuleWithProviders
import typings.ionicCore.utilsConfigMod.IonicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "IonicModule")
@js.native
class IonicModule ()
  extends typings.ionicAngular.ionicModuleMod.IonicModule

/* static members */
@JSImport("@ionic/angular/dist", "IonicModule")
@js.native
object IonicModule extends js.Object {
  def forRoot(): ModuleWithProviders[_] = js.native
  def forRoot(config: IonicConfig): ModuleWithProviders[_] = js.native
}

