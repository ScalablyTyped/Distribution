package typings
package hexoDashUtilLib.hexoDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern[T] extends js.Object {
  def `match`(str: java.lang.String): T
  def test(str: java.lang.String): scala.Boolean
}

object Pattern {
  @scala.inline
  def apply[T](`match`: java.lang.String => T, test: java.lang.String => scala.Boolean): Pattern[T] = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Pattern[T]]
  }
}

