package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParser extends js.Object {
  def empty(): Unit
  def isNullOrUndefined(obj: js.Object): Unit
  def num(): Unit
  def toBool(obj: js.Object): Unit
  /**
    * L.A. 18 June 2012 Fixing bug #113265 Column 'date' shows empty values as 'NaN'
    *
    * @param obj
    */
  def toDate(obj: js.Object): Unit
  def toNumber(obj: js.Object): Unit
  def toStr(obj: js.Object): Unit
  def toTime(obj: js.Object): Unit
}

object TypeParser {
  @scala.inline
  def apply(
    empty: () => Unit,
    isNullOrUndefined: js.Object => Unit,
    num: () => Unit,
    toBool: js.Object => Unit,
    toDate: js.Object => Unit,
    toNumber: js.Object => Unit,
    toStr: js.Object => Unit,
    toTime: js.Object => Unit
  ): TypeParser = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), num = js.Any.fromFunction0(num), toBool = js.Any.fromFunction1(toBool), toDate = js.Any.fromFunction1(toDate), toNumber = js.Any.fromFunction1(toNumber), toStr = js.Any.fromFunction1(toStr), toTime = js.Any.fromFunction1(toTime))
    __obj.asInstanceOf[TypeParser]
  }
}

