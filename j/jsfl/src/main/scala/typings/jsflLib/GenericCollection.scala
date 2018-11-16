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

