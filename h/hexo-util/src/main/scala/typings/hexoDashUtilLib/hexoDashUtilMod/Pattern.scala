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
  def apply[T](`match`: js.Function1[java.lang.String, T], test: js.Function1[java.lang.String, scala.Boolean]): Pattern[T] = {
    val __obj = js.Dynamic.literal(test = test)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Pattern[T]]
  }
}

