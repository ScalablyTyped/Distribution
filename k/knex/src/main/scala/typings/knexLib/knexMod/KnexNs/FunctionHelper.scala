package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionHelper extends js.Object {
  def now(): Raw
}

object FunctionHelper {
  @scala.inline
  def apply(now: js.Function0[Raw]): FunctionHelper = {
    val __obj = js.Dynamic.literal(now = now)
  
    __obj.asInstanceOf[FunctionHelper]
  }
}

