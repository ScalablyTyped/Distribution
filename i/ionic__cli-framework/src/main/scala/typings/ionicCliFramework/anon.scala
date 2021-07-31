package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.CommandPathItem
import typings.ionicCliFramework.definitionsMod.Footnote
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.ionicCliFramework.loggerMod.LogRecord
import typings.ionicCliFramework.loggerMod.LoggerFormatter
import typings.ionicCliFramework.loggerMod.LoggerHandler
import typings.ionicCliFramework.loggerMod.LoggerLevelWeight
import typings.node.NodeJS.WritableStream
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.std.Set
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
    
    @scala.inline
    def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](
      aliases: js.Array[String],
      command: C,
      namespace: N,
      path: js.Array[CommandPathItem[C, N, M, I, O]]
    ): Aliases[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aliases[C, N, M, I, O]]
    }
    
    @scala.inline
    implicit class AliasesMutableBuilder[Self <: Aliases[?, ?, ?, ?, ?], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self & (Aliases[C, N, M, I, O])) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: C): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: N): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[CommandPathItem[C, N, M, I, O]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (CommandPathItem[C, N, M, I, O])*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  trait Argv[N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    var argv: js.Array[String]
    
    var env: ProcessEnv
    
    var namespace: N
  }
  object Argv {
    
    @scala.inline
    def apply[N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](argv: js.Array[String], env: ProcessEnv, namespace: N): Argv[N, C, M, I, O] = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv[N, C, M, I, O]]
    }
    
    @scala.inline
    implicit class ArgvMutableBuilder[Self <: Argv[?, ?, ?, ?, ?], N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self & (Argv[N, C, M, I, O])) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: N): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait CaseSensitive extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
  }
  object CaseSensitive {
    
    @scala.inline
    def apply(): CaseSensitive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaseSensitive]
    }
    
    @scala.inline
    implicit class CaseSensitiveMutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    }
  }
  
  trait Colors extends StObject {
    
    var colors: js.UndefOr[typings.ionicCliFramework.colorsMod.Colors] = js.undefined
  }
  object Colors {
    
    @scala.inline
    def apply(): Colors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: typings.ionicCliFramework.colorsMod.Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    }
  }
  
  trait Commands[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    var commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
  }
  object Commands {
    
    @scala.inline
    def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Commands[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commands[C, N, M, I, O]]
    }
    
    @scala.inline
    implicit class CommandsMutableBuilder[Self <: Commands[?, ?, ?, ?, ?], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self & (Commands[C, N, M, I, O])) extends AnyVal {
      
      @scala.inline
      def setCommands(value: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsVarargs(value: (HydratedCommandMetadata[C, N, M, I, O])*): Self = StObject.set(x, "commands", js.Array(value :_*))
    }
  }
  
  trait IncludeSeparated extends StObject {
    
    var includeSeparated: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeSeparated {
    
    @scala.inline
    def apply(): IncludeSeparated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeSeparated]
    }
    
    @scala.inline
    implicit class IncludeSeparatedMutableBuilder[Self <: IncludeSeparated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeSeparated(value: Boolean): Self = StObject.set(x, "includeSeparated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSeparatedUndefined: Self = StObject.set(x, "includeSeparated", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerOptions> */
  trait PartialLoggerOptions extends StObject {
    
    var handlers: js.UndefOr[Set[LoggerHandler]] = js.undefined
    
    var level: js.UndefOr[LoggerLevelWeight] = js.undefined
  }
  object PartialLoggerOptions {
    
    @scala.inline
    def apply(): PartialLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLoggerOptions]
    }
    
    @scala.inline
    implicit class PartialLoggerOptionsMutableBuilder[Self <: PartialLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: Set[LoggerHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      @scala.inline
      def setLevel(value: LoggerLevelWeight): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.StreamHandlerOptions> */
  trait PartialStreamHandlerOptio extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.undefined
    
    var formatter: js.UndefOr[LoggerFormatter] = js.undefined
    
    var stream: js.UndefOr[WritableStream] = js.undefined
  }
  object PartialStreamHandlerOptio {
    
    @scala.inline
    def apply(): PartialStreamHandlerOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStreamHandlerOptio]
    }
    
    @scala.inline
    implicit class PartialStreamHandlerOptioMutableBuilder[Self <: PartialStreamHandlerOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: /* record */ LogRecord => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* record */ LogRecord => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/tasks.TaskOptions> */
  trait PartialTaskOptions extends StObject {
    
    var msg: js.UndefOr[String] = js.undefined
    
    var tickInterval: js.UndefOr[Double] = js.undefined
  }
  object PartialTaskOptions {
    
    @scala.inline
    def apply(): PartialTaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTaskOptions]
    }
    
    @scala.inline
    implicit class PartialTaskOptionsMutableBuilder[Self <: PartialTaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      @scala.inline
      def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
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
    implicit class RequiredCommandMetadataCoMutableBuilder[Self <: RequiredCommandMetadataCo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleCommands(value: js.Array[String]): Self = StObject.set(x, "exampleCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleCommandsVarargs(value: String*): Self = StObject.set(x, "exampleCommands", js.Array(value :_*))
      
      @scala.inline
      def setFootnotes(value: js.Array[Footnote]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFootnotesVarargs(value: Footnote*): Self = StObject.set(x, "footnotes", js.Array(value :_*))
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: js.Array[CommandMetadataInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: CommandMetadataInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[CommandMetadataOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: CommandMetadataOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Value {
    
    @scala.inline
    def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ValueString extends StObject {
    
    val value: String
  }
  object ValueString {
    
    @scala.inline
    def apply(value: String): ValueString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueString]
    }
    
    @scala.inline
    implicit class ValueStringMutableBuilder[Self <: ValueString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
