package typings.kefir.kefirMod

import typings.kefir.Anon_Convert
import typings.kefir.Anon_ConvertValue
import typings.kefir.Anon_FlushOnChange
import typings.kefir.Anon_FlushOnEnd
import typings.kefir.Anon_Immediate
import typings.kefir.Anon_Leading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "Observable")
@js.native
class Observable[T, S] () extends js.Object {
  var Empty: T = js.native
  def awaiting[U, V](otherObs: Observable[U, V]): Observable[Boolean, S] = js.native
  def beforeEnd[U](fn: js.Function0[U]): Observable[T | U, S] = js.native
  def bufferBy[U, V](otherObs: Observable[U, V]): Observable[js.Array[T], S] = js.native
  def bufferBy[U, V](otherObs: Observable[U, V], options: Anon_FlushOnEnd): Observable[js.Array[T], S] = js.native
  def bufferWhile(predicate: js.Function1[/* value */ T, Boolean]): Observable[js.Array[T], S] = js.native
  def bufferWhileBy[U](otherObs: Observable[Boolean, U]): Observable[js.Array[T], S] = js.native
  def bufferWhileBy[U](otherObs: Observable[Boolean, U], options: Anon_FlushOnChange): Observable[js.Array[T], S] = js.native
  def bufferWithCount(count: Double): Observable[js.Array[T], S] = js.native
  def bufferWithCount(count: Double, options: Anon_FlushOnEnd): Observable[js.Array[T], S] = js.native
  def bufferWithTimeOrCount(interval: Double, count: Double): Observable[js.Array[T], S] = js.native
  def bufferWithTimeOrCount(interval: Double, count: Double, options: Anon_FlushOnEnd): Observable[js.Array[T], S] = js.native
  def changes(): Observable[T, S] = js.native
  // Combine streams
  def combine[U, V, W](otherObs: Observable[U, V]): Observable[W, S | V] = js.native
  def combine[U, V, W](otherObs: Observable[U, V], combinator: js.Function2[/* value */ T, /* repeated */ U, W]): Observable[W, S | V] = js.native
  def concat[U, V](otherObs: Observable[U, V]): Observable[T | U, S | V] = js.native
  def debounce(wait: Double): Observable[T, S] = js.native
  def debounce(wait: Double, options: Anon_Immediate): Observable[T, S] = js.native
  def delay(wait: Double): Observable[T, S] = js.native
  def diff(): Observable[T, S] = js.native
  def diff(fn: js.Function2[/* prev */ T, /* next */ T, T]): Observable[T, S] = js.native
  def diff(fn: js.Function2[/* prev */ T, /* next */ T, T], seed: T): Observable[T, S] = js.native
  def endOnError(): Observable[T, S] = js.native
  def errorsToValues[U](): Observable[T | U, scala.Nothing] = js.native
  def errorsToValues[U](handler: js.Function1[/* error */ S, Anon_ConvertValue[U]]): Observable[T | U, scala.Nothing] = js.native
  def filter(): Observable[T, S] = js.native
  def filter(predicate: js.Function1[/* value */ T, Boolean]): Observable[T, S] = js.native
  // Combine two streams
  def filterBy[U](otherObs: Observable[Boolean, U]): Observable[T, S] = js.native
  def filterErrors(): Observable[T, S] = js.native
  def filterErrors(predicate: js.Function1[/* error */ S, Boolean]): Observable[T, S] = js.native
  @JSName("filter")
  def filter_U_T[U /* <: T */](fn: js.Function1[/* value */ T, /* is U */ Boolean]): Observable[U, S] = js.native
  def flatMap[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
  def flatMap[U, V](transform: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V] = js.native
  def flatMapConcat[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
  def flatMapConcat[U, V](fn: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V] = js.native
  def flatMapConcurLimit[U, V](fn: js.Function1[/* value */ T, Observable[U, V]], limit: Double): Observable[U, V] = js.native
  def flatMapErrors[U, V](transform: js.Function1[/* error */ S, Observable[U, V]]): Observable[U, V] = js.native
  def flatMapFirst[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
  def flatMapFirst[U, V](fn: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V] = js.native
  def flatMapLatest[X /* <: T with (Property[T, _]) */](): Observable[ValueOfAnObservable[X], _] = js.native
  def flatMapLatest[U, V](fn: js.Function1[/* value */ T, Observable[U, V]]): Observable[U, V] = js.native
  def flatten[U](): Stream[U, S] = js.native
  def flatten[U](transformer: js.Function1[/* value */ T, js.Array[U]]): Stream[U, S] = js.native
  def ignoreEnd(): Observable[T, S] = js.native
  def ignoreErrors(): Observable[T, scala.Nothing] = js.native
  def ignoreValues(): Observable[scala.Nothing, S] = js.native
  def last(): Observable[T, S] = js.native
  def log(): this.type = js.native
  def log(name: String): this.type = js.native
  // Modify an stream
  def map[U](fn: js.Function1[/* value */ T, U]): Observable[U, S] = js.native
  def mapErrors[U](fn: js.Function1[/* error */ S, U]): Observable[T, U] = js.native
  def merge[U, V](otherObs: Observable[U, V]): Observable[T | U, S | V] = js.native
  def observe(): Subscription = js.native
  def observe(onValue: js.Function1[/* value */ T, Unit]): Subscription = js.native
  def observe(onValue: js.Function1[/* value */ T, Unit], onError: js.Function1[/* error */ S, Unit]): Subscription = js.native
  def observe(
    onValue: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* error */ S, Unit],
    onEnd: js.Function0[Unit]
  ): Subscription = js.native
  // This method is designed to replace all other methods for subscribing
  def observe(params: Observer[T, S]): Subscription = js.native
  def offAny(callback: js.Function1[/* event */ Event[T, S], Unit]): this.type = js.native
  def offEnd(callback: js.Function0[Unit]): this.type = js.native
  def offError(callback: js.Function1[/* error */ S, Unit]): this.type = js.native
  def offLog(): this.type = js.native
  def offLog(name: String): this.type = js.native
  def offSpy(): this.type = js.native
  def offSpy(name: String): this.type = js.native
  def offValue(callback: js.Function1[/* value */ T, Unit]): this.type = js.native
  def onAny(callback: js.Function1[/* event */ Event[T, S], Unit]): this.type = js.native
  def onEnd(callback: js.Function0[Unit]): this.type = js.native
  def onError(callback: js.Function1[/* error */ S, Unit]): this.type = js.native
  // Subscribe / add side effects
  def onValue(callback: js.Function1[/* value */ T, Unit]): this.type = js.native
  def sampledBy(otherObs: Observable[_, _]): Observable[T, S] = js.native
  def sampledBy[U, W](otherObs: Observable[U, _], combinator: js.Function2[/* a */ T, /* b */ U, W]): Observable[W, S] = js.native
  def scan[W](fn: js.Function2[/* prev */ T | W, /* next */ T, W]): Observable[W, S] = js.native
  def scan[W](fn: js.Function2[/* prev */ W, /* next */ T, W], seed: W): Observable[W, S] = js.native
  def setName(selfName: String): this.type = js.native
  def setName(source: Observable[_, _], selfName: String): this.type = js.native
  def skip(n: Double): Observable[T, S] = js.native
  def skipDuplicates(): Observable[T, S] = js.native
  def skipDuplicates(comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): Observable[T, S] = js.native
  def skipUntilBy[U, V](otherObs: Observable[U, V]): Observable[U, V] = js.native
  def skipWhile(): Observable[T, S] = js.native
  def skipWhile(predicate: js.Function1[/* value */ T, Boolean]): Observable[T, S] = js.native
  def slidingWindow(max: Double): Observable[js.Array[T], S] = js.native
  def slidingWindow(max: Double, mix: Double): Observable[js.Array[T], S] = js.native
  def spy(): this.type = js.native
  def spy(name: String): this.type = js.native
  def take(n: Double): Observable[T, S] = js.native
  def takeErrors(n: Double): Observable[T, S] = js.native
  def takeUntilBy[U, V](otherObs: Observable[U, V]): Observable[T, S] = js.native
  def takeWhile(): Observable[T, S] = js.native
  def takeWhile(predicate: js.Function1[/* value */ T, Boolean]): Observable[T, S] = js.native
  def throttle(wait: Double): Observable[T, S] = js.native
  def throttle(wait: Double, options: Anon_Leading): Observable[T, S] = js.native
  def thru[R](cb: js.Function1[/* obs */ Observable[T, S], Observable[R, S]]): Observable[R, S] = js.native
  def toESObservable(): ESObservable[T, S] = js.native
  def toPromise(): js.Promise[T] = js.native
  def toPromise[W /* <: js.Thenable[T] */](PromiseConstructor: js.Function0[W]): W = js.native
   // TypeScript hack to enable value unwrapping for combine/flatMap
  def toProperty(): Property[T, S] = js.native
  def toProperty[T2](getCurrent: js.Function0[T2]): Property[T | T2, S] = js.native
  @JSName("toProperty")
  def toProperty_T2[T2](): Property[T | T2, S] = js.native
  def transduce[U](transducer: js.Any): Observable[U, S] = js.native
  def valuesToErrors(): Observable[scala.Nothing, S | T] = js.native
  def valuesToErrors[U](handler: js.Function1[/* value */ T, Anon_Convert[U]]): Observable[scala.Nothing, S | U] = js.native
  def withHandler[U, V](handler: js.Function2[/* emitter */ Emitter[U, S], /* event */ Event[T, S], Unit]): Observable[U, S] = js.native
  def zip[U, V, W](otherObs: Observable[U, V]): Observable[W, S | V] = js.native
  def zip[U, V, W](otherObs: Observable[U, V], combinator: js.Function2[/* value */ T, /* repeated */ U, W]): Observable[W, S | V] = js.native
}

