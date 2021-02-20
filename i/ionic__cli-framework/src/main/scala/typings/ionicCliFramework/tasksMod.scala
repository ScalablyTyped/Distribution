package typings.ionicCliFramework

import typings.ionicCliFramework.anon.PartialTaskOptions
import typings.ionicCliFramework.ionicCliFrameworkStrings.clear
import typings.ionicCliFramework.ionicCliFrameworkStrings.end
import typings.ionicCliFramework.ionicCliFrameworkStrings.failure
import typings.ionicCliFramework.ionicCliFrameworkStrings.next
import typings.ionicCliFramework.ionicCliFrameworkStrings.success
import typings.ionicCliFramework.ionicCliFrameworkStrings.tick
import typings.node.NodeJS.Timer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksMod {
  
  @JSImport("@ionic/cli-framework/lib/tasks", "ICON_FAILURE")
  @js.native
  val ICON_FAILURE: String = js.native
  
  @JSImport("@ionic/cli-framework/lib/tasks", "ICON_SUCCESS")
  @js.native
  val ICON_SUCCESS: String = js.native
  
  @JSImport("@ionic/cli-framework/lib/tasks", "Spinner")
  @js.native
  class Spinner () extends StObject {
    def this(frames: js.Array[String]) = this()
    
    def frame(): String = js.native
    
    var frames: js.Array[String] = js.native
    
    var i: Double = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/tasks", "Task")
  @js.native
  class Task () extends EventEmitter {
    def this(hasMsgTickInterval: TaskOptions) = this()
    
    var _msg: String = js.native
    
    def clear(): this.type = js.native
    
    @JSName("emit")
    def emit_clear(name: clear): Boolean = js.native
    @JSName("emit")
    def emit_end(name: end): Boolean = js.native
    @JSName("emit")
    def emit_failure(name: failure): Boolean = js.native
    @JSName("emit")
    def emit_success(name: success): Boolean = js.native
    @JSName("emit")
    def emit_tick(name: tick): Boolean = js.native
    
    def end(): this.type = js.native
    
    def fail(): this.type = js.native
    
    var intervalId: js.UndefOr[Timer] = js.native
    
    def msg: String = js.native
    def msg_=(msg: String): Unit = js.native
    
    @JSName("on")
    def on_clear(name: clear, handler: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(name: end, handler: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_failure(name: failure, handler: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_success(name: success, handler: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_tick(name: tick, handler: js.Function0[Unit]): this.type = js.native
    
    def progress(prog: Double, total: Double): this.type = js.native
    
    var progressRatio: js.UndefOr[Double] = js.native
    
    var running: Boolean = js.native
    
    def start(): this.type = js.native
    
    def succeed(): this.type = js.native
    
    def tick(): this.type = js.native
    
    var tickInterval: js.UndefOr[Double] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/tasks", "TaskChain")
  @js.native
  class TaskChain () extends EventEmitter {
    def this(hasTaskOptions: TaskChainOptions) = this()
    
    def cleanup(): this.type = js.native
    
    def createTask(options: TaskOptions): Task = js.native
    
    var current: js.UndefOr[Task] = js.native
    
    @JSName("emit")
    def emit_end(name: end): Boolean = js.native
    @JSName("emit")
    def emit_end(name: end, lastTask: Task): Boolean = js.native
    @JSName("emit")
    def emit_failure(name: failure): Boolean = js.native
    @JSName("emit")
    def emit_failure(name: failure, failedTask: Task): Boolean = js.native
    @JSName("emit")
    def emit_next(name: next, task: Task): Boolean = js.native
    
    def end(): this.type = js.native
    
    def fail(): this.type = js.native
    
    def next(msg: String): Task = js.native
    
    def nextTask(task: Task): Task = js.native
    
    @JSName("on")
    def on_end(name: end, handler: js.Function1[/* lastTask */ js.UndefOr[Task], Unit]): this.type = js.native
    @JSName("on")
    def on_failure(name: failure, handler: js.Function1[/* failedTask */ js.UndefOr[Task], Unit]): this.type = js.native
    @JSName("on")
    def on_next(name: next, handler: js.Function1[/* task */ Task, Unit]): this.type = js.native
    
    val taskOptions: PartialTaskOptions = js.native
    
    val tasks: js.Array[Task] = js.native
  }
  
  @js.native
  trait TaskChainOptions extends StObject {
    
    val taskOptions: js.UndefOr[PartialTaskOptions] = js.native
  }
  object TaskChainOptions {
    
    @scala.inline
    def apply(): TaskChainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskChainOptions]
    }
    
    @scala.inline
    implicit class TaskChainOptionsMutableBuilder[Self <: TaskChainOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTaskOptions(value: PartialTaskOptions): Self = StObject.set(x, "taskOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskOptionsUndefined: Self = StObject.set(x, "taskOptions", js.undefined)
    }
  }
  
  @js.native
  trait TaskOptions extends StObject {
    
    val msg: js.UndefOr[String] = js.native
    
    val tickInterval: js.UndefOr[Double] = js.native
  }
  object TaskOptions {
    
    @scala.inline
    def apply(): TaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions]
    }
    
    @scala.inline
    implicit class TaskOptionsMutableBuilder[Self <: TaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      @scala.inline
      def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    }
  }
}
