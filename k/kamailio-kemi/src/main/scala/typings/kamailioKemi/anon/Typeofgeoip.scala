package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeoip extends js.Object {
  def `match`(tomatch: String, pvclass: String): Double
}

object Typeofgeoip {
  @scala.inline
  def apply(`match`: (String, String) => Double): Typeofgeoip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Typeofgeoip]
  }
}

