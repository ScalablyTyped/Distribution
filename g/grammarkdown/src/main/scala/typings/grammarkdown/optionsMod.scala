package typings.grammarkdown

import org.scalablytyped.runtime.StringDictionary
import typings.grammarkdown.anon.PartialKnownOptionAliasFor
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("grammarkdown/dist/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EmitFormat extends StObject
  @JSImport("grammarkdown/dist/options", "EmitFormat")
  @js.native
  object EmitFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EmitFormat & Double] = js.native
    
    /**
      * Output should be emitted in ECMArkup format.
      */
    @js.native
    sealed trait ecmarkup
      extends StObject
         with EmitFormat
    /* 2 */ val ecmarkup: typings.grammarkdown.optionsMod.EmitFormat.ecmarkup & Double = js.native
    
    /**
      * Output should be emitted in HTML format.
      */
    @js.native
    sealed trait html
      extends StObject
         with EmitFormat
    /* 1 */ val html: typings.grammarkdown.optionsMod.EmitFormat.html & Double = js.native
    
    /**
      * Output should be emitted in Markdown format.
      */
    @js.native
    sealed trait markdown
      extends StObject
         with EmitFormat
    /* 0 */ val markdown: typings.grammarkdown.optionsMod.EmitFormat.markdown & Double = js.native
  }
  
  @js.native
  sealed trait NewLineKind extends StObject
  @JSImport("grammarkdown/dist/options", "NewLineKind")
  @js.native
  object NewLineKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NewLineKind & Double] = js.native
    
    /**
      * Lines should be terminted with a carriage-return followed by a line-feed (DOS-style).
      */
    @js.native
    sealed trait CarriageReturnLineFeed
      extends StObject
         with NewLineKind
    /* 1 */ val CarriageReturnLineFeed: typings.grammarkdown.optionsMod.NewLineKind.CarriageReturnLineFeed & Double = js.native
    
    /**
      * Lines should be terminated with a line-feed (Unix-style).
      */
    @js.native
    sealed trait LineFeed
      extends StObject
         with NewLineKind
    /* 0 */ val LineFeed: typings.grammarkdown.optionsMod.NewLineKind.LineFeed & Double = js.native
  }
  
  @JSImport("grammarkdown/dist/options", "UsageWriter")
  @js.native
  class UsageWriter protected () extends StObject {
    def this(margin: Double, padding: Double) = this()
    
    /* private */ var fit: js.Any = js.native
    
    /* private */ var margin: js.Any = js.native
    
    /* private */ var padding: js.Any = js.native
    
    /* private */ var remainder: js.Any = js.native
    
    def writeOption(): Unit = js.native
    def writeOption(left: String): Unit = js.native
    def writeOption(left: String, right: String): Unit = js.native
    def writeOption(left: Unit, right: String): Unit = js.native
    
    def writeln(): Unit = js.native
    def writeln(text: String): Unit = js.native
  }
  
  inline def getDefaultOptions(): CompilerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[CompilerOptions]
  
  inline def parse[T /* <: ParsedArguments */](options: KnownOptions): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def parse[T /* <: ParsedArguments */](options: KnownOptions, args: js.Array[String]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def usage(options: KnownOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usage(options: KnownOptions, margin: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usage(options: KnownOptions, margin: Double, printHeader: js.Function1[/* writer */ UsageWriter, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], printHeader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usage(options: KnownOptions, margin: Unit, printHeader: js.Function1[/* writer */ UsageWriter, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], printHeader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CompilerOptions extends StObject {
    
    /**
      * Indicates whether internal diagnostic information should be reported to the console.
      */
    var diagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether to include hyperlinks in the emit output.
      */
    var emitLinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates the emit output format.
      */
    var format: js.UndefOr[EmitFormat] = js.undefined
    
    /**
      * Indicates the token to use for line terminators during emit.
      */
    var newLine: js.UndefOr[NewLineKind] = js.undefined
    
    /**
      * Indicates that diagnostics should not be reported.
      */
    var noChecks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that emit output should not be produced.
      */
    var noEmit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that emit output should not be produced if any diagnostics are reported.
      */
    var noEmitOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables strict checking of production parameters.
      */
    var noStrictParametricProductions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that diagnostics should be produced if production parameters are unused.
      */
    var noUnusedParameters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates the file path for emit output.
      */
    var out: js.UndefOr[String] = js.undefined
  }
  object CompilerOptions {
    
    inline def apply(): CompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptions]
    }
    
    extension [Self <: CompilerOptions](x: Self) {
      
      inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setEmitLinks(value: Boolean): Self = StObject.set(x, "emitLinks", value.asInstanceOf[js.Any])
      
      inline def setEmitLinksUndefined: Self = StObject.set(x, "emitLinks", js.undefined)
      
      inline def setFormat(value: EmitFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setNewLine(value: NewLineKind): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      inline def setNoChecks(value: Boolean): Self = StObject.set(x, "noChecks", value.asInstanceOf[js.Any])
      
      inline def setNoChecksUndefined: Self = StObject.set(x, "noChecks", js.undefined)
      
      inline def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      inline def setNoEmitOnError(value: Boolean): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      inline def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      inline def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
      
      inline def setNoStrictParametricProductions(value: Boolean): Self = StObject.set(x, "noStrictParametricProductions", value.asInstanceOf[js.Any])
      
      inline def setNoStrictParametricProductionsUndefined: Self = StObject.set(x, "noStrictParametricProductions", js.undefined)
      
      inline def setNoUnusedParameters(value: Boolean): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
      
      inline def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    }
  }
  
  trait KnownOption extends StObject {
    
    var aliasFor: js.UndefOr[js.Array[String]] = js.undefined
    
    var convert: js.UndefOr[
        js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, js.Any]
      ] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var isUsage: js.UndefOr[Boolean] = js.undefined
    
    var longName: String
    
    var many: js.UndefOr[Boolean] = js.undefined
    
    var param: js.UndefOr[String] = js.undefined
    
    var shortName: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | (Map[String, js.Any])] = js.undefined
    
    var validate: js.UndefOr[
        js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
      ] = js.undefined
  }
  object KnownOption {
    
    inline def apply(longName: String): KnownOption = {
      val __obj = js.Dynamic.literal(longName = longName.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnownOption]
    }
    
    extension [Self <: KnownOption](x: Self) {
      
      inline def setAliasFor(value: js.Array[String]): Self = StObject.set(x, "aliasFor", value.asInstanceOf[js.Any])
      
      inline def setAliasForUndefined: Self = StObject.set(x, "aliasFor", js.undefined)
      
      inline def setAliasForVarargs(value: String*): Self = StObject.set(x, "aliasFor", js.Array(value :_*))
      
      inline def setConvert(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => js.Any): Self = StObject.set(x, "convert", js.Any.fromFunction3(value))
      
      inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIsUsage(value: Boolean): Self = StObject.set(x, "isUsage", value.asInstanceOf[js.Any])
      
      inline def setIsUsageUndefined: Self = StObject.set(x, "isUsage", js.undefined)
      
      inline def setLongName(value: String): Self = StObject.set(x, "longName", value.asInstanceOf[js.Any])
      
      inline def setMany(value: Boolean): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setType(value: String | (Map[String, js.Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type KnownOptions = StringDictionary[PartialKnownOptionAliasFor]
  
  trait ParsedArguments
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var argv: js.Array[String]
    
    var rest: js.Array[String]
  }
  object ParsedArguments {
    
    inline def apply(argv: js.Array[String], rest: js.Array[String]): ParsedArguments = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedArguments]
    }
    
    extension [Self <: ParsedArguments](x: Self) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      inline def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
    }
  }
  
  trait RawArgument extends StObject {
    
    var formattedKey: String
    
    var option: KnownOption
    
    var rawKey: String
    
    var value: js.Any
  }
  object RawArgument {
    
    inline def apply(formattedKey: String, option: KnownOption, rawKey: String, value: js.Any): RawArgument = {
      val __obj = js.Dynamic.literal(formattedKey = formattedKey.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], rawKey = rawKey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawArgument]
    }
    
    extension [Self <: RawArgument](x: Self) {
      
      inline def setFormattedKey(value: String): Self = StObject.set(x, "formattedKey", value.asInstanceOf[js.Any])
      
      inline def setOption(value: KnownOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setRawKey(value: String): Self = StObject.set(x, "rawKey", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawArguments extends StObject {
    
    var args: js.Array[RawArgument]
    
    var rest: js.Array[String]
  }
  object RawArguments {
    
    inline def apply(args: js.Array[RawArgument], rest: js.Array[String]): RawArguments = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawArguments]
    }
    
    extension [Self <: RawArguments](x: Self) {
      
      inline def setArgs(value: js.Array[RawArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: RawArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
    }
  }
}
