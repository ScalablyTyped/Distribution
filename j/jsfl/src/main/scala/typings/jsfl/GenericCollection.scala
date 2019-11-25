package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericCollection[T] extends js.Object {
  var elements: js.Array[T]
  def each(
    callback: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ]
  ): js.Any
  def randomize(info: js.Any): GenericCollection[T]
  def rename(pattern: String): GenericCollection[T]
  def select(): GenericCollection[T]
  def toGrid(x: Double, y: Double): GenericCollection[T]
  def update(): GenericCollection[T]
}

object GenericCollection {
  @scala.inline
  def apply[T](
    each: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ] => js.Any,
    elements: js.Array[T],
    randomize: js.Any => GenericCollection[T],
    rename: String => GenericCollection[T],
    select: () => GenericCollection[T],
    toGrid: (Double, Double) => GenericCollection[T],
    update: () => GenericCollection[T]
  ): GenericCollection[T] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), elements = elements.asInstanceOf[js.Any], randomize = js.Any.fromFunction1(randomize), rename = js.Any.fromFunction1(rename), select = js.Any.fromFunction0(select), toGrid = js.Any.fromFunction2(toGrid), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[GenericCollection[T]]
  }
}

