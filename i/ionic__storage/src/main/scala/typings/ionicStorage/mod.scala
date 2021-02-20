package typings.ionicStorage

import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ModuleWithProviders
import typings.ionicStorage.storageMod.StorageConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/storage", "IonicStorageModule")
  @js.native
  class IonicStorageModule () extends StObject
  /* static members */
  object IonicStorageModule {
    
    @JSImport("@ionic/storage", "IonicStorageModule.forRoot")
    @js.native
    def forRoot(): ModuleWithProviders[IonicStorageModule] = js.native
    @JSImport("@ionic/storage", "IonicStorageModule.forRoot")
    @js.native
    def forRoot(storageConfig: StorageConfig): ModuleWithProviders[IonicStorageModule] = js.native
  }
  
  @JSImport("@ionic/storage", "Storage")
  @js.native
  class Storage protected ()
    extends typings.ionicStorage.storageMod.Storage {
    /**
      * Create a new Storage instance using the order of drivers and any additional config
      * options to pass to LocalForage.
      *
      * Possible driver options are: ['sqlite', 'indexeddb', 'websql', 'localstorage'] and the
      * default is that exact ordering.
      */
    def this(config: StorageConfig, platformId: js.Object) = this()
  }
  
  @JSImport("@ionic/storage", "StorageConfigToken")
  @js.native
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  
  @JSImport("@ionic/storage", "\u0275a")
  @js.native
  def ɵa(storageConfig: StorageConfig, platformID: js.Object): typings.ionicStorage.storageMod.Storage = js.native
}
