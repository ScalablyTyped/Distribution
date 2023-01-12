package typings.jestTypes.mod

import typings.jestTypes.jestTypesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FakeTimersConfig extends StObject {
  
  /**
    * If set to `true` all timers will be advanced automatically
    * by 20 milliseconds every 20 milliseconds. A custom time delta
    * may be provided by passing a number.
    *
    * @defaultValue
    * The default is `false`.
    */
  var advanceTimers: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * List of names of APIs (e.g. `Date`, `nextTick()`, `setImmediate()`,
    * `setTimeout()`) that should not be faked.
    *
    * @defaultValue
    * The default is `[]`, meaning all APIs are faked.
    */
  var doNotFake: js.UndefOr[js.Array[FakeableAPI]] = js.undefined
  
  /**
    * Use the old fake timers implementation instead of one backed by
    * [`@sinonjs/fake-timers`](https://github.com/sinonjs/fake-timers).
    *
    * @defaultValue
    * The default is `false`.
    */
  var legacyFakeTimers: js.UndefOr[`false`] = js.undefined
  
  /**
    * Sets current system time to be used by fake timers.
    *
    * @defaultValue
    * The default is `Date.now()`.
    */
  var now: js.UndefOr[Double | js.Date] = js.undefined
  
  /**
    * The maximum number of recursive timers that will be run when calling
    * `jest.runAllTimers()`.
    *
    * @defaultValue
    * The default is `100_000` timers.
    */
  var timerLimit: js.UndefOr[Double] = js.undefined
}
object FakeTimersConfig {
  
  inline def apply(): FakeTimersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FakeTimersConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FakeTimersConfig] (val x: Self) extends AnyVal {
    
    inline def setAdvanceTimers(value: Boolean | Double): Self = StObject.set(x, "advanceTimers", value.asInstanceOf[js.Any])
    
    inline def setAdvanceTimersUndefined: Self = StObject.set(x, "advanceTimers", js.undefined)
    
    inline def setDoNotFake(value: js.Array[FakeableAPI]): Self = StObject.set(x, "doNotFake", value.asInstanceOf[js.Any])
    
    inline def setDoNotFakeUndefined: Self = StObject.set(x, "doNotFake", js.undefined)
    
    inline def setDoNotFakeVarargs(value: FakeableAPI*): Self = StObject.set(x, "doNotFake", js.Array(value*))
    
    inline def setLegacyFakeTimers(value: `false`): Self = StObject.set(x, "legacyFakeTimers", value.asInstanceOf[js.Any])
    
    inline def setLegacyFakeTimersUndefined: Self = StObject.set(x, "legacyFakeTimers", js.undefined)
    
    inline def setNow(value: Double | js.Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    
    inline def setTimerLimit(value: Double): Self = StObject.set(x, "timerLimit", value.asInstanceOf[js.Any])
    
    inline def setTimerLimitUndefined: Self = StObject.set(x, "timerLimit", js.undefined)
  }
}
