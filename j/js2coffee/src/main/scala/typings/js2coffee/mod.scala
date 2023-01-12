package typings.js2coffee

import typings.estree.mod.BaseNode
import typings.estree.mod.Comment
import typings.estree.mod.Node
import typings.estree.mod.SourceLocation
import typings.js2coffee.anon.Aliases
import typings.js2coffee.anon.Column
import typings.js2coffee.anon.Type
import typings.js2coffee.js2coffeeBooleans.`true`
import typings.js2coffee.js2coffeeStrings.Linefeed
import typings.js2coffee.js2coffeeStrings.Program
import typings.js2coffee.js2coffeeStrings.module
import typings.js2coffee.js2coffeeStrings.script
import typings.js2coffee.js2coffeeStrings.t
import typings.js2coffee.js2coffeeStrings.tab
import typings.sourceMap.mod.CodeWithSourceMap
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * JS2Coffee API.
    *
    * @param source JavaScript code to compile. In order to compile JSON as CSON, you must wrap the string in
    * parentheses like so: `(...)`.
    * @param [options] JS2Coffee compiler options.
    * @param [options.bare=false] Whether to omit a top-level IIFE safety wrapper.
    * @param [options.comments=true] Whether to keep comments in the output.
    * @param [options.compat=false] Compatibility mode with JS.
    * @param [options.filename=index.js] File name for JS script to compile to CoffeeScript.
    * @param [options.indent=2] Indentation character(s) used in the compiler output.
    * @param [options.source] The source code itself - always overwritten by
    * `source`.
    * @returns Compiled CoffeeScript code.
    */
  inline def apply(source: String): String = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(source: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("js2coffee", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * @param source JavaScript code to compile. In order to compile JSON as CSON, you must wrap the string in
  	 * parentheses like so: `(...)`.
  	 * @param [options] JS2Coffee compiler options.
  	 * @param [options.bare=false] Whether to omit a top-level IIFE safety wrapper.
  	 * @param [options.comments=true] Whether to keep comments in the output.
  	 * @param [options.compat=false] Compatibility mode with JS.
  	 * @param [options.filename=index.js] File name for JS script to compile to CoffeeScript.
  	 * @param [options.indent=2] Indentation character(s) used in the compiler output.
  	 * @param [options.source] The source code itself - always overwritten by
  	 * `source`.
  	 * @returns Build output in CoffeeScript.
  	 */
  inline def build(source: String): Build_ = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(source.asInstanceOf[js.Any]).asInstanceOf[Build_]
  inline def build(source: String, options: Options): Build_ = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Build_]
  
  /**
  	 * Generates a CoffeeScript `CodeWithSourceMap` instance from a given CoffeeScript transform.
  	 *
  	 * @param ast Transformed CoffeeScript AST in ESTree format.
  	 * @param [options] JS2Coffee compiler options.
  	 * @param [options.bare=false] Whether to omit a top-level IIFE safety wrapper.
  	 * @param [options.comments=true] Whether to keep comments in the output.
  	 * @param [options.compat=false] Compatibility mode with JS.
  	 * @param [options.filename=index.js] File name for JS script to compile to CoffeeScript.
  	 * @param [options.indent=2] Indentation character(s) used in the compiler output.
  	 * @param [options.source] The source code itself - always overwritten by
  	 * `source`.
  	 * @returns CoffeeScript output as a `CodeWithSourceMap` object.
  	 */
  inline def generate(ast: Transform_): CodeWithSourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[CodeWithSourceMap]
  inline def generate(ast: Transform_, options: Options): CodeWithSourceMap = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeWithSourceMap]
  
  /**
  	 * Collection of helper functions used to parse JavaScript in
  	 */
  @JSImport("js2coffee", "helpers")
  @js.native
  def helpers: Helpers_ = js.native
  inline def helpers_=(x: Helpers_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("helpers")(x.asInstanceOf[js.Any])
  
  /**
  	 * Compiles JavaScript into a ESTree-style CoffeeScript AST. The AST has the following custom types exclusive to
  	 * JS2Coffee:
  	 * - `CoffeeDoExpression`
  	 * - `CoffeeEscapedExpression`
  	 * - `CoffeeListExpression`
  	 * - `CoffeeLoopStatement`
  	 * - `CoffeePrototypeExpression`
  	 *
  	 * @param source JavaScript code to compile. In order to compile JSON as CSON,
  	 * you must wrap the string in parentheses like so: `(...)`.
  	 * @param [options] JS2Coffee compiler options.
  	 * @param [options.bare=false] Whether to omit a top-level IIFE safety wrapper.
  	 * @param [options.comments=true] Whether to keep comments in the output.
  	 * @param [options.compat=false] Compatibility mode with JS.
  	 * @param [options.filename=index.js] File name for JS script to compile to CoffeeScript.
  	 * @param [options.indent=2] Indentation character(s) used in the compiler output.
  	 * @param [options.source] The source code itself - always overwritten by
  	 * `source`.
  	 * @returns JavaScript AST in ESTree format.
  	 */
  inline def parseJS(source: String): AST = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJS")(source.asInstanceOf[js.Any]).asInstanceOf[AST]
  inline def parseJS(source: String, options: Options): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  /**
  	 * Mutates the `ast` JavaScript syntax tree into a CoffeeScript AST transform.
  	 *
  	 * @param JavaScript AST in ESTree format.
  	 * @param [options] JS2Coffee compiler options.
  	 * @param [options.bare=false] Whether to omit a top-level IIFE safety wrapper.
  	 * @param [options.comments=true] Whether to keep comments in the output.
  	 * @param [options.compat=false] Compatibility mode with JS.
  	 * @param [options.filename=index.js] File name for JS script to compile to CoffeeScript.
  	 * @param [options.indent=2] Indentation character(s) used in the compiler output.
  	 * @param [options.source] The source code itself - always overwritten by
  	 * `source`.
  	 * @returns Abstract syntax tree for post-transform CoffeeScript.
  	 */
  inline def transform(ast: AST): Transform_ = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(ast.asInstanceOf[js.Any]).asInstanceOf[Transform_]
  inline def transform(ast: AST, options: Options): Transform_ = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform_]
  
  /**
  	 * Version number. Type defintions are written for JS2Coffee v1.9.2.
  	 */
  @JSImport("js2coffee", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  /**
  	 * Abstract syntax tree for CoffeeScript file.
  	 *
  	 */
  /* Inlined parent std.Omit<estree.estree.Program, 'body'> */
  trait AST extends StObject {
    
    var body: js.Array[CoffeeNode]
    
    var comments: js.UndefOr[js.Array[Comment]] = js.undefined
    
    var leadingComments: js.UndefOr[js.Array[Comment]] = js.undefined
    
    var loc: js.UndefOr[SourceLocation | Null] = js.undefined
    
    var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var sourceType: script | module
    
    var trailingComments: js.UndefOr[js.Array[Comment]] = js.undefined
    
    var `type`: Program
  }
  object AST {
    
    inline def apply(body: js.Array[CoffeeNode], sourceType: script | module): AST = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Program")
      __obj.asInstanceOf[AST]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AST] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.Array[CoffeeNode]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: CoffeeNode*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
      
      inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
      
      inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocNull: Self = StObject.set(x, "loc", null)
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
      
      inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
      
      inline def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	 * Build output for JS code compiled to CoffeeScript.
  	 *
  	 * (See `CodeWithSourceMap` definition in `source-map`).
  	 */
  trait Build_ extends StObject {
    
    var ast: AST
    
    var code: String
    
    var map: CodeWithSourceMap
    
    var warnings: Warnings
  }
  object Build_ {
    
    inline def apply(ast: AST, code: String, map: CodeWithSourceMap, warnings: Warnings): Build_ = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Build_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Build_] (val x: Self) extends AnyVal {
      
      inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: CodeWithSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: Warnings): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: (Any | SyntaxProblem)*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  /**
  	 * Custom ESTree-style node used to define converted CoffeeScript nodes JS2Coffee ASTs.
  	 */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof estree.estree.Node, 'type'> ]: estree.estree.Node[P]} */ trait CoffeeNode extends StObject {
    
    var `type`: (/* import warning: importer.ImportType#apply Failed type conversion: estree.estree.Node['type'] */ js.Any) | CoffeeNodeType
  }
  object CoffeeNode {
    
    inline def apply(
      `type`: (/* import warning: importer.ImportType#apply Failed type conversion: estree.estree.Node['type'] */ js.Any) | CoffeeNodeType
    ): CoffeeNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoffeeNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoffeeNode] (val x: Self) extends AnyVal {
      
      inline def setType(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: estree.estree.Node['type'] */ js.Any) | CoffeeNodeType
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	 * ESTree node types for CoffeeScript AST nodes in `AST` body.
  	 */
  /* Rewritten from type alias, can be one of: 
    - typings.js2coffee.js2coffeeStrings.CoffeeDoExpression
    - typings.js2coffee.js2coffeeStrings.CoffeeEscapedExpression
    - typings.js2coffee.js2coffeeStrings.CoffeeListExpression
    - typings.js2coffee.js2coffeeStrings.CoffeeLoopStatement
    - typings.js2coffee.js2coffeeStrings.CoffeePrototypeExpression
  */
  trait CoffeeNodeType extends StObject
  object CoffeeNodeType {
    
    inline def CoffeeDoExpression: typings.js2coffee.js2coffeeStrings.CoffeeDoExpression = "CoffeeDoExpression".asInstanceOf[typings.js2coffee.js2coffeeStrings.CoffeeDoExpression]
    
    inline def CoffeeEscapedExpression: typings.js2coffee.js2coffeeStrings.CoffeeEscapedExpression = "CoffeeEscapedExpression".asInstanceOf[typings.js2coffee.js2coffeeStrings.CoffeeEscapedExpression]
    
    inline def CoffeeListExpression: typings.js2coffee.js2coffeeStrings.CoffeeListExpression = "CoffeeListExpression".asInstanceOf[typings.js2coffee.js2coffeeStrings.CoffeeListExpression]
    
    inline def CoffeeLoopStatement: typings.js2coffee.js2coffeeStrings.CoffeeLoopStatement = "CoffeeLoopStatement".asInstanceOf[typings.js2coffee.js2coffeeStrings.CoffeeLoopStatement]
    
    inline def CoffeePrototypeExpression: typings.js2coffee.js2coffeeStrings.CoffeePrototypeExpression = "CoffeePrototypeExpression".asInstanceOf[typings.js2coffee.js2coffeeStrings.CoffeePrototypeExpression]
  }
  
  /**
  	 * Generic compilation error in
  	 *
  	 */
  trait CompileError
    extends StObject
       with Error {
    
    var description: String
    
    var end: Column
    
    var start: Column
  }
  object CompileError {
    
    inline def apply(description: String, end: Column, message: String, name: String, start: Column): CompileError = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileError] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	 * Custom ESTree-style node used to define CoffeeScript in JS2Coffee ASTs.
  	 */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof estree.estree.Node, 'type'> ]: estree.estree.Node[P]} */ trait CustomNode extends StObject {
    
    var `type`: CoffeeNodeType
  }
  object CustomNode {
    
    inline def apply(`type`: CoffeeNodeType): CustomNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomNode] (val x: Self) extends AnyVal {
      
      inline def setType(value: CoffeeNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	 * Esprima-style error thrown by
  	 *
  	 */
  trait EsprimaStyleError extends StObject {
    
    var column: Double
    
    var description: String
    
    var lineNumber: Double
  }
  object EsprimaStyleError {
    
    inline def apply(column: Double, description: String, lineNumber: Double): EsprimaStyleError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsprimaStyleError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EsprimaStyleError] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	 * Collection of helper functions used to parse JavaScript in
  	 */
  @js.native
  trait Helpers_ extends StObject {
    
    /**
    		 * Builds a syntax error message.
    		 *
    		 * @param err Error to convert into syntax error.
    		 * @param source Source code that threw the JS2Coffee compiler error
    		 * @param file File name including extension.
    		 */
    def buildError(err: CompileError, source: String, file: String): SyntaxProblem = js.native
    def buildError(err: EsprimaStyleError, source: String, file: String): SyntaxProblem = js.native
    
    /**
    		 * Duplicates all primitive members of an object recursively.
    		 *
    		 * @param obj Object to clone.
    		 * @returns Deep copy of object.
    		 */
    def clone(obj: js.Object): js.Object = js.native
    
    /**
    		 * Turns an array of strings into a comma-separated list.
    		 * Takes new lines into account.
    		 *
    		 * @param list Array of elements to join with `,`.
    		 * @returns Array with elements separated by `,`.
    		 */
    def commaDelimit(list: js.Array[String]): js.Array[String] = js.native
    
    /**
    		 * Intersperses `joiner` into `list`.
    		 * Used for things like adding indentations.
    		 *
    		 * @param list Array of elements to be joined by `joiner`.
    		 * @param joiner Element to insert between each element of `list`.
    		 */
    def delimit(list: js.Array[Any], joiner: Any): js.Array[Any] = js.native
    
    /**
    		 * Escapes JS that cannot be converted to CoffeeScript.
    		 *
    		 * @param node Unconvertable node.
    		 * @returns Node with type "CoffeeEscapedExpression".
    		 */
    def escapeJs(node: Node): CoffeeNode & Type = js.native
    
    /**
    		 * Returns the precedence level of a ESTree operator node.
    		 * If a node"s precedence level is greater than its parent, it has to be
    		 * parenthesized.
    		 *
    		 * @param node ESTree operator node.
    		 * @returns Precedence level.
    		 */
    def getPrecedence(node: BaseNode): Double = js.native
    
    /**
    		 * Returns the final return statements in a body.
    		 *
    		 * @param body AST colleciton of nodes describing a program.
    		 * @returns Array of ESTree nodes for final return statement or empty array.
    		 */
    def getReturnStatements(body: js.Array[BaseNode]): js.Array[Any | BaseNode] = js.native
    
    /**
    		 * Inspect a ESTree node for debugging.
    		 *
    		 * @param node Node to inspect.
    		 * @returns String representation bounded by `~~~~`.
    		 */
    def inspect(node: BaseNode): /* template literal string: ~~~~\n${string}\n~~~~ */ String = js.native
    
    /**
    		 * ESTree comment node assertion.
    		 *
    		 * @param node Node to apply test to.
    		 * @returns Whether the ESTree node is a comment.
    		 */
    def isComment(node: BaseNode): Boolean = js.native
    
    /**
    		 * ESTree infinite loop node assertion.
    		 *
    		 * @param node Node to apply test to.
    		 * @returns Whether the ESTree node is a infinite loop.
    		 */
    def isLoop(node: BaseNode): Boolean = js.native
    
    /**
    		 * ESTree "truthy" node assertion.
    		 * A node is truthy when it has a "Literal" type and a value.
    		 *
    		 * @param node Node to apply test to.
    		 * @returns Whether the ESTree node is a "truthy" node.
    		 */
    def isTruthy(node: BaseNode): Boolean = js.native
    
    def joinLines(props: js.Array[String], indent: String): js.Array[String] = js.native
    
    /**
    		 * Get the last statement in a program.
    		 *
    		 * @param body AST colleciton of nodes describing a program.
    		 * @returns Last non-comment node in a program.
    		 */
    def lastStatement(body: js.Array[BaseNode]): BaseNode = js.native
    
    def newline(srcnode: js.Tuple2[BaseNode, Linefeed]): js.Tuple2[BaseNode, Linefeed] = js.native
    /**
    		 * Appends a new line to a given SourceNode (what `walk()` returns). If it
    		 * already ends in a newline, it is left alone.
    		 *
    		 * @param srcnode Either a ESTree node or a node array terminating with `\n`.
    		 * @returns ESTree node array terminating with `\n`.
    		 */
    def newline(srcnode: BaseNode): js.Tuple2[BaseNode, Linefeed] = js.native
    
    /**
    		 * Get the next ESTree node after `node` that is not a comment
    		 *
    		 * @param body AST colleciton of nodes describing a program.
    		 * @param node Current node in JS2Coffee stack.
    		 * @returns Next non-comment stack, if one is available.
    		 */
    def nextNonComment(body: js.Array[BaseNode], node: BaseNode): js.UndefOr[BaseNode] = js.native
    
    /**
    		 * Iterate to the next ESTree node until `fn` returns true.
    		 *
    		 * @param body AST colleciton of nodes describing a program.
    		 * @param node Current node in JS2Coffee stack.
    		 * @returns Next ESTree node that passes the `fn` callback.
    		 */
    def nextUntil(body: js.Array[BaseNode], node: BaseNode, fn: js.Function1[/* n */ BaseNode, Boolean]): js.UndefOr[BaseNode] = js.native
    
    /**
    		 * Prepends every item in the `list` with a given `prefix`.
    		 *
    		 * @param list Array of elements.
    		 * @param prefix Prefix to insert before every element.
    		 * @returns Array with all elements preceded by `prefix`.
    		 */
    def prependAll(list: js.Array[Any], prefix: Any): js.Array[Any] = js.native
    
    /**
    		 * Quotes a string or primitive with single quotes.
    		 *
    		 * @param str String to quote.
    		 */
    def quote(str: Any): String = js.native
    
    /**
    		 * Fabricates a replacement node for `node` that maintains the same source
    		 * location.
    		 *
    		 * @param node Prevous node.
    		 * @param node.loc Previous node"s location (preserved in output).
    		 * @param node.range Previous node"s character range (preserved in output).
    		 * @param newNode New ESTree node with a specified `type` and `name`.
    		 * @param newNode.type ESTree or JS2Coffee type for the new node.
    		 * @param newNode.name Name of the new node.
    		 * @returns Newly typed and named node with previous source location.
    		 */
    def replace(node: BaseNode, newNode: BaseNode): BaseNode = js.native
    
    /**
    		 * Reserved words taken from COFFEE_KEYWORDS (lexer.coffee).
    		 * We don't check for "undefined" because it"s already explicitly
    		 * accounted for elsewhere.
    		 */
    var reserved: Aliases = js.native
    
    var reservedWords: js.Array[String] = js.native
    
    /**
    		 * Delimit using spaces. This also accounts for times where one of the
    		 * statements begin with a new line, such as in the case of function
    		 * expressions and object expressions.
    		 *
    		 * @param list Array of code tokens.
    		 * @returns Array of code tokens separated by spaces.
    		 */
    def space(list: js.Array[String]): js.Array[String] = js.native
    
    def toIndent(ind: tab | t): String = js.native
    /**
    		 * Convert identifier, custom character or indentation level into indent.
    		 *
    		 * @param ind Either "tab", "t", custom character or indentation level.
    		 * @returns Indentation character sequence (character default: ` `).
    		 */
    def toIndent(ind: String): String = js.native
    def toIndent(ind: Double): String = js.native
  }
  
  /**
  	 * JS2Coffee compiler options.
  	 *
  	 * `source` parameter.
  	 */
  trait Options extends StObject {
    
    var bare: js.UndefOr[Boolean] = js.undefined
    
    var comments: js.UndefOr[Boolean] = js.undefined
    
    var compat: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBare(value: Boolean): Self = StObject.set(x, "bare", value.asInstanceOf[js.Any])
      
      inline def setBareUndefined: Self = StObject.set(x, "bare", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCompat(value: Boolean): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
      
      inline def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /**
  	 * JavaScript syntax error thrown by JS2Coffee compiler.
  	 */
  trait SyntaxProblem
    extends StObject
       with CompileError {
    
    var filename: String
    
    var js2coffee: `true`
    
    var sourcePreview: js.Array[String]
  }
  object SyntaxProblem {
    
    inline def apply(
      description: String,
      end: Column,
      filename: String,
      message: String,
      name: String,
      sourcePreview: js.Array[String],
      start: Column
    ): SyntaxProblem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], js2coffee = true, message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourcePreview = sourcePreview.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxProblem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyntaxProblem] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setJs2coffee(value: `true`): Self = StObject.set(x, "js2coffee", value.asInstanceOf[js.Any])
      
      inline def setSourcePreview(value: js.Array[String]): Self = StObject.set(x, "sourcePreview", value.asInstanceOf[js.Any])
      
      inline def setSourcePreviewVarargs(value: String*): Self = StObject.set(x, "sourcePreview", js.Array(value*))
    }
  }
  
  /**
  	 * Abstract syntax tree for post-transform CoffeeScript.
  	 *
  	 */
  trait Transform_ extends StObject {
    
    var ast: AST
    
    var warnings: Warnings
  }
  object Transform_ {
    
    inline def apply(ast: AST, warnings: Warnings): Transform_ = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transform_] (val x: Self) extends AnyVal {
      
      inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: Warnings): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: (Any | SyntaxProblem)*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  /**
  	 * Collection of syntax warnings to return to user (may be empty).
  	 */
  type Warnings = js.Array[Any | SyntaxProblem]
}
