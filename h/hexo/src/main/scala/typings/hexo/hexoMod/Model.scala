package typings.hexo.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model[T] extends js.Object {
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def count(): Double
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def filter(fn: js.Function2[/* v */ T, /* i */ Double, Boolean]): Model[T]
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def forEach(fn: js.Function2[/* v */ T, /* i */ Double, Unit]): Unit
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def map[U](fn: js.Function2[/* v */ T, /* i */ Double, U]): js.Array[U]
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def toArray(): js.Array[T]
}

object Model {
  @scala.inline
  def apply[T](
    count: () => Double,
    filter: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T],
    forEach: js.Function2[/* v */ T, /* i */ Double, Unit] => Unit,
    map: js.Function2[/* v */ T, /* i */ Double, js.Any] => js.Array[js.Any],
    toArray: () => js.Array[T]
  ): Model[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map), toArray = js.Any.fromFunction0(toArray))
  
    __obj.asInstanceOf[Model[T]]
  }
}

