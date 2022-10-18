package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.CommandPathItem
import typings.ionicCliFramework.definitionsMod.Footnote
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aliases[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    val aliases: js.Array[String]
    
    val command: C
    
    val namespace: N
    
    val path: js.Array[CommandPathItem[C, N, M, I, O]]
  }
  object Aliases {
    
    inline def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](
      aliases: js.Array[String],
      command: C,
      namespace: N,
      path: js.Array[CommandPathItem[C, N, M, I, O]]
    ): Aliases[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aliases[C, N, M, I, O]]
    }
    
    extension [Self <: Aliases[?, ?, ?, ?, ?], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](x: Self & (Aliases[C, N, M, I, O])) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setCommand(value: C): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: N): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[CommandPathItem[C, N, M, I, O]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (CommandPathItem[C, N, M, I, O])*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait Argv[N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    var argv: js.Array[String]
    
    var env: ProcessEnv
    
    var namespace: N
  }
  object Argv {
    
    inline def apply[N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](argv: js.Array[String], env: ProcessEnv, namespace: N): Argv[N, C, M, I, O] = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv[N, C, M, I, O]]
    }
    
    extension [Self <: Argv[?, ?, ?, ?, ?], N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](x: Self & (Argv[N, C, M, I, O])) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: N): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait CaseSensitive extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
  }
  object CaseSensitive {
    
    inline def apply(): CaseSensitive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaseSensitive]
    }
    
    extension [Self <: CaseSensitive](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    }
  }
  
  trait Colors extends StObject {
    
    var colors: js.UndefOr[typings.ionicCliFramework.libColorsMod.Colors] = js.undefined
  }
  object Colors {
    
    inline def apply(): Colors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setColors(value: typings.ionicCliFramework.libColorsMod.Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    }
  }
  
  trait Commands[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    var commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
  }
  object Commands {
    
    inline def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Commands[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commands[C, N, M, I, O]]
    }
    
    extension [Self <: Commands[?, ?, ?, ?, ?], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](x: Self & (Commands[C, N, M, I, O])) {
      
      inline def setCommands(value: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: (HydratedCommandMetadata[C, N, M, I, O])*): Self = StObject.set(x, "commands", js.Array(value*))
    }
  }
  
  trait IncludeSeparated extends StObject {
    
    var includeSeparated: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeSeparated {
    
    inline def apply(): IncludeSeparated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeSeparated]
    }
    
    extension [Self <: IncludeSeparated](x: Self) {
      
      inline def setIncludeSeparated(value: Boolean): Self = StObject.set(x, "includeSeparated", value.asInstanceOf[js.Any])
      
      inline def setIncludeSeparatedUndefined: Self = StObject.set(x, "includeSeparated", js.undefined)
    }
  }
  
  /* Inlined std.Required<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadata<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataInput, @ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataOption>> */
  trait RequiredCommandMetadataCo extends StObject {
    
    var description: String
    
    var exampleCommands: js.Array[String]
    
    var footnotes: js.Array[Footnote]
    
    var groups: js.Array[String]
    
    var inputs: js.Array[CommandMetadataInput]
    
    var name: String
    
    var options: js.Array[CommandMetadataOption]
    
    var summary: String
  }
  object RequiredCommandMetadataCo {
    
    inline def apply(
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
    
    extension [Self <: RequiredCommandMetadataCo](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExampleCommands(value: js.Array[String]): Self = StObject.set(x, "exampleCommands", value.asInstanceOf[js.Any])
      
      inline def setExampleCommandsVarargs(value: String*): Self = StObject.set(x, "exampleCommands", js.Array(value*))
      
      inline def setFootnotes(value: js.Array[Footnote]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      inline def setFootnotesVarargs(value: Footnote*): Self = StObject.set(x, "footnotes", js.Array(value*))
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setInputs(value: js.Array[CommandMetadataInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: CommandMetadataInput*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[CommandMetadataOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: CommandMetadataOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Value {
    
    inline def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ValueString extends StObject {
    
    val value: String
  }
  object ValueString {
    
    inline def apply(value: String): ValueString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueString]
    }
    
    extension [Self <: ValueString](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
