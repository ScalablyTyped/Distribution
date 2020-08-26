package typings.ionic.anon

import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.ionicStrings.global
import typings.ionic.ionicStrings.project
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.Footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.CommandMetadata> */
@js.native
trait PartialCommandMetadata extends js.Object {
  var description: js.UndefOr[String] = js.native
  var exampleCommands: js.UndefOr[js.Array[String]] = js.native
  var footnotes: js.UndefOr[js.Array[Footnote]] = js.native
  var groups: js.UndefOr[js.Array[String]] = js.native
  var inputs: js.UndefOr[js.Array[CommandMetadataInput]] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Array[CommandMetadataOption]] = js.native
  var summary: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[global | project] = js.native
}

object PartialCommandMetadata {
  @scala.inline
  def apply(): PartialCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommandMetadata]
  }
  @scala.inline
  implicit class PartialCommandMetadataOps[Self <: PartialCommandMetadata] (val x: Self) extends AnyVal {
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
    def setExampleCommandsVarargs(value: String*): Self = this.set("exampleCommands", js.Array(value :_*))
    @scala.inline
    def setExampleCommands(value: js.Array[String]): Self = this.set("exampleCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExampleCommands: Self = this.set("exampleCommands", js.undefined)
    @scala.inline
    def setFootnotesVarargs(value: Footnote*): Self = this.set("footnotes", js.Array(value :_*))
    @scala.inline
    def setFootnotes(value: js.Array[Footnote]): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFootnotes: Self = this.set("footnotes", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setInputsVarargs(value: CommandMetadataInput*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[CommandMetadataInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: CommandMetadataOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[CommandMetadataOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setType(value: global | project): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

