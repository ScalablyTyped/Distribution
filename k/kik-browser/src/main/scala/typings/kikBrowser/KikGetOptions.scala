package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KikGetOptions extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minResults: js.UndefOr[Double] = js.native
  var quality: js.UndefOr[Double] = js.native
}

object KikGetOptions {
  @scala.inline
  def apply(): KikGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikGetOptions]
  }
  @scala.inline
  implicit class KikGetOptionsOps[Self <: KikGetOptions] (val x: Self) extends AnyVal {
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
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinResults(value: Double): Self = this.set("minResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinResults: Self = this.set("minResults", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

