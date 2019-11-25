package typings.k6.globalMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("open")
@js.native
object open extends js.Object {
  // === Init context only ===
  // -------------------------
  /**
    * Opens a file, reading all its contents into memory.
    * https://docs.k6.io/docs/open-filepath-mode
    * @param filePath - Path to file.
    * @returns File contents decoded as UTF-8.
    * @public
    */
  def apply(filePath: String): String = js.native
}

