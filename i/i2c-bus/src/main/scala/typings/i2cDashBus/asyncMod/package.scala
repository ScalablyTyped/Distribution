package typings.i2cDashBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.IterableIterator

  type AsyncAutoTask[R1, R /* <: Dictionary[_] */, E] = (AsyncAutoTaskFunctionWithoutDependencies[R1, E]) | (js.Array[String | (AsyncAutoTaskFunction[R1, R, E])])
  type AsyncAutoTaskFunction[R1, R /* <: Dictionary[_] */, E] = js.Function2[/* results */ R, /* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  type AsyncAutoTaskFunctionWithoutDependencies[R1, E] = js.Function1[/* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  type AsyncAutoTasks[R /* <: Dictionary[_] */, E] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof R ]: i2c-bus.i2c-bus/async.AsyncAutoTask<R[K], R, E>}
    */ typings.i2cDashBus.i2cDashBusStrings.AsyncAutoTasks with R
  type AsyncBooleanIterator[T, E] = js.Function2[/* item */ T, /* callback */ AsyncBooleanResultCallback[E], Unit]
  type AsyncBooleanResultCallback[E] = js.Function2[/* err */ js.UndefOr[E | Null], /* truthValue */ js.UndefOr[Boolean], Unit]
  type AsyncForEachOfIterator[T, E] = js.Function3[/* item */ T, /* key */ Double | String, /* callback */ ErrorCallback[E], Unit]
  type AsyncFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | Null], /* result */ js.UndefOr[T], Unit], 
    Unit
  ]
  type AsyncFunctionEx[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | Null], /* repeated */ T, Unit], 
    Unit
  ]
  type AsyncIterator[T, E] = js.Function2[/* item */ T, /* callback */ ErrorCallback[E], Unit]
  type AsyncMemoIterator[T, R, E] = js.Function3[/* memo */ js.UndefOr[R], /* item */ T, /* callback */ AsyncResultCallback[R, E], Unit]
  type AsyncResultArrayCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E | Null], 
    /* results */ js.UndefOr[js.Array[js.UndefOr[T]]], 
    Unit
  ]
  type AsyncResultCallback[T, E] = js.Function2[/* err */ js.UndefOr[E | Null], /* result */ js.UndefOr[T], Unit]
  type AsyncResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ AsyncResultCallback[R, E], Unit]
  type AsyncResultObjectCallback[T, E] = js.Function2[/* err */ js.UndefOr[E], /* results */ Dictionary[js.UndefOr[T]], Unit]
  type AsyncVoidFunction[E] = js.Function1[/* callback */ ErrorCallback[E], Unit]
  type AsyncWorker[T, E] = js.Function2[/* task */ T, /* callback */ ErrorCallback[E], Unit]
  type Dictionary[T] = StringDictionary[T]
  type ErrorCallback[E] = js.Function1[/* err */ js.UndefOr[E | Null], Unit]
  type IterableCollection[T] = js.Array[T] | IterableIterator[T] | Dictionary[T]
}
