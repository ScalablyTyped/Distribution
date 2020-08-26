package typings.knockoutPreRendered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutArrayChange[T] extends js.Object {
  var index: Double = js.native
  var moved: js.UndefOr[Double] = js.native
  var status: String = js.native
  var value: T = js.native
}

object KnockoutArrayChange {
  @scala.inline
  def apply[T](index: Double, status: String, value: T): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
  @scala.inline
  implicit class KnockoutArrayChangeOps[Self <: KnockoutArrayChange[_], T] (val x: Self with KnockoutArrayChange[T]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoved(value: Double): Self = this.set("moved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
  }
  
}

