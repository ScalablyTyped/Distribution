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
    each: js.Function1[
      js.Function3[
        /* element */ T, 
        /* index */ js.UndefOr[scala.Double], 
        /* elements */ js.UndefOr[js.Array[T]], 
        scala.Unit
      ], 
      js.Any
    ],
    elements: js.Array[T],
    randomize: js.Function1[js.Any, GenericCollection[T]],
    rename: js.Function1[java.lang.String, GenericCollection[T]],
    select: js.Function0[GenericCollection[T]],
    toGrid: js.Function2[scala.Double, scala.Double, GenericCollection[T]],
    update: js.Function0[GenericCollection[T]]
  ): GenericCollection[T] = {
    val __obj = js.Dynamic.literal(each = each, elements = elements, randomize = randomize, rename = rename, select = select, toGrid = toGrid, update = update)
  
    __obj.asInstanceOf[GenericCollection[T]]
  }
}

