package typings.ionicAngular.mod

import typings.angularCore.mod.ModuleWithProviders
import typings.ionicCore.utilsConfigMod.IonicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonicModule")
@js.native
class IonicModule ()
  extends typings.ionicAngular.ionicModuleMod.IonicModule
/* static members */
object IonicModule {
  
  @JSImport("@ionic/angular", "IonicModule")
  @js.native
  val ^ : js.Any = js.native
  
  inline def forRoot(): ModuleWithProviders[typings.ionicAngular.ionicModuleMod.IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")().asInstanceOf[ModuleWithProviders[typings.ionicAngular.ionicModuleMod.IonicModule]]
  inline def forRoot(config: IonicConfig): ModuleWithProviders[typings.ionicAngular.ionicModuleMod.IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[typings.ionicAngular.ionicModuleMod.IonicModule]]
}
