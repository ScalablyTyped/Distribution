package typings
package koaDashMulterLib.koaDashMulterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-multer", JSImport.Namespace)
@js.native
object koaDashMulterModMembers extends js.Object {
  def apply(): koaDashMulterLib.koaDashMulterMod.multerNs.Instance = js.native
  def apply(options: koaDashMulterLib.koaDashMulterMod.multerNs.Options): koaDashMulterLib.koaDashMulterMod.multerNs.Instance = js.native
  /* The disk storage engine gives you full control on storing files to disk. */
  def diskStorage(options: koaDashMulterLib.koaDashMulterMod.multerNs.DiskStorageOptions): koaDashMulterLib.koaDashMulterMod.multerNs.StorageEngine = js.native
  /* The memory storage engine stores the files in memory as Buffer objects. */
  def memoryStorage(): koaDashMulterLib.koaDashMulterMod.multerNs.StorageEngine = js.native
}

