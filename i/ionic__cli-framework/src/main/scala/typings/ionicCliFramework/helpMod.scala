package typings.ionicCliFramework

import typings.ionicCliFramework.anon.Colors
import typings.ionicCliFramework.anon.RequiredCommandMetadataCo
import typings.ionicCliFramework.anon.ValueString
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.Footnote
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typings.ionicCliFramework.definitionsMod.HydratedNamespaceMetadata
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.NamespaceLocateResult
import typings.ionicCliFramework.definitionsMod.NamespaceMetadata
import typings.ionicCliFramework.ionicCliFrameworkStrings.link
import typings.ionicCliFramework.ionicCliFrameworkStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpMod {
  
  @JSImport("@ionic/cli-framework/lib/help", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework/lib/help", "CommandHelpFormatter")
  @js.native
  abstract class CommandHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends HelpFormatter {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
    
    /* protected */ var _fullName: js.UndefOr[String] = js.native
    
    /* protected */ var _metadata: js.UndefOr[M] = js.native
    
    /* protected */ val command: C = js.native
    
    /* protected */ val dotswidth: Double = js.native
    
    /**
      * Given an option definition from command metadata, decide whether to keep
      * or discard it.
      *
      * @return `true` to keep, `false` to discard
      */
    def filterOptionCallback(option: O): js.Promise[Boolean] = js.native
    
    def getCommandFullName(): js.Promise[String] = js.native
    
    def getCommandMetadata(): js.Promise[M | (HydratedCommandMetadata[C, N, M, I, O])] = js.native
    
    /* protected */ val location: NamespaceLocateResult[C, N, M, I, O] = js.native
    
    /* protected */ def normalizeMetadata(metadata: (HydratedCommandMetadata[C, N, M, I, O]) | M): M = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "CommandSchemaHelpFormatter")
  @js.native
  open class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends CommandHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
    
    def formatCommand(cmd: (HydratedCommandMetadata[C, N, M, I, O]) | M): js.Promise[CommandHelpSchema] = js.native
    
    def formatFootnote(footnote: Footnote): CommandHelpSchemaFootnote = js.native
    
    def formatInput(input: I): js.Promise[CommandHelpSchemaInput] = js.native
    
    def formatInputs(inputs: js.Array[I]): js.Promise[js.Array[CommandHelpSchemaInput]] = js.native
    
    def formatOption(option: O): js.Promise[CommandHelpSchemaOption] = js.native
    
    def formatOptions(options: js.Array[O]): js.Promise[js.Array[CommandHelpSchemaOption]] = js.native
    
    def serialize(): js.Promise[CommandHelpSchema] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "CommandStringHelpFormatter")
  @js.native
  open class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends CommandHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
    
    /**
      * Insert text that appears after the input's summary.
      *
      * @param input The metadata of the input.
      */
    def formatAfterInputSummary(input: I): js.Promise[String] = js.native
    
    /**
      * Insert text that appears after the option's summary.
      *
      * @param opt The metadata of the option.
      */
    def formatAfterOptionSummary(opt: O): js.Promise[String] = js.native
    
    /**
      * Insert text that appears after the command's summary.
      *
      * @param meta The metadata of the command.
      */
    def formatAfterSummary(meta: M): js.Promise[String] = js.native
    
    /**
      * Insert text that appears before the input's summary.
      *
      * @param input The metadata of the input.
      */
    def formatBeforeInputSummary(input: I): js.Promise[String] = js.native
    
    /**
      * Insert text that appears before an option's summary.
      *
      * @param opt The metadata of the option.
      */
    def formatBeforeOptionSummary(opt: O): js.Promise[String] = js.native
    
    /**
      * Insert text that appears before the command's summary.
      *
      * @param meta The metadata of the command.
      */
    def formatBeforeSummary(meta: M): js.Promise[String] = js.native
    
    def formatDescription(): js.Promise[String] = js.native
    
    def formatExamples(): js.Promise[String] = js.native
    
    def formatHeader(): js.Promise[String] = js.native
    
    def formatInlineInput(input: I): js.Promise[String] = js.native
    
    def formatInput(i: I): js.Promise[String] = js.native
    
    def formatInputs(): js.Promise[String] = js.native
    
    def formatOptionDefault(opt: O): js.Promise[String] = js.native
    
    def formatOptionLine(opt: O): js.Promise[String] = js.native
    
    def formatOptions(): js.Promise[String] = js.native
    
    def formatOptionsGroup(titleText: String, options: js.Array[O]): js.Promise[String] = js.native
    
    def formatSummary(): js.Promise[String] = js.native
    
    def formatUsage(): js.Promise[String] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "HelpFormatter")
  @js.native
  abstract class HelpFormatter protected () extends StObject {
    def this(hasColors: Colors) = this()
    
    /* protected */ val colors: typings.ionicCliFramework.colorsMod.Colors = js.native
    
    def format(): js.Promise[String] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "NamespaceHelpFormatter")
  @js.native
  abstract class NamespaceHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends HelpFormatter {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
    
    /* protected */ var _fullName: js.UndefOr[String] = js.native
    
    /* protected */ var _metadata: js.UndefOr[NamespaceMetadata] = js.native
    
    /* protected */ val dotswidth: Double = js.native
    
    /**
      * Given command metadata, decide whether to keep or discard the command that
      * the metadata represents.
      *
      * @param meta: The metadata of the command.
      * @return `true` to keep, `false` to discard
      */
    def filterCommandCallback(meta: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = js.native
    
    def getCommandMetadataList(): js.Promise[js.Array[HydratedCommandMetadata[C, N, M, I, O]]] = js.native
    
    def getNamespaceFullName(): js.Promise[String] = js.native
    
    def getNamespaceMetadata(): js.Promise[NamespaceMetadata] = js.native
    
    /* protected */ val location: NamespaceLocateResult[C, N, M, I, O] = js.native
    
    /* protected */ val namespace: N = js.native
    
    /* protected */ def normalizeCommandMetadata(metadata: HydratedCommandMetadata[C, N, M, I, O]): HydratedCommandMetadata[C, N, M, I, O] = js.native
    
    /* protected */ def normalizeMetadata(metadata: NamespaceMetadata): NamespaceMetadata = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "NamespaceSchemaHelpFormatter")
  @js.native
  open class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends NamespaceHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
    
    def formatCommand(cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[CommandHelpSchema] = js.native
    
    def formatCommandGroup(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[CommandHelpSchema]] = js.native
    
    def serialize(): js.Promise[NamespaceHelpSchema] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "NamespaceStringHelpFormatter")
  @js.native
  open class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends NamespaceHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
    
    /**
      * Insert text that appears after a commands's summary.
      *
      * @param meta: The metadata of the command.
      */
    def formatAfterCommandSummary(meta: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[String] = js.native
    
    /**
      * Insert text that appears after a namespace's summary.
      *
      * @param meta The metadata of the namespace.
      * @param commands An array of the metadata of the namespace's commands.
      */
    def formatAfterNamespaceSummary(
      meta: HydratedNamespaceMetadata[C, N, M, I, O],
      commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
    ): js.Promise[String] = js.native
    
    /**
      * Insert text after the namespace's summary.
      *
      * @param meta: The metadata of the namespace.
      */
    def formatAfterSummary(meta: NamespaceMetadata): js.Promise[String] = js.native
    
    /**
      * Insert text that appears before a commands's summary.
      *
      * @param meta: The metadata of the command.
      */
    def formatBeforeCommandSummary(meta: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[String] = js.native
    
    /**
      * Insert text that appears before a namespace's summary.
      *
      * @param meta The metadata of the namespace.
      * @param commands An array of the metadata of the namespace's commands.
      */
    def formatBeforeNamespaceSummary(
      meta: HydratedNamespaceMetadata[C, N, M, I, O],
      commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
    ): js.Promise[String] = js.native
    
    /**
      * Insert text before the namespace's summary.
      *
      * @param meta: The metadata of the namespace.
      */
    def formatBeforeSummary(meta: NamespaceMetadata): js.Promise[String] = js.native
    
    def formatCommandGroup(titleText: String, commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[String] = js.native
    
    def formatCommands(): js.Promise[String] = js.native
    
    def formatDescription(): js.Promise[String] = js.native
    
    def formatHeader(): js.Promise[String] = js.native
    
    def formatSummary(): js.Promise[String] = js.native
    
    def formatUsage(): js.Promise[String] = js.native
    
    def getGlobalOptions(): js.Promise[js.Array[String]] = js.native
    
    def getListOfCommandDetails(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[String]] = js.native
    
    def getListOfNamespaceDetails(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[String]] = js.native
  }
  
  inline def createCommandMetadataFromSchema(schema: CommandHelpSchema): RequiredCommandMetadataCo = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommandMetadataFromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[RequiredCommandMetadataCo]
  
  inline def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandVisible")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionVisible")(opt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  trait CommandHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    val colors: js.UndefOr[typings.ionicCliFramework.colorsMod.Colors] = js.undefined
    
    val command: C
    
    val location: NamespaceLocateResult[C, N, M, I, O]
    
    /**
      * Provide extra context with hydrated command metadata. If not provided,
      * `command.getMetadata()` is called.
      */
    val metadata: js.UndefOr[HydratedCommandMetadata[C, N, M, I, O]] = js.undefined
  }
  object CommandHelpFormatterDeps {
    
    inline def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](command: C, location: NamespaceLocateResult[C, N, M, I, O]): CommandHelpFormatterDeps[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHelpFormatterDeps[C, N, M, I, O]]
    }
    
    extension [Self <: CommandHelpFormatterDeps[?, ?, ?, ?, ?], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](x: Self & (CommandHelpFormatterDeps[C, N, M, I, O])) {
      
      inline def setColors(value: typings.ionicCliFramework.colorsMod.Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCommand(value: C): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: HydratedCommandMetadata[C, N, M, I, O]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait CommandHelpSchema extends StObject {
    
    val aliases: js.Array[String]
    
    val description: String
    
    val exampleCommands: js.Array[String]
    
    val footnotes: js.Array[CommandHelpSchemaFootnote]
    
    val groups: js.Array[String]
    
    val inputs: js.Array[CommandHelpSchemaInput]
    
    val name: String
    
    val namespace: js.Array[String]
    
    val options: js.Array[CommandHelpSchemaOption]
    
    val summary: String
  }
  object CommandHelpSchema {
    
    inline def apply(
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
    
    extension [Self <: CommandHelpSchema](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExampleCommands(value: js.Array[String]): Self = StObject.set(x, "exampleCommands", value.asInstanceOf[js.Any])
      
      inline def setExampleCommandsVarargs(value: String*): Self = StObject.set(x, "exampleCommands", js.Array(value*))
      
      inline def setFootnotes(value: js.Array[CommandHelpSchemaFootnote]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      inline def setFootnotesVarargs(value: CommandHelpSchemaFootnote*): Self = StObject.set(x, "footnotes", js.Array(value*))
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setInputs(value: js.Array[CommandHelpSchemaInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: CommandHelpSchemaInput*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: js.Array[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceVarargs(value: String*): Self = StObject.set(x, "namespace", js.Array(value*))
      
      inline def setOptions(value: js.Array[CommandHelpSchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: CommandHelpSchemaOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText
    - typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink
  */
  trait CommandHelpSchemaFootnote extends StObject
  object CommandHelpSchemaFootnote {
    
    inline def CommandHelpSchemaFootnoteLink(id: String | Double, url: String): typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("link")
      __obj.asInstanceOf[typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink]
    }
    
    inline def CommandHelpSchemaFootnoteText(id: String | Double, text: String): typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText]
    }
  }
  
  trait CommandHelpSchemaFootnoteLink
    extends StObject
       with CommandHelpSchemaFootnote {
    
    val id: String | Double
    
    val shortUrl: js.UndefOr[String] = js.undefined
    
    val `type`: link
    
    val url: String
  }
  object CommandHelpSchemaFootnoteLink {
    
    inline def apply(id: String | Double, url: String): CommandHelpSchemaFootnoteLink = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("link")
      __obj.asInstanceOf[CommandHelpSchemaFootnoteLink]
    }
    
    extension [Self <: CommandHelpSchemaFootnoteLink](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setShortUrl(value: String): Self = StObject.set(x, "shortUrl", value.asInstanceOf[js.Any])
      
      inline def setShortUrlUndefined: Self = StObject.set(x, "shortUrl", js.undefined)
      
      inline def setType(value: link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandHelpSchemaFootnoteText
    extends StObject
       with CommandHelpSchemaFootnote {
    
    val id: String | Double
    
    val text: String
    
    val `type`: typings.ionicCliFramework.ionicCliFrameworkStrings.text
  }
  object CommandHelpSchemaFootnoteText {
    
    inline def apply(id: String | Double, text: String): CommandHelpSchemaFootnoteText = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[CommandHelpSchemaFootnoteText]
    }
    
    extension [Self <: CommandHelpSchemaFootnoteText](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandHelpSchemaInput extends StObject {
    
    val name: String
    
    val required: Boolean
    
    val summary: String
  }
  object CommandHelpSchemaInput {
    
    inline def apply(name: String, required: Boolean, summary: String): CommandHelpSchemaInput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHelpSchemaInput]
    }
    
    extension [Self <: CommandHelpSchemaInput](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandHelpSchemaOption extends StObject {
    
    val default: js.UndefOr[String | Boolean] = js.undefined
    
    val aliases: js.Array[String]
    
    val groups: js.Array[String]
    
    val name: String
    
    val spec: ValueString
    
    val summary: String
    
    val `type`: String
  }
  object CommandHelpSchemaOption {
    
    inline def apply(
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
    
    extension [Self <: CommandHelpSchemaOption](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setDefault(value: String | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: ValueString): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamespaceHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    val colors: js.UndefOr[typings.ionicCliFramework.colorsMod.Colors] = js.undefined
    
    val location: NamespaceLocateResult[C, N, M, I, O]
    
    val namespace: N
  }
  object NamespaceHelpFormatterDeps {
    
    inline def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](location: NamespaceLocateResult[C, N, M, I, O], namespace: N): NamespaceHelpFormatterDeps[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespaceHelpFormatterDeps[C, N, M, I, O]]
    }
    
    extension [Self <: NamespaceHelpFormatterDeps[?, ?, ?, ?, ?], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](x: Self & (NamespaceHelpFormatterDeps[C, N, M, I, O])) {
      
      inline def setColors(value: typings.ionicCliFramework.colorsMod.Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: N): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamespaceHelpSchema extends StObject {
    
    val aliases: js.Array[String]
    
    val commands: js.Array[CommandHelpSchema]
    
    val description: String
    
    val groups: js.Array[String]
    
    val name: String
    
    val summary: String
  }
  object NamespaceHelpSchema {
    
    inline def apply(
      aliases: js.Array[String],
      commands: js.Array[CommandHelpSchema],
      description: String,
      groups: js.Array[String],
      name: String,
      summary: String
    ): NamespaceHelpSchema = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespaceHelpSchema]
    }
    
    extension [Self <: NamespaceHelpSchema](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setCommands(value: js.Array[CommandHelpSchema]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: CommandHelpSchema*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
}
