package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates and handles a runnable instance of the Task.
  */
@js.native
trait Task[Ctx, Renderer /* <: ListrRendererFactory */] extends ListrTaskEventManager {
  
  /**
    * Checks whether the current task with the given context should be set as enabled.
    */
  def check(ctx: Ctx): js.Promise[Boolean] = js.native
  
  /* private */ var close: Any = js.native
  
  /** Marks the task as closed. This is different from finalized since this is not really related to task itself. */
  /* private */ var closed: Any = js.native
  
  /** Enable flag of this task. */
  /* private */ var enabled: Any = js.native
  
  /** Returns whether this task has been failed. */
  def hasFailed(): Boolean = js.native
  
  /** Returns whether this task is finalized in someform. */
  def hasFinalized(): Boolean = js.native
  
  /** Returns whether this task has some kind of reset like retry and rollback going on. */
  def hasReset(): Boolean = js.native
  
  /** Returns whether the rollback action was successful. */
  def hasRolledBack(): Boolean = js.native
  
  /** Returns whether this task has subtasks. */
  def hasSubtasks(): Boolean = js.native
  
  /** Returns whether this task actually has a title. */
  def hasTitle(): Boolean = js.native
  
  /** Unique id per task, can be used for identifying a Task. */
  var id: String = js.native
  
  /** Initial/Untouched version of the title for using whenever task has a reset. */
  val initialTitle: js.UndefOr[String] = js.native
  
  /** Returns whether this task is closed. */
  def isClosed(): Boolean = js.native
  
  /** Returns whether this task has been completed. */
  def isCompleted(): Boolean = js.native
  
  /** Returns whether enabled function resolves to true. */
  def isEnabled(): Boolean = js.native
  
  /** Returns whether this task is currently paused. */
  def isPaused(): Boolean = js.native
  
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
  
  /** Returns whether this task has started. */
  def isStarted(): Boolean = js.native
  
  var listr: Listr[Ctx, Any, Any] = js.native
  
  /**
    * A channel for messages.
    *
    * This requires a separate channel for messages like error, skip or runtime messages to further utilize in the renderers.
    */
  var message: ListrTaskMessage = js.native
  
  /**
    * Update or extend the current message of the Task and emit the neccassary events.
    */
  @JSName("message$")
  def message$_=(data: ListrTaskMessage): Unit = js.native
  
  var options: ListrOptions[ListrContext] = js.native
  
  /** Output channel for the task. */
  var output: js.UndefOr[String] = js.native
  
  /**
    * Update the current output of the Task and emit the neccassary events.
    */
  @JSName("output$")
  def output$_=(data: String): Unit = js.native
  
  /** Parent task of the current task. */
  var parent: js.UndefOr[Task[Ctx, Renderer]] = js.native
  
  /**
    * Current task path in the hierarchy.
    */
  def path: js.Array[String] = js.native
  
  /** Pause the given task for certain time. */
  def pause(time: Double): js.Promise[Unit] = js.native
  
  /** Current prompt instance or prompt error whenever the task is prompting. */
  var prompt: ListrTaskPrompt = js.native
  
  /**
    * Update the current prompt output of the Task and emit the neccassary events.
    */
  @JSName("promptOutput$")
  def promptOutput$_=(data: String): Unit = js.native
  
  var rendererOptions: ListrGetRendererOptions[Renderer] = js.native
  
  /** Per-task options for the current renderer of the task. */
  var rendererTaskOptions: ListrGetRendererTaskOptions[Renderer] = js.native
  
  /** Current state of the retry process whenever the task is retrying. */
  var retry: js.UndefOr[ListrTaskRetry] = js.native
  
  /** Run the current task. */
  def run(context: Ctx, wrapper: TaskWrapper[Ctx, Renderer]): js.Promise[Unit] = js.native
  
  /** The current state of the task. */
  var state: ListrTaskState = js.native
  
  /**
    * Update the current state of the Task and emit the neccassary events.
    */
  @JSName("state$")
  def state$_=(state: ListrTaskState): Unit = js.native
  
  /** Subtasks of the current task. */
  var subtasks: js.Array[Task[Ctx, Renderer]] = js.native
  
  var task: ListrTask[Ctx, Any] = js.native
  
  /** User provided Task callback function to run. */
  /* private */ var taskFn: Any = js.native
  
  /** Title of the task. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Update the current title of the Task and emit the neccassary events.
    */
  @JSName("title$")
  def title$_=(title: String): Unit = js.native
}
