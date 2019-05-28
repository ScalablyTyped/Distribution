package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofphonenum extends js.Object {
  def `match`(tomatch: java.lang.String, pvclass: java.lang.String): scala.Double
}

object Typeofphonenum {
  @scala.inline
  def apply(`match`: (java.lang.String, java.lang.String) => scala.Double): Typeofphonenum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Typeofphonenum]
  }
}

