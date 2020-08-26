package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option[T] extends js.Object {
  var index: Double = js.native
  var option: T = js.native
}

object Option {
  @scala.inline
  def apply[T](index: Double, option: T): Option[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[T]]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option[_], T] (val x: Self with Option[T]) extends AnyVal {
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
    def setOption(value: T): Self = this.set("option", value.asInstanceOf[js.Any])
  }
  
}

