package typings.grammarkdown

import typings.grammarkdown.grammarkdownBooleans.`true`
import typings.grammarkdown.grammarkdownMod.Range2
import typings.grammarkdown.grammarkdownMod.RawArguments
import typings.grammarkdown.optionsMod.EmitFormat
import typings.grammarkdown.optionsMod.NewLineKind
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var detailed: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: Double
    
    var message: String
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Detailed extends StObject {
    
    var detailed: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object Detailed {
    
    @scala.inline
    def apply(): Detailed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Detailed]
    }
    
    @scala.inline
    implicit class DetailedMutableBuilder[Self <: Detailed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait DetailedMessage extends StObject {
    
    var detailedMessage: js.UndefOr[Boolean] = js.undefined
    
    var formatMessage: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object DetailedMessage {
    
    @scala.inline
    def apply(): DetailedMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedMessage]
    }
    
    @scala.inline
    implicit class DetailedMessageMutableBuilder[Self <: DetailedMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailedMessage(value: Boolean): Self = StObject.set(x, "detailedMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedMessageUndefined: Self = StObject.set(x, "detailedMessage", js.undefined)
      
      @scala.inline
      def setFormatMessage(value: Boolean): Self = StObject.set(x, "formatMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait FormatMessage extends StObject {
    
    var detailedMessage: js.UndefOr[Boolean] = js.undefined
    
    var formatMessage: js.UndefOr[Boolean] = js.undefined
  }
  object FormatMessage {
    
    @scala.inline
    def apply(): FormatMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatMessage]
    }
    
    @scala.inline
    implicit class FormatMessageMutableBuilder[Self <: FormatMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailedMessage(value: Boolean): Self = StObject.set(x, "detailedMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedMessageUndefined: Self = StObject.set(x, "detailedMessage", js.undefined)
      
      @scala.inline
      def setFormatMessage(value: Boolean): Self = StObject.set(x, "formatMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var code: Double
    
    var message: String
    
    var warning: `true`
  }
  object Message {
    
    @scala.inline
    def apply(code: Double, message: String): Message = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], warning = true)
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: `true`): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<grammarkdown.grammarkdown/dist/grammarkdown.KnownOption> */
  trait PartialKnownOption extends StObject {
    
    var aliasFor: js.UndefOr[js.Array[String]] = js.undefined
    
    var convert: js.UndefOr[
        js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, js.Any]
      ] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var isUsage: js.UndefOr[Boolean] = js.undefined
    
    var longName: js.UndefOr[String] = js.undefined
    
    var many: js.UndefOr[Boolean] = js.undefined
    
    var param: js.UndefOr[String] = js.undefined
    
    var shortName: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | (Map[String, js.Any])] = js.undefined
    
    var validate: js.UndefOr[
        js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
      ] = js.undefined
  }
  object PartialKnownOption {
    
    @scala.inline
    def apply(): PartialKnownOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialKnownOption]
    }
    
    @scala.inline
    implicit class PartialKnownOptionMutableBuilder[Self <: PartialKnownOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasFor(value: js.Array[String]): Self = StObject.set(x, "aliasFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasForUndefined: Self = StObject.set(x, "aliasFor", js.undefined)
      
      @scala.inline
      def setAliasForVarargs(value: String*): Self = StObject.set(x, "aliasFor", js.Array(value :_*))
      
      @scala.inline
      def setConvert(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => js.Any): Self = StObject.set(x, "convert", js.Any.fromFunction3(value))
      
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
      def setLongNameUndefined: Self = StObject.set(x, "longName", js.undefined)
      
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
      def setType(value: String | (Map[String, js.Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidate(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  /* Inlined std.Partial<grammarkdown.grammarkdown/dist/options.KnownOption> */
  trait PartialKnownOptionAliasFor extends StObject {
    
    var aliasFor: js.UndefOr[js.Array[String]] = js.undefined
    
    var convert: js.UndefOr[
        js.Function3[
          /* key */ String, 
          /* value */ String, 
          /* raw */ typings.grammarkdown.optionsMod.RawArguments, 
          js.Any
        ]
      ] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var isUsage: js.UndefOr[Boolean] = js.undefined
    
    var longName: js.UndefOr[String] = js.undefined
    
    var many: js.UndefOr[Boolean] = js.undefined
    
    var param: js.UndefOr[String] = js.undefined
    
    var shortName: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | (Map[String, js.Any])] = js.undefined
    
    var validate: js.UndefOr[
        js.Function3[
          /* key */ String, 
          /* value */ String, 
          /* raw */ typings.grammarkdown.optionsMod.RawArguments, 
          Boolean
        ]
      ] = js.undefined
  }
  object PartialKnownOptionAliasFor {
    
    @scala.inline
    def apply(): PartialKnownOptionAliasFor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialKnownOptionAliasFor]
    }
    
    @scala.inline
    implicit class PartialKnownOptionAliasForMutableBuilder[Self <: PartialKnownOptionAliasFor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasFor(value: js.Array[String]): Self = StObject.set(x, "aliasFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasForUndefined: Self = StObject.set(x, "aliasFor", js.undefined)
      
      @scala.inline
      def setAliasForVarargs(value: String*): Self = StObject.set(x, "aliasFor", js.Array(value :_*))
      
      @scala.inline
      def setConvert(
        value: (/* key */ String, /* value */ String, /* raw */ typings.grammarkdown.optionsMod.RawArguments) => js.Any
      ): Self = StObject.set(x, "convert", js.Any.fromFunction3(value))
      
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
      def setLongNameUndefined: Self = StObject.set(x, "longName", js.undefined)
      
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
      def setType(value: String | (Map[String, js.Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidate(
        value: (/* key */ String, /* value */ String, /* raw */ typings.grammarkdown.optionsMod.RawArguments) => Boolean
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var range: Range2
    
    var text: String
  }
  object Range {
    
    @scala.inline
    def apply(range: Range2, text: String): Range = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRange(value: Range2): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ReadonlyCompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyCompilerOptions]
    }
    
    @scala.inline
    implicit class ReadonlyCompilerOptionsMutableBuilder[Self <: ReadonlyCompilerOptions] (val x: Self) extends AnyVal {
      
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
  
  trait Text extends StObject {
    
    var range: typings.grammarkdown.typesMod.Range
    
    var text: String
  }
  object Text {
    
    @scala.inline
    def apply(range: typings.grammarkdown.typesMod.Range, text: String): Text = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRange(value: typings.grammarkdown.typesMod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
