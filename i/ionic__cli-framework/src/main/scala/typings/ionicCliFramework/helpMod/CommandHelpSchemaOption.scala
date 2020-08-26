package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.anon.ValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpSchemaOption extends js.Object {
  val aliases: js.Array[String] = js.native
  val default: js.UndefOr[String | Boolean] = js.native
  val groups: js.Array[String] = js.native
  val name: String = js.native
  val spec: ValueString = js.native
  val summary: String = js.native
  val `type`: String = js.native
}

object CommandHelpSchemaOption {
  @scala.inline
  def apply(
    aliases: js.Array[String],
    groups: js.Array[String],
    name: String,
    spec: ValueString,
    summary: String,
    `type`: String
  ): CommandHelpSchemaOption = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaOption]
  }
  @scala.inline
  implicit class CommandHelpSchemaOptionOps[Self <: CommandHelpSchemaOption] (val x: Self) extends AnyVal {
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: ValueString): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: String | Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

