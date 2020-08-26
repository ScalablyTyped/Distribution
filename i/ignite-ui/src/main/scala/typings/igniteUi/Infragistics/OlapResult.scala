package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapResult extends js.Object {
  /**
    * Returns an array of $.ig.OlapResultAxis objects this result is built on.
    *
    * @param value
    */
  def axes(value: js.Object): js.Array[_] = js.native
  /**
    * Returns an array of $.ig.OlapResultCell objects which hold the result data.
    *
    * @param value
    */
  def cells(value: js.Object): js.Array[_] = js.native
  /**
    * Returns a value indicating whether the result object contains any data.
    *
    * @param value
    */
  def isEmpty(value: js.Object): Boolean = js.native
}

object OlapResult {
  @scala.inline
  def apply(axes: js.Object => js.Array[_], cells: js.Object => js.Array[_], isEmpty: js.Object => Boolean): OlapResult = {
    val __obj = js.Dynamic.literal(axes = js.Any.fromFunction1(axes), cells = js.Any.fromFunction1(cells), isEmpty = js.Any.fromFunction1(isEmpty))
    __obj.asInstanceOf[OlapResult]
  }
  @scala.inline
  implicit class OlapResultOps[Self <: OlapResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxes(value: js.Object => js.Array[_]): Self = this.set("axes", js.Any.fromFunction1(value))
    @scala.inline
    def setCells(value: js.Object => js.Array[_]): Self = this.set("cells", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: js.Object => Boolean): Self = this.set("isEmpty", js.Any.fromFunction1(value))
  }
  
}

