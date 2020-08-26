package typings.hexoUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoDetect extends js.Object {
  var autoDetect: js.UndefOr[Boolean] = js.native
  var caption: js.UndefOr[String] = js.native
  var firstLine: js.UndefOr[Double] = js.native
  var gutter: js.UndefOr[Boolean] = js.native
  var hljs: js.UndefOr[Boolean] = js.native
  var lang: js.UndefOr[String] = js.native
  var mark: js.UndefOr[js.Array[Double]] = js.native
  var tab: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
}

object AutoDetect {
  @scala.inline
  def apply(): AutoDetect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDetect]
  }
  @scala.inline
  implicit class AutoDetectOps[Self <: AutoDetect] (val x: Self) extends AnyVal {
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
    def setAutoDetect(value: Boolean): Self = this.set("autoDetect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDetect: Self = this.set("autoDetect", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setFirstLine(value: Double): Self = this.set("firstLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstLine: Self = this.set("firstLine", js.undefined)
    @scala.inline
    def setGutter(value: Boolean): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setHljs(value: Boolean): Self = this.set("hljs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHljs: Self = this.set("hljs", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMarkVarargs(value: Double*): Self = this.set("mark", js.Array(value :_*))
    @scala.inline
    def setMark(value: js.Array[Double]): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setTab(value: String): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

