package typings.grammarkdown

import typings.grammarkdown.distOptionsMod.EmitFormat
import typings.grammarkdown.distOptionsMod.NewLineKind
import typings.grammarkdown.distOptionsMod.RawArguments
import typings.grammarkdown.distTokensMod.SyntaxKind
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bof extends StObject {
    
    def bof(): Unit = js.native
    
    def eof(): Unit = js.native
    
    def firstToken(): Unit = js.native
    def firstToken(kind: Unit, text: String): Unit = js.native
    def firstToken(kind: SyntaxKind): Unit = js.native
    def firstToken(kind: SyntaxKind, text: String): Unit = js.native
    
    def lastToken(): Unit = js.native
    def lastToken(kind: Unit, text: String): Unit = js.native
    def lastToken(kind: SyntaxKind): Unit = js.native
    def lastToken(kind: SyntaxKind, text: String): Unit = js.native
    
    def nextToken(): Unit = js.native
    def nextToken(kind: Unit, text: String): Unit = js.native
    def nextToken(kind: SyntaxKind): Unit = js.native
    def nextToken(kind: SyntaxKind, text: String): Unit = js.native
    
    def prevToken(): Unit = js.native
    def prevToken(kind: Unit, text: String): Unit = js.native
    def prevToken(kind: SyntaxKind): Unit = js.native
    def prevToken(kind: SyntaxKind, text: String): Unit = js.native
  }
  
  /* Inlined grammarkdown.grammarkdown/dist/options.CompilerOptions & {  file :string | undefined} */
  trait CompilerOptionsfilestring extends StObject {
    
    /**
      * Indicates whether internal diagnostic information should be reported to the console.
      */
    var diagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether to include hyperlinks in the emit output.
      */
    var emitLinks: js.UndefOr[Boolean] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
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
  object CompilerOptionsfilestring {
    
    inline def apply(): CompilerOptionsfilestring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptionsfilestring]
    }
    
    extension [Self <: CompilerOptionsfilestring](x: Self) {
      
      inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setEmitLinks(value: Boolean): Self = StObject.set(x, "emitLinks", value.asInstanceOf[js.Any])
      
      inline def setEmitLinksUndefined: Self = StObject.set(x, "emitLinks", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
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
  
  trait Detailed extends StObject {
    
    var detailed: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object Detailed {
    
    inline def apply(): Detailed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Detailed]
    }
    
    extension [Self <: Detailed](x: Self) {
      
      inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait DetailedMessage extends StObject {
    
    var detailedMessage: js.UndefOr[Boolean] = js.undefined
    
    var formatMessage: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object DetailedMessage {
    
    inline def apply(): DetailedMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedMessage]
    }
    
    extension [Self <: DetailedMessage](x: Self) {
      
      inline def setDetailedMessage(value: Boolean): Self = StObject.set(x, "detailedMessage", value.asInstanceOf[js.Any])
      
      inline def setDetailedMessageUndefined: Self = StObject.set(x, "detailedMessage", js.undefined)
      
      inline def setFormatMessage(value: Boolean): Self = StObject.set(x, "formatMessage", value.asInstanceOf[js.Any])
      
      inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait Dispose extends StObject {
    
    def unsubscribe(): Unit = js.native
  }
  
  /* Inlined std.Partial<grammarkdown.grammarkdown/dist/options.KnownOption> */
  trait PartialKnownOption extends StObject {
    
    var aliasFor: js.UndefOr[js.Array[String]] = js.undefined
    
    var convert: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Any]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var isUsage: js.UndefOr[Boolean] = js.undefined
    
    var longName: js.UndefOr[String] = js.undefined
    
    var many: js.UndefOr[Boolean] = js.undefined
    
    var param: js.UndefOr[String] = js.undefined
    
    var shortName: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | (Map[String, Any])] = js.undefined
    
    var validate: js.UndefOr[
        js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
      ] = js.undefined
  }
  object PartialKnownOption {
    
    inline def apply(): PartialKnownOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialKnownOption]
    }
    
    extension [Self <: PartialKnownOption](x: Self) {
      
      inline def setAliasFor(value: js.Array[String]): Self = StObject.set(x, "aliasFor", value.asInstanceOf[js.Any])
      
      inline def setAliasForUndefined: Self = StObject.set(x, "aliasFor", js.undefined)
      
      inline def setAliasForVarargs(value: String*): Self = StObject.set(x, "aliasFor", js.Array(value*))
      
      inline def setConvert(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Any): Self = StObject.set(x, "convert", js.Any.fromFunction3(value))
      
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
      
      inline def setLongNameUndefined: Self = StObject.set(x, "longName", js.undefined)
      
      inline def setMany(value: Boolean): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setType(value: String | (Map[String, Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var range: typings.grammarkdown.distTypesMod.Range
    
    var text: String
  }
  object Range {
    
    inline def apply(range: typings.grammarkdown.distTypesMod.Range, text: String): Range = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setRange(value: typings.grammarkdown.distTypesMod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<grammarkdown.grammarkdown/dist/options.CompilerOptions> */
  trait ReadonlyCompilerOptions extends StObject {
    
    val diagnostics: js.UndefOr[Boolean] = js.undefined
    
    val emitLinks: js.UndefOr[Boolean] = js.undefined
    
    val format: js.UndefOr[EmitFormat] = js.undefined
    
    val newLine: js.UndefOr[NewLineKind] = js.undefined
    
    val noChecks: js.UndefOr[Boolean] = js.undefined
    
    val noEmit: js.UndefOr[Boolean] = js.undefined
    
    val noEmitOnError: js.UndefOr[Boolean] = js.undefined
    
    val noStrictParametricProductions: js.UndefOr[Boolean] = js.undefined
    
    val noUnusedParameters: js.UndefOr[Boolean] = js.undefined
    
    val out: js.UndefOr[String] = js.undefined
  }
  object ReadonlyCompilerOptions {
    
    inline def apply(): ReadonlyCompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyCompilerOptions]
    }
    
    extension [Self <: ReadonlyCompilerOptions](x: Self) {
      
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
}
