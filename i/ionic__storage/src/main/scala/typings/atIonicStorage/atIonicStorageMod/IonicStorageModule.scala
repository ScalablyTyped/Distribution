package typings.atIonicStorage.atIonicStorageMod

import typings.atAngularCore.atAngularCoreMod.ModuleWithProviders
import typings.atIonicStorage.atIonicStorageStorageMod.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage", "IonicStorageModule")
@js.native
class IonicStorageModule () extends js.Object

/* static members */
@JSImport("@ionic/storage", "IonicStorageModule")
@js.native
object IonicStorageModule extends js.Object {
  def forRoot(): ModuleWithProviders[_] = js.native
  def forRoot(storageConfig: StorageConfig): ModuleWithProviders[_] = js.native
}

