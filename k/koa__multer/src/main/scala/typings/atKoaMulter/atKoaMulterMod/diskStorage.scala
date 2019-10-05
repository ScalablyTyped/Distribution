package typings.atKoaMulter.atKoaMulterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@koa/multer", "diskStorage")
@js.native
object diskStorage extends js.Object {
  /* The disk storage engine gives you full control on storing files to disk. */
  def apply(options: DiskStorageOptions): StorageEngine = js.native
}

