package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconOptions extends BaseIconOptions {
  @JSName("iconUrl")
  var iconUrl_IconOptions: String = js.native
}

object IconOptions {
  @scala.inline
  def apply(iconUrl: String): IconOptions = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
  @scala.inline
  implicit class IconOptionsOps[Self <: IconOptions] (val x: Self) extends AnyVal {
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
  }
  
}

