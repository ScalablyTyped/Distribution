package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofgeoip extends js.Object {
  def `match`(tomatch: String, pvclass: String): Double = js.native
}

object Typeofgeoip {
  @scala.inline
  def apply(`match`: (String, String) => Double): Typeofgeoip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Typeofgeoip]
  }
  @scala.inline
  implicit class TypeofgeoipOps[Self <: Typeofgeoip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatch(value: (String, String) => Double): Self = this.set("match", js.Any.fromFunction2(value))
  }
  
}

