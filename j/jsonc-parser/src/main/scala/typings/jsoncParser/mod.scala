package typings.jsoncParser

import typings.jsoncParser.jsoncParserInts.`0`
import typings.jsoncParser.jsoncParserInts.`10`
import typings.jsoncParser.jsoncParserInts.`11`
import typings.jsoncParser.jsoncParserInts.`12`
import typings.jsoncParser.jsoncParserInts.`13`
import typings.jsoncParser.jsoncParserInts.`14`
import typings.jsoncParser.jsoncParserInts.`15`
import typings.jsoncParser.jsoncParserInts.`16`
import typings.jsoncParser.jsoncParserInts.`17`
import typings.jsoncParser.jsoncParserInts.`1`
import typings.jsoncParser.jsoncParserInts.`2`
import typings.jsoncParser.jsoncParserInts.`3`
import typings.jsoncParser.jsoncParserInts.`4`
import typings.jsoncParser.jsoncParserInts.`5`
import typings.jsoncParser.jsoncParserInts.`6`
import typings.jsoncParser.jsoncParserInts.`7`
import typings.jsoncParser.jsoncParserInts.`8`
import typings.jsoncParser.jsoncParserInts.`9`
import typings.jsoncParser.jsoncParserStrings.CloseBraceExpected
import typings.jsoncParser.jsoncParserStrings.CloseBracketExpected
import typings.jsoncParser.jsoncParserStrings.ColonExpected
import typings.jsoncParser.jsoncParserStrings.CommaExpected
import typings.jsoncParser.jsoncParserStrings.EndOfFileExpected
import typings.jsoncParser.jsoncParserStrings.InvalidCharacter
import typings.jsoncParser.jsoncParserStrings.InvalidCommentToken
import typings.jsoncParser.jsoncParserStrings.InvalidEscapeCharacter
import typings.jsoncParser.jsoncParserStrings.InvalidNumberFormat
import typings.jsoncParser.jsoncParserStrings.InvalidSymbol
import typings.jsoncParser.jsoncParserStrings.InvalidUnicode
import typings.jsoncParser.jsoncParserStrings.PropertyNameExpected
import typings.jsoncParser.jsoncParserStrings.UnexpectedEndOfComment
import typings.jsoncParser.jsoncParserStrings.UnexpectedEndOfNumber
import typings.jsoncParser.jsoncParserStrings.UnexpectedEndOfString
import typings.jsoncParser.jsoncParserStrings.ValueExpected
import typings.jsoncParser.jsoncParserStrings.`Lessthansignunknown ParseErrorCodeGreaterthansign`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonc-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyEdits(text: String, edits: EditResult): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEdits")(text.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createScanner(text: String): JSONScanner = ^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(text.asInstanceOf[js.Any]).asInstanceOf[JSONScanner]
  inline def createScanner(text: String, ignoreTrivia: Boolean): JSONScanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(text.asInstanceOf[js.Any], ignoreTrivia.asInstanceOf[js.Any])).asInstanceOf[JSONScanner]
  
  inline def findNodeAtLocation(root: Node, path: JSONPath): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAtLocation")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def findNodeAtOffset(root: Node, offset: Double): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAtOffset")(root.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def findNodeAtOffset(root: Node, offset: Double, includeRightBound: Boolean): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAtOffset")(root.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], includeRightBound.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def format(documentText: String, range: Unit, options: FormattingOptions): EditResult = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(documentText.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditResult]
  inline def format(documentText: String, range: Range, options: FormattingOptions): EditResult = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(documentText.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditResult]
  
  inline def getLocation(text: String, position: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(text.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Location]
  
  inline def getNodePath(node: Node): JSONPath = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodePath")(node.asInstanceOf[js.Any]).asInstanceOf[JSONPath]
  
  inline def getNodeValue(node: Node): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeValue")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def modify(text: String, path: JSONPath, value: Any, options: ModificationOptions): EditResult = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(text.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditResult]
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, errors: js.Array[ParseError]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, errors: js.Array[ParseError], options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, errors: Unit, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseTree(text: String): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def parseTree(text: String, errors: js.Array[ParseError]): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def parseTree(text: String, errors: js.Array[ParseError], options: ParseOptions): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def parseTree(text: String, errors: Unit, options: ParseOptions): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def printParseErrorCode(code: ParseErrorCode): InvalidSymbol | InvalidNumberFormat | PropertyNameExpected | ValueExpected | ColonExpected | CommaExpected | CloseBraceExpected | CloseBracketExpected | EndOfFileExpected | InvalidCommentToken | UnexpectedEndOfComment | UnexpectedEndOfString | UnexpectedEndOfNumber | InvalidUnicode | InvalidEscapeCharacter | InvalidCharacter | (`Lessthansignunknown ParseErrorCodeGreaterthansign`) = ^.asInstanceOf[js.Dynamic].applyDynamic("printParseErrorCode")(code.asInstanceOf[js.Any]).asInstanceOf[InvalidSymbol | InvalidNumberFormat | PropertyNameExpected | ValueExpected | ColonExpected | CommaExpected | CloseBraceExpected | CloseBracketExpected | EndOfFileExpected | InvalidCommentToken | UnexpectedEndOfComment | UnexpectedEndOfString | UnexpectedEndOfNumber | InvalidUnicode | InvalidEscapeCharacter | InvalidCharacter | (`Lessthansignunknown ParseErrorCodeGreaterthansign`)]
  
  inline def stripComments(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripComments")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stripComments(text: String, replaceCh: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stripComments")(text.asInstanceOf[js.Any], replaceCh.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def visit(text: String, visitor: JSONVisitor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(text.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def visit(text: String, visitor: JSONVisitor, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(text.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Edit extends StObject {
    
    /**
      * The new content. Empty content represents a *remove*.
      */
    var content: String
    
    /**
      * The length of the modification. Must not be negative. Empty length represents an *insert*.
      */
    var length: Double
    
    /**
      * The start offset of the modification.
      */
    var offset: Double
  }
  object Edit {
    
    inline def apply(content: String, length: Double, offset: Double): Edit = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edit]
    }
    
    extension [Self <: Edit](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type EditResult = js.Array[Edit]
  
  trait FormattingOptions extends StObject {
    
    /**
      * The default 'end of line' character. If not set, '\n' is used as default.
      */
    var eol: js.UndefOr[String] = js.undefined
    
    /**
      * If set, will add a new line at the end of the document.
      */
    var insertFinalNewline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is indentation based on spaces?
      */
    var insertSpaces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, will keep line positions as is in the formatting
      */
    var keepLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If indentation is based on spaces (`insertSpaces` = true), the number of spaces that make an indent.
      */
    var tabSize: js.UndefOr[Double] = js.undefined
  }
  object FormattingOptions {
    
    inline def apply(): FormattingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattingOptions]
    }
    
    extension [Self <: FormattingOptions](x: Self) {
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setInsertFinalNewline(value: Boolean): Self = StObject.set(x, "insertFinalNewline", value.asInstanceOf[js.Any])
      
      inline def setInsertFinalNewlineUndefined: Self = StObject.set(x, "insertFinalNewline", js.undefined)
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      inline def setKeepLines(value: Boolean): Self = StObject.set(x, "keepLines", value.asInstanceOf[js.Any])
      
      inline def setKeepLinesUndefined: Self = StObject.set(x, "keepLines", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    }
  }
  
  type JSONPath = js.Array[Segment]
  
  trait JSONScanner extends StObject {
    
    /**
      * Returns the zero-based current scan position, which is after the last read token.
      */
    def getPosition(): Double
    
    /**
      * Returns the last read token.
      */
    def getToken(): SyntaxKind
    
    /**
      * An error code of the last scan.
      */
    def getTokenError(): ScanError
    
    /**
      * The length of the last read token.
      */
    def getTokenLength(): Double
    
    /**
      * The zero-based start offset of the last read token.
      */
    def getTokenOffset(): Double
    
    /**
      * The zero-based start character (column) of the last read token.
      */
    def getTokenStartCharacter(): Double
    
    /**
      * The zero-based start line number of the last read token.
      */
    def getTokenStartLine(): Double
    
    /**
      * Returns the last read token value. The value for strings is the decoded string content. For numbers it's of type number, for boolean it's true or false.
      */
    def getTokenValue(): String
    
    /**
      * Read the next token. Returns the token code.
      */
    def scan(): SyntaxKind
    
    /**
      * Sets the scan position to a new offset. A call to 'scan' is needed to get the first token.
      */
    def setPosition(pos: Double): Unit
  }
  object JSONScanner {
    
    inline def apply(
      getPosition: () => Double,
      getToken: () => SyntaxKind,
      getTokenError: () => ScanError,
      getTokenLength: () => Double,
      getTokenOffset: () => Double,
      getTokenStartCharacter: () => Double,
      getTokenStartLine: () => Double,
      getTokenValue: () => String,
      scan: () => SyntaxKind,
      setPosition: Double => Unit
    ): JSONScanner = {
      val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), getToken = js.Any.fromFunction0(getToken), getTokenError = js.Any.fromFunction0(getTokenError), getTokenLength = js.Any.fromFunction0(getTokenLength), getTokenOffset = js.Any.fromFunction0(getTokenOffset), getTokenStartCharacter = js.Any.fromFunction0(getTokenStartCharacter), getTokenStartLine = js.Any.fromFunction0(getTokenStartLine), getTokenValue = js.Any.fromFunction0(getTokenValue), scan = js.Any.fromFunction0(scan), setPosition = js.Any.fromFunction1(setPosition))
      __obj.asInstanceOf[JSONScanner]
    }
    
    extension [Self <: JSONScanner](x: Self) {
      
      inline def setGetPosition(value: () => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      inline def setGetToken(value: () => SyntaxKind): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
      
      inline def setGetTokenError(value: () => ScanError): Self = StObject.set(x, "getTokenError", js.Any.fromFunction0(value))
      
      inline def setGetTokenLength(value: () => Double): Self = StObject.set(x, "getTokenLength", js.Any.fromFunction0(value))
      
      inline def setGetTokenOffset(value: () => Double): Self = StObject.set(x, "getTokenOffset", js.Any.fromFunction0(value))
      
      inline def setGetTokenStartCharacter(value: () => Double): Self = StObject.set(x, "getTokenStartCharacter", js.Any.fromFunction0(value))
      
      inline def setGetTokenStartLine(value: () => Double): Self = StObject.set(x, "getTokenStartLine", js.Any.fromFunction0(value))
      
      inline def setGetTokenValue(value: () => String): Self = StObject.set(x, "getTokenValue", js.Any.fromFunction0(value))
      
      inline def setScan(value: () => SyntaxKind): Self = StObject.set(x, "scan", js.Any.fromFunction0(value))
      
      inline def setSetPosition(value: Double => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    }
  }
  
  trait JSONVisitor extends StObject {
    
    /**
      * Invoked when an open bracket is encountered. The offset and length represent the location of the open bracket.
      */
    var onArrayBegin: js.UndefOr[
        js.Function5[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a closing bracket is encountered. The offset and length represent the location of the closing bracket.
      */
    var onArrayEnd: js.UndefOr[
        js.Function4[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * When comments are allowed, invoked when a line or block comment is encountered. The offset and length represent the location of the comment.
      */
    var onComment: js.UndefOr[
        js.Function4[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked on an error.
      */
    var onError: js.UndefOr[
        js.Function5[
          /* error */ ParseErrorCode, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a literal value is encountered. The offset and length represent the location of the literal value.
      */
    var onLiteralValue: js.UndefOr[
        js.Function6[
          /* value */ Any, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when an open brace is encountered and an object is started. The offset and length represent the location of the open brace.
      */
    var onObjectBegin: js.UndefOr[
        js.Function5[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a closing brace is encountered and an object is completed. The offset and length represent the location of the closing brace.
      */
    var onObjectEnd: js.UndefOr[
        js.Function4[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a property is encountered. The offset and length represent the location of the property name.
      * The `JSONPath` created by the `pathSupplier` refers to the enclosing JSON object, it does not include the
      * property name yet.
      */
    var onObjectProperty: js.UndefOr[
        js.Function6[
          /* property */ String, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a comma or colon separator is encountered. The offset and length represent the location of the separator.
      */
    var onSeparator: js.UndefOr[
        js.Function5[
          /* character */ String, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
  }
  object JSONVisitor {
    
    inline def apply(): JSONVisitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONVisitor]
    }
    
    extension [Self <: JSONVisitor](x: Self) {
      
      inline def setOnArrayBegin(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Unit
      ): Self = StObject.set(x, "onArrayBegin", js.Any.fromFunction5(value))
      
      inline def setOnArrayBeginUndefined: Self = StObject.set(x, "onArrayBegin", js.undefined)
      
      inline def setOnArrayEnd(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Unit
      ): Self = StObject.set(x, "onArrayEnd", js.Any.fromFunction4(value))
      
      inline def setOnArrayEndUndefined: Self = StObject.set(x, "onArrayEnd", js.undefined)
      
      inline def setOnComment(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Unit
      ): Self = StObject.set(x, "onComment", js.Any.fromFunction4(value))
      
      inline def setOnCommentUndefined: Self = StObject.set(x, "onComment", js.undefined)
      
      inline def setOnError(
        value: (/* error */ ParseErrorCode, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction5(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLiteralValue(
        value: (/* value */ Any, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Unit
      ): Self = StObject.set(x, "onLiteralValue", js.Any.fromFunction6(value))
      
      inline def setOnLiteralValueUndefined: Self = StObject.set(x, "onLiteralValue", js.undefined)
      
      inline def setOnObjectBegin(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Unit
      ): Self = StObject.set(x, "onObjectBegin", js.Any.fromFunction5(value))
      
      inline def setOnObjectBeginUndefined: Self = StObject.set(x, "onObjectBegin", js.undefined)
      
      inline def setOnObjectEnd(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Unit
      ): Self = StObject.set(x, "onObjectEnd", js.Any.fromFunction4(value))
      
      inline def setOnObjectEndUndefined: Self = StObject.set(x, "onObjectEnd", js.undefined)
      
      inline def setOnObjectProperty(
        value: (/* property */ String, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Unit
      ): Self = StObject.set(x, "onObjectProperty", js.Any.fromFunction6(value))
      
      inline def setOnObjectPropertyUndefined: Self = StObject.set(x, "onObjectProperty", js.undefined)
      
      inline def setOnSeparator(
        value: (/* character */ String, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Unit
      ): Self = StObject.set(x, "onSeparator", js.Any.fromFunction5(value))
      
      inline def setOnSeparatorUndefined: Self = StObject.set(x, "onSeparator", js.undefined)
    }
  }
  
  trait Location extends StObject {
    
    /**
      * If set, the location's offset is at a property key.
      */
    var isAtPropertyKey: Boolean
    
    /**
      * Matches the locations path against a pattern consisting of strings (for properties) and numbers (for array indices).
      * '*' will match a single segment of any property name or index.
      * '**' will match a sequence of segments of any property name or index, or no segment.
      */
    def matches(patterns: JSONPath): Boolean
    
    /**
      * The path describing the location in the JSON document. The path consists of a sequence of strings
      * representing an object property or numbers for array indices.
      */
    var path: JSONPath
    
    /**
      * The previous property key or literal value (string, number, boolean or null) or undefined.
      */
    var previousNode: js.UndefOr[Node] = js.undefined
  }
  object Location {
    
    inline def apply(isAtPropertyKey: Boolean, matches: JSONPath => Boolean, path: JSONPath): Location = {
      val __obj = js.Dynamic.literal(isAtPropertyKey = isAtPropertyKey.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setIsAtPropertyKey(value: Boolean): Self = StObject.set(x, "isAtPropertyKey", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: JSONPath => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Segment*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPreviousNode(value: Node): Self = StObject.set(x, "previousNode", value.asInstanceOf[js.Any])
      
      inline def setPreviousNodeUndefined: Self = StObject.set(x, "previousNode", js.undefined)
    }
  }
  
  trait ModificationOptions extends StObject {
    
    /**
      * Formatting options. If undefined, the newly inserted code will be inserted unformatted.
      */
    var formattingOptions: js.UndefOr[FormattingOptions] = js.undefined
    
    /**
      * Optional function to define the insertion index given an existing list of properties.
      */
    var getInsertionIndex: js.UndefOr[js.Function1[/* properties */ js.Array[String], Double]] = js.undefined
    
    /**
      * Default false. If `JSONPath` refers to an index of an array and `isArrayInsertion` is `true`, then
      * {@linkcode modify} will insert a new item at that location instead of overwriting its contents.
      */
    var isArrayInsertion: js.UndefOr[Boolean] = js.undefined
  }
  object ModificationOptions {
    
    inline def apply(): ModificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModificationOptions]
    }
    
    extension [Self <: ModificationOptions](x: Self) {
      
      inline def setFormattingOptions(value: FormattingOptions): Self = StObject.set(x, "formattingOptions", value.asInstanceOf[js.Any])
      
      inline def setFormattingOptionsUndefined: Self = StObject.set(x, "formattingOptions", js.undefined)
      
      inline def setGetInsertionIndex(value: /* properties */ js.Array[String] => Double): Self = StObject.set(x, "getInsertionIndex", js.Any.fromFunction1(value))
      
      inline def setGetInsertionIndexUndefined: Self = StObject.set(x, "getInsertionIndex", js.undefined)
      
      inline def setIsArrayInsertion(value: Boolean): Self = StObject.set(x, "isArrayInsertion", value.asInstanceOf[js.Any])
      
      inline def setIsArrayInsertionUndefined: Self = StObject.set(x, "isArrayInsertion", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    val children: js.UndefOr[js.Array[Node]] = js.undefined
    
    val colonOffset: js.UndefOr[Double] = js.undefined
    
    val length: Double
    
    val offset: Double
    
    val parent: js.UndefOr[Node] = js.undefined
    
    val `type`: NodeType
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object Node {
    
    inline def apply(length: Double, offset: Double, `type`: NodeType): Node = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColonOffset(value: Double): Self = StObject.set(x, "colonOffset", value.asInstanceOf[js.Any])
      
      inline def setColonOffsetUndefined: Self = StObject.set(x, "colonOffset", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsoncParser.jsoncParserStrings.`object`
    - typings.jsoncParser.jsoncParserStrings.array
    - typings.jsoncParser.jsoncParserStrings.property
    - typings.jsoncParser.jsoncParserStrings.string
    - typings.jsoncParser.jsoncParserStrings.number
    - typings.jsoncParser.jsoncParserStrings.boolean
    - typings.jsoncParser.jsoncParserStrings.`null`
  */
  trait NodeType extends StObject
  object NodeType {
    
    inline def array: typings.jsoncParser.jsoncParserStrings.array = "array".asInstanceOf[typings.jsoncParser.jsoncParserStrings.array]
    
    inline def boolean: typings.jsoncParser.jsoncParserStrings.boolean = "boolean".asInstanceOf[typings.jsoncParser.jsoncParserStrings.boolean]
    
    inline def `null`: typings.jsoncParser.jsoncParserStrings.`null` = "null".asInstanceOf[typings.jsoncParser.jsoncParserStrings.`null`]
    
    inline def number: typings.jsoncParser.jsoncParserStrings.number = "number".asInstanceOf[typings.jsoncParser.jsoncParserStrings.number]
    
    inline def `object`: typings.jsoncParser.jsoncParserStrings.`object` = "object".asInstanceOf[typings.jsoncParser.jsoncParserStrings.`object`]
    
    inline def property: typings.jsoncParser.jsoncParserStrings.property = "property".asInstanceOf[typings.jsoncParser.jsoncParserStrings.property]
    
    inline def string: typings.jsoncParser.jsoncParserStrings.string = "string".asInstanceOf[typings.jsoncParser.jsoncParserStrings.string]
  }
  
  trait ParseError extends StObject {
    
    var error: ParseErrorCode
    
    var length: Double
    
    var offset: Double
  }
  object ParseError {
    
    inline def apply(error: ParseErrorCode, length: Double, offset: Double): ParseError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    extension [Self <: ParseError](x: Self) {
      
      inline def setError(value: ParseErrorCode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsoncParser.jsoncParserInts.`1`
    - typings.jsoncParser.jsoncParserInts.`2`
    - typings.jsoncParser.jsoncParserInts.`3`
    - typings.jsoncParser.jsoncParserInts.`4`
    - typings.jsoncParser.jsoncParserInts.`5`
    - typings.jsoncParser.jsoncParserInts.`6`
    - typings.jsoncParser.jsoncParserInts.`7`
    - typings.jsoncParser.jsoncParserInts.`8`
    - typings.jsoncParser.jsoncParserInts.`9`
    - typings.jsoncParser.jsoncParserInts.`10`
    - typings.jsoncParser.jsoncParserInts.`11`
    - typings.jsoncParser.jsoncParserInts.`12`
    - typings.jsoncParser.jsoncParserInts.`13`
    - typings.jsoncParser.jsoncParserInts.`14`
    - typings.jsoncParser.jsoncParserInts.`15`
    - typings.jsoncParser.jsoncParserInts.`16`
  */
  trait ParseErrorCode extends StObject
  object ParseErrorCode {
    
    inline def CloseBraceExpected: `7` = 7.asInstanceOf[`7`]
    
    inline def CloseBracketExpected: `8` = 8.asInstanceOf[`8`]
    
    inline def ColonExpected: `5` = 5.asInstanceOf[`5`]
    
    inline def CommaExpected: `6` = 6.asInstanceOf[`6`]
    
    inline def EndOfFileExpected: `9` = 9.asInstanceOf[`9`]
    
    inline def InvalidCharacter: `16` = 16.asInstanceOf[`16`]
    
    inline def InvalidCommentToken: `10` = 10.asInstanceOf[`10`]
    
    inline def InvalidEscapeCharacter: `15` = 15.asInstanceOf[`15`]
    
    inline def InvalidNumberFormat: `2` = 2.asInstanceOf[`2`]
    
    inline def InvalidSymbol: `1` = 1.asInstanceOf[`1`]
    
    inline def InvalidUnicode: `14` = 14.asInstanceOf[`14`]
    
    inline def PropertyNameExpected: `3` = 3.asInstanceOf[`3`]
    
    inline def UnexpectedEndOfComment: `11` = 11.asInstanceOf[`11`]
    
    inline def UnexpectedEndOfNumber: `13` = 13.asInstanceOf[`13`]
    
    inline def UnexpectedEndOfString: `12` = 12.asInstanceOf[`12`]
    
    inline def ValueExpected: `4` = 4.asInstanceOf[`4`]
  }
  
  trait ParseOptions extends StObject {
    
    var allowEmptyContent: js.UndefOr[Boolean] = js.undefined
    
    var allowTrailingComma: js.UndefOr[Boolean] = js.undefined
    
    var disallowComments: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setAllowEmptyContent(value: Boolean): Self = StObject.set(x, "allowEmptyContent", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyContentUndefined: Self = StObject.set(x, "allowEmptyContent", js.undefined)
      
      inline def setAllowTrailingComma(value: Boolean): Self = StObject.set(x, "allowTrailingComma", value.asInstanceOf[js.Any])
      
      inline def setAllowTrailingCommaUndefined: Self = StObject.set(x, "allowTrailingComma", js.undefined)
      
      inline def setDisallowComments(value: Boolean): Self = StObject.set(x, "disallowComments", value.asInstanceOf[js.Any])
      
      inline def setDisallowCommentsUndefined: Self = StObject.set(x, "disallowComments", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    /**
      * The length of the range. Must not be negative.
      */
    var length: Double
    
    /**
      * The start offset of the range.
      */
    var offset: Double
  }
  object Range {
    
    inline def apply(length: Double, offset: Double): Range = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsoncParser.jsoncParserInts.`0`
    - typings.jsoncParser.jsoncParserInts.`1`
    - typings.jsoncParser.jsoncParserInts.`2`
    - typings.jsoncParser.jsoncParserInts.`3`
    - typings.jsoncParser.jsoncParserInts.`4`
    - typings.jsoncParser.jsoncParserInts.`5`
    - typings.jsoncParser.jsoncParserInts.`6`
  */
  trait ScanError extends StObject
  object ScanError {
    
    inline def InvalidCharacter: `6` = 6.asInstanceOf[`6`]
    
    inline def InvalidEscapeCharacter: `5` = 5.asInstanceOf[`5`]
    
    inline def InvalidUnicode: `4` = 4.asInstanceOf[`4`]
    
    inline def None: `0` = 0.asInstanceOf[`0`]
    
    inline def UnexpectedEndOfComment: `1` = 1.asInstanceOf[`1`]
    
    inline def UnexpectedEndOfNumber: `3` = 3.asInstanceOf[`3`]
    
    inline def UnexpectedEndOfString: `2` = 2.asInstanceOf[`2`]
  }
  
  type Segment = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsoncParser.jsoncParserInts.`1`
    - typings.jsoncParser.jsoncParserInts.`2`
    - typings.jsoncParser.jsoncParserInts.`3`
    - typings.jsoncParser.jsoncParserInts.`4`
    - typings.jsoncParser.jsoncParserInts.`5`
    - typings.jsoncParser.jsoncParserInts.`6`
    - typings.jsoncParser.jsoncParserInts.`7`
    - typings.jsoncParser.jsoncParserInts.`8`
    - typings.jsoncParser.jsoncParserInts.`9`
    - typings.jsoncParser.jsoncParserInts.`10`
    - typings.jsoncParser.jsoncParserInts.`11`
    - typings.jsoncParser.jsoncParserInts.`12`
    - typings.jsoncParser.jsoncParserInts.`13`
    - typings.jsoncParser.jsoncParserInts.`14`
    - typings.jsoncParser.jsoncParserInts.`15`
    - typings.jsoncParser.jsoncParserInts.`16`
    - typings.jsoncParser.jsoncParserInts.`17`
  */
  trait SyntaxKind extends StObject
  object SyntaxKind {
    
    inline def BlockCommentTrivia: `13` = 13.asInstanceOf[`13`]
    
    inline def CloseBraceToken: `2` = 2.asInstanceOf[`2`]
    
    inline def CloseBracketToken: `4` = 4.asInstanceOf[`4`]
    
    inline def ColonToken: `6` = 6.asInstanceOf[`6`]
    
    inline def CommaToken: `5` = 5.asInstanceOf[`5`]
    
    inline def EOF: `17` = 17.asInstanceOf[`17`]
    
    inline def FalseKeyword: `9` = 9.asInstanceOf[`9`]
    
    inline def LineBreakTrivia: `14` = 14.asInstanceOf[`14`]
    
    inline def LineCommentTrivia: `12` = 12.asInstanceOf[`12`]
    
    inline def NullKeyword: `7` = 7.asInstanceOf[`7`]
    
    inline def NumericLiteral: `11` = 11.asInstanceOf[`11`]
    
    inline def OpenBraceToken: `1` = 1.asInstanceOf[`1`]
    
    inline def OpenBracketToken: `3` = 3.asInstanceOf[`3`]
    
    inline def StringLiteral: `10` = 10.asInstanceOf[`10`]
    
    inline def Trivia: `15` = 15.asInstanceOf[`15`]
    
    inline def TrueKeyword: `8` = 8.asInstanceOf[`8`]
    
    inline def Unknown: `16` = 16.asInstanceOf[`16`]
  }
}
