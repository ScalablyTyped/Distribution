package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeoip extends js.Object {
  def `match`(tomatch: java.lang.String, pvclass: java.lang.String): scala.Double
}

object Typeofgeoip {
  @scala.inline
  def apply(`match`: (java.lang.String, java.lang.String) => scala.Double): Typeofgeoip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Typeofgeoip]
  }
}

