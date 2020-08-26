package typings.jsDataHttp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alpha extends js.Object {
  var alpha: js.UndefOr[String | Boolean] = js.native
  var beta: js.UndefOr[String | Boolean] = js.native
  var full: js.UndefOr[String] = js.native
  var major: js.UndefOr[String] = js.native
  var minor: js.UndefOr[String] = js.native
  var patch: js.UndefOr[String] = js.native
}

object Alpha {
  @scala.inline
  def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
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
    def setAlpha(value: String | Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setBeta(value: String | Boolean): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeta: Self = this.set("beta", js.undefined)
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    @scala.inline
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
  }
  
}

