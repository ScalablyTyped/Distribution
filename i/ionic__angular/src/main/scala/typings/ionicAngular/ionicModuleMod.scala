package typings.ionicAngular

import typings.angularCore.mod.ModuleWithProviders
import typings.ionicCore.utilsConfigMod.IonicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicModuleMod {
  
  @JSImport("@ionic/angular/ionic-module", "IonicModule")
  @js.native
  class IonicModule () extends StObject
  /* static members */
  object IonicModule {
    
    @JSImport("@ionic/angular/ionic-module", "IonicModule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def forRoot(): ModuleWithProviders[IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")().asInstanceOf[ModuleWithProviders[IonicModule]]
    @scala.inline
    def forRoot(config: IonicConfig): ModuleWithProviders[IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[IonicModule]]
  }
}
