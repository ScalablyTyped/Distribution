package typings.handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.hbs.AST.Expression
import typings.handlebars.hbs.AST.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handlebars {
  
  trait Exception extends StObject {
    
    var column: js.UndefOr[js.Any] = js.undefined
    
    var description: String
    
    var endColumn: js.UndefOr[js.Any] = js.undefined
    
    var endLineNumber: js.UndefOr[js.Any] = js.undefined
    
    var fileName: String
    
    var lineNumber: js.UndefOr[js.Any] = js.undefined
    
    var message: String
    
    var name: String
    
    var number: Double
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object Exception {
    
    inline def apply(description: String, fileName: String, message: String, name: String, number: Double): Exception = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exception]
    }
    
    extension [Self <: Exception](x: Self) {
      
      inline def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEndColumn(value: js.Any): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setEndLineNumber(value: js.Any): Self = StObject.set(x, "endLineNumber", value.asInstanceOf[js.Any])
      
      inline def setEndLineNumberUndefined: Self = StObject.set(x, "endLineNumber", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: js.Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type HelperDeclareSpec = StringDictionary[HelperDelegate]
  
  type HelperDelegate = js.Function7[
    /* context */ js.UndefOr[js.Any], 
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    /* arg4 */ js.UndefOr[js.Any], 
    /* arg5 */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[HelperOptions], 
    js.Any
  ]
  
  trait HelperOptions extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    def fn(context: js.Any): String
    def fn(context: js.Any, options: typings.handlebars.Handlebars.RuntimeOptions): String
    @JSName("fn")
    var fn_Original: TemplateDelegate[js.Any]
    
    var hash: js.Any
    
    def inverse(context: js.Any): String
    def inverse(context: js.Any, options: typings.handlebars.Handlebars.RuntimeOptions): String
    @JSName("inverse")
    var inverse_Original: TemplateDelegate[js.Any]
  }
  object HelperOptions {
    
    inline def apply(
      fn: (js.Any, /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions]) => String,
      hash: js.Any,
      inverse: (js.Any, /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions]) => String
    ): HelperOptions = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn), hash = hash.asInstanceOf[js.Any], inverse = js.Any.fromFunction2(inverse))
      __obj.asInstanceOf[HelperOptions]
    }
    
    extension [Self <: HelperOptions](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFn(value: (js.Any, /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions]) => String): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setInverse(value: (js.Any, /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions]) => String): Self = StObject.set(x, "inverse", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ICompiler extends StObject {
    
    def BlockStatement(block: typings.handlebars.hbs.AST.BlockStatement): Unit = js.native
    
    def BooleanLiteral(bool: typings.handlebars.hbs.AST.BooleanLiteral): Unit = js.native
    
    def CommentStatement(): Unit = js.native
    def CommentStatement(comment: typings.handlebars.hbs.AST.CommentStatement): Unit = js.native
    
    def ContentStatement(content: typings.handlebars.hbs.AST.ContentStatement): Unit = js.native
    
    def Decorator(decorator: typings.handlebars.hbs.AST.Decorator): Unit = js.native
    
    def DecoratorBlock(decorator: typings.handlebars.hbs.AST.DecoratorBlock): Unit = js.native
    
    def Hash(hash: typings.handlebars.hbs.AST.Hash): Unit = js.native
    
    def MustacheStatement(mustache: typings.handlebars.hbs.AST.MustacheStatement): Unit = js.native
    
    def NullLiteral(): Unit = js.native
    
    def NumberLiteral(num: typings.handlebars.hbs.AST.NumberLiteral): Unit = js.native
    
    def PartialBlockStatement(partial: typings.handlebars.hbs.AST.PartialBlockStatement): Unit = js.native
    
    def PartialStatement(partial: typings.handlebars.hbs.AST.PartialStatement): Unit = js.native
    
    def PathExpression(path: typings.handlebars.hbs.AST.PathExpression): Unit = js.native
    
    def Program(program: typings.handlebars.hbs.AST.Program): Unit = js.native
    
    def StringLiteral(str: typings.handlebars.hbs.AST.StringLiteral): Unit = js.native
    
    def SubExpression(sexpr: typings.handlebars.hbs.AST.SubExpression): Unit = js.native
    
    def UndefinedLiteral(): Unit = js.native
    
    def accept(node: Node): Unit = js.native
  }
  
  trait ParseOptions extends StObject {
    
    var ignoreStandalone: js.UndefOr[Boolean] = js.undefined
    
    var srcName: js.UndefOr[String] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setIgnoreStandalone(value: Boolean): Self = StObject.set(x, "ignoreStandalone", value.asInstanceOf[js.Any])
      
      inline def setIgnoreStandaloneUndefined: Self = StObject.set(x, "ignoreStandalone", js.undefined)
      
      inline def setSrcName(value: String): Self = StObject.set(x, "srcName", value.asInstanceOf[js.Any])
      
      inline def setSrcNameUndefined: Self = StObject.set(x, "srcName", js.undefined)
    }
  }
  
  trait ResolvePartialOptions extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var decorators: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var helpers: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var name: String
    
    var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[js.Any]]] = js.undefined
  }
  object ResolvePartialOptions {
    
    inline def apply(name: String): ResolvePartialOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvePartialOptions]
    }
    
    extension [Self <: ResolvePartialOptions](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDecorators(value: StringDictionary[js.Function]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      inline def setHelpers(value: StringDictionary[js.Function]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPartials(value: StringDictionary[HandlebarsTemplateDelegate[js.Any]]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    }
  }
  
  trait RuntimeOptions extends StObject {
    
    var allowCallsToHelperMissing: js.UndefOr[Boolean] = js.undefined
    
    var allowProtoMethodsByDefault: js.UndefOr[Boolean] = js.undefined
    
    var allowProtoPropertiesByDefault: js.UndefOr[Boolean] = js.undefined
    
    var allowedProtoMethods: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var allowedProtoProperties: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var blockParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var decorators: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var depths: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var helpers: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var partial: js.UndefOr[Boolean] = js.undefined
    
    var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[js.Any]]] = js.undefined
  }
  object RuntimeOptions {
    
    inline def apply(): typings.handlebars.Handlebars.RuntimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.handlebars.Handlebars.RuntimeOptions]
    }
    
    extension [Self <: typings.handlebars.Handlebars.RuntimeOptions](x: Self) {
      
      inline def setAllowCallsToHelperMissing(value: Boolean): Self = StObject.set(x, "allowCallsToHelperMissing", value.asInstanceOf[js.Any])
      
      inline def setAllowCallsToHelperMissingUndefined: Self = StObject.set(x, "allowCallsToHelperMissing", js.undefined)
      
      inline def setAllowProtoMethodsByDefault(value: Boolean): Self = StObject.set(x, "allowProtoMethodsByDefault", value.asInstanceOf[js.Any])
      
      inline def setAllowProtoMethodsByDefaultUndefined: Self = StObject.set(x, "allowProtoMethodsByDefault", js.undefined)
      
      inline def setAllowProtoPropertiesByDefault(value: Boolean): Self = StObject.set(x, "allowProtoPropertiesByDefault", value.asInstanceOf[js.Any])
      
      inline def setAllowProtoPropertiesByDefaultUndefined: Self = StObject.set(x, "allowProtoPropertiesByDefault", js.undefined)
      
      inline def setAllowedProtoMethods(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedProtoMethods", value.asInstanceOf[js.Any])
      
      inline def setAllowedProtoMethodsUndefined: Self = StObject.set(x, "allowedProtoMethods", js.undefined)
      
      inline def setAllowedProtoProperties(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedProtoProperties", value.asInstanceOf[js.Any])
      
      inline def setAllowedProtoPropertiesUndefined: Self = StObject.set(x, "allowedProtoProperties", js.undefined)
      
      inline def setBlockParams(value: js.Array[js.Any]): Self = StObject.set(x, "blockParams", value.asInstanceOf[js.Any])
      
      inline def setBlockParamsUndefined: Self = StObject.set(x, "blockParams", js.undefined)
      
      inline def setBlockParamsVarargs(value: js.Any*): Self = StObject.set(x, "blockParams", js.Array(value :_*))
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDecorators(value: StringDictionary[js.Function]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      inline def setDepths(value: js.Array[js.Any]): Self = StObject.set(x, "depths", value.asInstanceOf[js.Any])
      
      inline def setDepthsUndefined: Self = StObject.set(x, "depths", js.undefined)
      
      inline def setDepthsVarargs(value: js.Any*): Self = StObject.set(x, "depths", js.Array(value :_*))
      
      inline def setHelpers(value: StringDictionary[js.Function]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      inline def setPartials(value: StringDictionary[HandlebarsTemplateDelegate[js.Any]]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    }
  }
  
  trait SafeString extends StObject {
    
    def toHTML(): String
  }
  object SafeString {
    
    inline def apply(toHTML: () => String): SafeString = {
      val __obj = js.Dynamic.literal(toHTML = js.Any.fromFunction0(toHTML))
      __obj.asInstanceOf[SafeString]
    }
    
    extension [Self <: SafeString](x: Self) {
      
      inline def setToHTML(value: () => String): Self = StObject.set(x, "toHTML", js.Any.fromFunction0(value))
    }
  }
  
  type Template[T] = TemplateDelegate[T] | String
  
  type TemplateDelegate[T] = js.Function2[
    /* context */ T, 
    /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions], 
    String
  ]
  
  @js.native
  trait Visitor
    extends StObject
       with ICompiler {
    
    def acceptArray(arr: js.Array[Expression]): Unit = js.native
    
    def acceptKey(node: Node, name: String): Unit = js.native
  }
}
