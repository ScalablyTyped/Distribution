package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableOptions extends DroppableEvents {
  var accept: js.UndefOr[js.Any] = js.native
  var activeClass: js.UndefOr[String] = js.native
  var addClasses: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var greedy: js.UndefOr[Boolean] = js.native
  var hoverClass: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var tolerance: js.UndefOr[String] = js.native
}

object DroppableOptions {
  @scala.inline
  def apply(): DroppableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableOptions]
  }
  @scala.inline
  implicit class DroppableOptionsOps[Self <: DroppableOptions] (val x: Self) extends AnyVal {
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
    def setAccept(value: js.Any): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setAddClasses(value: Boolean): Self = this.set("addClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddClasses: Self = this.set("addClasses", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreedy: Self = this.set("greedy", js.undefined)
    @scala.inline
    def setHoverClass(value: String): Self = this.set("hoverClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverClass: Self = this.set("hoverClass", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTolerance(value: String): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
  
}

