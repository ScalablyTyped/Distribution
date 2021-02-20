package typings.lolex

import org.scalablytyped.runtime.Shortcut
import typings.lolex.anon.Now
import typings.std.Date
import typings.std.DateConstructor
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lolex", "createClock")
  @js.native
  def createClock[TClock /* <: Clock */](): TClock = js.native
  @JSImport("lolex", "createClock")
  @js.native
  def createClock[TClock /* <: Clock */](now: js.UndefOr[scala.Nothing], loopLimit: Double): TClock = js.native
  @JSImport("lolex", "createClock")
  @js.native
  def createClock[TClock /* <: Clock */](now: Double): TClock = js.native
  @JSImport("lolex", "createClock")
  @js.native
  def createClock[TClock /* <: Clock */](now: Double, loopLimit: Double): TClock = js.native
  @JSImport("lolex", "createClock")
  @js.native
  def createClock[TClock /* <: Clock */](now: Date): TClock = js.native
  @JSImport("lolex", "createClock")
  @js.native
  def createClock[TClock /* <: Clock */](now: Date, loopLimit: Double): TClock = js.native
  
  @JSImport("lolex", "install")
  @js.native
  def install[TClock /* <: Clock */](): InstalledClock[TClock] = js.native
  @JSImport("lolex", "install")
  @js.native
  def install[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = js.native
  
  object timers extends Shortcut {
    
    @JSImport("lolex", "timers")
    @js.native
    val ^ : GlobalTimers[TimerId] = js.native
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lolex", "timers.Date")
    @js.native
    class Date ()
      extends typings.std.Date {
      def this(value: String) = this()
      def this(value: Double) = this()
      def this(value: typings.std.Date) = this()
      def this(vd: VarDate) = this()
      def this(year: Double, month: Double) = this()
      def this(year: Double, month: Double, date: Double) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double
      ) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: js.UndefOr[scala.Nothing], minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
    }
    
    type _To = GlobalTimers[TimerId]
    
    /* This means you don't have to write `^`, but can instead just say `timers.foo` */
    override def _to: GlobalTimers[TimerId] = ^
  }
  
  @JSImport("lolex", "withGlobal")
  @js.native
  def withGlobal(global: js.Object): LolexWithContext = js.native
  
  /**
    * Lolex clock for a browser environment.
    */
  /* Inlined lolex.lolex.LolexClock<number> & {  performance :{now (): number}} */
  @js.native
  trait BrowserClock extends Clock {
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    def Date(): String = js.native
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
    /**
      * Cancel animation frame request.
      *
      * @param id   The id returned from requestAnimationFrame method.
      */
    def cancelAnimationFrame(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using requestIdleCallback.
      *
      * @param id   Timer ID or object.
      */
    def cancelIdleCallback(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setImmediate.
      *
      * @param id   Timer ID or object.
      */
    def clearImmediate(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setInterval.
      *
      * @param id   Timer ID or object.
      */
    def clearInterval(id: Double): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setTimeout.
      *
      * @param id   Timer ID or object.
      */
    def clearTimeout(id: TimerId): Unit = js.native
    
    /**
      * Get the number of waiting timers.
      *
      * @returns number of waiting timers.
      */
    def countTimers(): Double = js.native
    
    /**
      * Maximum number of timers that will be run when calling runAll().
      */
    var loopLimit: Double = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      */
    def next(): Unit = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def nextAsync(): js.Promise[Unit] = js.native
    
    /**
      * Current clock time.
      */
    var now: Double = js.native
    
    /**
      * Mimics performance.now().
      */
    var performance: Now = js.native
    
    /**
      * Schedule callback to run in the next animation frame.
      *
      * @param callback   Callback to be fired.
      * @returns Request id.
      */
    def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
    
    /**
      * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
      *
      * @param callback   Callback to be fired.
      * @param timeout   The maximum number of ticks before the callback must be fired.
      * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
      */
    def requestIdleCallback(callback: js.Function0[Unit]): Double = js.native
    def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): Double = js.native
    
    /**
      * Removes all timers and tick without firing them and restore now to its original value.
      */
    def reset(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      */
    def runAll(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      */
    def runAllAsync(): js.Promise[Unit] = js.native
    
    /**
      * Advanced the clock to the next animation frame while firing all scheduled callbacks.
      */
    def runToFrame(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      */
    def runToLast(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def runToLastAsync(): js.Promise[Unit] = js.native
    
    /**
      * Schedules the callback to be fired once 0 milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @remarks You'll still have to call clock.tick() for the callback to fire.
      * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
      */
    def setImmediate(callback: js.Function0[Unit]): Double = js.native
    
    /**
      * Schedules a callback to be fired every time timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait between callbacks.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setInterval(callback: js.Function0[Unit], timeout: Double, args: js.Any*): Double = js.native
    
    /**
      * Simulates a user changing the system clock.
      *
      * @param now   New system time.
      * @remarks This affects the current time but it does not in itself cause timers to fire.
      */
    def setSystemTime(): Unit = js.native
    def setSystemTime(now: Double): Unit = js.native
    def setSystemTime(now: Date): Unit = js.native
    
    /**
      * Schedules a callback to be fired once timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait to run the callback.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setTimeout(callback: js.Function0[Unit], timeout: Double, args: js.Any*): Double = js.native
    
    def tick(time: String): Unit = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * @param time   How many ticks to advance by.
      */
    def tick(time: Double): Unit = js.native
    
    def tickAsync(time: String): js.Promise[Unit] = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @param time   How many ticks to advance by.
      */
    def tickAsync(time: Double): js.Promise[Unit] = js.native
  }
  
  /**
    * Clock object created by lolex.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.lolex.mod.BrowserClock
    - typings.lolex.mod.NodeClock
  */
  trait Clock extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.lolex.lolexStrings.setTimeout
    - typings.lolex.lolexStrings.clearTimeout
    - typings.lolex.lolexStrings.setImmediate
    - typings.lolex.lolexStrings.clearImmediate
    - typings.lolex.lolexStrings.setInterval
    - typings.lolex.lolexStrings.clearInterval
    - typings.lolex.lolexStrings.Date
    - typings.lolex.lolexStrings.nextTick
    - typings.lolex.lolexStrings.hrtime
    - typings.lolex.lolexStrings.requestAnimationFrame
    - typings.lolex.lolexStrings.cancelAnimationFrame
    - typings.lolex.lolexStrings.requestIdleCallback
    - typings.lolex.lolexStrings.cancelIdleCallback
  */
  trait FakeMethod extends StObject
  object FakeMethod {
    
    @scala.inline
    def Date: typings.lolex.lolexStrings.Date = "Date".asInstanceOf[typings.lolex.lolexStrings.Date]
    
    @scala.inline
    def cancelAnimationFrame: typings.lolex.lolexStrings.cancelAnimationFrame = "cancelAnimationFrame".asInstanceOf[typings.lolex.lolexStrings.cancelAnimationFrame]
    
    @scala.inline
    def cancelIdleCallback: typings.lolex.lolexStrings.cancelIdleCallback = "cancelIdleCallback".asInstanceOf[typings.lolex.lolexStrings.cancelIdleCallback]
    
    @scala.inline
    def clearImmediate: typings.lolex.lolexStrings.clearImmediate = "clearImmediate".asInstanceOf[typings.lolex.lolexStrings.clearImmediate]
    
    @scala.inline
    def clearInterval: typings.lolex.lolexStrings.clearInterval = "clearInterval".asInstanceOf[typings.lolex.lolexStrings.clearInterval]
    
    @scala.inline
    def clearTimeout: typings.lolex.lolexStrings.clearTimeout = "clearTimeout".asInstanceOf[typings.lolex.lolexStrings.clearTimeout]
    
    @scala.inline
    def hrtime: typings.lolex.lolexStrings.hrtime = "hrtime".asInstanceOf[typings.lolex.lolexStrings.hrtime]
    
    @scala.inline
    def nextTick: typings.lolex.lolexStrings.nextTick = "nextTick".asInstanceOf[typings.lolex.lolexStrings.nextTick]
    
    @scala.inline
    def requestAnimationFrame: typings.lolex.lolexStrings.requestAnimationFrame = "requestAnimationFrame".asInstanceOf[typings.lolex.lolexStrings.requestAnimationFrame]
    
    @scala.inline
    def requestIdleCallback: typings.lolex.lolexStrings.requestIdleCallback = "requestIdleCallback".asInstanceOf[typings.lolex.lolexStrings.requestIdleCallback]
    
    @scala.inline
    def setImmediate: typings.lolex.lolexStrings.setImmediate = "setImmediate".asInstanceOf[typings.lolex.lolexStrings.setImmediate]
    
    @scala.inline
    def setInterval: typings.lolex.lolexStrings.setInterval = "setInterval".asInstanceOf[typings.lolex.lolexStrings.setInterval]
    
    @scala.inline
    def setTimeout: typings.lolex.lolexStrings.setTimeout = "setTimeout".asInstanceOf[typings.lolex.lolexStrings.setTimeout]
  }
  
  @js.native
  trait GlobalTimers[TTimerId /* <: TimerId */] extends StObject {
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    def Date(): String = js.native
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
    /**
      * Clears a timer, as long as it was created using setImmediate.
      *
      * @param id   Timer ID or object.
      */
    def clearImmediate(id: TTimerId): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setInterval.
      *
      * @param id   Timer ID or object.
      */
    def clearInterval(id: TTimerId): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setTimeout.
      *
      * @param id   Timer ID or object.
      */
    def clearTimeout(id: TimerId): Unit = js.native
    
    /**
      * Schedules the callback to be fired once 0 milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @remarks You'll still have to call clock.tick() for the callback to fire.
      * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
      */
    def setImmediate(callback: js.Function0[Unit]): TTimerId = js.native
    
    /**
      * Schedules a callback to be fired every time timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait between callbacks.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setInterval(callback: js.Function0[Unit], timeout: Double, args: js.Any*): TTimerId = js.native
    
    /**
      * Schedules a callback to be fired once timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait to run the callback.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setTimeout(callback: js.Function0[Unit], timeout: Double, args: js.Any*): TTimerId = js.native
  }
  
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: Clock */] = TClock with InstalledMethods
  
  /**
    * Additional methods that installed clock have.
    */
  @js.native
  trait InstalledMethods extends StObject {
    
    var methods: js.Array[FakeMethod] = js.native
    
    /**
      * Restores the original methods on the context that was passed to lolex.install,
      * or the native timers if no context was given.
      */
    def uninstall(): Unit = js.native
  }
  object InstalledMethods {
    
    @scala.inline
    def apply(methods: js.Array[FakeMethod], uninstall: () => Unit): InstalledMethods = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uninstall = js.Any.fromFunction0(uninstall))
      __obj.asInstanceOf[InstalledMethods]
    }
    
    @scala.inline
    implicit class InstalledMethodsMutableBuilder[Self <: InstalledMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[FakeMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: FakeMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setUninstall(value: () => Unit): Self = StObject.set(x, "uninstall", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LolexClock[TTimerId /* <: TimerId */] extends GlobalTimers[TTimerId] {
    
    /**
      * Cancel animation frame request.
      *
      * @param id   The id returned from requestAnimationFrame method.
      */
    def cancelAnimationFrame(id: TTimerId): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using requestIdleCallback.
      *
      * @param id   Timer ID or object.
      */
    def cancelIdleCallback(id: TTimerId): Unit = js.native
    
    /**
      * Get the number of waiting timers.
      *
      * @returns number of waiting timers.
      */
    def countTimers(): Double = js.native
    
    /**
      * Maximum number of timers that will be run when calling runAll().
      */
    var loopLimit: Double = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      */
    def next(): Unit = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def nextAsync(): js.Promise[Unit] = js.native
    
    /**
      * Current clock time.
      */
    var now: Double = js.native
    
    /**
      * Schedule callback to run in the next animation frame.
      *
      * @param callback   Callback to be fired.
      * @returns Request id.
      */
    def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): TTimerId = js.native
    
    /**
      * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
      *
      * @param callback   Callback to be fired.
      * @param timeout   The maximum number of ticks before the callback must be fired.
      * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
      */
    def requestIdleCallback(callback: js.Function0[Unit]): TTimerId = js.native
    def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): TTimerId = js.native
    
    /**
      * Removes all timers and tick without firing them and restore now to its original value.
      */
    def reset(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      */
    def runAll(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      */
    def runAllAsync(): js.Promise[Unit] = js.native
    
    /**
      * Advanced the clock to the next animation frame while firing all scheduled callbacks.
      */
    def runToFrame(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      */
    def runToLast(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def runToLastAsync(): js.Promise[Unit] = js.native
    
    /**
      * Simulates a user changing the system clock.
      *
      * @param now   New system time.
      * @remarks This affects the current time but it does not in itself cause timers to fire.
      */
    def setSystemTime(): Unit = js.native
    def setSystemTime(now: Double): Unit = js.native
    def setSystemTime(now: Date): Unit = js.native
    
    def tick(time: String): Unit = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * @param time   How many ticks to advance by.
      */
    def tick(time: Double): Unit = js.native
    
    def tickAsync(time: String): js.Promise[Unit] = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @param time   How many ticks to advance by.
      */
    def tickAsync(time: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait LolexInstallOpts extends StObject {
    
    /**
      * Relevant only when using with shouldAdvanceTime: true. increment mocked time by advanceTimeDelta ms every advanceTimeDelta ms change
      * in the real system time (default: 20)
      */
    var advanceTimeDelta: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of timers that will be run when calling runAll() (default: 1000)
      */
    var loopLimit: js.UndefOr[Double] = js.native
    
    /**
      * Installs lolex with the specified unix epoch (default: 0)
      */
    var now: js.UndefOr[Double | Date] = js.native
    
    /**
      * Tells lolex to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
      * 20ms for every 20ms change in the real system time) (default: false)
      */
    var shouldAdvanceTime: js.UndefOr[Boolean] = js.native
    
    /**
      * Installs lolex onto the specified target context (default: global)
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /**
      * An array with explicit function names to hijack. When not set, lolex will automatically fake all methods except nextTick
      * e.g., lolex.install({ toFake: ["setTimeout", "nextTick"]}) will fake only setTimeout and nextTick
      */
    var toFake: js.UndefOr[js.Array[FakeMethod]] = js.native
  }
  object LolexInstallOpts {
    
    @scala.inline
    def apply(): LolexInstallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LolexInstallOpts]
    }
    
    @scala.inline
    implicit class LolexInstallOptsMutableBuilder[Self <: LolexInstallOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvanceTimeDelta(value: Double): Self = StObject.set(x, "advanceTimeDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvanceTimeDeltaUndefined: Self = StObject.set(x, "advanceTimeDelta", js.undefined)
      
      @scala.inline
      def setLoopLimit(value: Double): Self = StObject.set(x, "loopLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopLimitUndefined: Self = StObject.set(x, "loopLimit", js.undefined)
      
      @scala.inline
      def setNow(value: Double | Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setToFake(value: js.Array[FakeMethod]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
      
      @scala.inline
      def setToFakeVarargs(value: FakeMethod*): Self = StObject.set(x, "toFake", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LolexWithContext extends StObject {
    
    def createClock[TClock /* <: Clock */](): TClock = js.native
    def createClock[TClock /* <: Clock */](now: js.UndefOr[scala.Nothing], loopLimit: Double): TClock = js.native
    def createClock[TClock /* <: Clock */](now: Double): TClock = js.native
    def createClock[TClock /* <: Clock */](now: Double, loopLimit: Double): TClock = js.native
    def createClock[TClock /* <: Clock */](now: Date): TClock = js.native
    def createClock[TClock /* <: Clock */](now: Date, loopLimit: Double): TClock = js.native
    
    def install[TClock /* <: Clock */](): InstalledClock[TClock] = js.native
    def install[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = js.native
    
    var timers: GlobalTimers[TimerId] = js.native
    
    def withGlobal(global: js.Object): LolexWithContext = js.native
  }
  
  /**
    * Lolex clock for a Node environment.
    */
  /* Inlined lolex.lolex.LolexClock<lolex.lolex.NodeTimer> & {hrtime (prevTime : [number, number] | undefined): [number, number], queueMicrotask (callback : (): void): void, nextTick (callback : (): void): void, runMicrotasks (): void} */
  @js.native
  trait NodeClock extends Clock {
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    def Date(): String = js.native
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
    /**
      * Cancel animation frame request.
      *
      * @param id   The id returned from requestAnimationFrame method.
      */
    def cancelAnimationFrame(id: NodeTimer): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using requestIdleCallback.
      *
      * @param id   Timer ID or object.
      */
    def cancelIdleCallback(id: NodeTimer): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setImmediate.
      *
      * @param id   Timer ID or object.
      */
    def clearImmediate(id: NodeTimer): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setInterval.
      *
      * @param id   Timer ID or object.
      */
    def clearInterval(id: NodeTimer): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using setTimeout.
      *
      * @param id   Timer ID or object.
      */
    def clearTimeout(id: TimerId): Unit = js.native
    
    /**
      * Get the number of waiting timers.
      *
      * @returns number of waiting timers.
      */
    def countTimers(): Double = js.native
    
    /**
      * Mimicks process.hrtime().
      *
      * @param prevTime   Previous system time to calculate time elapsed.
      * @returns High resolution real time as [seconds, nanoseconds].
      */
    def hrtime(): js.Tuple2[Double, Double] = js.native
    def hrtime(prevTime: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
    
    /**
      * Maximum number of timers that will be run when calling runAll().
      */
    var loopLimit: Double = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      */
    def next(): Unit = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def nextAsync(): js.Promise[Unit] = js.native
    
    /**
      * Simulates process.nextTick().
      */
    def nextTick(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Current clock time.
      */
    var now: Double = js.native
    
    /**
      * Mimics process.nextTick() explicitly dropping additional arguments.
      */
    def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Schedule callback to run in the next animation frame.
      *
      * @param callback   Callback to be fired.
      * @returns Request id.
      */
    def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): NodeTimer = js.native
    
    /**
      * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
      *
      * @param callback   Callback to be fired.
      * @param timeout   The maximum number of ticks before the callback must be fired.
      * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
      */
    def requestIdleCallback(callback: js.Function0[Unit]): NodeTimer = js.native
    def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): NodeTimer = js.native
    
    /**
      * Removes all timers and tick without firing them and restore now to its original value.
      */
    def reset(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      */
    def runAll(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      */
    def runAllAsync(): js.Promise[Unit] = js.native
    
    /**
      * Run all pending microtasks scheduled with nextTick.
      */
    def runMicrotasks(): Unit = js.native
    
    /**
      * Advanced the clock to the next animation frame while firing all scheduled callbacks.
      */
    def runToFrame(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      */
    def runToLast(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def runToLastAsync(): js.Promise[Unit] = js.native
    
    /**
      * Schedules the callback to be fired once 0 milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @remarks You'll still have to call clock.tick() for the callback to fire.
      * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
      */
    def setImmediate(callback: js.Function0[Unit]): NodeTimer = js.native
    
    /**
      * Schedules a callback to be fired every time timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait between callbacks.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setInterval(callback: js.Function0[Unit], timeout: Double, args: js.Any*): NodeTimer = js.native
    
    /**
      * Simulates a user changing the system clock.
      *
      * @param now   New system time.
      * @remarks This affects the current time but it does not in itself cause timers to fire.
      */
    def setSystemTime(): Unit = js.native
    def setSystemTime(now: Double): Unit = js.native
    def setSystemTime(now: Date): Unit = js.native
    
    /**
      * Schedules a callback to be fired once timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait to run the callback.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setTimeout(callback: js.Function0[Unit], timeout: Double, args: js.Any*): NodeTimer = js.native
    
    def tick(time: String): Unit = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * @param time   How many ticks to advance by.
      */
    def tick(time: Double): Unit = js.native
    
    def tickAsync(time: String): js.Promise[Unit] = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @param time   How many ticks to advance by.
      */
    def tickAsync(time: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait NodeTimer extends StObject {
    
    /**
      * Stub method call. Does nothing.
      */
    def ref(): Unit = js.native
    
    /**
      * Stub method call. Does nothing.
      */
    def unref(): Unit = js.native
  }
  object NodeTimer {
    
    @scala.inline
    def apply(ref: () => Unit, unref: () => Unit): NodeTimer = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[NodeTimer]
    }
    
    @scala.inline
    implicit class NodeTimerMutableBuilder[Self <: NodeTimer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  type TimerId = Double | NodeTimer
}
