package typings.listr

import org.scalablytyped.runtime.Instantiable2
import typings.node.streamMod.Readable
import typings.rxjs.mod.Observable_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("listr", JSImport.Namespace)
  @js.native
  open class ^[Ctx] ()
    extends StObject
       with Listr[Ctx] {
    def this(options: ListrOptions[Ctx]) = this()
    def this(tasks: js.Array[ListrTask[Ctx]]) = this()
    def this(tasks: js.Array[ListrTask[Ctx]], options: ListrOptions[Ctx]) = this()
    def this(tasks: Unit, options: ListrOptions[Ctx]) = this()
  }
  
  @js.native
  trait Listr[Ctx] extends StObject {
    
    def add(tasks: js.Array[ListrTask[Ctx]]): Unit = js.native
    def add(tasks: ListrTask[Ctx]): Unit = js.native
    
    def render(): Unit = js.native
    
    def run(): js.Promise[Ctx] = js.native
    def run(ctx: Ctx): js.Promise[Ctx] = js.native
    
    def setRenderer(value: ListrRendererValue[Ctx]): Unit = js.native
    
    var tasks: js.Array[ListrTaskWrapper[Ctx]] = js.native
  }
  
  type ListrContext = Any
  
  trait ListrError[Ctx]
    extends StObject
       with Error {
    
    var context: Ctx
  }
  object ListrError {
    
    inline def apply[Ctx](context: Ctx, message: String, name: String): ListrError[Ctx] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListrError[Ctx]]
    }
    
    extension [Self <: ListrError[?], Ctx](x: Self & ListrError[Ctx]) {
      
      inline def setContext(value: Ctx): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListrEvent extends StObject {
    
    var data: js.UndefOr[String | Boolean] = js.undefined
    
    var `type`: String
  }
  object ListrEvent {
    
    inline def apply(`type`: String): ListrEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListrEvent]
    }
    
    extension [Self <: ListrEvent](x: Self) {
      
      inline def setData(value: String | Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListrOptions[Ctx] extends StObject {
    
    var concurrent: js.UndefOr[Boolean | Double] = js.undefined
    
    var exitOnError: js.UndefOr[Boolean] = js.undefined
    
    var nonTTYRenderer: js.UndefOr[ListrRendererValue[Ctx]] = js.undefined
    
    var renderer: js.UndefOr[ListrRendererValue[Ctx]] = js.undefined
  }
  object ListrOptions {
    
    inline def apply[Ctx](): ListrOptions[Ctx] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListrOptions[Ctx]]
    }
    
    extension [Self <: ListrOptions[?], Ctx](x: Self & ListrOptions[Ctx]) {
      
      inline def setConcurrent(value: Boolean | Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      inline def setExitOnError(value: Boolean): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
      
      inline def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
      
      inline def setNonTTYRenderer(value: ListrRendererValue[Ctx]): Self = StObject.set(x, "nonTTYRenderer", value.asInstanceOf[js.Any])
      
      inline def setNonTTYRendererUndefined: Self = StObject.set(x, "nonTTYRenderer", js.undefined)
      
      inline def setRenderer(value: ListrRendererValue[Ctx]): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  trait ListrRenderer extends StObject {
    
    def end(err: js.Error): Unit
    
    def render(): Unit
  }
  object ListrRenderer {
    
    inline def apply(end: js.Error => Unit, render: () => Unit): ListrRenderer = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[ListrRenderer]
    }
    
    extension [Self <: ListrRenderer](x: Self) {
      
      inline def setEnd(value: js.Error => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ListrRendererClass[Ctx]
    extends StObject
       with Instantiable2[
          /* tasks */ js.Array[ListrTaskObject[Ctx]], 
          /* options */ ListrOptions[Ctx], 
          ListrRenderer
        ]
       with ListrRendererValue[Ctx] {
    
    var nonTTY: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.listr.listrStrings.silent
    - typings.listr.listrStrings.default
    - typings.listr.listrStrings.verbose
    - typings.listr.mod.ListrRendererClass[Ctx]
  */
  trait ListrRendererValue[Ctx] extends StObject
  
  trait ListrTask[Ctx] extends StObject {
    
    var enabled: js.UndefOr[
        js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean] | Observable_[Boolean]]
      ] = js.undefined
    
    var skip: js.UndefOr[
        js.Function1[
          /* ctx */ Ctx, 
          Unit | Boolean | String | (js.Promise[js.UndefOr[Boolean | String]])
        ]
      ] = js.undefined
    
    def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx]
    
    var title: String
  }
  object ListrTask {
    
    inline def apply[Ctx](task: (Ctx, ListrTaskWrapper[Ctx]) => Unit | ListrTaskResult[Ctx], title: String): ListrTask[Ctx] = {
      val __obj = js.Dynamic.literal(task = js.Any.fromFunction2(task), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListrTask[Ctx]]
    }
    
    extension [Self <: ListrTask[?], Ctx](x: Self & ListrTask[Ctx]) {
      
      inline def setEnabled(value: /* ctx */ Ctx => Boolean | js.Promise[Boolean] | Observable_[Boolean]): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setSkip(value: /* ctx */ Ctx => Unit | Boolean | String | (js.Promise[js.UndefOr[Boolean | String]])): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTask(value: (Ctx, ListrTaskWrapper[Ctx]) => Unit | ListrTaskResult[Ctx]): Self = StObject.set(x, "task", js.Any.fromFunction2(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListrTaskObject[Ctx] extends Observable_[ListrEvent] {
    
    def check(ctx: Ctx): Unit = js.native
    
    def hasFailed(): Boolean = js.native
    
    def hasSubtasks(): Boolean = js.native
    
    def isCompleted(): Boolean = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isPending(): Boolean = js.native
    
    def isSkipped(): Boolean = js.native
    
    var output: js.UndefOr[String] = js.native
    
    def run(ctx: Ctx, wrapper: ListrTaskWrapper[Ctx]): js.Promise[Unit] = js.native
    
    def skip(ctx: Ctx): Unit | Boolean | String | (js.Promise[js.UndefOr[Boolean | String]]) = js.native
    
    var state: String = js.native
    
    var subtasks: js.Array[ListrTaskWrapper[Ctx]] = js.native
    
    def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx] = js.native
    
    var title: String = js.native
  }
  
  type ListrTaskResult[Ctx] = String | js.Promise[Any] | Listr[Ctx] | Readable | Observable_[Any]
  
  @js.native
  trait ListrTaskWrapper[Ctx] extends StObject {
    
    var output: String = js.native
    
    def report(error: js.Error): Unit = js.native
    
    def run(): js.Promise[Unit] = js.native
    def run(ctx: Ctx): js.Promise[Unit] = js.native
    
    def skip(message: String): Unit = js.native
    
    var title: String = js.native
  }
}
