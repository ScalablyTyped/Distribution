package typings.ionicCliFramework

import typings.ionicCliFramework.anon.IncludeSeparated
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.HydratedParseArgsOptions
import typings.ionicCliFramework.definitionsMod.ParsedArg
import typings.ionicCliFramework.libColorsMod.Colors
import typings.minimist.mod.Opts
import typings.minimist.mod.ParsedArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionsMod {
  
  @JSImport("@ionic/cli-framework/lib/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework/lib/options", "OptionFilters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    inline def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    
    inline def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    inline def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
  }
  
  inline def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  inline def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  inline def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  inline def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  inline def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatOptionName[O /* <: CommandMetadataOption */](opt: O, param1: FormatOptionNameOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateCommandMetadataOption")(option.asInstanceOf[js.Any]).asInstanceOf[O]
  
  inline def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateOptionSpec")(opt.asInstanceOf[js.Any]).asInstanceOf[HydratedOptionSpec]
  
  inline def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataOptionsToParseArgsOptions")(commandOptions.asInstanceOf[js.Any]).asInstanceOf[HydratedParseArgsOptions]
  
  inline def parseArgs(): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[ParsedArgs]
  inline def parseArgs(args: js.Array[String]): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[ParsedArgs]
  inline def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  inline def parseArgs(args: Unit, opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  
  inline def parseArgs_T_Intersection[T](): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: js.Array[String]): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: Unit, opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  
  inline def parseArgs_T_T[T /* <: ParsedArgs */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T]
  inline def parseArgs_T_T[T /* <: ParsedArgs */](args: js.Array[String]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def parseArgs_T_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def parseArgs_T_T[T /* <: ParsedArgs */](args: Unit, opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateArgv")(pargv.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[String], js.Array[String]]]
  
  inline def stripOptions(pargv: js.Array[String], param1: IncludeSeparated): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stripOptions")(pargv.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def unparseArgs(parsedArgs: ParsedArgs, param1: Unit, parseArgsOptions: Opts): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def unparseArgs(parsedArgs: ParsedArgs, param1: UnparseArgsOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def unparseArgs(parsedArgs: ParsedArgs, param1: UnparseArgsOptions, parseArgsOptions: Opts): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait FormatOptionNameOptions extends StObject {
    
    val colors: js.UndefOr[Colors] = js.undefined
    
    val showAliases: js.UndefOr[Boolean] = js.undefined
    
    val showValueSpec: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptionNameOptions {
    
    inline def apply(): FormatOptionNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptionNameOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptionNameOptions] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setShowAliases(value: Boolean): Self = StObject.set(x, "showAliases", value.asInstanceOf[js.Any])
      
      inline def setShowAliasesUndefined: Self = StObject.set(x, "showAliases", js.undefined)
      
      inline def setShowValueSpec(value: Boolean): Self = StObject.set(x, "showValueSpec", value.asInstanceOf[js.Any])
      
      inline def setShowValueSpecUndefined: Self = StObject.set(x, "showValueSpec", js.undefined)
    }
  }
  
  trait HydratedOptionSpec extends StObject {
    
    val value: String
  }
  object HydratedOptionSpec {
    
    inline def apply(value: String): HydratedOptionSpec = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HydratedOptionSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HydratedOptionSpec] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def apply(): UnparseArgsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnparseArgsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnparseArgsOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowCamelCase(value: Boolean): Self = StObject.set(x, "allowCamelCase", value.asInstanceOf[js.Any])
      
      inline def setAllowCamelCaseUndefined: Self = StObject.set(x, "allowCamelCase", js.undefined)
      
      inline def setIgnoreFalse(value: Boolean): Self = StObject.set(x, "ignoreFalse", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFalseUndefined: Self = StObject.set(x, "ignoreFalse", js.undefined)
      
      inline def setUseDoubleQuotes(value: Boolean): Self = StObject.set(x, "useDoubleQuotes", value.asInstanceOf[js.Any])
      
      inline def setUseDoubleQuotesUndefined: Self = StObject.set(x, "useDoubleQuotes", js.undefined)
      
      inline def setUseEquals(value: Boolean): Self = StObject.set(x, "useEquals", value.asInstanceOf[js.Any])
      
      inline def setUseEqualsUndefined: Self = StObject.set(x, "useEquals", js.undefined)
    }
  }
}
