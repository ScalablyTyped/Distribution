package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapResult extends js.Object {
  /**
    * Returns an array of $.ig.OlapResultAxis objects this result is built on.
    *
    * @param value
    */
  def axes(value: js.Object): js.Array[_]
  /**
    * Returns an array of $.ig.OlapResultCell objects which hold the result data.
    *
    * @param value
    */
  def cells(value: js.Object): js.Array[_]
  /**
    * Returns a value indicating whether the result object contains any data.
    *
    * @param value
    */
  def isEmpty(value: js.Object): Boolean
}

object OlapResult {
  @scala.inline
  def apply(axes: js.Object => js.Array[_], cells: js.Object => js.Array[_], isEmpty: js.Object => Boolean): OlapResult = {
    val __obj = js.Dynamic.literal(axes = js.Any.fromFunction1(axes), cells = js.Any.fromFunction1(cells), isEmpty = js.Any.fromFunction1(isEmpty))
    __obj.asInstanceOf[OlapResult]
  }
}

