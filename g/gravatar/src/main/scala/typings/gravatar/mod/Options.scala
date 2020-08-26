package typings.gravatar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cdn: js.UndefOr[String] = js.native
  var d: js.UndefOr[String] = js.native
  var default: js.UndefOr[String] = js.native
  var f: js.UndefOr[String] = js.native
  var forcedefault: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var r: js.UndefOr[String] = js.native
  var rating: js.UndefOr[String] = js.native
  var s: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
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
    def setCdn(value: String): Self = this.set("cdn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdn: Self = this.set("cdn", js.undefined)
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setF(value: String): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    @scala.inline
    def setForcedefault(value: String): Self = this.set("forcedefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcedefault: Self = this.set("forcedefault", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

