package typings.listr2.mod

import typings.listr2.anon.Enquirer
import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Strings.full
import typings.listr2.listr2Strings.minimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to set the behavior of this base task.
  */
trait ListrOptions[Ctx] extends StObject {
  
  /**
    * Collects errors to `ListrInstance.errors`
    *
    * This can take up a lot of memory, so disabling it can fix out-of-memory errors
    *
    * - 'full' will clone the current context and task in to the error instance
    * - 'minimal' will only collect the error message and the location
    * - false will collect no errors
    *
    * @default 'minimal'
    */
  var collectErrors: js.UndefOr[`false` | minimal | full] = js.undefined
  
  /**
    * Concurrency sets how many tasks will be run at the same time in parallel.
    *
    * @default false > Default is to run everything synchronously.
    *
    * `true` will set it to `Infinity`, `false` will set it to synchronous.
    *
    * If you pass in a `number` it will limit it to that number.
    */
  var concurrent: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * To inject a context through this options wrapper. Context can also be defined in run time.
    *
    * @default {}
    */
  var ctx: js.UndefOr[Ctx] = js.undefined
  
  /**
    * Disabling the color, useful for tests and such.
    *
    * @default false
    */
  var disableColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the behavior of exiting after rollback actions.
    *
    * This is independent of exitOnError, since failure of a rollback can be a more critical operation comparing to
    * failing a single task.
    *
    * @default true > exit after rolling back tasks
    */
  var exitAfterRollback: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the default behavior of exiting on errors.
    *
    * @default true > exit on any error coming from the tasks.
    */
  var exitOnError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Inject data directly to TaskWrapper.
    */
  var injectWrapper: js.UndefOr[Enquirer] = js.undefined
  
  /**
    * By default, Listr2 will track SIGINIT signal to update the renderer one last time before completely failing.
    *
    * @default true
    */
  var registerSignalListeners: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determine the certain condition required to use the non-TTY renderer.
    *
    * @default null > handled internally
    */
  var rendererFallback: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  
  /**
    * Determine the certain condition required to use the silent renderer.
    *
    * @default null > handled internally
    */
  var rendererSilent: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
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
    
    inline def setInjectWrapper(value: Enquirer): Self = StObject.set(x, "injectWrapper", value.asInstanceOf[js.Any])
    
    inline def setInjectWrapperUndefined: Self = StObject.set(x, "injectWrapper", js.undefined)
    
    inline def setRegisterSignalListeners(value: Boolean): Self = StObject.set(x, "registerSignalListeners", value.asInstanceOf[js.Any])
    
    inline def setRegisterSignalListenersUndefined: Self = StObject.set(x, "registerSignalListeners", js.undefined)
    
    inline def setRendererFallback(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "rendererFallback", value.asInstanceOf[js.Any])
    
    inline def setRendererFallbackFunction0(value: () => Boolean): Self = StObject.set(x, "rendererFallback", js.Any.fromFunction0(value))
    
    inline def setRendererFallbackUndefined: Self = StObject.set(x, "rendererFallback", js.undefined)
    
    inline def setRendererSilent(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "rendererSilent", value.asInstanceOf[js.Any])
    
    inline def setRendererSilentFunction0(value: () => Boolean): Self = StObject.set(x, "rendererSilent", js.Any.fromFunction0(value))
    
    inline def setRendererSilentUndefined: Self = StObject.set(x, "rendererSilent", js.undefined)
  }
}
