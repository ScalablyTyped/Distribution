package typings.ifvisible

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ifvisible", JSImport.Namespace)
  @js.native
  val ^ : IfVisible = js.native
  
  trait IdleInfo extends StObject {
    
    /**
      * How long was the page idle in milliseconds
      */
    var idleFor: Double
    
    /**
      * if page idle now?
      */
    var isIdle: Boolean
    
    /**
      * How much time left to become idle in milliseconds
      */
    var timeLeft: Double
    
    /**
      * How much time left to become idle represented as percentage
      */
    var timeLeftPer: String
  }
  object IdleInfo {
    
    inline def apply(idleFor: Double, isIdle: Boolean, timeLeft: Double, timeLeftPer: String): IdleInfo = {
      val __obj = js.Dynamic.literal(idleFor = idleFor.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any], timeLeftPer = timeLeftPer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdleInfo]
    }
    
    extension [Self <: IdleInfo](x: Self) {
      
      inline def setIdleFor(value: Double): Self = StObject.set(x, "idleFor", value.asInstanceOf[js.Any])
      
      inline def setIsIdle(value: Boolean): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
      
      inline def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
      
      inline def setTimeLeftPer(value: String): Self = StObject.set(x, "timeLeftPer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IfVisible extends StObject {
    
    /**
      * Registers a callback function to blur event
      * @param callback function to run when event fires
      */
    def blur(): IfVisible = js.native
    def blur(callback: js.Function0[Unit]): IfVisible = js.native
    
    /**
      * Registers a callback function to focus event
      * @param callback function to run when event fires
      */
    def focus(): IfVisible = js.native
    def focus(callback: js.Function0[Unit]): IfVisible = js.native
    
    /**
      * Returns the current duration time in milliseconds
      */
    def getIdleDuration(): Double = js.native
    
    /**
      * Returns detailed information about current idle status
      */
    def getIdleInfo(): IdleInfo = js.native
    
    /**
      * Registers a callback function to idle event
      * @param callback function to run when event fires
      */
    def idle(): IfVisible = js.native
    def idle(callback: js.Function0[Unit]): IfVisible = js.native
    
    /**
      * Given the event, it check if page is in that state for example
      * ifvisible.now('idle') return boolean to state if you are idle or not
      */
    def now(): Boolean = js.native
    def now(check: String): Boolean = js.native
    
    /**
      * Unregister given event of name
      * @param name name of the event
      * @param handler function to remove from registered events
      */
    def off(name: String): Unit = js.native
    def off(name: String, handler: js.Function0[Unit]): Unit = js.native
    
    /**
      * Register any event
      * @param name Name of the event
      * @param callback Function to run when event fires
      */
    def on(name: String, callback: js.Function1[/* status */ js.UndefOr[String], Unit]): Double = js.native
    
    /**
      * Utility to run a given function at every given seconds intervals.
      * This method is smart and it will stop executing when the page is not active
      * @param seconds duration to wait between each interval in seconds
      * @param callback callback function run on every iteration
      */
    def onEvery(seconds: Double, callback: js.Function0[Unit]): OnEveryReturn = js.native
    
    /**
      * Let's you change duration that page becomes idle dynamically
      * @param seconds new duration in seconds
      */
    def setIdleDuration(seconds: Double): Double = js.native
    
    /**
      * Registers a callback function to wakeup event
      * @param callback function to run when event fires
      */
    def wakeup(): IfVisible = js.native
    def wakeup(callback: js.Function0[Unit]): IfVisible = js.native
  }
  
  trait OnEveryReturn extends StObject {
    
    /**
      * Callback function you passed to onEvery
      */
    def callback(): Unit
    
    /**
      * Timer Id of setInterval
      */
    var code: Double
    
    /**
      * Pauses the interval, it's resumable
      */
    def pause(): Boolean
    
    /**
      * Resumes paused interval
      */
    def resume(): Boolean
    
    /**
      * Stop the interval, you cannot resume
      */
    def stop(): Boolean
  }
  object OnEveryReturn {
    
    inline def apply(
      callback: () => Unit,
      code: Double,
      pause: () => Boolean,
      resume: () => Boolean,
      stop: () => Boolean
    ): OnEveryReturn = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), code = code.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[OnEveryReturn]
    }
    
    extension [Self <: OnEveryReturn](x: Self) {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setResume(value: () => Boolean): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Boolean): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  type _To = IfVisible
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IfVisible = ^
}
