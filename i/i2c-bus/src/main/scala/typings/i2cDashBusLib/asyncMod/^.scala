package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val all: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  val allLimit: i2cDashBusLib.Anon_ArrCallbackIteratorLimitAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  val allSeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  val any: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  val anyLimit: i2cDashBusLib.Anon_ArrCallbackIteratorLimitAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  val anySeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  val concatSeries: i2cDashBusLib.Anon_ArrCallbackIteratorArray = js.native
  val detectSeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncResultCallback = js.native
  val eachOf: i2cDashBusLib.Anon_CallbackIterator = js.native
  val eachOfLimit: i2cDashBusLib.Anon_CallbackIteratorLimit = js.native
  val eachOfSeries: i2cDashBusLib.Anon_CallbackIterator = js.native
  val eachSeries: i2cDashBusLib.Anon_Arr = js.native
  val everySeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  val filterSeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIterator = js.native
  val find: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncResultCallback = js.native
  val findLimit: i2cDashBusLib.Anon_ArrCallbackIteratorLimitAsyncBooleanIterator = js.native
  val findSeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncResultCallback = js.native
  val foldl: i2cDashBusLib.Anon_ArrCallbackIteratorMemo = js.native
  val foldr: i2cDashBusLib.Anon_ArrCallbackIteratorMemo = js.native
  val forEach: i2cDashBusLib.Anon_Arr = js.native
  val forEachLimit: i2cDashBusLib.Anon_ArrCallback = js.native
  val forEachOfSeries: i2cDashBusLib.Anon_CallbackIterator = js.native
  val forEachSeries: i2cDashBusLib.Anon_Arr = js.native
  val inject: i2cDashBusLib.Anon_ArrCallbackIteratorMemo = js.native
  val mapSeries: i2cDashBusLib.Anon_ArrCallbackIterator = js.native
  val mapValuesSeries: i2cDashBusLib.Anon_CallbackIteratee = js.native
  val reduceRight: i2cDashBusLib.Anon_ArrCallbackIteratorMemo = js.native
  val reject: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIterator = js.native
  val rejectLimit: i2cDashBusLib.Anon_ArrCallbackIteratorLimit = js.native
  val rejectSeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIterator = js.native
  val select: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIterator = js.native
  val selectLimit: i2cDashBusLib.Anon_ArrCallbackIteratorLimit = js.native
  val selectSeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIterator = js.native
  val setImmediate: js.Function2[/* callback */ js.Function, /* repeated */ js.Any, scala.Unit] = js.native
  val someSeries: i2cDashBusLib.Anon_ArrCallbackIteratorAsyncBooleanIteratorAsyncBooleanResultCallback = js.native
  @JSName("apply")
  def apply[E](fn: js.Function, args: js.Any*): i2cDashBusLib.asyncMod.AsyncFunction[_, E] = js.native
  def applyEach(fns: js.Array[js.Function], argsAndCallback: js.Any*): scala.Unit = js.native
  def applyEachSeries(fns: js.Array[js.Function], argsAndCallback: js.Any*): scala.Unit = js.native
  def asyncify(fn: js.Function): js.Function1[/* repeated */ js.Any, _] = js.native
  def auto[R /* <: i2cDashBusLib.asyncMod.Dictionary[_] */, E](tasks: i2cDashBusLib.asyncMod.AsyncAutoTasks[R, E]): scala.Unit = js.native
  def auto[R /* <: i2cDashBusLib.asyncMod.Dictionary[_] */, E](
    tasks: i2cDashBusLib.asyncMod.AsyncAutoTasks[R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def auto[R /* <: i2cDashBusLib.asyncMod.Dictionary[_] */, E](tasks: i2cDashBusLib.asyncMod.AsyncAutoTasks[R, E], concurrency: scala.Double): scala.Unit = js.native
  def auto[R /* <: i2cDashBusLib.asyncMod.Dictionary[_] */, E](
    tasks: i2cDashBusLib.asyncMod.AsyncAutoTasks[R, E],
    concurrency: scala.Double,
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def autoInject[E](tasks: js.Any): scala.Unit = js.native
  def autoInject[E](tasks: js.Any, callback: i2cDashBusLib.asyncMod.AsyncResultCallback[_, E]): scala.Unit = js.native
  def cargo[E](
    worker: js.Function2[
      /* tasks */ js.Array[_], 
      /* callback */ i2cDashBusLib.asyncMod.ErrorCallback[E], 
      scala.Unit
    ]
  ): i2cDashBusLib.asyncMod.AsyncCargo = js.native
  def cargo[E](
    worker: js.Function2[
      /* tasks */ js.Array[_], 
      /* callback */ i2cDashBusLib.asyncMod.ErrorCallback[E], 
      scala.Unit
    ],
    payload: scala.Double
  ): i2cDashBusLib.asyncMod.AsyncCargo = js.native
  def compose(fns: js.Function*): js.Function = js.native
  def concat[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, js.Array[R], E]
  ): scala.Unit = js.native
  def concat[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, js.Array[R], E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def concatLimit[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, js.Array[R], E]
  ): scala.Unit = js.native
  def concatLimit[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, js.Array[R], E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def constant(values: js.Any*): js.Function = js.native
  def detect[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def detect[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def detectLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def detectLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def dir(fn: js.Function, args: js.Any*): scala.Unit = js.native
  def doDuring[E](
    fn: i2cDashBusLib.asyncMod.AsyncVoidFunction[E],
    test: js.Function1[
      /* testCallback */ i2cDashBusLib.asyncMod.AsyncBooleanResultCallback[E], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def doUntil[T, E](
    fn: i2cDashBusLib.asyncMod.AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, scala.Boolean],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def doWhilst[T, E](
    fn: i2cDashBusLib.asyncMod.AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, scala.Boolean],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def during[E](
    test: js.Function1[
      /* testCallback */ i2cDashBusLib.asyncMod.AsyncBooleanResultCallback[E], 
      scala.Unit
    ],
    fn: i2cDashBusLib.asyncMod.AsyncVoidFunction[E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def each[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncIterator[T, E]
  ): scala.Unit = js.native
  def each[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncIterator[T, E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def eachLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncIterator[T, E]
  ): scala.Unit = js.native
  def eachLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncIterator[T, E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def ensureAsync(fn: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function = js.native
  def every[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def every[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def everyLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def everyLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def filter[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def filter[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def filterLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def filterLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def forEachOf[T, E](
    obj: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def forEachOf[T, E](
    obj: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forEachOfLimit[T, E](
    obj: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def forEachOfLimit[T, E](
    obj: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forever[E](
    next: js.Function1[/* next */ i2cDashBusLib.asyncMod.ErrorCallback[E], scala.Unit],
    errBack: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def log(fn: js.Function, args: js.Any*): scala.Unit = js.native
  def map[T, R, E](
    arr: i2cDashBusLib.asyncMod.Dictionary[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]
  ): scala.Unit = js.native
  def map[T, R, E](
    arr: i2cDashBusLib.asyncMod.Dictionary[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: js.Array[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def map[T, R, E](arr: nodeLib.IterableIterator[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: nodeLib.IterableIterator[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapLimit[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]
  ): scala.Unit = js.native
  def mapLimit[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapValues[T, R, E](
    obj: i2cDashBusLib.asyncMod.Dictionary[T],
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ i2cDashBusLib.asyncMod.AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
  def mapValuesLimit[T, R, E](
    obj: i2cDashBusLib.asyncMod.Dictionary[T],
    limit: scala.Double,
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ i2cDashBusLib.asyncMod.AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
  def memoize(fn: js.Function): js.Function = js.native
  def memoize(fn: js.Function, hasher: js.Function): js.Function = js.native
  def nextTick(callback: js.Function, args: js.Any*): scala.Unit = js.native
  def parallel[T, E](tasks: i2cDashBusLib.asyncMod.Dictionary[i2cDashBusLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](
    tasks: i2cDashBusLib.asyncMod.Dictionary[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def parallel[T, E](tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](
    tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def parallelLimit[T, E](
    tasks: i2cDashBusLib.asyncMod.Dictionary[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    limit: scala.Double
  ): scala.Unit = js.native
  def parallelLimit[T, E](
    tasks: i2cDashBusLib.asyncMod.Dictionary[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    limit: scala.Double,
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def parallelLimit[T, E](tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]], limit: scala.Double): scala.Unit = js.native
  def parallelLimit[T, E](
    tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    limit: scala.Double,
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def priorityQueue[T, E](worker: i2cDashBusLib.asyncMod.AsyncWorker[T, E], concurrency: scala.Double): i2cDashBusLib.asyncMod.AsyncPriorityQueue[T] = js.native
  def queue[T, E](worker: i2cDashBusLib.asyncMod.AsyncWorker[T, E]): i2cDashBusLib.asyncMod.AsyncQueue[T] = js.native
  def queue[T, E](worker: i2cDashBusLib.asyncMod.AsyncWorker[T, E], concurrency: scala.Double): i2cDashBusLib.asyncMod.AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]): i2cDashBusLib.asyncMod.AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E], concurrency: scala.Double): i2cDashBusLib.asyncMod.AsyncQueue[T] = js.native
  def race[T, E](
    tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def reduce[T, R, E](arr: js.Array[T], memo: R, iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def reduce[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reduce[T, R, E](
    arr: nodeLib.IterableIterator[T],
    memo: R,
    iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E]
  ): scala.Unit = js.native
  def reduce[T, R, E](
    arr: nodeLib.IterableIterator[T],
    memo: R,
    iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reflect[T, E](fn: i2cDashBusLib.asyncMod.AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ scala.Null, /* result */ i2cDashBusLib.Anon_Error[E, T], scala.Unit], 
    scala.Unit
  ] = js.native
  def reflectAll[T, E](tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ scala.Null, /* result */ i2cDashBusLib.Anon_Error[E, T], scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  def retry[T, E](
    opts: i2cDashBusLib.Anon_Interval,
    task: js.Function2[
      /* callback */ i2cDashBusLib.asyncMod.AsyncResultCallback[T, E], 
      /* results */ js.Any, 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[_, E]
  ): scala.Unit = js.native
  def retry[T, E](
    opts: scala.Double,
    task: js.Function2[
      /* callback */ i2cDashBusLib.asyncMod.AsyncResultCallback[T, E], 
      /* results */ js.Any, 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[_, E]
  ): scala.Unit = js.native
  def retryable[T, E](opts: i2cDashBusLib.Anon_IntervalTimes, task: i2cDashBusLib.asyncMod.AsyncFunction[T, E]): i2cDashBusLib.asyncMod.AsyncFunction[T, E] = js.native
  def retryable[T, E](opts: scala.Double, task: i2cDashBusLib.asyncMod.AsyncFunction[T, E]): i2cDashBusLib.asyncMod.AsyncFunction[T, E] = js.native
  def seq(fns: js.Function*): js.Function = js.native
  def series[T, E](tasks: i2cDashBusLib.asyncMod.Dictionary[i2cDashBusLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def series[T, E](
    tasks: i2cDashBusLib.asyncMod.Dictionary[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def series[T, E](tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def series[T, E](
    tasks: js.Array[i2cDashBusLib.asyncMod.AsyncFunction[T, E]],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def some[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def some[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def someLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def someLimit[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, V, E]): scala.Unit = js.native
  def sortBy[T, V, E](
    arr: js.Array[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, V, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def sortBy[T, V, E](arr: nodeLib.IterableIterator[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, V, E]): scala.Unit = js.native
  def sortBy[T, V, E](
    arr: nodeLib.IterableIterator[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, V, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timeout[T, E](fn: i2cDashBusLib.asyncMod.AsyncFunction[T, E], milliseconds: scala.Double): i2cDashBusLib.asyncMod.AsyncFunction[T, E] = js.native
  def timeout[T, E](fn: i2cDashBusLib.asyncMod.AsyncFunction[T, E], milliseconds: scala.Double, info: js.Any): i2cDashBusLib.asyncMod.AsyncFunction[T, E] = js.native
  def timeout[T, R, E](fn: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E], milliseconds: scala.Double): i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E] = js.native
  def timeout[T, R, E](fn: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E], milliseconds: scala.Double, info: js.Any): i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E] = js.native
  def times[T, E](
    n: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[scala.Double, T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timesLimit[T, E](
    n: scala.Double,
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[scala.Double, T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timesSeries[T, E](
    n: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[scala.Double, T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    acc: org.scalablytyped.runtime.StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    acc: org.scalablytyped.runtime.StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def unmemoize(fn: js.Function): js.Function = js.native
  def until[E](
    test: js.Function0[scala.Boolean],
    fn: i2cDashBusLib.asyncMod.AsyncVoidFunction[E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function]): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function], callback: i2cDashBusLib.asyncMod.AsyncResultCallback[T, E]): scala.Unit = js.native
  def whilst[E](
    test: js.Function0[scala.Boolean],
    fn: i2cDashBusLib.asyncMod.AsyncVoidFunction[E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def wrapSync(fn: js.Function): js.Function = js.native
}

