package typings.jointjs.mod.dia.Graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExploreOptions extends ConnectionOptions {
  var breadthFirst: js.UndefOr[Boolean] = js.native
}

object ExploreOptions {
  @scala.inline
  def apply(): ExploreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExploreOptions]
  }
  @scala.inline
  implicit class ExploreOptionsOps[Self <: ExploreOptions] (val x: Self) extends AnyVal {
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
    def setBreadthFirst(value: Boolean): Self = this.set("breadthFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreadthFirst: Self = this.set("breadthFirst", js.undefined)
  }
  
}

