package typings.ionicUtilsArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-array", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def concurrentFilter[T](array: js.Array[T], callback: js.Function1[/* currentValue */ T, js.Promise[Boolean]]): js.Promise[js.Array[T]] = js.native
  def conform[T](): js.Array[T] = js.native
  def conform[T](t: T): js.Array[T] = js.native
  def conform[T](t: js.Array[T]): js.Array[T] = js.native
  def filter[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[Boolean]
    ]
  ): js.Promise[js.Array[T]] = js.native
  def map[T, U](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[U]
    ]
  ): js.Promise[js.Array[U]] = js.native
  def move[T](array: js.Array[T], fromIndex: Double, toIndex: Double): js.Array[T] = js.native
  def reduce[T](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[T]
    ]
  ): js.Promise[T] = js.native
  def reduce[T](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[T]
    ],
    initialValue: T
  ): js.Promise[T] = js.native
  @JSName("reduce")
  def reduce_TR[T, R](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ R, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[R]
    ]
  ): js.Promise[R] = js.native
  @JSName("reduce")
  def reduce_TU[T, U](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[U]
    ],
    initialValue: U
  ): js.Promise[U] = js.native
  def replace[T](array: js.Array[T], index: Double, item: T): js.Array[T] = js.native
  def splice[T](array: js.Array[T], start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): js.Array[T] = js.native
  def splice[T](array: js.Array[T], start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
}

