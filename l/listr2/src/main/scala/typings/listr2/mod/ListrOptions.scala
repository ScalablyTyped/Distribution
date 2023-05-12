package typings.listr2.mod

import typings.listr2.anon.Enquirer
import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Strings.full
import typings.listr2.listr2Strings.minimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to set the behavior of Listr.
  */
trait ListrOptions[Ctx] extends StObject {
  
  /**
    * Collects errors inside the `Listr.errors`.
    *
    * - `false` will collect no errors.
    * - `minimal` will only collect the error message and the location.
    * - `full` will clone the current context and task in to the error instance.
    *
    * @defaultValue `false`
    * @see {@link https://listr2.kilic.dev/task/error-handling.html#collected-errors}
    */
  var collectErrors: js.UndefOr[`false` | minimal | full] = js.undefined
  
  /**
    * Concurrency limits how many tasks will be running in parallel.
    *
    * - `false` will only run a single task at a time.
    * - `true` will set it to `Infinity` to run all the tasks in parallel.
    * - Given a `number` it will limit the concurrency to that number.
    *
    * @defaultValue `false`
    */
  var concurrent: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * Inject a context through this options wrapper.
    *
    * @defaultValue `{}`
    * @see {@link https://listr2.kilic.dev/listr/context.html}
    */
  var ctx: js.UndefOr[Ctx] = js.undefined
  
  /**
    * Disable the color output coming from Listr for all renderers.
    *
    * @defaultValue `false`
    */
  var disableColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the behavior of exiting after rollback actions.
    *
    * This is independent of `exitOnError`, since failure of a rollback can be a more critical operation comparing to
    * failing a single task.
    *
    * - `true` will stop the execution whenever a rollback happens.
    * - `false` will continue after successfully recovering from a rollback.
    *
    * @defaultValue `true`
    */
  var exitAfterRollback: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the default behavior of exiting on errors.
    *
    * - `true` will exit the current Listr whenever it encounters an error.
    * - `false` will continue the execution of current Listr if it encounters an error.
    *
    * @defaultValue `true`
    */
  var exitOnError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the certain condition required to use the fallback renderer.
    *
    * @defaultValue handled internally
    */
  var fallbackRendererCondition: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  
  /**
    * Force use color, even though the underlying library detects your current output may not be compatible.
    *
    * @defaultValue `false`
    */
  var forceColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces TTY stdout even though your current output may not be compatible.
    *
    * @defaultValue `false`
    */
  var forceTTY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces unicode icons even though your current output may not be compatible.
    *
    * @defaultValue `false`
    */
  var forceUnicode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Inject data directly to TaskWrapper.
    */
  var injectWrapper: js.UndefOr[Enquirer] = js.undefined
  
  /**
    * Listr will track SIGINIT signal to update the renderer one last time before failing, therefore it needs to
    * register exit listeners.
    *
    * @defaultValue true
    */
  var registerSignalListeners: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the certain condition required to use the silent renderer.
    *
    * @defaultValue handled internally
    */
  var silentRendererCondition: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
}
object ListrOptions {
  
  inline def apply[Ctx](): ListrOptions[Ctx] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrOptions[Ctx]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrOptions[?], Ctx] (val x: Self & ListrOptions[Ctx]) extends AnyVal {
    
    inline def setCollectErrors(value: `false` | minimal | full): Self = StObject.set(x, "collectErrors", value.asInstanceOf[js.Any])
    
    inline def setCollectErrorsUndefined: Self = StObject.set(x, "collectErrors", js.undefined)
    
    inline def setConcurrent(value: Boolean | Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
    
    inline def setCtx(value: Ctx): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    inline def setDisableColor(value: Boolean): Self = StObject.set(x, "disableColor", value.asInstanceOf[js.Any])
    
    inline def setDisableColorUndefined: Self = StObject.set(x, "disableColor", js.undefined)
    
    inline def setExitAfterRollback(value: Boolean): Self = StObject.set(x, "exitAfterRollback", value.asInstanceOf[js.Any])
    
    inline def setExitAfterRollbackUndefined: Self = StObject.set(x, "exitAfterRollback", js.undefined)
    
    inline def setExitOnError(value: Boolean): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
    
    inline def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
    
    inline def setFallbackRendererCondition(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "fallbackRendererCondition", value.asInstanceOf[js.Any])
    
    inline def setFallbackRendererConditionFunction0(value: () => Boolean): Self = StObject.set(x, "fallbackRendererCondition", js.Any.fromFunction0(value))
    
    inline def setFallbackRendererConditionUndefined: Self = StObject.set(x, "fallbackRendererCondition", js.undefined)
    
    inline def setForceColor(value: Boolean): Self = StObject.set(x, "forceColor", value.asInstanceOf[js.Any])
    
    inline def setForceColorUndefined: Self = StObject.set(x, "forceColor", js.undefined)
    
    inline def setForceTTY(value: Boolean): Self = StObject.set(x, "forceTTY", value.asInstanceOf[js.Any])
    
    inline def setForceTTYUndefined: Self = StObject.set(x, "forceTTY", js.undefined)
    
    inline def setForceUnicode(value: Boolean): Self = StObject.set(x, "forceUnicode", value.asInstanceOf[js.Any])
    
    inline def setForceUnicodeUndefined: Self = StObject.set(x, "forceUnicode", js.undefined)
    
    inline def setInjectWrapper(value: Enquirer): Self = StObject.set(x, "injectWrapper", value.asInstanceOf[js.Any])
    
    inline def setInjectWrapperUndefined: Self = StObject.set(x, "injectWrapper", js.undefined)
    
    inline def setRegisterSignalListeners(value: Boolean): Self = StObject.set(x, "registerSignalListeners", value.asInstanceOf[js.Any])
    
    inline def setRegisterSignalListenersUndefined: Self = StObject.set(x, "registerSignalListeners", js.undefined)
    
    inline def setSilentRendererCondition(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "silentRendererCondition", value.asInstanceOf[js.Any])
    
    inline def setSilentRendererConditionFunction0(value: () => Boolean): Self = StObject.set(x, "silentRendererCondition", js.Any.fromFunction0(value))
    
    inline def setSilentRendererConditionUndefined: Self = StObject.set(x, "silentRendererCondition", js.undefined)
  }
}
