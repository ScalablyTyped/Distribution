package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericCollection[T] extends js.Object {
  var elements: js.Array[T]
  def each(
    callback: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[scala.Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      scala.Unit
    ]
  ): js.Any
  def randomize(info: js.Any): GenericCollection[T]
  def rename(pattern: java.lang.String): GenericCollection[T]
  def select(): GenericCollection[T]
  def toGrid(x: scala.Double, y: scala.Double): GenericCollection[T]
  def update(): GenericCollection[T]
}

object GenericCollection {
  @scala.inline
  def apply[T](
    each: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[scala.Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      scala.Unit
    ] => js.Any,
    elements: js.Array[T],
    randomize: js.Any => GenericCollection[T],
    rename: java.lang.String => GenericCollection[T],
    select: () => GenericCollection[T],
    toGrid: (scala.Double, scala.Double) => GenericCollection[T],
    update: () => GenericCollection[T]
  ): GenericCollection[T] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), elements = elements, randomize = js.Any.fromFunction1(randomize), rename = js.Any.fromFunction1(rename), select = js.Any.fromFunction0(select), toGrid = js.Any.fromFunction2(toGrid), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[GenericCollection[T]]
  }
}

