package typings.k6.globalMod._Global_

import typings.k6.k6Strings.b
import typings.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("open")
@js.native
object open_b extends js.Object {
  /**
    * Opens a file, reading all its contents into memory.
    * https://docs.k6.io/docs/open-filepath-mode
    * @param filePath - Path to file.
    * @returns Binary file contents.
    * @public
    */
  def apply(filePath: String, mode: b): bytes = js.native
}

