package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.TypeParser")
@js.native
class TypeParser () extends js.Object {
  def empty(): Unit = js.native
  def isNullOrUndefined(obj: js.Object): Unit = js.native
  def num(): Unit = js.native
  def toBool(obj: js.Object): Unit = js.native
  /**
  	 * L.A. 18 June 2012 Fixing bug #113265 Column 'date' shows empty values as 'NaN'
  	 *
  	 * @param obj
  	 */
  def toDate(obj: js.Object): Unit = js.native
  def toNumber(obj: js.Object): Unit = js.native
  def toStr(obj: js.Object): Unit = js.native
  def toTime(obj: js.Object): Unit = js.native
}

