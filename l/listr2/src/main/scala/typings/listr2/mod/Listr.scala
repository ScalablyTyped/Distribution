package typings.listr2.mod

import typings.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new set of Listr2 task list.
  */
@JSImport("listr2", "Listr")
@js.native
open class Listr[Ctx /* <: ListrContext */, Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */] protected () extends StObject {
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
  
  def add(task: js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]]): Unit = js.native
  def add(task: ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]): Unit = js.native
  
  /* private */ var checkAll: Any = js.native
  
  /* private */ var concurrency: Any = js.native
  
  var ctx: Ctx = js.native
  
  var err: js.Array[ListrError[Ctx]] = js.native
  
  var options: js.UndefOr[ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer]] = js.native
  
  var parentTask: js.UndefOr[Task[Any, Any]] = js.native
  
  var path: js.Array[String] = js.native
  
  @JSName("renderHook$")
  var renderHook$: Subject[Unit] = js.native
  
  /* private */ var renderer: Any = js.native
  
  var rendererClass: ListrRendererFactory = js.native
  
  var rendererClassOptions: ListrGetRendererOptions[ListrRendererFactory] = js.native
  
  def run(): js.Promise[Ctx] = js.native
  def run(context: Ctx): js.Promise[Ctx] = js.native
  
  /* private */ var runTask: Any = js.native
  
  var task: (ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]) | (js.Array[ListrTask[Ctx, ListrGetRendererClassFromValue[Renderer]]]) = js.native
  
  var tasks: js.Array[Task[Ctx, ListrGetRendererClassFromValue[Renderer]]] = js.native
}
