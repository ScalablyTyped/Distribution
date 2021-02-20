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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpMod {
  
  @JSImport("@ionic/cli-framework/lib/help", "CommandHelpFormatter")
  @js.native
  abstract class CommandHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends HelpFormatter {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
    
    var _fullName: js.UndefOr[String] = js.native
    
    var _metadata: js.UndefOr[M] = js.native
    
    val command: C = js.native
    
    val dotswidth: Double = js.native
    
    /**
      * Given an option definition from command metadata, decide whether to keep
      * or discard it.
      *
      * @return `true` to keep, `false` to discard
      */
    def filterOptionCallback(option: O): js.Promise[Boolean] = js.native
    
    def getCommandFullName(): js.Promise[String] = js.native
    
    def getCommandMetadata(): js.Promise[M | (HydratedCommandMetadata[C, N, M, I, O])] = js.native
    
    val location: NamespaceLocateResult[C, N, M, I, O] = js.native
    
    /* protected */ def normalizeMetadata(metadata: (HydratedCommandMetadata[C, N, M, I, O]) | M): M = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "CommandSchemaHelpFormatter")
  @js.native
  class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends CommandHelpFormatter[C, N, M, I, O] {
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
  class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends CommandHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
    
    def formatAfterOptionSummary(opt: O): js.Promise[String] = js.native
    
    /**
      * Insert text after the command's summary.
      *
      * @param meta The metadata of the command.
      */
    def formatAfterSummary(meta: M): js.Promise[String] = js.native
    
    /**
      * Insert text that appears before an option's summary.
      *
      * @param opt The metadata of the option.
      */
    def formatBeforeOptionSummary(opt: O): js.Promise[String] = js.native
    
    /**
      * Insert text before the command's summary.
      *
      * @param meta The metadata of the command.
      */
    def formatBeforeSummary(meta: M): js.Promise[String] = js.native
    
    def formatDescription(): js.Promise[String] = js.native
    
    def formatExamples(): js.Promise[String] = js.native
    
    def formatHeader(): js.Promise[String] = js.native
    
    def formatInlineInput(input: I): js.Promise[String] = js.native
    
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
    
    val colors: typings.ionicCliFramework.colorsMod.Colors = js.native
    
    def format(): js.Promise[String] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "NamespaceHelpFormatter")
  @js.native
  abstract class NamespaceHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends HelpFormatter {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
    
    var _fullName: js.UndefOr[String] = js.native
    
    var _metadata: js.UndefOr[NamespaceMetadata] = js.native
    
    val dotswidth: Double = js.native
    
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
    
    val location: NamespaceLocateResult[C, N, M, I, O] = js.native
    
    val namespace: N = js.native
    
    /* protected */ def normalizeCommandMetadata(metadata: HydratedCommandMetadata[C, N, M, I, O]): HydratedCommandMetadata[C, N, M, I, O] = js.native
    
    /* protected */ def normalizeMetadata(metadata: NamespaceMetadata): NamespaceMetadata = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "NamespaceSchemaHelpFormatter")
  @js.native
  class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends NamespaceHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
    
    def formatCommand(cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[CommandHelpSchema] = js.native
    
    def formatCommandGroup(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[CommandHelpSchema]] = js.native
    
    def serialize(): js.Promise[NamespaceHelpSchema] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/help", "NamespaceStringHelpFormatter")
  @js.native
  class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends NamespaceHelpFormatter[C, N, M, I, O] {
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
  
  @JSImport("@ionic/cli-framework/lib/help", "createCommandMetadataFromSchema")
  @js.native
  def createCommandMetadataFromSchema(schema: CommandHelpSchema): RequiredCommandMetadataCo = js.native
  
  @JSImport("@ionic/cli-framework/lib/help", "isCommandVisible")
  @js.native
  def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/cli-framework/lib/help", "isOptionVisible")
  @js.native
  def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = js.native
  
  @js.native
  trait CommandHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    val colors: js.UndefOr[typings.ionicCliFramework.colorsMod.Colors] = js.native
    
    val command: C = js.native
    
    val location: NamespaceLocateResult[C, N, M, I, O] = js.native
    
    /**
      * Provide extra context with hydrated command metadata. If not provided,
      * `command.getMetadata()` is called.
      */
    val metadata: js.UndefOr[HydratedCommandMetadata[C, N, M, I, O]] = js.native
  }
  object CommandHelpFormatterDeps {
    
    @scala.inline
    def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](command: C, location: NamespaceLocateResult[C, N, M, I, O]): CommandHelpFormatterDeps[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHelpFormatterDeps[C, N, M, I, O]]
    }
    
    @scala.inline
    implicit class CommandHelpFormatterDepsMutableBuilder[Self <: CommandHelpFormatterDeps[_, _, _, _, _], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self with (CommandHelpFormatterDeps[C, N, M, I, O])) extends AnyVal {
      
      @scala.inline
      def setColors(value: typings.ionicCliFramework.colorsMod.Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setCommand(value: C): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: HydratedCommandMetadata[C, N, M, I, O]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait CommandHelpSchema extends StObject {
    
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
    implicit class CommandHelpSchemaMutableBuilder[Self <: CommandHelpSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleCommands(value: js.Array[String]): Self = StObject.set(x, "exampleCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleCommandsVarargs(value: String*): Self = StObject.set(x, "exampleCommands", js.Array(value :_*))
      
      @scala.inline
      def setFootnotes(value: js.Array[CommandHelpSchemaFootnote]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFootnotesVarargs(value: CommandHelpSchemaFootnote*): Self = StObject.set(x, "footnotes", js.Array(value :_*))
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: js.Array[CommandHelpSchemaInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: CommandHelpSchemaInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: js.Array[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceVarargs(value: String*): Self = StObject.set(x, "namespace", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Array[CommandHelpSchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: CommandHelpSchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText
    - typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink
  */
  trait CommandHelpSchemaFootnote extends StObject
  object CommandHelpSchemaFootnote {
    
    @scala.inline
    def CommandHelpSchemaFootnoteLink(id: String | Double, `type`: link, url: String): typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink]
    }
    
    @scala.inline
    def CommandHelpSchemaFootnoteText(id: String | Double, text: String, `type`: text): typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText]
    }
  }
  
  @js.native
  trait CommandHelpSchemaFootnoteLink extends CommandHelpSchemaFootnote {
    
    val id: String | Double = js.native
    
    val shortUrl: js.UndefOr[String] = js.native
    
    val `type`: link = js.native
    
    val url: String = js.native
  }
  object CommandHelpSchemaFootnoteLink {
    
    @scala.inline
    def apply(id: String | Double, `type`: link, url: String): CommandHelpSchemaFootnoteLink = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHelpSchemaFootnoteLink]
    }
    
    @scala.inline
    implicit class CommandHelpSchemaFootnoteLinkMutableBuilder[Self <: CommandHelpSchemaFootnoteLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUrl(value: String): Self = StObject.set(x, "shortUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUrlUndefined: Self = StObject.set(x, "shortUrl", js.undefined)
      
      @scala.inline
      def setType(value: link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandHelpSchemaFootnoteText extends CommandHelpSchemaFootnote {
    
    val id: String | Double = js.native
    
    val text: String = js.native
    
    val `type`: typings.ionicCliFramework.ionicCliFrameworkStrings.text = js.native
  }
  object CommandHelpSchemaFootnoteText {
    
    @scala.inline
    def apply(id: String | Double, text: String, `type`: text): CommandHelpSchemaFootnoteText = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHelpSchemaFootnoteText]
    }
    
    @scala.inline
    implicit class CommandHelpSchemaFootnoteTextMutableBuilder[Self <: CommandHelpSchemaFootnoteText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandHelpSchemaInput extends StObject {
    
    val name: String = js.native
    
    val required: Boolean = js.native
    
    val summary: String = js.native
  }
  object CommandHelpSchemaInput {
    
    @scala.inline
    def apply(name: String, required: Boolean, summary: String): CommandHelpSchemaInput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandHelpSchemaInput]
    }
    
    @scala.inline
    implicit class CommandHelpSchemaInputMutableBuilder[Self <: CommandHelpSchemaInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandHelpSchemaOption extends StObject {
    
    val default: js.UndefOr[String | Boolean] = js.native
    
    val aliases: js.Array[String] = js.native
    
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
    implicit class CommandHelpSchemaOptionMutableBuilder[Self <: CommandHelpSchemaOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: String | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: ValueString): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NamespaceHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    val colors: js.UndefOr[typings.ionicCliFramework.colorsMod.Colors] = js.native
    
    val location: NamespaceLocateResult[C, N, M, I, O] = js.native
    
    val namespace: N = js.native
  }
  object NamespaceHelpFormatterDeps {
    
    @scala.inline
    def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](location: NamespaceLocateResult[C, N, M, I, O], namespace: N): NamespaceHelpFormatterDeps[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespaceHelpFormatterDeps[C, N, M, I, O]]
    }
    
    @scala.inline
    implicit class NamespaceHelpFormatterDepsMutableBuilder[Self <: NamespaceHelpFormatterDeps[_, _, _, _, _], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self with (NamespaceHelpFormatterDeps[C, N, M, I, O])) extends AnyVal {
      
      @scala.inline
      def setColors(value: typings.ionicCliFramework.colorsMod.Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: N): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NamespaceHelpSchema extends StObject {
    
    val aliases: js.Array[String] = js.native
    
    val commands: js.Array[CommandHelpSchema] = js.native
    
    val description: String = js.native
    
    val groups: js.Array[String] = js.native
    
    val name: String = js.native
    
    val summary: String = js.native
  }
  object NamespaceHelpSchema {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class NamespaceHelpSchemaMutableBuilder[Self <: NamespaceHelpSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setCommands(value: js.Array[CommandHelpSchema]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsVarargs(value: CommandHelpSchema*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
}
