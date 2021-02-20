package typings.grammarkdown

import org.scalablytyped.runtime.StringDictionary
import typings.grammarkdown.anon.PartialKnownOptionAliasFor
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  sealed trait EmitFormat extends StObject
  @JSImport("grammarkdown/dist/options", "EmitFormat")
  @js.native
  object EmitFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EmitFormat with Double] = js.native
    
    /**
      * Output should be emitted in ECMArkup format.
      */
    @js.native
    sealed trait ecmarkup extends EmitFormat
    /* 2 */ val ecmarkup: typings.grammarkdown.optionsMod.EmitFormat.ecmarkup with Double = js.native
    
    /**
      * Output should be emitted in HTML format.
      */
    @js.native
    sealed trait html extends EmitFormat
    /* 1 */ val html: typings.grammarkdown.optionsMod.EmitFormat.html with Double = js.native
    
    /**
      * Output should be emitted in Markdown format.
      */
    @js.native
    sealed trait markdown extends EmitFormat
    /* 0 */ val markdown: typings.grammarkdown.optionsMod.EmitFormat.markdown with Double = js.native
  }
  
  @js.native
  sealed trait NewLineKind extends StObject
  @JSImport("grammarkdown/dist/options", "NewLineKind")
  @js.native
  object NewLineKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
    
    /**
      * Lines should be terminted with a carriage-return followed by a line-feed (DOS-style).
      */
    @js.native
    sealed trait CarriageReturnLineFeed extends NewLineKind
    /* 1 */ val CarriageReturnLineFeed: typings.grammarkdown.optionsMod.NewLineKind.CarriageReturnLineFeed with Double = js.native
    
    /**
      * Lines should be terminated with a line-feed (Unix-style).
      */
    @js.native
    sealed trait LineFeed extends NewLineKind
    /* 0 */ val LineFeed: typings.grammarkdown.optionsMod.NewLineKind.LineFeed with Double = js.native
  }
  
  @JSImport("grammarkdown/dist/options", "UsageWriter")
  @js.native
  class UsageWriter protected () extends StObject {
    def this(margin: Double, padding: Double) = this()
    
    var fit: js.Any = js.native
    
    var margin: js.Any = js.native
    
    var padding: js.Any = js.native
    
    var remainder: js.Any = js.native
    
    def writeOption(): Unit = js.native
    def writeOption(left: js.UndefOr[scala.Nothing], right: String): Unit = js.native
    def writeOption(left: String): Unit = js.native
    def writeOption(left: String, right: String): Unit = js.native
    
    def writeln(): Unit = js.native
    def writeln(text: String): Unit = js.native
  }
  
  @JSImport("grammarkdown/dist/options", "getDefaultOptions")
  @js.native
  def getDefaultOptions(): CompilerOptions = js.native
  
  @JSImport("grammarkdown/dist/options", "parse")
  @js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions): js.UndefOr[T] = js.native
  @JSImport("grammarkdown/dist/options", "parse")
  @js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions, args: js.Array[String]): js.UndefOr[T] = js.native
  
  @JSImport("grammarkdown/dist/options", "usage")
  @js.native
  def usage(options: KnownOptions): Unit = js.native
  @JSImport("grammarkdown/dist/options", "usage")
  @js.native
  def usage(
    options: KnownOptions,
    margin: js.UndefOr[scala.Nothing],
    printHeader: js.Function1[/* writer */ UsageWriter, Unit]
  ): Unit = js.native
  @JSImport("grammarkdown/dist/options", "usage")
  @js.native
  def usage(options: KnownOptions, margin: Double): Unit = js.native
  @JSImport("grammarkdown/dist/options", "usage")
  @js.native
  def usage(options: KnownOptions, margin: Double, printHeader: js.Function1[/* writer */ UsageWriter, Unit]): Unit = js.native
  
  @js.native
  trait CompilerOptions extends StObject {
    
    /**
      * Indicates whether internal diagnostic information should be reported to the console.
      */
    var diagnostics: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates whether to include hyperlinks in the emit output.
      */
    var emitLinks: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the emit output format.
      */
    var format: js.UndefOr[EmitFormat] = js.native
    
    /**
      * Indicates the token to use for line terminators during emit.
      */
    var newLine: js.UndefOr[NewLineKind] = js.native
    
    /**
      * Indicates that diagnostics should not be reported.
      */
    var noChecks: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates that emit output should not be produced.
      */
    var noEmit: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates that emit output should not be produced if any diagnostics are reported.
      */
    var noEmitOnError: js.UndefOr[Boolean] = js.native
    
    /**
      * Disables strict checking of production parameters.
      */
    var noStrictParametricProductions: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates that diagnostics should be produced if production parameters are unused.
      */
    var noUnusedParameters: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the file path for emit output.
      */
    var out: js.UndefOr[String] = js.native
  }
  object CompilerOptions {
    
    @scala.inline
    def apply(): CompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptions]
    }
    
    @scala.inline
    implicit class CompilerOptionsMutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      @scala.inline
      def setEmitLinks(value: Boolean): Self = StObject.set(x, "emitLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitLinksUndefined: Self = StObject.set(x, "emitLinks", js.undefined)
      
      @scala.inline
      def setFormat(value: EmitFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setNewLine(value: NewLineKind): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      @scala.inline
      def setNoChecks(value: Boolean): Self = StObject.set(x, "noChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoChecksUndefined: Self = StObject.set(x, "noChecks", js.undefined)
      
      @scala.inline
      def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitOnError(value: Boolean): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      @scala.inline
      def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
      
      @scala.inline
      def setNoStrictParametricProductions(value: Boolean): Self = StObject.set(x, "noStrictParametricProductions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStrictParametricProductionsUndefined: Self = StObject.set(x, "noStrictParametricProductions", js.undefined)
      
      @scala.inline
      def setNoUnusedParameters(value: Boolean): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    }
  }
  
  @js.native
  trait KnownOption extends StObject {
    
    var aliasFor: js.UndefOr[js.Array[String]] = js.native
    
    var convert: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, _]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var isUsage: js.UndefOr[Boolean] = js.native
    
    var longName: String = js.native
    
    var many: js.UndefOr[Boolean] = js.native
    
    var param: js.UndefOr[String] = js.native
    
    var shortName: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String | (Map[String, _])] = js.native
    
    var validate: js.UndefOr[
        js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
      ] = js.native
  }
  object KnownOption {
    
    @scala.inline
    def apply(longName: String): KnownOption = {
      val __obj = js.Dynamic.literal(longName = longName.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnownOption]
    }
    
    @scala.inline
    implicit class KnownOptionMutableBuilder[Self <: KnownOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasFor(value: js.Array[String]): Self = StObject.set(x, "aliasFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasForUndefined: Self = StObject.set(x, "aliasFor", js.undefined)
      
      @scala.inline
      def setAliasForVarargs(value: String*): Self = StObject.set(x, "aliasFor", js.Array(value :_*))
      
      @scala.inline
      def setConvert(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => _): Self = StObject.set(x, "convert", js.Any.fromFunction3(value))
      
      @scala.inline
      def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIsUsage(value: Boolean): Self = StObject.set(x, "isUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUsageUndefined: Self = StObject.set(x, "isUsage", js.undefined)
      
      @scala.inline
      def setLongName(value: String): Self = StObject.set(x, "longName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMany(value: Boolean): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      @scala.inline
      def setType(value: String | (Map[String, _])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidate(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type KnownOptions = StringDictionary[PartialKnownOptionAliasFor]
  
  @js.native
  trait ParsedArguments
    extends /* key */ StringDictionary[js.Any] {
    
    var argv: js.Array[String] = js.native
    
    var rest: js.Array[String] = js.native
  }
  object ParsedArguments {
    
    @scala.inline
    def apply(argv: js.Array[String], rest: js.Array[String]): ParsedArguments = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedArguments]
    }
    
    @scala.inline
    implicit class ParsedArgumentsMutableBuilder[Self <: ParsedArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RawArgument extends StObject {
    
    var formattedKey: String = js.native
    
    var option: KnownOption = js.native
    
    var rawKey: String = js.native
    
    var value: js.Any = js.native
  }
  object RawArgument {
    
    @scala.inline
    def apply(formattedKey: String, option: KnownOption, rawKey: String, value: js.Any): RawArgument = {
      val __obj = js.Dynamic.literal(formattedKey = formattedKey.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], rawKey = rawKey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawArgument]
    }
    
    @scala.inline
    implicit class RawArgumentMutableBuilder[Self <: RawArgument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormattedKey(value: String): Self = StObject.set(x, "formattedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption(value: KnownOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawKey(value: String): Self = StObject.set(x, "rawKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RawArguments extends StObject {
    
    var args: js.Array[RawArgument] = js.native
    
    var rest: js.Array[String] = js.native
  }
  object RawArguments {
    
    @scala.inline
    def apply(args: js.Array[RawArgument], rest: js.Array[String]): RawArguments = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawArguments]
    }
    
    @scala.inline
    implicit class RawArgumentsMutableBuilder[Self <: RawArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[RawArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: RawArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
    }
  }
}
