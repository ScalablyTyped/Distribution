package typings.joi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Description_
  extends /* key */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.native
  var example: js.UndefOr[js.Array[_]] = js.native
  var flags: js.UndefOr[js.Object] = js.native
  var invalids: js.UndefOr[js.Array[_]] = js.native
  var label: js.UndefOr[String] = js.native
  var meta: js.UndefOr[js.Array[_]] = js.native
  var notes: js.UndefOr[js.Array[String]] = js.native
  var options: js.UndefOr[ValidationOptions] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[Types | String] = js.native
  var unit: js.UndefOr[String] = js.native
  var valids: js.UndefOr[js.Array[_]] = js.native
}

object Description_ {
  @scala.inline
  def apply(): Description_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description_]
  }
  @scala.inline
  implicit class Description_Ops[Self <: Description_] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExampleVarargs(value: js.Any*): Self = this.set("example", js.Array(value :_*))
    @scala.inline
    def setExample(value: js.Array[_]): Self = this.set("example", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    @scala.inline
    def setFlags(value: js.Object): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setInvalidsVarargs(value: js.Any*): Self = this.set("invalids", js.Array(value :_*))
    @scala.inline
    def setInvalids(value: js.Array[_]): Self = this.set("invalids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalids: Self = this.set("invalids", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = this.set("meta", js.Array(value :_*))
    @scala.inline
    def setMeta(value: js.Array[_]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setNotesVarargs(value: String*): Self = this.set("notes", js.Array(value :_*))
    @scala.inline
    def setNotes(value: js.Array[String]): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setOptions(value: ValidationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setType(value: Types | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValidsVarargs(value: js.Any*): Self = this.set("valids", js.Array(value :_*))
    @scala.inline
    def setValids(value: js.Array[_]): Self = this.set("valids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValids: Self = this.set("valids", js.undefined)
  }
  
}

