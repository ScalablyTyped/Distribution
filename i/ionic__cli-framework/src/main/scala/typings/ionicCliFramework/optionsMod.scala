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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("@ionic/cli-framework/lib/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework/lib/options", "OptionFilters")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    @scala.inline
    def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    
    @scala.inline
    def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    @scala.inline
    def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
  }
  
  @scala.inline
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  @scala.inline
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  @scala.inline
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  @scala.inline
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  @scala.inline
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any], hasShowAliasesShowValueSpecColors.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): HydratedCommandMetadataOption[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateCommandMetadataOption")(option.asInstanceOf[js.Any]).asInstanceOf[HydratedCommandMetadataOption[O]]
  
  @scala.inline
  def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateOptionSpec")(opt.asInstanceOf[js.Any]).asInstanceOf[HydratedOptionSpec]
  
  @scala.inline
  def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataOptionsToParseArgsOptions")(commandOptions.asInstanceOf[js.Any]).asInstanceOf[HydratedParseArgsOptions]
  
  @scala.inline
  def parseArgs(): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[ParsedArgs]
  @scala.inline
  def parseArgs(args: js.Array[String]): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[ParsedArgs]
  @scala.inline
  def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  @scala.inline
  def parseArgs(args: Unit, opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  
  @scala.inline
  def parseArgs_T_Intersection[T](): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T & ParsedArgs]
  @scala.inline
  def parseArgs_T_Intersection[T](args: js.Array[String]): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T & ParsedArgs]
  @scala.inline
  def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  @scala.inline
  def parseArgs_T_Intersection[T](args: Unit, opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T]
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: Unit, opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateArgv")(pargv.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[String], js.Array[String]]]
  
  @scala.inline
  def stripOptions(pargv: js.Array[String], hasIncludeSeparated: IncludeSeparated): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stripOptions")(pargv.asInstanceOf[js.Any], hasIncludeSeparated.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: Unit,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait FormatOptionNameOptions extends StObject {
    
    val colors: js.UndefOr[Colors] = js.undefined
    
    val showAliases: js.UndefOr[Boolean] = js.undefined
    
    val showValueSpec: js.UndefOr[Boolean] = js.undefined
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
  
  trait HydratedOptionSpec extends StObject {
    
    val value: String
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
  
  trait UnparseArgsOptions extends StObject {
    
    var allowCamelCase: js.UndefOr[Boolean] = js.undefined
    
    var ignoreFalse: js.UndefOr[Boolean] = js.undefined
    
    var useDoubleQuotes: js.UndefOr[Boolean] = js.undefined
    
    var useEquals: js.UndefOr[Boolean] = js.undefined
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
