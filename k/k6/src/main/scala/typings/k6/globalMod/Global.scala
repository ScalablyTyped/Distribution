package typings.k6.globalMod

import org.scalablytyped.runtime.StringDictionary
import typings.k6.k6Mod.bytes
import typings.k6.k6Strings.b
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Available without importing
@JSGlobalScope
@js.native
object Global extends js.Object {
  /**
    * Current iteration number.
    * https://docs.k6.io/docs/execution-context-variables
    * @public
    */
  val __ITER: Double = js.native
  /**
    * Current VU number.
    * https://docs.k6.io/docs/execution-context-variables
    * @public
    */
  val __VU: Double = js.native
  // === VU logic only ===
  // ---------------------
  /**
    * Interface to system console.
    * @public
    */
  var console: Console = js.native
  // === Init context only ===
  // -------------------------
  /**
    * Opens a file, reading all its contents into memory.
    * https://docs.k6.io/docs/open-filepath-mode
    * @param filePath - Path to file.
    * @returns File contents decoded as UTF-8.
    * @public
    */
  def open(filePath: String): String = js.native
  /**
    * Opens a file, reading all its contents into memory.
    * https://docs.k6.io/docs/open-filepath-mode
    * @param filePath - Path to file.
    * @returns Binary file contents.
    * @public
    */
  @JSName("open")
  def open_b(filePath: String, mode: b): bytes = js.native
  // === Init context and VU logic ===
  // ---------------------------------
  /**
    * Environment variables.
    * https://docs.k6.io/docs/environment-variables
    * @public
    */
  @js.native
  object __ENV extends /* name */ StringDictionary[String]
  
}

