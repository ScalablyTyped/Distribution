package typings.materialSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PAGEFACTOR extends js.Object {
  var PAGE_FACTOR: Double = js.native
}

object PAGEFACTOR {
  @scala.inline
  def apply(PAGE_FACTOR: Double): PAGEFACTOR = {
    val __obj = js.Dynamic.literal(PAGE_FACTOR = PAGE_FACTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[PAGEFACTOR]
  }
  @scala.inline
  implicit class PAGEFACTOROps[Self <: PAGEFACTOR] (val x: Self) extends AnyVal {
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
    def setPAGE_FACTOR(value: Double): Self = this.set("PAGE_FACTOR", value.asInstanceOf[js.Any])
  }
  
}

