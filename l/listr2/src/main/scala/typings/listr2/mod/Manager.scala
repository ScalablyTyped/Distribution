package typings.listr2.mod

import typings.listr2.listr2Strings.task
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Listr2 task manager.
  *
  * Useful for creating a single instance of Listr2 with pre-set settings.
  *
  * @see {@link https://listr2.kilic.dev/listr/manager.html}
  */
@JSImport("listr2", "Manager")
@js.native
open class Manager[Ctx, Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */] () extends StObject {
  def this(options: ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer]) = this()
  
  def add[InjectCtx](tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]): Unit = js.native
  def add[InjectCtx](
    tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]],
    options: ListrSubClassOptions[InjectCtx, Renderer]
  ): Unit = js.native
  def add[InjectCtx](
    tasks: js.Function1[
      /* ctx */ js.UndefOr[InjectCtx], 
      js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]
    ]
  ): Unit = js.native
  def add[InjectCtx](
    tasks: js.Function1[
      /* ctx */ js.UndefOr[InjectCtx], 
      js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]
    ],
    options: ListrSubClassOptions[InjectCtx, Renderer]
  ): Unit = js.native
  
  def ctx: Ctx = js.native
  def ctx_=(ctx: Ctx): Unit = js.native
  
  var errors: js.Array[ListrError[ListrContext]] = js.native
  
  def indent[InjectCtx](tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  def indent[InjectCtx](
    tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]],
    options: ListrBaseClassOptions[InjectCtx, Renderer, FallbackRenderer]
  ): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  def indent[InjectCtx](
    tasks: js.Function1[
      /* ctx */ js.UndefOr[InjectCtx], 
      js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]
    ]
  ): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  def indent[InjectCtx](
    tasks: js.Function1[
      /* ctx */ js.UndefOr[InjectCtx], 
      js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]
    ],
    options: ListrBaseClassOptions[InjectCtx, Renderer, FallbackRenderer]
  ): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  @JSName("indent")
  def indent_task[InjectCtx](
    tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]],
    options: Unit,
    taskOptions: Omit[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]], task]
  ): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  @JSName("indent")
  def indent_task[InjectCtx](
    tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]],
    options: ListrBaseClassOptions[InjectCtx, Renderer, FallbackRenderer],
    taskOptions: Omit[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]], task]
  ): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  @JSName("indent")
  def indent_task[InjectCtx](
    tasks: js.Function1[
      /* ctx */ js.UndefOr[InjectCtx], 
      js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]
    ],
    options: Unit,
    taskOptions: Omit[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]], task]
  ): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  @JSName("indent")
  def indent_task[InjectCtx](
    tasks: js.Function1[
      /* ctx */ js.UndefOr[InjectCtx], 
      js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]
    ],
    options: ListrBaseClassOptions[InjectCtx, Renderer, FallbackRenderer],
    taskOptions: Omit[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]], task]
  ): ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]] = js.native
  
  def newListr[InjectCtx, InjectRenderer /* <: ListrRendererValue */, InjectFallbackRenderer /* <: ListrRendererValue */](tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[InjectRenderer]]]): Listr[InjectCtx, InjectRenderer, InjectFallbackRenderer] = js.native
  def newListr[InjectCtx, InjectRenderer /* <: ListrRendererValue */, InjectFallbackRenderer /* <: ListrRendererValue */](
    tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[InjectRenderer]]],
    options: ListrBaseClassOptions[InjectCtx, InjectRenderer, InjectFallbackRenderer]
  ): Listr[InjectCtx, InjectRenderer, InjectFallbackRenderer] = js.native
  
  var options: js.UndefOr[ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer]] = js.native
  
  def run[InjectCtx](tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]]): js.Promise[InjectCtx] = js.native
  def run[InjectCtx](
    tasks: js.Array[ListrTask[InjectCtx, ListrGetRendererClassFromValue[Renderer]]],
    options: ListrBaseClassOptions[InjectCtx, Renderer, FallbackRenderer]
  ): js.Promise[InjectCtx] = js.native
  
  def runAll[InjectCtx](): js.Promise[InjectCtx] = js.native
  def runAll[InjectCtx](options: ListrBaseClassOptions[InjectCtx, Renderer, FallbackRenderer]): js.Promise[InjectCtx] = js.native
  
  /* private */ var tasks: Any = js.native
}
