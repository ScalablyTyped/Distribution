package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new task list with Listr.
  *
  * @see {@link https://listr2.kilic.dev/listr/listr.html}
  */
@JSImport("listr2", "Listr")
@js.native
open class Listr[Ctx, Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */] protected () extends StObject {
  def this(task: js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]]) = this()
  def this(task: ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]) = this()
  def this(
    task: js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]],
    options: ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer]
  ) = this()
  def this(
    task: ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]],
    options: ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer]
  ) = this()
  def this(
    task: js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]],
    options: Unit,
    parentTask: Task[Any, Any]
  ) = this()
  def this(
    task: js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]],
    options: ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer],
    parentTask: Task[Any, Any]
  ) = this()
  def this(
    task: ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]],
    options: Unit,
    parentTask: Task[Any, Any]
  ) = this()
  def this(
    task: ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]],
    options: ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer],
    parentTask: Task[Any, Any]
  ) = this()
  
  def add(tasks: js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]]): Unit = js.native
  def add(tasks: ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]): Unit = js.native
  
  /* private */ var concurrency: Any = js.native
  
  var ctx: Ctx = js.native
  
  var errors: js.Array[ListrError[Ctx]] = js.native
  
  var events: ListrEventManager = js.native
  
  /* private */ var generate: Any = js.native
  
  var options: js.UndefOr[ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer]] = js.native
  
  var parentTask: js.UndefOr[Task[Any, Any]] = js.native
  
  var path: js.Array[String] = js.native
  
  /* private */ var renderer: Any = js.native
  
  var rendererClass: ListrRendererFactory = js.native
  
  var rendererClassOptions: ListrGetRendererOptions[ListrRendererFactory] = js.native
  
  def run(): js.Promise[Ctx] = js.native
  def run(context: Ctx): js.Promise[Ctx] = js.native
  
  /* private */ var runTask: Any = js.native
  
  var task: (ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]) | (js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]]) = js.native
  
  var tasks: js.Array[Task[Ctx, ListrGetRendererClassFromValue[Renderer]]] = js.native
}
