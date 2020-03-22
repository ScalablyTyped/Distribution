package typings.matrixJsSdk.mod

import typings.matrixJsSdk.AnonLocalStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "MemoryStore")
@js.native
class MemoryStore () extends MatrixStore {
  def this(opts: AnonLocalStorage) = this()
  var localStorage: js.UndefOr[js.Any] = js.native
}

