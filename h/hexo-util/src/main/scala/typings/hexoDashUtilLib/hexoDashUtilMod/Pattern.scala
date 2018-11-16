package typings
package hexoDashUtilLib.hexoDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pattern[T] extends js.Object {
  def `match`(str: java.lang.String): T
  def test(str: java.lang.String): scala.Boolean
}

