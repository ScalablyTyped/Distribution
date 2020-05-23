package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureList extends js.Object {
  /**
    * Returns the caption of the measure list used when displaying the name of the measure list to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  /**
    * Returns an array of $.ig.Measure objects this measure list is grouping.
    *
    * @param value
    */
  def measures(value: js.Object): js.Array[_]
}

object MeasureList {
  @scala.inline
  def apply(caption: js.Object => String, measures: js.Object => js.Array[_]): MeasureList = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), measures = js.Any.fromFunction1(measures))
    __obj.asInstanceOf[MeasureList]
  }
}

