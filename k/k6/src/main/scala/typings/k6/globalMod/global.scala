package typings.k6.globalMod

import org.scalablytyped.runtime.StringDictionary
import typings.k6.k6Strings.b
import typings.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Available without importing
@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * Current iteration number.
    * https://k6.io/docs/using-k6/execution-context-variables
    */
  val __ITER: Double = js.native
  
  /**
    * Current VU number.
    * https://k6.io/docs/using-k6/execution-context-variables
    */
  val __VU: Double = js.native
  
  // === VU logic only ===
  // ---------------------
  /**
    * Interface to system console.
    */
  var console: Console = js.native
  
  // === Init context only ===
  // -------------------------
  /**
    * Opens a file, reading all its contents into memory.
    * https://k6.io/docs/javascript-api/init-context/open-filepath-mode
    * @param filePath - Path to file.
    * @returns File contents decoded as UTF-8.
    * @example
    * let binFile = open('/path/to/file.bin', 'b');
    * export default function () {
    * var data = {
    *    field: 'this is a standard form field',
    *    file: http.file(binFile, 'test.bin'),
    *  };
    *  const res = http.post('https://example.com/upload', data);
    *  sleep(3);
    * }
    */
  def open(filePath: String): String = js.native
  /**
    * Opens a file, reading all its contents into memory.
    * https://k6.io/docs/javascript-api/init-context/open-filepath-mode
    * @param filePath - Path to file.
    * @returns Binary file contents.
    * @example
    * let binFile = open('/path/to/file.bin', 'b');
    * export default function () {
    * var data = {
    *    field: 'this is a standard form field',
    *    file: http.file(binFile, 'test.bin'),
    *  };
    *  const res = http.post('https://example.com/upload', data);
    *  sleep(3);
    * }
    */
  @JSName("open")
  def open_b(filePath: String, mode: b): bytes = js.native
  
  // === Init context and VU logic ===
  // ---------------------------------
  /**
    * Environment variables.
    * https://k6.io/docs/using-k6/environment-variables
    */
  @js.native
  object __ENV extends /* name */ StringDictionary[String]
}
