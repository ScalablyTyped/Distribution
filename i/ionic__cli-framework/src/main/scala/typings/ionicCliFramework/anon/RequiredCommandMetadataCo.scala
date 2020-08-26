package typings.ionicCliFramework.anon

import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.Footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadata<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataInput, @ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataOption>> */
@js.native
trait RequiredCommandMetadataCo extends js.Object {
  var description: String = js.native
  var exampleCommands: js.Array[String] = js.native
  var footnotes: js.Array[Footnote] = js.native
  var groups: js.Array[String] = js.native
  var inputs: js.Array[CommandMetadataInput] = js.native
  var name: String = js.native
  var options: js.Array[CommandMetadataOption] = js.native
  var summary: String = js.native
}

object RequiredCommandMetadataCo {
  @scala.inline
  def apply(
    description: String,
    exampleCommands: js.Array[String],
    footnotes: js.Array[Footnote],
    groups: js.Array[String],
    inputs: js.Array[CommandMetadataInput],
    name: String,
    options: js.Array[CommandMetadataOption],
    summary: String
  ): RequiredCommandMetadataCo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredCommandMetadataCo]
  }
  @scala.inline
  implicit class RequiredCommandMetadataCoOps[Self <: RequiredCommandMetadataCo] (val x: Self) extends AnyVal {
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
    def setExampleCommandsVarargs(value: String*): Self = this.set("exampleCommands", js.Array(value :_*))
    @scala.inline
    def setExampleCommands(value: js.Array[String]): Self = this.set("exampleCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def setFootnotesVarargs(value: Footnote*): Self = this.set("footnotes", js.Array(value :_*))
    @scala.inline
    def setFootnotes(value: js.Array[Footnote]): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: CommandMetadataInput*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[CommandMetadataInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsVarargs(value: CommandMetadataOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[CommandMetadataOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

