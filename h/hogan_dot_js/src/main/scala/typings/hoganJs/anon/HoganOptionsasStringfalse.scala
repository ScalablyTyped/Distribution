package typings.hoganJs.anon

import typings.hoganJs.hoganJsBooleans.`false`
import typings.hoganJs.mod.SectionTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hogan.js.hogan.js.HoganOptions & {  asString :false} */
@js.native
trait HoganOptionsasStringfalse extends js.Object {
  var asString: js.UndefOr[Boolean] with `false` = js.native
  var delimiters: js.UndefOr[String] = js.native
  var disableLambda: js.UndefOr[Boolean] = js.native
  var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.native
}

object HoganOptionsasStringfalse {
  @scala.inline
  def apply(asString: js.UndefOr[Boolean] with `false`): HoganOptionsasStringfalse = {
    val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoganOptionsasStringfalse]
  }
  @scala.inline
  implicit class HoganOptionsasStringfalseOps[Self <: HoganOptionsasStringfalse] (val x: Self) extends AnyVal {
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
    def setAsString(value: js.UndefOr[Boolean] with `false`): Self = this.set("asString", value.asInstanceOf[js.Any])
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

