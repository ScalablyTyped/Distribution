package typings.atIonicStorage.atIonicStorageStorageMod

import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atIonicStorage.Anon_DbKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage/storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  def getDefaultConfig(): Anon_DbKey = js.native
  def provideStorage(storageConfig: StorageConfig): Storage = js.native
}

