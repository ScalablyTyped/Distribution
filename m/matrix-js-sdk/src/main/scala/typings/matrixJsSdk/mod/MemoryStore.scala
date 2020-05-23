package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.LocalStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "MemoryStore")
@js.native
class MemoryStore () extends MatrixStore {
  def this(opts: LocalStorage) = this()
  var localStorage: js.UndefOr[js.Any] = js.native
}

