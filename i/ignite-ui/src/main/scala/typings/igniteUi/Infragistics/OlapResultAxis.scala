package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapResultAxis extends js.Object {
  /**
    * Returns the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  def tupleSize(): Double
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  def tuples(): js.Array[_]
}

object OlapResultAxis {
  @scala.inline
  def apply(tupleSize: () => Double, tuples: () => js.Array[_]): OlapResultAxis = {
    val __obj = js.Dynamic.literal(tupleSize = js.Any.fromFunction0(tupleSize), tuples = js.Any.fromFunction0(tuples))
    __obj.asInstanceOf[OlapResultAxis]
  }
}

