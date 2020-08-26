package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdiversion extends js.Object {
  def add_diversion(reason: String): Double = js.native
  def add_diversion_uri(reason: String, uri: String): Double = js.native
}

object Typeofdiversion {
  @scala.inline
  def apply(add_diversion: String => Double, add_diversion_uri: (String, String) => Double): Typeofdiversion = {
    val __obj = js.Dynamic.literal(add_diversion = js.Any.fromFunction1(add_diversion), add_diversion_uri = js.Any.fromFunction2(add_diversion_uri))
    __obj.asInstanceOf[Typeofdiversion]
  }
  @scala.inline
  implicit class TypeofdiversionOps[Self <: Typeofdiversion] (val x: Self) extends AnyVal {
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
    def setAdd_diversion(value: String => Double): Self = this.set("add_diversion", js.Any.fromFunction1(value))
    @scala.inline
    def setAdd_diversion_uri(value: (String, String) => Double): Self = this.set("add_diversion_uri", js.Any.fromFunction2(value))
  }
  
}

