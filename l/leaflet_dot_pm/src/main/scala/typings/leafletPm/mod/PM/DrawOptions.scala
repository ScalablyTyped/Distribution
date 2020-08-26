package typings.leafletPm.mod.PM

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOptions extends js.Object {
  var hintlineStyle: js.UndefOr[PathOptions] = js.native
  var pathOptions: js.UndefOr[PathOptions] = js.native
  var templineStyle: js.UndefOr[PathOptions] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
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
    def setHintlineStyle(value: PathOptions): Self = this.set("hintlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHintlineStyle: Self = this.set("hintlineStyle", js.undefined)
    @scala.inline
    def setPathOptions(value: PathOptions): Self = this.set("pathOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathOptions: Self = this.set("pathOptions", js.undefined)
    @scala.inline
    def setTemplineStyle(value: PathOptions): Self = this.set("templineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplineStyle: Self = this.set("templineStyle", js.undefined)
  }
  
}

