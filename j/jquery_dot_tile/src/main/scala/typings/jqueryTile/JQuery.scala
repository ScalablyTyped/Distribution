package typings.jqueryTile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Align the height of the largest of the elements arranged in the same row.
    * if columns is not specified, align the height of the largest of the all elements.
    *
    * @param columns Number of elements in a row
    */
  def tile(): Unit = js.native
  def tile(columns: Double): Unit = js.native
}

