package typings.igniteUi.global.Infragistics

import typings.igniteUi.OlapResultAxisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.OlapResultAxis")
@js.native
class OlapResultAxis protected ()
  extends typings.igniteUi.Infragistics.OlapResultAxis {
  def this(options: OlapResultAxisOptions) = this()
  /**
    * Returns the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  /* CompleteClass */
  override def tupleSize(): Double = js.native
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  /* CompleteClass */
  override def tuples(): js.Array[_] = js.native
}

