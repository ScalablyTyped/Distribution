package typings.ionicAngular

import typings.angularCore.mod.ModuleWithProviders
import typings.ionicCore.utilsConfigMod.IonicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicModuleMod {
  
  @JSImport("@ionic/angular/ionic-module", "IonicModule")
  @js.native
  class IonicModule () extends StObject
  /* static members */
  object IonicModule {
    
    @JSImport("@ionic/angular/ionic-module", "IonicModule.forRoot")
    @js.native
    def forRoot(): ModuleWithProviders[IonicModule] = js.native
    @JSImport("@ionic/angular/ionic-module", "IonicModule.forRoot")
    @js.native
    def forRoot(config: IonicConfig): ModuleWithProviders[IonicModule] = js.native
  }
}
