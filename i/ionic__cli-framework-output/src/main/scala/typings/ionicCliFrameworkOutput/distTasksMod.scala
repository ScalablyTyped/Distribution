package typings.ionicCliFrameworkOutput

import typings.ionicCliFrameworkOutput.anon.PartialTaskOptions
import typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.clear
import typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.end
import typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.failure
import typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.next
import typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.success
import typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.tick
import typings.node.eventsMod.EventEmitter
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTasksMod {
  
  @JSImport("@ionic/cli-framework-output/dist/tasks", "ICON_FAILURE")
  @js.native
  val ICON_FAILURE: String = js.native
  
  @JSImport("@ionic/cli-framework-output/dist/tasks", "ICON_SUCCESS")
  @js.native
  val ICON_SUCCESS: String = js.native
  
  @JSImport("@ionic/cli-framework-output/dist/tasks", "Spinner")
  @js.native
  open class Spinner () extends StObject {
    def this(frames: js.Array[String]) = this()
    
    def frame(): String = js.native
    
    var frames: js.Array[String] = js.native
    
    var i: Double = js.native
  }
  
  @JSImport("@ionic/cli-framework-output/dist/tasks", "Task")
  @js.native
  open class Task () extends EventEmitter {
    def this(param0: TaskOptions) = this()
    
    /* protected */ var _msg: String = js.native
    
    /* protected */ var _startTime: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    /* protected */ var _success: Boolean = js.native
    
    def clear(): this.type = js.native
    
    @JSName("emit")
    def emit_clear(name: clear): Boolean = js.native
    @JSName("emit")
    def emit_end(name: end, result: TaskResult): Boolean = js.native
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
    def on_end(name: end, handler: js.Function1[/* result */ TaskResult, Unit]): this.type = js.native
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
  
  @JSImport("@ionic/cli-framework-output/dist/tasks", "TaskChain")
  @js.native
  open class TaskChain () extends EventEmitter {
    def this(param0: TaskChainOptions) = this()
    
    def cleanup(): this.type = js.native
    
    def createTask(options: TaskOptions): Task = js.native
    
    /* protected */ var current: js.UndefOr[Task] = js.native
    
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
    
    /* protected */ val taskOptions: PartialTaskOptions = js.native
    
    /* protected */ val tasks: js.Array[Task] = js.native
  }
  
  trait TaskChainOptions extends StObject {
    
    val taskOptions: js.UndefOr[PartialTaskOptions] = js.undefined
  }
  object TaskChainOptions {
    
    inline def apply(): TaskChainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskChainOptions]
    }
    
    extension [Self <: TaskChainOptions](x: Self) {
      
      inline def setTaskOptions(value: PartialTaskOptions): Self = StObject.set(x, "taskOptions", value.asInstanceOf[js.Any])
      
      inline def setTaskOptionsUndefined: Self = StObject.set(x, "taskOptions", js.undefined)
    }
  }
  
  trait TaskOptions extends StObject {
    
    val msg: js.UndefOr[String] = js.undefined
    
    val tickInterval: js.UndefOr[Double] = js.undefined
  }
  object TaskOptions {
    
    inline def apply(): TaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions]
    }
    
    extension [Self <: TaskOptions](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
      
      inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    }
  }
  
  trait TaskResult extends StObject {
    
    /**
      * Elapsed time from process.hrtime()
      */
    var elapsedTime: js.Tuple2[Double, Double]
    
    /**
      * Whether the task succeeded or not
      */
    var success: Boolean
  }
  object TaskResult {
    
    inline def apply(elapsedTime: js.Tuple2[Double, Double], success: Boolean): TaskResult = {
      val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskResult]
    }
    
    extension [Self <: TaskResult](x: Self) {
      
      inline def setElapsedTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
