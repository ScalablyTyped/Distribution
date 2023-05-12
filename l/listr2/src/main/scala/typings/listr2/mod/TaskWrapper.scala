package typings.listr2.mod

import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Booleans.`true`
import typings.listr2.listr2Strings.enabled
import typings.listr2.listr2Strings.skip
import typings.listr2.mod.ListrTaskEventType.OUTPUT
import typings.listr2.mod.ListrTaskEventType.PROMPT
import typings.node.NodeJS.WritableStream
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The original Task that is defined by the user is wrapped with the TaskWrapper to provide additional functionality.
  *
  * @see {@link https://listr2.kilic.dev/task/task.html}
  */
@js.native
trait TaskWrapper[Ctx, Renderer /* <: ListrRendererFactory */] extends StObject {
  
  /**
    * Cancel the current active prompt, if there is any.
    *
    * @see {@link https://listr2.kilic.dev/task/prompt.html}
    */
  def cancelPrompt(): Unit = js.native
  def cancelPrompt(options: PromptCancelOptions): Unit = js.native
  
  /**
    * Check whether this task is currently in a retry state.
    *
    * @see {@link https://listr2.kilic.dev/task/retry.html}
    */
  def isRetrying(): js.UndefOr[ListrTaskRetry] = js.native
  
  def newListr[NewCtx](task: js.Array[ListrTask[NewCtx, Renderer]]): Listr[NewCtx, Any, Any] = js.native
  def newListr[NewCtx](task: js.Array[ListrTask[NewCtx, Renderer]], options: ListrSubClassOptions[NewCtx, Renderer]): Listr[NewCtx, Any, Any] = js.native
  def newListr[NewCtx](
    task: js.Function1[
      /* parent */ Omit[this.type, skip | enabled], 
      (ListrTask[NewCtx, Renderer]) | (js.Array[ListrTask[NewCtx, Renderer]])
    ]
  ): Listr[NewCtx, Any, Any] = js.native
  def newListr[NewCtx](
    task: js.Function1[
      /* parent */ Omit[this.type, skip | enabled], 
      (ListrTask[NewCtx, Renderer]) | (js.Array[ListrTask[NewCtx, Renderer]])
    ],
    options: ListrSubClassOptions[NewCtx, Renderer]
  ): Listr[NewCtx, Any, Any] = js.native
  /**
    * Creates a new set of Listr subtasks.
    *
    * @see {@link https://listr2.kilic.dev/task/subtasks.html}
    */
  def newListr[NewCtx](task: ListrTask[NewCtx, Renderer]): Listr[NewCtx, Any, Any] = js.native
  def newListr[NewCtx](task: ListrTask[NewCtx, Renderer], options: ListrSubClassOptions[NewCtx, Renderer]): Listr[NewCtx, Any, Any] = js.native
  
  /* private */ var options: Any = js.native
  
  def output: String = js.native
  /**
    * Send output from the current task to the renderer.
    *
    * @see {@link https://listr2.kilic.dev/task/output.html}
    */
  def output_=(output: String | js.Array[Any]): Unit = js.native
  
  /** Send an output to the output channel as prompt. */
  /* private */ def promptOutput_=(value: Any): Unit = js.native
  
  /**
    * Create a new prompt for getting user input through `enquirer`.
    *
    * - `enquirer` is a optional peer dependency and has to be already installed separately.
    *
    * @see {@link https://listr2.kilic.dev/task/prompt.html}
    */
  @JSName("prompt")
  def prompt_false[T](options: PromptOptions[`false`]): js.Promise[T] = js.native
  @JSName("prompt")
  def prompt_true[T](options: js.Array[PromptOptions[`true`]]): js.Promise[T] = js.native
  
  /**
    * Report an error that has to be collected and handled.
    *
    * @see {@link https://listr2.kilic.dev/task/error-handling.html}
    */
  def report(error: js.Error, `type`: ListrErrorTypes): Unit = js.native
  
  /** Run this task. */
  def run(ctx: Ctx): js.Promise[Unit] = js.native
  
  /**
    * Skip the current task.
    *
    * @see {@link https://listr2.kilic.dev/task/skip.html}
    */
  def skip(message: String, metadata: Any*): Unit = js.native
  def skip(message: Unit, metadata: Any*): Unit = js.native
  
  /**
    * Generates a fake stdout for your use case, where it will be tunnelled through Listr to handle the rendering process.
    *
    * @see {@link https://listr2.kilic.dev/renderer/process-output.html}
    */
  def stdout(): WritableStream = js.native
  def stdout(`type`: OUTPUT): WritableStream = js.native
  def stdout(`type`: PROMPT): WritableStream = js.native
  
  var task: Task[Ctx, ListrRendererFactory] = js.native
  
  def title: String = js.native
  /**
    * Title of the current task.
    *
    * @see {@link https://listr2.kilic.dev/task/title.html}
    */
  def title_=(title: String | js.Array[Any]): Unit = js.native
}
