package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpdt extends js.Object {
  def pd_translate(sd: String, md: Double): Double = js.native
  def pprefix2domain(m: Double, s: Double): Double = js.native
}

object Typeofpdt {
  @scala.inline
  def apply(pd_translate: (String, Double) => Double, pprefix2domain: (Double, Double) => Double): Typeofpdt = {
    val __obj = js.Dynamic.literal(pd_translate = js.Any.fromFunction2(pd_translate), pprefix2domain = js.Any.fromFunction2(pprefix2domain))
    __obj.asInstanceOf[Typeofpdt]
  }
  @scala.inline
  implicit class TypeofpdtOps[Self <: Typeofpdt] (val x: Self) extends AnyVal {
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
    def setPd_translate(value: (String, Double) => Double): Self = this.set("pd_translate", js.Any.fromFunction2(value))
    @scala.inline
    def setPprefix2domain(value: (Double, Double) => Double): Self = this.set("pprefix2domain", js.Any.fromFunction2(value))
  }
  
}

