package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselItem extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var item: js.UndefOr[js.Any] = js.native
  var prevIndex: js.UndefOr[Double] = js.native
}

object CarouselItem {
  @scala.inline
  def apply(): CarouselItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselItem]
  }
  @scala.inline
  implicit class CarouselItemOps[Self <: CarouselItem] (val x: Self) extends AnyVal {
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
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setPrevIndex(value: Double): Self = this.set("prevIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevIndex: Self = this.set("prevIndex", js.undefined)
  }
  
}

