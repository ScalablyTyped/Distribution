package typings.koaMulter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-multer", "memoryStorage")
@js.native
object memoryStorage extends js.Object {
  
  /* The memory storage engine stores the files in memory as Buffer objects. */
  def apply(): StorageEngine = js.native
}
