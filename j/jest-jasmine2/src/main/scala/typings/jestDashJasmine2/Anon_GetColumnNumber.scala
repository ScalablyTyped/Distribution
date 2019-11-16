package typings.jestDashJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetColumnNumber extends js.Object {
  def getColumnNumber(): Double
  def getLineNumber(): Double
}

object Anon_GetColumnNumber {
  @scala.inline
  def apply(getColumnNumber: () => Double, getLineNumber: () => Double): Anon_GetColumnNumber = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getLineNumber = js.Any.fromFunction0(getLineNumber))
  
    __obj.asInstanceOf[Anon_GetColumnNumber]
  }
}

