package typings.koaPug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends PugOptions {
  /**
    * Render template string instead template file
    */
  var fromString: js.UndefOr[Boolean] = js.native
}

object RenderOptions {
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
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
    def setFromString(value: Boolean): Self = this.set("fromString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromString: Self = this.set("fromString", js.undefined)
  }
  
}

