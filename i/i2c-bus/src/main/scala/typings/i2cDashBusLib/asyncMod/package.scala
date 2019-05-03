package typings
package i2cDashBusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncMod {
  type AsyncAutoTask[R1, R /* <: Dictionary[_] */, E] = (AsyncAutoTaskFunctionWithoutDependencies[R1, E]) | (js.Array[java.lang.String | (AsyncAutoTaskFunction[R1, R, E])])
  type AsyncAutoTaskFunction[R1, R /* <: Dictionary[_] */, E] = js.Function2[
    /* results */ R, 
    /* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncAutoTaskFunctionWithoutDependencies[R1, E] = js.Function1[/* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], scala.Unit]
  type AsyncAutoTasks[R /* <: Dictionary[_] */, E] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof R ]: i2c-bus.i2c-bus/async.AsyncAutoTask<R[K], R, E>}
    */ i2cDashBusLib.i2cDashBusLibStrings.AsyncAutoTasks with R
  type AsyncBooleanIterator[T, E] = js.Function2[/* item */ T, /* callback */ AsyncBooleanResultCallback[E], scala.Unit]
  type AsyncBooleanResultCallback[E] = js.Function2[
    /* err */ js.UndefOr[E | scala.Null], 
    /* truthValue */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type AsyncForEachOfIterator[T, E] = js.Function3[
    /* item */ T, 
    /* key */ scala.Double | java.lang.String, 
    /* callback */ ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | scala.Null], /* result */ js.UndefOr[T], scala.Unit], 
    scala.Unit
  ]
  type AsyncFunctionEx[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | scala.Null], /* repeated */ T, scala.Unit], 
    scala.Unit
  ]
  type AsyncIterator[T, E] = js.Function2[/* item */ T, /* callback */ ErrorCallback[E], scala.Unit]
  type AsyncMemoIterator[T, R, E] = js.Function3[
    /* memo */ js.UndefOr[R], 
    /* item */ T, 
    /* callback */ AsyncResultCallback[R, E], 
    scala.Unit
  ]
  type AsyncResultArrayCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E | scala.Null], 
    /* results */ js.UndefOr[js.Array[js.UndefOr[T]]], 
    scala.Unit
  ]
  type AsyncResultCallback[T, E] = js.Function2[/* err */ js.UndefOr[E | scala.Null], /* result */ js.UndefOr[T], scala.Unit]
  type AsyncResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ AsyncResultCallback[R, E], scala.Unit]
  type AsyncResultObjectCallback[T, E] = js.Function2[/* err */ js.UndefOr[E], /* results */ Dictionary[js.UndefOr[T]], scala.Unit]
  type AsyncVoidFunction[E] = js.Function1[/* callback */ ErrorCallback[E], scala.Unit]
  type AsyncWorker[T, E] = js.Function2[/* task */ T, /* callback */ ErrorCallback[E], scala.Unit]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorCallback[E] = js.Function1[/* err */ js.UndefOr[E | scala.Null], scala.Unit]
  type IterableCollection[T] = js.Array[T] | stdLib.IterableIterator[T] | Dictionary[T]
}
