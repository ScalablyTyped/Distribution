package typings.hoganJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoganOptions extends js.Object {
  var asString: js.UndefOr[Boolean] = js.native
  var delimiters: js.UndefOr[String] = js.native
  var disableLambda: js.UndefOr[Boolean] = js.native
  var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.native
}

object HoganOptions {
  @scala.inline
  def apply(): HoganOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoganOptions]
  }
  @scala.inline
  implicit class HoganOptionsOps[Self <: HoganOptions] (val x: Self) extends AnyVal {
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
    def setAsString(value: Boolean): Self = this.set("asString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsString: Self = this.set("asString", js.undefined)
    @scala.inline
    def setDelimiters(value: String): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    @scala.inline
    def setDisableLambda(value: Boolean): Self = this.set("disableLambda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLambda: Self = this.set("disableLambda", js.undefined)
    @scala.inline
    def setSectionTagsVarargs(value: SectionTags*): Self = this.set("sectionTags", js.Array(value :_*))
    @scala.inline
    def setSectionTags(value: js.Array[SectionTags]): Self = this.set("sectionTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionTags: Self = this.set("sectionTags", js.undefined)
  }
  
}

