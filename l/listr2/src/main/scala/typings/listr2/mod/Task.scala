package typings.listr2.mod

import typings.listr2.anon.Count
import typings.listr2.anon.Duration
import typings.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a task from the given set of variables and make it runnable.
  */
@js.native
trait Task[Ctx, Renderer /* <: ListrRendererFactory */] extends Subject[ListrEvent] {
  
  /**
    * A function to check whether this task should run at all via enable.
    */
  def check(ctx: Ctx): js.Promise[Unit] = js.native
  
  /* private */ var enabled: Any = js.native
  
  /* private */ var enabledFn: Any = js.native
  
  /** Returns whether this task has been failed. */
  def hasFailed(): Boolean = js.native
  
  /** Returns whether the rollback action was successful. */
  def hasRolledBack(): Boolean = js.native
  
  /** Returns whether this task has subtasks. */
  def hasSubtasks(): Boolean = js.native
  
  /** Returns whether this task actually has a title. */
  def hasTitle(): Boolean = js.native
  
  /** Unique id per task, randomly generated in the uuid v4 format */
  var id: String = js.native
  
  /** Untouched unchanged title of the task */
  var initialTitle: js.UndefOr[String] = js.native
  
  /** Returns whether this task has been completed. */
  def isCompleted(): Boolean = js.native
  
  /** Returns whether enabled function resolves to true. */
  def isEnabled(): Boolean = js.native
  
  /** Returns whether this task is in progress. */
  def isPending(): Boolean = js.native
  
  /** Returns whether this task has a prompt inside. */
  def isPrompt(): Boolean = js.native
  
  /** Returns whether this task has an actively retrying task going on. */
  def isRetrying(): Boolean = js.native
  
  /** Returns whether this task has an active rollback task going on. */
  def isRollingBack(): Boolean = js.native
  
  /** Returns whether this task is skipped. */
  def isSkipped(): Boolean = js.native
  
  var listr: Listr[Ctx, Any, Any] = js.native
  
  /**
    * A channel for messages.
    *
    * This requires a separate channel for messages like error, skip or runtime messages to further utilize in the renderers.
    */
  var message: Duration = js.native
  
  @JSName("message$")
  def message$_=(data: Duration): Unit = js.native
  
  var options: ListrOptions[ListrContext] = js.native
  
  /** Output data from the task. */
  var output: js.UndefOr[String] = js.native
  
  @JSName("output$")
  def output$_=(data: String): Unit = js.native
  
  var prompt: js.UndefOr[PromptInstance | PromptError] = js.native
  
  /** This will be triggered each time a new render should happen. */
  @JSName("renderHook$")
  var renderHook$: Subject[Unit] = js.native
  
  var rendererOptions: ListrGetRendererOptions[Renderer] = js.native
  
  /** Per task options for the current renderer of the task. */
  var rendererTaskOptions: ListrGetRendererTaskOptions[Renderer] = js.native
  
  /** Current retry number of the task if retrying */
  var retry: js.UndefOr[Count] = js.native
  
  /** Run the current task. */
  def run(context: Ctx, wrapper: TaskWrapper[Ctx, Renderer]): js.Promise[Unit] = js.native
  
  /** Skip current task. */
  var skip: Boolean | String | (js.Function1[/* ctx */ Ctx, Boolean | String | (js.Promise[Boolean | String])]) = js.native
  
  /** The current state of the task. */
  var state: String = js.native
  
  @JSName("state$")
  def state$_=(state: ListrTaskState): Unit = js.native
  
  /** Extend current task with multiple subtasks. */
  var subtasks: js.Array[Task[Ctx, Any]] = js.native
  
  /** The task object itself, to further utilize it. */
  def task(ctx: Ctx, task: TaskWrapper[Ctx, Renderer]): Unit | ListrTaskResult[Ctx] = js.native
  
  var tasks: ListrTask[Ctx, Any] = js.native
  
  /** Title of the task */
  var title: js.UndefOr[String] = js.native
  
  @JSName("title$")
  def title$_=(title: String): Unit = js.native
}
