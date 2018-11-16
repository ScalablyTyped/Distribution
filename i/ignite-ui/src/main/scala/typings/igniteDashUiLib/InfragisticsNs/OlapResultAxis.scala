package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.OlapResultAxis")
@js.native
class OlapResultAxis protected () extends js.Object {
  def this(options: igniteDashUiLib.OlapResultAxisOptions) = this()
  /**
  	 * Returns the count of the $.ig.OlapResultAxisMember objects of each tuple.
  	 */
  def tupleSize(): scala.Double = js.native
  /**
  	 * Returns an array of $.ig.OlapResultTuple objects which form the axis.
  	 */
  def tuples(): js.Array[_] = js.native
}

