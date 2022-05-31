package typings.k6

import typings.k6.k6Strings.b
import typings.k6.mod.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
    
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
    inline def open(filePath: String): String = js.Dynamic.global.applyDynamic("open")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
    
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
    inline def open_b(filePath: String, mode: b): bytes = (js.Dynamic.global.applyDynamic("open")(filePath.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[bytes]
  }
  
  trait Console extends StObject {
    
    /** Log debug message. */
    def debug(msg: js.Any, fields: js.Any*): Unit
    /** Log debug message. */
    @JSName("debug")
    var debug_Original: Logger
    
    /** Log error message. */
    def error(msg: js.Any, fields: js.Any*): Unit
    /** Log error message. */
    @JSName("error")
    var error_Original: Logger
    
    /** Log informational message. */
    def info(msg: js.Any, fields: js.Any*): Unit
    /** Log informational message. */
    @JSName("info")
    var info_Original: Logger
    
    /** Log message. */
    def log(msg: js.Any, fields: js.Any*): Unit
    /** Log message. */
    @JSName("log")
    var log_Original: Logger
    
    /** Log warning message. */
    def warn(msg: js.Any, fields: js.Any*): Unit
    /** Log warning message. */
    @JSName("warn")
    var warn_Original: Logger
  }
  object Console {
    
    inline def apply(
      debug: (/* msg */ js.Any, /* repeated */ js.Any) => Unit,
      error: (/* msg */ js.Any, /* repeated */ js.Any) => Unit,
      info: (/* msg */ js.Any, /* repeated */ js.Any) => Unit,
      log: (/* msg */ js.Any, /* repeated */ js.Any) => Unit,
      warn: (/* msg */ js.Any, /* repeated */ js.Any) => Unit
    ): Console = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Console]
    }
    
    extension [Self <: Console](x: Self) {
      
      inline def setDebug(value: (/* msg */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setError(value: (/* msg */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setInfo(value: (/* msg */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      inline def setLog(value: (/* msg */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setWarn(value: (/* msg */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Log message procedure.
    */
  type Logger = js.Function2[/* msg */ js.Any, /* repeated */ js.Any, Unit]
}
