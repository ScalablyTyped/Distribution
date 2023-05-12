package typings.listr2.mod

import typings.listr2.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the task, conditions and options to run a specific task in the Listr.
  * This defines the external API for the task where {@link TaskWrapper} is used internally.
  *
  * @see {@link https://listr2.kilic.dev/task/task.html}
  */
trait ListrTask[Ctx, Renderer /* <: ListrRendererFactory */] extends StObject {
  
  /**
    * Enable a task depending on the context.
    *
    * - The callback function will be evaluated before all the tasks start to check which tasks has been enabled.
    * - The callback function will be evaluated again before the task starts.
    *
    * @see {@link https://listr2.kilic.dev/task/enable.html}
    */
  var enabled: js.UndefOr[Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])] = js.undefined
  
  /**
    * Determine the default behavior of exiting on errors for this attached task.
    */
  var exitOnError: js.UndefOr[Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])] = js.undefined
  
  /**
    * Per-task options, that depends on the selected renderer.
    *
    * - Options of the current preferred renderer can be changed on task level.
    * - These options depend on the implementation of the preferred renderer.
    * - Whenever the preferred renderer has no options it will be displayed as never.
    *
    * **This option will be deprecated in a future major release in favor of having options for both the default and the fallback renderer.**
    */
  var options: js.UndefOr[ListrGetRendererTaskOptions[Renderer]] = js.undefined
  
  /**
    * Retries a task with the given amounts whenever a task fails.
    *
    * @see {@link https://listr2.kilic.dev/task/retry.html}
    */
  var retry: js.UndefOr[Double | Delay] = js.undefined
  
  /**
    * The callback function that you provide will run whenever the attached task fails and
    * give you the ability to revert your changes, before failing.
    *
    * @see {@link https://listr2.kilic.dev/task/rollback.html}
    */
  var rollback: js.UndefOr[ListrTaskFn[Ctx, Renderer]] = js.undefined
  
  /**
    * Skip this task depending on the context.
    *
    * - The callback function will be evaluated once before the task starts.
    *
    * @see {@link https://listr2.kilic.dev/task/skip.html}
    */
  var skip: js.UndefOr[
    Boolean | String | (js.Function1[/* ctx */ Ctx, Boolean | String | (js.Promise[Boolean | String])])
  ] = js.undefined
  
  /**
    * The task itself in the form of a `Function`, `Promise`, `Listr`, `Observable` or `Stream`.
    *
    * - Task will be executed, whenever the provided criterion is met with the current state and whenever the time for that specific task has come.
    *
    * @see {@link https://listr2.kilic.dev/task/task.html}
    */
  def task(ctx: Ctx, task: TaskWrapper[Ctx, Renderer]): Unit | ListrTaskResult[Ctx]
  /**
    * The task itself in the form of a `Function`, `Promise`, `Listr`, `Observable` or `Stream`.
    *
    * - Task will be executed, whenever the provided criterion is met with the current state and whenever the time for that specific task has come.
    *
    * @see {@link https://listr2.kilic.dev/task/task.html}
    */
  @JSName("task")
  var task_Original: ListrTaskFn[Ctx, Renderer]
  
  /**
    * Title of the task.
    *
    * Give this task a title to enchance it on the preferred renderer.
    *
    * - Tasks without a title will be hidden from view in renderers and will act as a background task.
    *
    * @see {@link https://listr2.kilic.dev/task/title.html}
    */
  var title: js.UndefOr[String | js.Array[Any]] = js.undefined
}
object ListrTask {
  
  inline def apply[Ctx, Renderer /* <: ListrRendererFactory */](task: ListrTaskFn[Ctx, Renderer]): ListrTask[Ctx, Renderer] = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrTask[Ctx, Renderer]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrTask[?, ?], Ctx, Renderer /* <: ListrRendererFactory */] (val x: Self & (ListrTask[Ctx, Renderer])) extends AnyVal {
    
    inline def setEnabled(value: Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledFunction1(value: /* ctx */ Ctx => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExitOnError(value: Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
    
    inline def setExitOnErrorFunction1(value: /* ctx */ Ctx => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "exitOnError", js.Any.fromFunction1(value))
    
    inline def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
    
    inline def setOptions(value: ListrGetRendererTaskOptions[Renderer]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRetry(value: Double | Delay): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setRollback(value: ListrTaskFn[Ctx, Renderer]): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
    
    inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
    
    inline def setSkip(
      value: Boolean | String | (js.Function1[/* ctx */ Ctx, Boolean | String | (js.Promise[Boolean | String])])
    ): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipFunction1(value: /* ctx */ Ctx => Boolean | String | (js.Promise[Boolean | String])): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setTask(value: ListrTaskFn[Ctx, Renderer]): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String | js.Array[Any]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: Any*): Self = StObject.set(x, "title", js.Array(value*))
  }
}
