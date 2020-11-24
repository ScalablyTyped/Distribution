package typings.ionicStorage

import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ModuleWithProviders
import typings.ionicStorage.storageMod.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/storage", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  
  def ɵa(storageConfig: StorageConfig, platformID: js.Object): typings.ionicStorage.storageMod.Storage = js.native
  
  @js.native
  class IonicStorageModule () extends js.Object
  /* static members */
  @js.native
  object IonicStorageModule extends js.Object {
    
    def forRoot(): ModuleWithProviders[IonicStorageModule] = js.native
    def forRoot(storageConfig: StorageConfig): ModuleWithProviders[IonicStorageModule] = js.native
  }
  
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
}
