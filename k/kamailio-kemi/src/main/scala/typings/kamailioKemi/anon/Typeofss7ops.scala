package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofss7ops extends js.Object {
  def isup_to_json(proto: Double): Double = js.native
}

object Typeofss7ops {
  @scala.inline
  def apply(isup_to_json: Double => Double): Typeofss7ops = {
    val __obj = js.Dynamic.literal(isup_to_json = js.Any.fromFunction1(isup_to_json))
    __obj.asInstanceOf[Typeofss7ops]
  }
  @scala.inline
  implicit class Typeofss7opsOps[Self <: Typeofss7ops] (val x: Self) extends AnyVal {
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
    def setIsup_to_json(value: Double => Double): Self = this.set("isup_to_json", js.Any.fromFunction1(value))
  }
  
}

