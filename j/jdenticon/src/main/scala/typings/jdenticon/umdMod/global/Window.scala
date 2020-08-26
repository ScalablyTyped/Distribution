package typings.jdenticon.umdMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /**
    * Specifies options for generated identicons.
    * 
    * See also {@link jdenticon.config} for Node usage.
    */
  var jdenticon_config: js.UndefOr[JdenticonConfig] = js.native
}

object Window {
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setJdenticon_config(value: JdenticonConfig): Self = this.set("jdenticon_config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJdenticon_config: Self = this.set("jdenticon_config", js.undefined)
  }
  
}

