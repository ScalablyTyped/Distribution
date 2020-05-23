package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapResultTuple extends js.Object {
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  def members(): js.Array[_]
}

object OlapResultTuple {
  @scala.inline
  def apply(members: () => js.Array[_]): OlapResultTuple = {
    val __obj = js.Dynamic.literal(members = js.Any.fromFunction0(members))
    __obj.asInstanceOf[OlapResultTuple]
  }
}

