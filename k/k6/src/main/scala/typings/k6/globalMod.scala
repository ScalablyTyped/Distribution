package typings.k6

import typings.k6.k6Strings.b
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  // Available without importing
  object global {
    
    /**
      * Current iteration number.
      * https://k6.io/docs/using-k6/execution-context-variables/
      */
    @JSGlobal("__ITER")
    @js.native
    val __ITER: Double = js.native
    
    // === VU logic only ===
    // ---------------------
    /**
      * Current VU number.
      * https://k6.io/docs/using-k6/execution-context-variables/
      */
    @JSGlobal("__VU")
    @js.native
    val __VU: Double = js.native
    
    // === Init context only ===
    // -------------------------
    /**
      * Opens a file, reading all its contents into memory.
      * https://k6.io/docs/javascript-api/init-context/open-filepath-mode/
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
    inline def open(filePath: String): String = js.Dynamic.global.applyDynamic("open")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Opens a file, reading all its contents into memory.
      * https://k6.io/docs/javascript-api/init-context/open-filepath-mode/
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
    inline def open_b(filePath: String, mode: b): js.typedarray.ArrayBuffer = (js.Dynamic.global.applyDynamic("open")(filePath.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  }
}
