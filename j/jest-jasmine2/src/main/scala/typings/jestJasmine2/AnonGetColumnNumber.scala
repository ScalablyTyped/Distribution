package typings.jestJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetColumnNumber extends js.Object {
  def getColumnNumber(): Double
  def getLineNumber(): Double
}

object AnonGetColumnNumber {
  @scala.inline
  def apply(getColumnNumber: () => Double, getLineNumber: () => Double): AnonGetColumnNumber = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getLineNumber = js.Any.fromFunction0(getLineNumber))
    __obj.asInstanceOf[AnonGetColumnNumber]
  }
}

