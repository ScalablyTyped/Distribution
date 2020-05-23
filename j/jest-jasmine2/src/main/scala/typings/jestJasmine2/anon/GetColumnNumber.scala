package typings.jestJasmine2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetColumnNumber extends js.Object {
  def getColumnNumber(): Double
  def getLineNumber(): Double
}

object GetColumnNumber {
  @scala.inline
  def apply(getColumnNumber: () => Double, getLineNumber: () => Double): GetColumnNumber = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getLineNumber = js.Any.fromFunction0(getLineNumber))
    __obj.asInstanceOf[GetColumnNumber]
  }
}

