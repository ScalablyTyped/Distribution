package typings.atIonicStorage

import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atAngularCore.atAngularCoreMod.ModuleWithProviders
import typings.atIonicStorage.atIonicStorageStorageMod.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage", JSImport.Namespace)
@js.native
object atIonicStorageMod extends js.Object {
  @js.native
  class IonicStorageModule () extends js.Object
  
  @js.native
  class Storage protected ()
    extends typings.atIonicStorage.atIonicStorageStorageMod.Storage {
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
  def ɵa(storageConfig: StorageConfig): typings.atIonicStorage.atIonicStorageStorageMod.Storage = js.native
  /* static members */
  @js.native
  object IonicStorageModule extends js.Object {
    def forRoot(): ModuleWithProviders[_] = js.native
    def forRoot(storageConfig: StorageConfig): ModuleWithProviders[_] = js.native
  }
  
}

