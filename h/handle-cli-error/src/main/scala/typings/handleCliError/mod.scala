package typings.handleCliError

import org.scalablytyped.runtime.StringDictionary
import typings.chalkString.mod.Styles
import typings.handleCliError.anon.OmitOptionsclasses
import typings.handleCliError.handleCliErrorStrings._empty
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
      *   InputError: { exitCode: 1, stack: false },
      *   DatabaseError: { exitCode: 2, stack: false },
      *   default: { exitCode: 3 },
      * })
      * ```
      */
    val classes: js.UndefOr[StringDictionary[OmitOptionsclasses]] = js.undefined
    
    /**
      * Whether to colorize the error's message, stack trace and additional properties.
      *
      * Quoted strings in the error's message are printed in bold (for `"..."` and
      * `'...'`) and in italic (for `` `...` ``).
      *
      * @default `true` in terminals, `false` otherwise
      */
    val colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Process [exit code](https://en.wikipedia.org/wiki/Exit_status).
      *
      * Note: when passing invalid `options`, the exit code is always `125`.
      *
      * @default 1
      */
    val exitCode: js.UndefOr[Double] = js.undefined
    
    /**
      * Color/style of the error's icon and name. The available values are listed
      * [here](https://github.com/ehmicky/chalk-string#available-styles).
      * Several styles can be specified by using spaces.
      * Can be disabled by passing an empty string.
      *
      * @default 'red bold'
      */
    val header: js.UndefOr[Styles | _empty] = js.undefined
    
    /**
      * Icon prepended to the error's name. The available values are listed
      * [here](https://github.com/sindresorhus/figures/blob/main/readme.md#figures-1).
      * Can be disabled by passing an empty string.
      *
      * @default 'cross'
      */
    val icon: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 230, starting with typings.handleCliError.handleCliErrorStrings.tick, typings.handleCliError.handleCliErrorStrings.info, typings.handleCliError.handleCliErrorStrings.warning */ Any
      ] = js.undefined
    
    /**
      * Whether to log the error's additional properties.
      *
      * @default true
      */
    val props: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exits the process without logging anything on the console.
      *
      * @default false
      */
    val silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to log the `error` stack trace.
      *
      * @default true
      */
    val stack: js.UndefOr[Boolean] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: StringDictionary[OmitOptionsclasses]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
      
      inline def setHeader(value: Styles | _empty): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcon(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 230, starting with typings.handleCliError.handleCliErrorStrings.tick, typings.handleCliError.handleCliErrorStrings.info, typings.handleCliError.handleCliErrorStrings.warning */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setProps(value: Boolean): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
