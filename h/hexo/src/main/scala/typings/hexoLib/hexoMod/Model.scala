package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model[T] extends js.Object {
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def count(): scala.Double
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def filter(fn: js.Function2[/* v */ T, /* i */ scala.Double, scala.Boolean]): Model[T]
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def forEach(fn: js.Function2[/* v */ T, /* i */ scala.Double, scala.Unit]): scala.Unit
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def map[U](fn: js.Function2[/* v */ T, /* i */ scala.Double, U]): js.Array[U]
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def toArray(): js.Array[T]
}

object Model {
  @scala.inline
  def apply[T](
    count: js.Function0[scala.Double],
    filter: js.Function1[js.Function2[/* v */ T, /* i */ scala.Double, scala.Boolean], Model[T]],
    forEach: js.Function1[js.Function2[/* v */ T, /* i */ scala.Double, scala.Unit], scala.Unit],
    map: js.Function1[js.Function2[/* v */ T, /* i */ scala.Double, js.Any], js.Array[js.Any]],
    toArray: js.Function0[js.Array[T]]
  ): Model[T] = {
    val __obj = js.Dynamic.literal(count = count, filter = filter, forEach = forEach, map = map, toArray = toArray)
  
    __obj.asInstanceOf[Model[T]]
  }
}

