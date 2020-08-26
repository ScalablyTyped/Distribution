package typings.jquerySortable.JQuerySortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerOptions extends js.Object {
  var drag: js.UndefOr[Boolean] = js.native
  var drop: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[String] = js.native
  var nested: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ContainerOptions {
  @scala.inline
  def apply(): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOptions]
  }
  @scala.inline
  implicit class ContainerOptionsOps[Self <: ContainerOptions] (val x: Self) extends AnyVal {
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
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDrop(value: Boolean): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setExclude(value: String): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setNested(value: Boolean): Self = this.set("nested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNested: Self = this.set("nested", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

