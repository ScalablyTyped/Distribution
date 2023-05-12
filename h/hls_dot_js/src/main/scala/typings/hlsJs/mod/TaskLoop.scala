package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  * Sub-class specialization of EventHandler base class.
  *
  * TaskLoop allows to schedule a task function being called (optionnaly repeatedly) on the main loop,
  * scheduled asynchroneously, avoiding recursive calls in the same tick.
  *
  * The task itself is implemented in `doTick`. It can be requested and called for single execution
  * using the `tick` method.
  *
  * It will be assured that the task execution method (`tick`) only gets called once per main loop "tick",
  * no matter how often it gets requested for execution. Execution in further ticks will be scheduled accordingly.
  *
  * If further execution requests have already been scheduled on the next tick, it can be checked with `hasNextTick`,
  * and cancelled with `clearNextTick`.
  *
  * The task can be scheduled as an interval repeatedly with a period as parameter (see `setInterval`, `clearInterval`).
  *
  * Sub-classes need to implement the `doTick` method which will effectively have the task execution routine.
  *
  * Further explanations:
  *
  * The baseclass has a `tick` method that will schedule the doTick call. It may be called synchroneously
  * only for a stack-depth of one. On re-entrant calls, sub-sequent calls are scheduled for next main loop ticks.
  *
  * When the task execution (`tick` method) is called in re-entrant way this is detected and
  * we are limiting the task execution per call stack to exactly one, but scheduling/post-poning further
  * task processing on the next main loop iteration (also known as "next tick" in the Node/JS runtime lingo).
  */
trait TaskLoop extends StObject {
  
  /* private */ val _boundTick: Any
  
  /* private */ var _tickCallCount: Any
  
  /* private */ var _tickInterval: Any
  
  /* private */ var _tickTimer: Any
  
  /**
    * @returns True when interval was cleared, false when none was set (no effect)
    */
  def clearInterval(): Boolean
  
  /**
    * @returns True when timeout was cleared, false when none was set (no effect)
    */
  def clearNextTick(): Boolean
  
  def destroy(): Unit
  
  /**
    * For subclass to implement task logic
    * @abstract
    */
  /* protected */ def doTick(): Unit
  
  def hasInterval(): Boolean
  
  def hasNextTick(): Boolean
  
  /* protected */ def onHandlerDestroyed(): Unit
  
  /* protected */ def onHandlerDestroying(): Unit
  
  /**
    * @param millis - Interval time (ms)
    * @eturns True when interval has been scheduled, false when already scheduled (no effect)
    */
  def setInterval(millis: Double): Boolean
  
  /**
    * Will call the subclass doTick implementation in this main loop tick
    * or in the next one (via setTimeout(,0)) in case it has already been called
    * in this tick (in case this is a re-entrant call).
    */
  def tick(): Unit
  
  def tickImmediate(): Unit
}
object TaskLoop {
  
  inline def apply(
    _boundTick: Any,
    _tickCallCount: Any,
    _tickInterval: Any,
    _tickTimer: Any,
    clearInterval: () => Boolean,
    clearNextTick: () => Boolean,
    destroy: () => Unit,
    doTick: () => Unit,
    hasInterval: () => Boolean,
    hasNextTick: () => Boolean,
    onHandlerDestroyed: () => Unit,
    onHandlerDestroying: () => Unit,
    setInterval: Double => Boolean,
    tick: () => Unit,
    tickImmediate: () => Unit
  ): TaskLoop = {
    val __obj = js.Dynamic.literal(_boundTick = _boundTick.asInstanceOf[js.Any], _tickCallCount = _tickCallCount.asInstanceOf[js.Any], _tickInterval = _tickInterval.asInstanceOf[js.Any], _tickTimer = _tickTimer.asInstanceOf[js.Any], clearInterval = js.Any.fromFunction0(clearInterval), clearNextTick = js.Any.fromFunction0(clearNextTick), destroy = js.Any.fromFunction0(destroy), doTick = js.Any.fromFunction0(doTick), hasInterval = js.Any.fromFunction0(hasInterval), hasNextTick = js.Any.fromFunction0(hasNextTick), onHandlerDestroyed = js.Any.fromFunction0(onHandlerDestroyed), onHandlerDestroying = js.Any.fromFunction0(onHandlerDestroying), setInterval = js.Any.fromFunction1(setInterval), tick = js.Any.fromFunction0(tick), tickImmediate = js.Any.fromFunction0(tickImmediate))
    __obj.asInstanceOf[TaskLoop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskLoop] (val x: Self) extends AnyVal {
    
    inline def setClearInterval(value: () => Boolean): Self = StObject.set(x, "clearInterval", js.Any.fromFunction0(value))
    
    inline def setClearNextTick(value: () => Boolean): Self = StObject.set(x, "clearNextTick", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDoTick(value: () => Unit): Self = StObject.set(x, "doTick", js.Any.fromFunction0(value))
    
    inline def setHasInterval(value: () => Boolean): Self = StObject.set(x, "hasInterval", js.Any.fromFunction0(value))
    
    inline def setHasNextTick(value: () => Boolean): Self = StObject.set(x, "hasNextTick", js.Any.fromFunction0(value))
    
    inline def setOnHandlerDestroyed(value: () => Unit): Self = StObject.set(x, "onHandlerDestroyed", js.Any.fromFunction0(value))
    
    inline def setOnHandlerDestroying(value: () => Unit): Self = StObject.set(x, "onHandlerDestroying", js.Any.fromFunction0(value))
    
    inline def setSetInterval(value: Double => Boolean): Self = StObject.set(x, "setInterval", js.Any.fromFunction1(value))
    
    inline def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
    
    inline def setTickImmediate(value: () => Unit): Self = StObject.set(x, "tickImmediate", js.Any.fromFunction0(value))
    
    inline def set_boundTick(value: Any): Self = StObject.set(x, "_boundTick", value.asInstanceOf[js.Any])
    
    inline def set_tickCallCount(value: Any): Self = StObject.set(x, "_tickCallCount", value.asInstanceOf[js.Any])
    
    inline def set_tickInterval(value: Any): Self = StObject.set(x, "_tickInterval", value.asInstanceOf[js.Any])
    
    inline def set_tickTimer(value: Any): Self = StObject.set(x, "_tickTimer", value.asInstanceOf[js.Any])
  }
}
