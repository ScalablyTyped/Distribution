package typings.jestFakeTimers

import typings.jestFakeTimers.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestFakeTimersMod {
  
  @JSImport("@jest/fake-timers/build/jestFakeTimers", JSImport.Default)
  @js.native
  class default[TimerRef] protected () extends FakeTimers[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[TimerRef]) = this()
  }
  
  type Callback = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait FakeTimers[TimerRef] extends StObject {
    
    var _cancelledImmediates: js.Any = js.native
    
    var _cancelledTicks: js.Any = js.native
    
    var _checkFakeTimers: js.Any = js.native
    
    var _config: js.Any = js.native
    
    var _createMocks: js.Any = js.native
    
    var _disposed: js.Any = js.native
    
    var _fakeClearImmediate: js.Any = js.native
    
    var _fakeClearTimer: js.Any = js.native
    
    var _fakeNextTick: js.Any = js.native
    
    var _fakeSetImmediate: js.Any = js.native
    
    var _fakeSetInterval: js.Any = js.native
    
    var _fakeSetTimeout: js.Any = js.native
    
    var _fakeTimerAPIs: js.Any = js.native
    
    var _getNextTimerHandle: js.Any = js.native
    
    var _global: js.Any = js.native
    
    var _immediates: js.Any = js.native
    
    var _maxLoops: js.Any = js.native
    
    var _moduleMocker: js.Any = js.native
    
    var _now: js.Any = js.native
    
    var _runImmediate: js.Any = js.native
    
    var _runTimerHandle: js.Any = js.native
    
    var _ticks: js.Any = js.native
    
    var _timerAPIs: js.Any = js.native
    
    var _timerConfig: js.Any = js.native
    
    var _timers: js.Any = js.native
    
    var _uuidCounter: js.Any = js.native
    
    def advanceTimersByTime(msToRun: Double): Unit = js.native
    
    def advanceTimersToNextTimer(): Unit = js.native
    def advanceTimersToNextTimer(steps: Double): Unit = js.native
    
    def clearAllTimers(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getTimerCount(): Double = js.native
    
    def reset(): Unit = js.native
    
    def runAllImmediates(): Unit = js.native
    
    def runAllTicks(): Unit = js.native
    
    def runAllTimers(): Unit = js.native
    
    def runOnlyPendingTimers(): Unit = js.native
    
    def runWithRealTimers(cb: Callback): Unit = js.native
    
    def useFakeTimers(): Unit = js.native
    
    def useRealTimers(): Unit = js.native
  }
  
  @js.native
  trait TimerConfig[Ref] extends StObject {
    
    def idToRef(id: Double): Ref = js.native
    
    def refToId(ref: Ref): Double | Unit = js.native
  }
  object TimerConfig {
    
    @scala.inline
    def apply[Ref](idToRef: Double => Ref, refToId: Ref => Double | Unit): TimerConfig[Ref] = {
      val __obj = js.Dynamic.literal(idToRef = js.Any.fromFunction1(idToRef), refToId = js.Any.fromFunction1(refToId))
      __obj.asInstanceOf[TimerConfig[Ref]]
    }
    
    @scala.inline
    implicit class TimerConfigMutableBuilder[Self <: TimerConfig[_], Ref] (val x: Self with TimerConfig[Ref]) extends AnyVal {
      
      @scala.inline
      def setIdToRef(value: Double => Ref): Self = StObject.set(x, "idToRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefToId(value: Ref => Double | Unit): Self = StObject.set(x, "refToId", js.Any.fromFunction1(value))
    }
  }
}
