package typings.handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import typings.handlebars.Handlebars.ParseOptions
import typings.handlebars.Handlebars.ResolvePartialOptions
import typings.handlebars.Handlebars.Template
import typings.handlebars.anon.TypeofHandlebars
import typings.handlebars.hbs.AST.Node
import typings.handlebars.hbs.AST.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @JSImport("handlebars/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AST {
    
    @JSImport("handlebars/runtime", "AST.helpers")
    @js.native
    val helpers: typings.handlebars.hbs.AST.helpers = js.native
  }
  
  @JSImport("handlebars/runtime", "Exception")
  @js.native
  class Exception protected ()
    extends StObject
       with typings.handlebars.Handlebars.Exception {
    def this(message: String) = this()
    def this(message: String, node: Node) = this()
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var fileName: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var number: Double = js.native
  }
  
  @scala.inline
  def K(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("K")().asInstanceOf[Unit]
  
  @JSImport("handlebars/runtime", "SafeString")
  @js.native
  class SafeString protected ()
    extends StObject
       with typings.handlebars.Handlebars.SafeString {
    def this(str: String) = this()
    
    /* CompleteClass */
    override def toHTML(): String = js.native
  }
  
  object Utils {
    
    @JSImport("handlebars/runtime", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def blockParams(obj: js.Array[js.Any], ids: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blockParams")(obj.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def createFrame(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrame")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def escapeExpression(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeExpression")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def extend(obj: js.Any, source: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(obj.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def isArray(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isEmpty(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def toString_(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("handlebars/runtime", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  object VM {
    
    @JSImport("handlebars/runtime", "VM")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def resolvePartial[T](partial: Unit, context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePartial")(partial.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlebarsTemplateDelegate[T]]
    @scala.inline
    def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePartial")(partial.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlebarsTemplateDelegate[T]]
  }
  
  @JSImport("handlebars/runtime", "Visitor")
  @js.native
  class Visitor ()
    extends StObject
       with typings.handlebars.Handlebars.Visitor
  
  @scala.inline
  def blockParams(obj: js.Array[js.Any], ids: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blockParams")(obj.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(input.asInstanceOf[js.Any]).asInstanceOf[HandlebarsTemplateDelegate[T]]
  @scala.inline
  def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HandlebarsTemplateDelegate[T]]
  
  @scala.inline
  def create(): TypeofHandlebars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TypeofHandlebars]
  
  @scala.inline
  def createFrame(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrame")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("handlebars/runtime", "escapeExpression")
  @js.native
  val escapeExpression: js.Function1[/* str */ String, String] = js.native
  
  @scala.inline
  def log(level: Double, obj: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("handlebars/runtime", "logger")
  @js.native
  val logger: Logger = js.native
  
  @scala.inline
  def noConflict(): TypeofHandlebars = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[TypeofHandlebars]
  
  @scala.inline
  def parse(input: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Program]
  @scala.inline
  def parse(input: String, options: ParseOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  @scala.inline
  def parseWithoutProcessing(input: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWithoutProcessing")(input.asInstanceOf[js.Any]).asInstanceOf[Program]
  @scala.inline
  def parseWithoutProcessing(input: String, options: ParseOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithoutProcessing")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  @scala.inline
  def precompile(input: js.Any): TemplateSpecification = ^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(input.asInstanceOf[js.Any]).asInstanceOf[TemplateSpecification]
  @scala.inline
  def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = (^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TemplateSpecification]
  
  @scala.inline
  def registerDecorator(name: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDecorator")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerHelper(name: String, fn: HelperDelegate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def registerHelper(name: HelperDeclareSpec): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerPartial(name: String, fn: Template[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPartial")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPartial")(spec.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(precompilation.asInstanceOf[js.Any]).asInstanceOf[HandlebarsTemplateDelegate[T]]
  
  @JSImport("handlebars/runtime", "templates")
  @js.native
  val templates: HandlebarsTemplates = js.native
  
  @scala.inline
  def unregisterDecorator(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unregisterHelper(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterHelper")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unregisterPartial(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterPartial")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
