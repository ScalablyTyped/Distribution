package typings.jestFakeTimers

import typings.jestFakeTimers.anon.Config
import typings.jestFakeTimers.anon.Global
import typings.jestTypes.mod.FakeTimersConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/fake-timers", "LegacyFakeTimers")
  @js.native
  open class LegacyFakeTimers[TimerRef] protected () extends StObject {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[TimerRef]) = this()
    
    /* private */ var _cancelledTicks: Any = js.native
    
    /* private */ var _checkFakeTimers: Any = js.native
    
    /* private */ val _config: Any = js.native
    
    /* private */ var _createMocks: Any = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _fakeClearImmediate: Any = js.native
    
    /* private */ var _fakeClearTimer: Any = js.native
    
    /* private */ var _fakeNextTick: Any = js.native
    
    /* private */ var _fakeRequestAnimationFrame: Any = js.native
    
    /* private */ var _fakeSetImmediate: Any = js.native
    
    /* private */ var _fakeSetInterval: Any = js.native
    
    /* private */ var _fakeSetTimeout: Any = js.native
    
    /* private */ var _fakeTimerAPIs: Any = js.native
    
    /* private */ var _fakingTime: Any = js.native
    
    /* private */ var _getNextTimerHandleAndExpiry: Any = js.native
    
    /* private */ var _global: Any = js.native
    
    /* private */ var _immediates: Any = js.native
    
    /* private */ val _maxLoops: Any = js.native
    
    /* private */ val _moduleMocker: Any = js.native
    
    /* private */ var _now: Any = js.native
    
    /* private */ var _runImmediate: Any = js.native
    
    /* private */ var _runTimerHandle: Any = js.native
    
    /* private */ var _ticks: Any = js.native
    
    /* private */ val _timerAPIs: Any = js.native
    
    /* private */ val _timerConfig: Any = js.native
    
    /* private */ var _timers: Any = js.native
    
    /* private */ var _uuidCounter: Any = js.native
    
    def advanceTimersByTime(msToRun: Double): Unit = js.native
    
    def advanceTimersToNextTimer(): Unit = js.native
    def advanceTimersToNextTimer(steps: Double): Unit = js.native
    
    def clearAllTimers(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getTimerCount(): Double = js.native
    
    def now(): Double = js.native
    
    def reset(): Unit = js.native
    
    def runAllImmediates(): Unit = js.native
    
    def runAllTicks(): Unit = js.native
    
    def runAllTimers(): Unit = js.native
    
    def runOnlyPendingTimers(): Unit = js.native
    
    def runWithRealTimers(cb: Callback): Unit = js.native
    
    def useFakeTimers(): Unit = js.native
    
    def useRealTimers(): Unit = js.native
  }
  
  @JSImport("@jest/fake-timers", "ModernFakeTimers")
  @js.native
  open class ModernFakeTimers protected () extends StObject {
    def this(hasGlobalConfig: Global) = this()
    
    /* private */ var _checkFakeTimers: Any = js.native
    
    /* private */ var _clock: Any = js.native
    
    /* private */ val _config: Any = js.native
    
    /* private */ val _fakeTimers: Any = js.native
    
    /* private */ var _fakingTime: Any = js.native
    
    /* private */ val _global: Any = js.native
    
    /* private */ var _toSinonFakeTimersConfig: Any = js.native
    
    def advanceTimersByTime(msToRun: Double): Unit = js.native
    
    def advanceTimersToNextTimer(): Unit = js.native
    def advanceTimersToNextTimer(steps: Double): Unit = js.native
    
    def clearAllTimers(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getRealSystemTime(): Double = js.native
    
    def getTimerCount(): Double = js.native
    
    def now(): Double = js.native
    
    def reset(): Unit = js.native
    
    def runAllTicks(): Unit = js.native
    
    def runAllTimers(): Unit = js.native
    
    def runOnlyPendingTimers(): Unit = js.native
    
    def setSystemTime(): Unit = js.native
    def setSystemTime(now: js.Date): Unit = js.native
    def setSystemTime(now: Double): Unit = js.native
    
    def useFakeTimers(): Unit = js.native
    def useFakeTimers(fakeTimersConfig: FakeTimersConfig): Unit = js.native
    
    def useRealTimers(): Unit = js.native
  }
  
  @js.native
  trait Callback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait TimerConfig[Ref] extends StObject {
    
    def idToRef(id: Double): Ref
    
    def refToId(ref: Ref): Double | Unit
  }
  object TimerConfig {
    
    inline def apply[Ref](idToRef: Double => Ref, refToId: Ref => Double | Unit): TimerConfig[Ref] = {
      val __obj = js.Dynamic.literal(idToRef = js.Any.fromFunction1(idToRef), refToId = js.Any.fromFunction1(refToId))
      __obj.asInstanceOf[TimerConfig[Ref]]
    }
    
    extension [Self <: TimerConfig[?], Ref](x: Self & TimerConfig[Ref]) {
      
      inline def setIdToRef(value: Double => Ref): Self = StObject.set(x, "idToRef", js.Any.fromFunction1(value))
      
      inline def setRefToId(value: Ref => Double | Unit): Self = StObject.set(x, "refToId", js.Any.fromFunction1(value))
    }
  }
}
