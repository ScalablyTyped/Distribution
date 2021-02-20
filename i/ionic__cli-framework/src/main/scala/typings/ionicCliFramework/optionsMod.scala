package typings.ionicCliFramework

import typings.ionicCliFramework.anon.IncludeSeparated
import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadataOption
import typings.ionicCliFramework.definitionsMod.HydratedParseArgsOptions
import typings.ionicCliFramework.definitionsMod.ParsedArg
import typings.minimist.mod.Opts
import typings.minimist.mod.ParsedArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework/lib/options", "OptionFilters.excludesGroups")
    @js.native
    def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
    @JSImport("@ionic/cli-framework/lib/options", "OptionFilters.excludesGroups")
    @js.native
    def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
    
    @JSImport("@ionic/cli-framework/lib/options", "OptionFilters.includesGroups")
    @js.native
    def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
    @JSImport("@ionic/cli-framework/lib/options", "OptionFilters.includesGroups")
    @js.native
    def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/options", "filterCommandLineOptions")
  @js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = js.native
  @JSImport("@ionic/cli-framework/lib/options", "filterCommandLineOptions")
  @js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "filterCommandLineOptionsByGroup")
  @js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = js.native
  @JSImport("@ionic/cli-framework/lib/options", "filterCommandLineOptionsByGroup")
  @js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "formatOptionName")
  @js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = js.native
  @JSImport("@ionic/cli-framework/lib/options", "formatOptionName")
  @js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "hydrateCommandMetadataOption")
  @js.native
  def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): HydratedCommandMetadataOption[O] = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "hydrateOptionSpec")
  @js.native
  def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "metadataOptionsToParseArgsOptions")
  @js.native
  def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs(): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs(args: js.UndefOr[scala.Nothing], opts: Opts): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs(args: js.Array[String]): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.UndefOr[scala.Nothing], opts: Opts): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.Array[String]): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](): T = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.UndefOr[scala.Nothing], opts: Opts): T = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String]): T = js.native
  @JSImport("@ionic/cli-framework/lib/options", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "separateArgv")
  @js.native
  def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "stripOptions")
  @js.native
  def stripOptions(pargv: js.Array[String], hasIncludeSeparated: IncludeSeparated): js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework/lib/options", "unparseArgs")
  @js.native
  def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/lib/options", "unparseArgs")
  @js.native
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: js.UndefOr[scala.Nothing],
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/lib/options", "unparseArgs")
  @js.native
  def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/lib/options", "unparseArgs")
  @js.native
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  
  @js.native
  trait FormatOptionNameOptions extends StObject {
    
    val colors: js.UndefOr[Colors] = js.native
    
    val showAliases: js.UndefOr[Boolean] = js.native
    
    val showValueSpec: js.UndefOr[Boolean] = js.native
  }
  object FormatOptionNameOptions {
    
    @scala.inline
    def apply(): FormatOptionNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptionNameOptions]
    }
    
    @scala.inline
    implicit class FormatOptionNameOptionsMutableBuilder[Self <: FormatOptionNameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setShowAliases(value: Boolean): Self = StObject.set(x, "showAliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAliasesUndefined: Self = StObject.set(x, "showAliases", js.undefined)
      
      @scala.inline
      def setShowValueSpec(value: Boolean): Self = StObject.set(x, "showValueSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowValueSpecUndefined: Self = StObject.set(x, "showValueSpec", js.undefined)
    }
  }
  
  @js.native
  trait HydratedOptionSpec extends StObject {
    
    val value: String = js.native
  }
  object HydratedOptionSpec {
    
    @scala.inline
    def apply(value: String): HydratedOptionSpec = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HydratedOptionSpec]
    }
    
    @scala.inline
    implicit class HydratedOptionSpecMutableBuilder[Self <: HydratedOptionSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionPredicate[O /* <: CommandMetadataOption */] = js.Function2[/* option */ O, /* value */ js.UndefOr[ParsedArg], Boolean]
  
  @js.native
  trait UnparseArgsOptions extends StObject {
    
    var allowCamelCase: js.UndefOr[Boolean] = js.native
    
    var ignoreFalse: js.UndefOr[Boolean] = js.native
    
    var useDoubleQuotes: js.UndefOr[Boolean] = js.native
    
    var useEquals: js.UndefOr[Boolean] = js.native
  }
  object UnparseArgsOptions {
    
    @scala.inline
    def apply(): UnparseArgsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnparseArgsOptions]
    }
    
    @scala.inline
    implicit class UnparseArgsOptionsMutableBuilder[Self <: UnparseArgsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCamelCase(value: Boolean): Self = StObject.set(x, "allowCamelCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCamelCaseUndefined: Self = StObject.set(x, "allowCamelCase", js.undefined)
      
      @scala.inline
      def setIgnoreFalse(value: Boolean): Self = StObject.set(x, "ignoreFalse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFalseUndefined: Self = StObject.set(x, "ignoreFalse", js.undefined)
      
      @scala.inline
      def setUseDoubleQuotes(value: Boolean): Self = StObject.set(x, "useDoubleQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDoubleQuotesUndefined: Self = StObject.set(x, "useDoubleQuotes", js.undefined)
      
      @scala.inline
      def setUseEquals(value: Boolean): Self = StObject.set(x, "useEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEqualsUndefined: Self = StObject.set(x, "useEquals", js.undefined)
    }
  }
}
