package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbDragStartEventUIParam extends js.Object {
  /**
    * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ThumbDragStartEventUIParam {
  @scala.inline
  def apply(): ThumbDragStartEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbDragStartEventUIParam]
  }
  @scala.inline
  implicit class ThumbDragStartEventUIParamOps[Self <: ThumbDragStartEventUIParam] (val x: Self) extends AnyVal {
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
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

