package typings.log

import org.scalablytyped.runtime.Shortcut
import typings.log.anon.Restore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("log", JSImport.Namespace)
  @js.native
  val ^ : Logger = js.native
  
  @js.native
  trait LogFunction extends StObject {
    
    /**
      * log doesn't force any specific arguments handling.
      * Still it is recommended to assume printf-like message format, as all currently available writers are setup to support it.
      * Placeholders support reflects one implemented in Node.js [`util.format`](https://nodejs.org/api/util.html#utilformatformat-args).
      *
      * If using placeholders, the first argument is a string containing zero or more placeholder tokens.
      * Each placeholder token is replaced with the converted value from the corresponding argument.
      * Supported placeholders are:
      * * %s - String.
      * * %d - Number (integer or floating point value).
      * * %i - Integer.
      * * %f - Floating point value.
      * * %j - JSON. Replaced with the string '[Circular]' if the argument contains circular references.
      * * %o - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) with options `{ showHidden: true, depth: 4, showProxy: true }`.
      *                This will show the full object including non-enumerable symbols and properties.
      * * %O - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) without options.
      *                This will show the full object not including non-enumerable symbols and properties.
      * * %% - single percent sign ('%'). This does not consume an argument.
      *
      * ```
      * log.info("Log out different things!", 123, { "prop": true })
      * log.info("This uses %i format %s", 2, "placeholders")
      * ```
      */
    def apply(args: Any*): Unit = js.native
    
    /** Dynamically disable log output at runtime */
    def disable(): Restore = js.native
  }
  
  trait Logger extends StObject {
    
    /**
      * log doesn't force any specific arguments handling.
      * Still it is recommended to assume printf-like message format, as all currently available writers are setup to support it.
      * Placeholders support reflects one implemented in Node.js [`util.format`](https://nodejs.org/api/util.html#utilformatformat-args).
      *
      * If using placeholders, the first argument is a string containing zero or more placeholder tokens.
      * Each placeholder token is replaced with the converted value from the corresponding argument.
      * Supported placeholders are:
      * * %s - String.
      * * %d - Number (integer or floating point value).
      * * %i - Integer.
      * * %f - Floating point value.
      * * %j - JSON. Replaced with the string '[Circular]' if the argument contains circular references.
      * * %o - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) with options `{ showHidden: true, depth: 4, showProxy: true }`.
      *                This will show the full object including non-enumerable symbols and properties.
      * * %O - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) without options.
      *                This will show the full object not including non-enumerable symbols and properties.
      * * %% - single percent sign ('%'). This does not consume an argument.
      *
      * ```
      * log.info("Log out different things!", 123, { "prop": true })
      * log.info("This uses %i format %s", 2, "placeholders")
      * ```
      */
    /** debugging information (hidden by default) */
    def debug(args: Any*): Unit
    /** debugging information (hidden by default) */
    @JSName("debug")
    var debug_Original: LogFunction
    
    /**
      * log doesn't force any specific arguments handling.
      * Still it is recommended to assume printf-like message format, as all currently available writers are setup to support it.
      * Placeholders support reflects one implemented in Node.js [`util.format`](https://nodejs.org/api/util.html#utilformatformat-args).
      *
      * If using placeholders, the first argument is a string containing zero or more placeholder tokens.
      * Each placeholder token is replaced with the converted value from the corresponding argument.
      * Supported placeholders are:
      * * %s - String.
      * * %d - Number (integer or floating point value).
      * * %i - Integer.
      * * %f - Floating point value.
      * * %j - JSON. Replaced with the string '[Circular]' if the argument contains circular references.
      * * %o - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) with options `{ showHidden: true, depth: 4, showProxy: true }`.
      *                This will show the full object including non-enumerable symbols and properties.
      * * %O - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) without options.
      *                This will show the full object not including non-enumerable symbols and properties.
      * * %% - single percent sign ('%'). This does not consume an argument.
      *
      * ```
      * log.info("Log out different things!", 123, { "prop": true })
      * log.info("This uses %i format %s", 2, "placeholders")
      * ```
      */
    /** condition error - to notify of errors accompanied with recovery mechanism (hence reported as log and not as uncaught exception) */
    def error(args: Any*): Unit
    /** condition error - to notify of errors accompanied with recovery mechanism (hence reported as log and not as uncaught exception) */
    @JSName("error")
    var error_Original: LogFunction
    
    /** Get namespaced logger (debug lib style) */
    def get(namespace: String): Logger
    
    /**
      * log doesn't force any specific arguments handling.
      * Still it is recommended to assume printf-like message format, as all currently available writers are setup to support it.
      * Placeholders support reflects one implemented in Node.js [`util.format`](https://nodejs.org/api/util.html#utilformatformat-args).
      *
      * If using placeholders, the first argument is a string containing zero or more placeholder tokens.
      * Each placeholder token is replaced with the converted value from the corresponding argument.
      * Supported placeholders are:
      * * %s - String.
      * * %d - Number (integer or floating point value).
      * * %i - Integer.
      * * %f - Floating point value.
      * * %j - JSON. Replaced with the string '[Circular]' if the argument contains circular references.
      * * %o - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) with options `{ showHidden: true, depth: 4, showProxy: true }`.
      *                This will show the full object including non-enumerable symbols and properties.
      * * %O - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) without options.
      *                This will show the full object not including non-enumerable symbols and properties.
      * * %% - single percent sign ('%'). This does not consume an argument.
      *
      * ```
      * log.info("Log out different things!", 123, { "prop": true })
      * log.info("This uses %i format %s", 2, "placeholders")
      * ```
      */
    /** a purely informational message (hidden by default) */
    def info(args: Any*): Unit
    /** a purely informational message (hidden by default) */
    @JSName("info")
    var info_Original: LogFunction
    
    /**
      * log doesn't force any specific arguments handling.
      * Still it is recommended to assume printf-like message format, as all currently available writers are setup to support it.
      * Placeholders support reflects one implemented in Node.js [`util.format`](https://nodejs.org/api/util.html#utilformatformat-args).
      *
      * If using placeholders, the first argument is a string containing zero or more placeholder tokens.
      * Each placeholder token is replaced with the converted value from the corresponding argument.
      * Supported placeholders are:
      * * %s - String.
      * * %d - Number (integer or floating point value).
      * * %i - Integer.
      * * %f - Floating point value.
      * * %j - JSON. Replaced with the string '[Circular]' if the argument contains circular references.
      * * %o - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) with options `{ showHidden: true, depth: 4, showProxy: true }`.
      *                This will show the full object including non-enumerable symbols and properties.
      * * %O - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) without options.
      *                This will show the full object not including non-enumerable symbols and properties.
      * * %% - single percent sign ('%'). This does not consume an argument.
      *
      * ```
      * log.info("Log out different things!", 123, { "prop": true })
      * log.info("This uses %i format %s", 2, "placeholders")
      * ```
      */
    /** condition normal, but significant */
    def notice(args: Any*): Unit
    /** condition normal, but significant */
    @JSName("notice")
    var notice_Original: LogFunction
    
    /**
      * log doesn't force any specific arguments handling.
      * Still it is recommended to assume printf-like message format, as all currently available writers are setup to support it.
      * Placeholders support reflects one implemented in Node.js [`util.format`](https://nodejs.org/api/util.html#utilformatformat-args).
      *
      * If using placeholders, the first argument is a string containing zero or more placeholder tokens.
      * Each placeholder token is replaced with the converted value from the corresponding argument.
      * Supported placeholders are:
      * * %s - String.
      * * %d - Number (integer or floating point value).
      * * %i - Integer.
      * * %f - Floating point value.
      * * %j - JSON. Replaced with the string '[Circular]' if the argument contains circular references.
      * * %o - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) with options `{ showHidden: true, depth: 4, showProxy: true }`.
      *                This will show the full object including non-enumerable symbols and properties.
      * * %O - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) without options.
      *                This will show the full object not including non-enumerable symbols and properties.
      * * %% - single percent sign ('%'). This does not consume an argument.
      *
      * ```
      * log.info("Log out different things!", 123, { "prop": true })
      * log.info("This uses %i format %s", 2, "placeholders")
      * ```
      */
    /** @see warning */
    def warn(args: Any*): Unit
    /** @see warning */
    @JSName("warn")
    var warn_Original: LogFunction
    
    /**
      * log doesn't force any specific arguments handling.
      * Still it is recommended to assume printf-like message format, as all currently available writers are setup to support it.
      * Placeholders support reflects one implemented in Node.js [`util.format`](https://nodejs.org/api/util.html#utilformatformat-args).
      *
      * If using placeholders, the first argument is a string containing zero or more placeholder tokens.
      * Each placeholder token is replaced with the converted value from the corresponding argument.
      * Supported placeholders are:
      * * %s - String.
      * * %d - Number (integer or floating point value).
      * * %i - Integer.
      * * %f - Floating point value.
      * * %j - JSON. Replaced with the string '[Circular]' if the argument contains circular references.
      * * %o - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) with options `{ showHidden: true, depth: 4, showProxy: true }`.
      *                This will show the full object including non-enumerable symbols and properties.
      * * %O - Object. A string representation of an object with generic JavaScript object formatting.
      *                Similar to [`util.inspect`](https://nodejs.org/api/util.html#utilinspectobject-options) without options.
      *                This will show the full object not including non-enumerable symbols and properties.
      * * %% - single percent sign ('%'). This does not consume an argument.
      *
      * ```
      * log.info("Log out different things!", 123, { "prop": true })
      * log.info("This uses %i format %s", 2, "placeholders")
      * ```
      */
    /** condition warning */
    def warning(args: Any*): Unit
    /** condition warning */
    @JSName("warning")
    var warning_Original: LogFunction
  }
  object Logger {
    
    inline def apply(
      debug: LogFunction,
      error: LogFunction,
      get: String => Logger,
      info: LogFunction,
      notice: LogFunction,
      warn: LogFunction,
      warning: LogFunction
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: LogFunction): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: LogFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => Logger): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setInfo(value: LogFunction): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: LogFunction): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: LogFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: LogFunction): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Logger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Logger = ^
}
