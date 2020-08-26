package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionRenderedEventUIParam extends js.Object {
  /**
    * Gets a reference to the caption container.
    */
  var captionContainer: js.UndefOr[Element] = js.native
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object CaptionRenderedEventUIParam {
  @scala.inline
  def apply(): CaptionRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionRenderedEventUIParam]
  }
  @scala.inline
  implicit class CaptionRenderedEventUIParamOps[Self <: CaptionRenderedEventUIParam] (val x: Self) extends AnyVal {
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
    def setCaptionContainer(value: Element): Self = this.set("captionContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionContainer: Self = this.set("captionContainer", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

