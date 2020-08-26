package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brspaces extends js.Object {
  var br_spaces: js.UndefOr[Double] = js.native
  var list_item_empty_lines: js.UndefOr[Boolean] = js.native
}

object Brspaces {
  @scala.inline
  def apply(): Brspaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brspaces]
  }
  @scala.inline
  implicit class BrspacesOps[Self <: Brspaces] (val x: Self) extends AnyVal {
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
    def setBr_spaces(value: Double): Self = this.set("br_spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBr_spaces: Self = this.set("br_spaces", js.undefined)
    @scala.inline
    def setList_item_empty_lines(value: Boolean): Self = this.set("list_item_empty_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList_item_empty_lines: Self = this.set("list_item_empty_lines", js.undefined)
  }
  
}

