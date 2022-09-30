package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListrTask.
  *
  * Defines the task, conditions and options to run a specific task in the listr.
  */
trait ListrTask[Ctx, Renderer /* <: ListrRendererFactory */] extends StObject {
  
  /**
    * Enable a task depending on the context.
    *
    * The function that has been passed in will be evaluated at the initial creation of the Listr class for rendering purposes,
    * as well as re-evaluated when the time for that specific task has come.
    */
  var enabled: js.UndefOr[Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])] = js.undefined
  
  /**
    * Set exit on the error option from task-level instead of setting it for all the subtasks.
    */
  var exitOnError: js.UndefOr[Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])] = js.undefined
  
  /**
    * Per task options, that depends on the selected renderer.
    *
    * These options depend on the implementation of the selected renderer. If the selected renderer has no options it will
    * be displayed as never.
    */
  var options: js.UndefOr[ListrGetRendererTaskOptions[Renderer]] = js.undefined
  
  /**
    * Adds the given number of retry attempts to the task if the task fails.
    */
  var retry: js.UndefOr[Double] = js.undefined
  
  /**
    * Runs a specific event if the current task or any of the subtasks has failed.
    *
    * Mostly useful for rollback purposes for subtasks.
    * But can also be useful whenever a task is failed and some measures have to be taken to ensure the state is not changed.
    */
  var rollback: js.UndefOr[
    js.Function2[/* ctx */ Ctx, /* task */ TaskWrapper[Ctx, Renderer], Unit | ListrTaskResult[Ctx]]
  ] = js.undefined
  
  /**
    * Skip this task depending on the context.
    *
    * The function that has been passed in will be evaluated at the runtime when the task tries to initially run.
    */
  var skip: js.UndefOr[
    Boolean | String | (js.Function1[/* ctx */ Ctx, Boolean | String | (js.Promise[Boolean | String])])
  ] = js.undefined
  
  /**
    * The task itself.
    *
    * Task can be a sync or async function, an Observable, or a Stream.
    * Task will be executed, if the certain criteria of the state are met and whenever the time for that specific task has come.
    */
  def task(ctx: Ctx, task: TaskWrapper[Ctx, Renderer]): Unit | ListrTaskResult[Ctx]
  
  /**
    * Title of the task.
    *
    * Give this task a title if you want to track it by name in the current renderer.
    *
    * Tasks without a title will hide in the default renderer and are useful for running a background instance.
    * On verbose renderer, state changes from these tasks will log as 'Task without a title.'
    */
  var title: js.UndefOr[String] = js.undefined
}
object ListrTask {
  
  inline def apply[Ctx, Renderer /* <: ListrRendererFactory */](task: (Ctx, TaskWrapper[Ctx, Renderer]) => Unit | ListrTaskResult[Ctx]): ListrTask[Ctx, Renderer] = {
    val __obj = js.Dynamic.literal(task = js.Any.fromFunction2(task))
    __obj.asInstanceOf[ListrTask[Ctx, Renderer]]
  }
  
  extension [Self <: ListrTask[?, ?], Ctx, Renderer /* <: ListrRendererFactory */](x: Self & (ListrTask[Ctx, Renderer])) {
    
    inline def setEnabled(value: Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledFunction1(value: /* ctx */ Ctx => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExitOnError(value: Boolean | (js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean]])): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
    
    inline def setExitOnErrorFunction1(value: /* ctx */ Ctx => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "exitOnError", js.Any.fromFunction1(value))
    
    inline def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
    
    inline def setOptions(value: ListrGetRendererTaskOptions[Renderer]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setRollback(value: (/* ctx */ Ctx, /* task */ TaskWrapper[Ctx, Renderer]) => Unit | ListrTaskResult[Ctx]): Self = StObject.set(x, "rollback", js.Any.fromFunction2(value))
    
    inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
    
    inline def setSkip(
      value: Boolean | String | (js.Function1[/* ctx */ Ctx, Boolean | String | (js.Promise[Boolean | String])])
    ): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipFunction1(value: /* ctx */ Ctx => Boolean | String | (js.Promise[Boolean | String])): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setTask(value: (Ctx, TaskWrapper[Ctx, Renderer]) => Unit | ListrTaskResult[Ctx]): Self = StObject.set(x, "task", js.Any.fromFunction2(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
