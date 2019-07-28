package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofphonenum extends js.Object {
  def `match`(tomatch: String, pvclass: String): Double
}

object Typeofphonenum {
  @scala.inline
  def apply(`match`: (String, String) => Double): Typeofphonenum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Typeofphonenum]
  }
}

