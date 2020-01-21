package typings.ionicStorage

import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ModuleWithProviders
import typings.ionicStorage.storageMod.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IonicStorageModule () extends js.Object
  
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
    def this(config: StorageConfig) = this()
  }
  
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  def ɵa(storageConfig: StorageConfig): typings.ionicStorage.storageMod.Storage = js.native
  /* static members */
  @js.native
  object IonicStorageModule extends js.Object {
    def forRoot(): ModuleWithProviders[_] = js.native
    def forRoot(storageConfig: StorageConfig): ModuleWithProviders[_] = js.native
  }
  
}

