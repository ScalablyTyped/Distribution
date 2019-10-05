package typings.i2cDashBus.asyncMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "transform")
@js.native
object transform extends js.Object {
  def apply[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def apply[T, R, E](
    arr: StringDictionary[T],
    acc: StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[T, R, E](
    arr: StringDictionary[T],
    acc: StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultObjectCallback[T, E]
  ): Unit = js.native
  def apply[T, R, E](
    arr: StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[T, R, E](
    arr: StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultObjectCallback[T, E]
  ): Unit = js.native
}

