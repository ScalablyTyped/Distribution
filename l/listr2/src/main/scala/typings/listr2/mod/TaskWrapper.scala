package typings.listr2.mod

import typings.listr2.anon.Count
import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Booleans.`true`
import typings.listr2.listr2Strings.enabled
import typings.listr2.listr2Strings.skip
import typings.node.NodeJS.WritableStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extend the task to have more functionality while accessing from the outside.
  */
@js.native
trait TaskWrapper[Ctx, Renderer /* <: ListrRendererFactory */] extends StObject {
  
  /** Cancels the current prompt attach to this task. */
  def cancelPrompt(): Unit = js.native
  def cancelPrompt(throwError: Boolean): Unit = js.native
  
  var errors: js.Array[ListrError[Ctx]] = js.native
  
  /** Get the number of retrying, else returns false */
  def isRetrying(): js.UndefOr[Count] = js.native
  
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
  /** Create a new subtask with given renderer selection from the parent task. */
  def newListr[NewCtx](task: ListrTask[NewCtx, Renderer]): Listr[NewCtx, Any, Any] = js.native
  def newListr[NewCtx](task: ListrTask[NewCtx, Renderer], options: ListrSubClassOptions[NewCtx, Renderer]): Listr[NewCtx, Any, Any] = js.native
  
  /* private */ var options: Any = js.native
  
  /** Get the output from the output channel. */
  def output: String = js.native
  /** Send a output to the output channel. */
  def output_=(data: String): Unit = js.native
  
  /**
    * Create a new Enquirer prompt using prompt options.
    *
    * Since process.stdout is controlled by Listr, this will passthrough all Enquirer data through internal stdout.
    */
  @JSName("prompt")
  def prompt_false[T](options: PromptOptions[`false`]): js.Promise[T] = js.native
  @JSName("prompt")
  def prompt_true[T](options: js.Array[PromptOptions[`true`]]): js.Promise[T] = js.native
  
  /** Report a error in process for error collection. */
  def report(error: js.Error, `type`: ListrErrorTypes): Unit = js.native
  
  /** Run this task. */
  def run(ctx: Ctx): js.Promise[Unit] = js.native
  
  /** Skip current task. */
  def skip(): Unit = js.native
  def skip(message: String): Unit = js.native
  
  /**
    * Pass stream of data to internal stdout.
    *
    * Since Listr2 takes control of process.stdout utilizing the default renderer, any data outputted to process.stdout
    * will corrupt its looks.
    *
    * This returns a fake stream to pass any stream inside Listr as task data.
    */
  def stdout(): WriteStream & WritableStream = js.native
  
  var task: Task[Ctx, ListrRendererFactory] = js.native
  
  /** Get the title of the current task. */
  def title: String = js.native
  /** Change the title of the current task. */
  def title_=(data: String): Unit = js.native
}
