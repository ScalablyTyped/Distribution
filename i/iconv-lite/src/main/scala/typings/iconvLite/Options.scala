package typings.iconvLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var addBOM: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[String] = js.native
  var stripBOM: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAddBOM(value: Boolean): Self = this.set("addBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBOM: Self = this.set("addBOM", js.undefined)
    @scala.inline
    def setDefaultEncoding(value: String): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    @scala.inline
    def setStripBOM(value: Boolean): Self = this.set("stripBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripBOM: Self = this.set("stripBOM", js.undefined)
  }
  
}

