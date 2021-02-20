package typings.k6

import typings.k6.k6Strings.b
import typings.k6.mod.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  // Available without importing
  object global {
    
    /**
      * Current iteration number.
      * https://k6.io/docs/using-k6/execution-context-variables
      */
    @JSGlobal("__ITER")
    @js.native
    val __ITER: Double = js.native
    
    /**
      * Current VU number.
      * https://k6.io/docs/using-k6/execution-context-variables
      */
    @JSGlobal("__VU")
    @js.native
    val __VU: Double = js.native
    
    // === VU logic only ===
    // ---------------------
    /**
      * Interface to system console.
      */
    @JSGlobal("console")
    @js.native
    def console: Console = js.native
    @scala.inline
    def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
    
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
    @JSGlobal("open")
    @js.native
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
    @JSGlobal("open")
    @js.native
    def open_b(filePath: String, mode: b): bytes = js.native
    
    // === Init context and VU logic ===
    // ---------------------------------
    /**
      * Environment variables.
      * https://k6.io/docs/using-k6/environment-variables
      */
    object __ENV
  }
  
  @js.native
  trait Console extends StObject {
    
    /** Log debug message. */
    def debug(msg: js.Any, fields: js.Any*): Unit = js.native
    /** Log debug message. */
    @JSName("debug")
    var debug_Original: Logger = js.native
    
    /** Log error message. */
    def error(msg: js.Any, fields: js.Any*): Unit = js.native
    /** Log error message. */
    @JSName("error")
    var error_Original: Logger = js.native
    
    /** Log informational message. */
    def info(msg: js.Any, fields: js.Any*): Unit = js.native
    /** Log informational message. */
    @JSName("info")
    var info_Original: Logger = js.native
    
    /** Log message. */
    def log(msg: js.Any, fields: js.Any*): Unit = js.native
    /** Log message. */
    @JSName("log")
    var log_Original: Logger = js.native
    
    /** Log warning message. */
    def warn(msg: js.Any, fields: js.Any*): Unit = js.native
    /** Log warning message. */
    @JSName("warn")
    var warn_Original: Logger = js.native
  }
  
  /**
    * Log message procedure.
    */
  type Logger = js.Function2[/* msg */ js.Any, /* repeated */ js.Any, Unit]
}
