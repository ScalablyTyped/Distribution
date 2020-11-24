package typings.ionicCliFramework.helpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandHelpSchema extends js.Object {
  
  val aliases: js.Array[String] = js.native
  
  val description: String = js.native
  
  val exampleCommands: js.Array[String] = js.native
  
  val footnotes: js.Array[CommandHelpSchemaFootnote] = js.native
  
  val groups: js.Array[String] = js.native
  
  val inputs: js.Array[CommandHelpSchemaInput] = js.native
  
  val name: String = js.native
  
  val namespace: js.Array[String] = js.native
  
  val options: js.Array[CommandHelpSchemaOption] = js.native
  
  val summary: String = js.native
}
object CommandHelpSchema {
  
  @scala.inline
  def apply(
    aliases: js.Array[String],
    description: String,
    exampleCommands: js.Array[String],
    footnotes: js.Array[CommandHelpSchemaFootnote],
    groups: js.Array[String],
    inputs: js.Array[CommandHelpSchemaInput],
    name: String,
    namespace: js.Array[String],
    options: js.Array[CommandHelpSchemaOption],
    summary: String
  ): CommandHelpSchema = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchema]
  }
  
  @scala.inline
  implicit class CommandHelpSchemaOps[Self <: CommandHelpSchema] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleCommandsVarargs(value: String*): Self = this.set("exampleCommands", js.Array(value :_*))
    
    @scala.inline
    def setExampleCommands(value: js.Array[String]): Self = this.set("exampleCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotesVarargs(value: CommandHelpSchemaFootnote*): Self = this.set("footnotes", js.Array(value :_*))
    
    @scala.inline
    def setFootnotes(value: js.Array[CommandHelpSchemaFootnote]): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: CommandHelpSchemaInput*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[CommandHelpSchemaInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceVarargs(value: String*): Self = this.set("namespace", js.Array(value :_*))
    
    @scala.inline
    def setNamespace(value: js.Array[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: CommandHelpSchemaOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[CommandHelpSchemaOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
}
