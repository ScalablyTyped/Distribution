package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sorted extends js.Object {
  var sorted: Boolean = js.native
}

object Sorted {
  @scala.inline
  def apply(sorted: Boolean): Sorted = {
    val __obj = js.Dynamic.literal(sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sorted]
  }
  @scala.inline
  implicit class SortedOps[Self <: Sorted] (val x: Self) extends AnyVal {
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
    def setSorted(value: Boolean): Self = this.set("sorted", value.asInstanceOf[js.Any])
  }
  
}

