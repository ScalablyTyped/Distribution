package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.DbName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "IndexedDBStore")
@js.native
class IndexedDBStore protected () extends MemoryStore {
  def this(opts: DbName) = this()
}

