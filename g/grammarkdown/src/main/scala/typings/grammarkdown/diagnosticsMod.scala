package typings.grammarkdown

import typings.grammarkdown.anon.Detailed
import typings.grammarkdown.anon.DetailedMessage
import typings.grammarkdown.lineOffsetMapMod.LineOffsetMap
import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.grammarkdown.typesMod.Position
import typings.grammarkdown.typesMod.Range
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsMod {
  
  @JSImport("grammarkdown/dist/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grammarkdown/dist/diagnostics", "DiagnosticMessages")
  @js.native
  class DiagnosticMessages () extends StObject {
    def this(lineOffsetMap: LineOffsetMap) = this()
    
    /* private */ var compareDiagnostics: js.Any = js.native
    
    def copyFrom(other: DiagnosticMessages): Unit = js.native
    
    def count(): Double = js.native
    
    /* private */ var deduplicateDiagnostics: js.Any = js.native
    
    /* private */ var detailedDiagnosticMessages: js.Any = js.native
    
    /* private */ var diagnostics: js.Any = js.native
    
    /* private */ var diagnosticsArguments: js.Any = js.native
    
    /* private */ var diagnosticsLength: js.Any = js.native
    
    /* private */ var diagnosticsNode: js.Any = js.native
    
    /* private */ var diagnosticsPos: js.Any = js.native
    
    def forEach(callback: js.Function2[/* message */ String, /* diagnosticIndex */ Double, Unit]): Unit = js.native
    
    def getDiagnostic(diagnosticIndex: Double): js.UndefOr[Diagnostic] = js.native
    
    def getDiagnosticArguments(diagnosticIndex: Double): js.UndefOr[js.Array[js.Any]] = js.native
    
    /* private */ var getDiagnosticCode: js.Any = js.native
    
    /* private */ var getDiagnosticErrorLevel: js.Any = js.native
    
    def getDiagnosticFilename(diagnosticIndex: Double): js.UndefOr[String] = js.native
    def getDiagnosticFilename(diagnosticIndex: Double, raw: Boolean): js.UndefOr[String] = js.native
    
    def getDiagnosticInfo(diagnosticIndex: Double): js.UndefOr[DiagnosticInfo] = js.native
    def getDiagnosticInfo(diagnosticIndex: Double, options: DetailedMessage): js.UndefOr[DiagnosticInfo] = js.native
    
    def getDiagnosticInfos(): js.Array[DiagnosticInfo] = js.native
    def getDiagnosticInfos(options: DetailedMessage): js.Array[DiagnosticInfo] = js.native
    
    def getDiagnosticInfosForSourceFile(sourceFile: SourceFile): js.Array[DiagnosticInfo] = js.native
    def getDiagnosticInfosForSourceFile(sourceFile: SourceFile, options: DetailedMessage): js.Array[DiagnosticInfo] = js.native
    
    /* private */ var getDiagnosticLength: js.Any = js.native
    
    def getDiagnosticNode(diagnosticIndex: Double): js.UndefOr[Node[SyntaxKind]] = js.native
    
    /* private */ var getDiagnosticPos: js.Any = js.native
    
    def getDiagnosticPosition(diagnosticIndex: Double): js.UndefOr[Position] = js.native
    def getDiagnosticPosition(diagnosticIndex: Double, raw: Boolean): js.UndefOr[Position] = js.native
    
    def getDiagnosticRange(diagnosticIndex: Double): js.UndefOr[Range] = js.native
    def getDiagnosticRange(diagnosticIndex: Double, raw: Boolean): js.UndefOr[Range] = js.native
    
    def getDiagnosticSourceFile(diagnosticIndex: Double): js.UndefOr[SourceFile] = js.native
    
    def getMessage(diagnosticIndex: Double): String = js.native
    def getMessage(diagnosticIndex: Double, options: Detailed): String = js.native
    
    /* private */ var getSortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[js.UndefOr[DiagnosticInfo], Unit, js.Any]] = js.native
    
    /* private */ var lineOffsetMap: js.Any = js.native
    
    def report(pos: Double, message: Diagnostic, args: js.Any*): Unit = js.native
    
    /* private */ var reportDiagnostic: js.Any = js.native
    
    def reportNode(sourceFile: Unit, node: Node[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
    def reportNode(sourceFile: SourceFile, node: Node[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
    
    def setSourceFile(sourceFile: SourceFile): Unit = js.native
    
    /* private */ var simpleDiagnosticMessages: js.Any = js.native
    
    def size: Double = js.native
    
    /* private */ var sortDiagnostics: js.Any = js.native
    
    /* private */ var sortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
    
    /* private */ var sourceFiles: js.Any = js.native
    
    /* private */ var sourceFilesDiagnosticOffset: js.Any = js.native
    
    def values(): Generator[js.UndefOr[DiagnosticInfo], Unit, js.Any] = js.native
  }
  
  object Diagnostics {
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics._0_expected")
    @js.native
    val `0Expected`: Diagnostic = js.native
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics._0_or_1_")
    @js.native
    val `0Or1`: Diagnostic = js.native
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Argument_0_cannot_be_specified_multiple_times")
    @js.native
    def Argument0CannotBeSpecifiedMultipleTimes: Diagnostic = js.native
    
    inline def Argument0CannotBeSpecifiedMultipleTimes_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Argument_0_cannot_be_specified_multiple_times")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Cannot_find_name_0_")
    @js.native
    def CannotFindName0: Diagnostic = js.native
    
    inline def CannotFindName0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cannot_find_name_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Constant_expected")
    @js.native
    def ConstantExpected: Diagnostic = js.native
    
    inline def ConstantExpected_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constant_expected")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Digit_expected")
    @js.native
    def DigitExpected: Diagnostic = js.native
    
    inline def DigitExpected_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Digit_expected")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Duplicate_identifier_0_")
    @js.native
    def DuplicateIdentifier0: Diagnostic = js.native
    
    inline def DuplicateIdentifier0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Duplicate_identifier_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Duplicate_terminal_0_")
    @js.native
    def DuplicateTerminal0: Diagnostic = js.native
    
    inline def DuplicateTerminal0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Duplicate_terminal_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.HTML_trivia_not_allowed_here")
    @js.native
    def HTMLTriviaNotAllowedHere: Diagnostic = js.native
    
    inline def HTMLTriviaNotAllowedHere_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML_trivia_not_allowed_here")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Invalid_character")
    @js.native
    def InvalidCharacter: Diagnostic = js.native
    
    inline def InvalidCharacter_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid_character")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Invalid_escape_sequence")
    @js.native
    def InvalidEscapeSequence: Diagnostic = js.native
    
    inline def InvalidEscapeSequence_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid_escape_sequence")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Obsolete_0_")
    @js.native
    def Obsolete0: Diagnostic = js.native
    
    inline def Obsolete0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Obsolete_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Parameter_0_is_unused")
    @js.native
    def Parameter0IsUnused: Diagnostic = js.native
    
    inline def Parameter0IsUnused_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter_0_is_unused")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Production_0_does_not_have_a_parameter_named_1_")
    @js.native
    def Production0DoesNotHaveAParameterNamed1: Diagnostic = js.native
    
    inline def Production0DoesNotHaveAParameterNamed1_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production_0_does_not_have_a_parameter_named_1_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Production_0_is_missing_parameter_1_All_definitions_of_production_0_must_specify_the_same_formal_parameters")
    @js.native
    def Production0IsMissingParameter1AllDefinitionsOfProduction0MustSpecifyTheSameFormalParameters: Diagnostic = js.native
    
    inline def Production0IsMissingParameter1AllDefinitionsOfProduction0MustSpecifyTheSameFormalParameters_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production_0_is_missing_parameter_1_All_definitions_of_production_0_must_specify_the_same_formal_parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Production_expected")
    @js.native
    def ProductionExpected: Diagnostic = js.native
    
    inline def ProductionExpected_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production_expected")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.There_is_no_argument_given_for_parameter_0_")
    @js.native
    def ThereIsNoArgumentGivenForParameter0: Diagnostic = js.native
    
    inline def ThereIsNoArgumentGivenForParameter0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("There_is_no_argument_given_for_parameter_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Unexpected_token_0_")
    @js.native
    def UnexpectedToken0: Diagnostic = js.native
    
    inline def UnexpectedToken0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unexpected_token_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Unterminated_identifier_literal")
    @js.native
    def UnterminatedIdentifierLiteral: Diagnostic = js.native
    
    inline def UnterminatedIdentifierLiteral_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unterminated_identifier_literal")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Unterminated_string_literal")
    @js.native
    def UnterminatedStringLiteral: Diagnostic = js.native
    
    inline def UnterminatedStringLiteral_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unterminated_string_literal")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("grammarkdown/dist/diagnostics", "LineMap")
  @js.native
  class LineMap protected () extends StObject {
    def this(text: String) = this()
    
    /* private */ var computeLineStarts: js.Any = js.native
    
    def formatOffset(pos: Double): String = js.native
    
    def lineCount: Double = js.native
    
    /* private */ var lineStarts: js.Any = js.native
    
    def offsetAt(position: Position): Double = js.native
    
    def positionAt(offset: Double): Position = js.native
    
    /* private */ var text: js.Any = js.native
  }
  
  @JSImport("grammarkdown/dist/diagnostics", "NullDiagnosticMessages")
  @js.native
  class NullDiagnosticMessages () extends DiagnosticMessages {
    def this(lineOffsetMap: LineOffsetMap) = this()
  }
  /* static members */
  object NullDiagnosticMessages {
    
    @JSImport("grammarkdown/dist/diagnostics", "NullDiagnosticMessages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("grammarkdown/dist/diagnostics", "NullDiagnosticMessages._instance")
    @js.native
    def _instance: js.Any = js.native
    inline def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  }
  
  inline def formatList(tokens: js.Array[SyntaxKind | String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(tokens.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatString(format: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatString(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatString(format: String, args: js.Array[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Diagnostic extends StObject {
    
    var code: Double
    
    var message: String
    
    var warning: js.UndefOr[Boolean] = js.undefined
  }
  object Diagnostic {
    
    inline def apply(code: Double, message: String): Diagnostic = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagnostic]
    }
    
    extension [Self <: Diagnostic](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait DiagnosticInfo extends StObject {
    
    var code: Double
    
    var diagnosticIndex: Double
    
    var filename: js.UndefOr[String] = js.undefined
    
    var formattedMessage: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var messageArguments: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var node: js.UndefOr[Node[SyntaxKind]] = js.undefined
    
    var pos: Double
    
    var range: js.UndefOr[Range] = js.undefined
    
    var sourceFile: js.UndefOr[SourceFile] = js.undefined
    
    var warning: Boolean
  }
  object DiagnosticInfo {
    
    inline def apply(code: Double, diagnosticIndex: Double, message: String, pos: Double, warning: Boolean): DiagnosticInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnosticIndex = diagnosticIndex.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticInfo]
    }
    
    extension [Self <: DiagnosticInfo](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticIndex(value: Double): Self = StObject.set(x, "diagnosticIndex", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormattedMessage(value: String): Self = StObject.set(x, "formattedMessage", value.asInstanceOf[js.Any])
      
      inline def setFormattedMessageUndefined: Self = StObject.set(x, "formattedMessage", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageArguments(value: js.Array[js.Any]): Self = StObject.set(x, "messageArguments", value.asInstanceOf[js.Any])
      
      inline def setMessageArgumentsUndefined: Self = StObject.set(x, "messageArguments", js.undefined)
      
      inline def setMessageArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "messageArguments", js.Array(value :_*))
      
      inline def setNode(value: Node[SyntaxKind]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
