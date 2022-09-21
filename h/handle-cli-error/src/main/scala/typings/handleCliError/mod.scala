package typings.handleCliError

import org.scalablytyped.runtime.StringDictionary
import typings.handleCliError.anon.OmitOptionsclasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("handle-cli-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(error: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(error: Any, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * Specify different options per error class. The object:
      *  - Keys are either the
      *    [`error.name`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/name),
      *    or `"default"` (used if no `error.name` matches)
      *  - Values are options objects
      *
      * @default {}
      *
      * @example
      * ```js
      * handleCliError(error, {
      *   InputError: { exitCode: 1, short: true },
      *   DatabaseError: { exitCode: 2, short: true },
      *   default: { exitCode: 3 },
      * })
      * ```
      */
    val classes: js.UndefOr[StringDictionary[OmitOptionsclasses]] = js.undefined
    
    /**
      * Process [exit code](https://en.wikipedia.org/wiki/Exit_status).
      *
      * Note: when passing invalid `options`, the exit code is always `125`.
      *
      * @default 1
      */
    val exitCode: js.UndefOr[Double] = js.undefined
    
    /**
      * When `true`, only the `error` message is logged, not its stack trace.
      *
      * This is useful when the error was caused by the user (as opposed to being
      * an internal bug), in which cause the stack trace is not relevant to the
      * user.
      *
      * @default false
      */
    val short: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, the `error` is not logged. The process still exits with a
      * specific exit code.
      *
      * @default false
      */
    val silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The process exits gracefully: it waits for any ongoing tasks (callbacks,
      * promises, etc.) to complete, up to a specific `timeout`.
      *
      * Special values:
      *  - `0`: Exits right away, without waiting for ongoing tasks
      *  - `Number.POSITIVE_INFINITY`: Waits for ongoing tasks forever, without
      *    timing out
      *
      * @default 5000
      */
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClasses(value: StringDictionary[OmitOptionsclasses]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
      
      inline def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
