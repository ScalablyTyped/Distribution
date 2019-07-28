package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeoip2 extends js.Object {
  def `match`(tomatch: String, pvclass: String): Double
}

object Typeofgeoip2 {
  @scala.inline
  def apply(`match`: (String, String) => Double): Typeofgeoip2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Typeofgeoip2]
  }
}

