package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssProps extends js.Object {
  var contentZooming: String = js.native
  var tapHighlightColor: String = js.native
  var touchCallout: String = js.native
  var touchSelect: String = js.native
  var userDrag: String = js.native
  var userSelect: String = js.native
}

object CssProps {
  @scala.inline
  def apply(
    contentZooming: String,
    tapHighlightColor: String,
    touchCallout: String,
    touchSelect: String,
    userDrag: String,
    userSelect: String
  ): CssProps = {
    val __obj = js.Dynamic.literal(contentZooming = contentZooming.asInstanceOf[js.Any], tapHighlightColor = tapHighlightColor.asInstanceOf[js.Any], touchCallout = touchCallout.asInstanceOf[js.Any], touchSelect = touchSelect.asInstanceOf[js.Any], userDrag = userDrag.asInstanceOf[js.Any], userSelect = userSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssProps]
  }
  @scala.inline
  implicit class CssPropsOps[Self <: CssProps] (val x: Self) extends AnyVal {
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
    def setContentZooming(value: String): Self = this.set("contentZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def setTapHighlightColor(value: String): Self = this.set("tapHighlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchCallout(value: String): Self = this.set("touchCallout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchSelect(value: String): Self = this.set("touchSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserDrag(value: String): Self = this.set("userDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSelect(value: String): Self = this.set("userSelect", value.asInstanceOf[js.Any])
  }
  
}

