package typings.atKoaMulter.atKoaMulterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@koa/multer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Instance = js.native
  def apply(options: Options): Instance = js.native
  /* The disk storage engine gives you full control on storing files to disk. */
  def diskStorage(options: DiskStorageOptions): StorageEngine = js.native
  /* The memory storage engine stores the files in memory as Buffer objects. */
  def memoryStorage(): StorageEngine = js.native
}

