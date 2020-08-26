package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbDragMoveEventUIParam extends js.Object {
  /**
    * Gets which scrollbar thumb is being used - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets how much the content will be scrolled horizontally.
    */
  var stepX: js.UndefOr[Double] = js.native
  /**
    * Gets how much the content will be scrolled vertically.
    */
  var stepY: js.UndefOr[Double] = js.native
}

object ThumbDragMoveEventUIParam {
  @scala.inline
  def apply(): ThumbDragMoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbDragMoveEventUIParam]
  }
  @scala.inline
  implicit class ThumbDragMoveEventUIParamOps[Self <: ThumbDragMoveEventUIParam] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setStepX(value: Double): Self = this.set("stepX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepX: Self = this.set("stepX", js.undefined)
    @scala.inline
    def setStepY(value: Double): Self = this.set("stepY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepY: Self = this.set("stepY", js.undefined)
  }
  
}

