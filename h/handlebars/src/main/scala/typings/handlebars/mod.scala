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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object AST {
    
    @JSImport("handlebars", "AST.helpers")
    @js.native
    val helpers: typings.handlebars.hbs.AST.helpers = js.native
  }
  
  @JSImport("handlebars", "Exception")
  @js.native
  class Exception protected ()
    extends typings.handlebars.Handlebars.Exception {
    def this(message: String) = this()
    def this(message: String, node: Node) = this()
  }
  
  @JSImport("handlebars", "K")
  @js.native
  def K(): Unit = js.native
  
  @JSImport("handlebars", "SafeString")
  @js.native
  class SafeString protected ()
    extends typings.handlebars.Handlebars.SafeString {
    def this(str: String) = this()
  }
  
  object Utils {
    
    @JSImport("handlebars", "Utils.blockParams")
    @js.native
    def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
    
    @JSImport("handlebars", "Utils.createFrame")
    @js.native
    def createFrame(`object`: js.Any): js.Any = js.native
    
    @JSImport("handlebars", "Utils.escapeExpression")
    @js.native
    def escapeExpression(str: String): String = js.native
    
    @JSImport("handlebars", "Utils.extend")
    @js.native
    def extend(obj: js.Any, source: js.Any*): js.Any = js.native
    
    @JSImport("handlebars", "Utils.isArray")
    @js.native
    def isArray(obj: js.Any): Boolean = js.native
    
    @JSImport("handlebars", "Utils.isEmpty")
    @js.native
    def isEmpty(obj: js.Any): Boolean = js.native
    
    @JSImport("handlebars", "Utils.isFunction")
    @js.native
    def isFunction(obj: js.Any): Boolean = js.native
    
    @JSImport("handlebars", "Utils.toString")
    @js.native
    def toString_(obj: js.Any): String = js.native
  }
  
  @JSImport("handlebars", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  object VM {
    
    @JSImport("handlebars", "VM.resolvePartial")
    @js.native
    def resolvePartial[T](partial: js.UndefOr[scala.Nothing], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
    @JSImport("handlebars", "VM.resolvePartial")
    @js.native
    def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
  }
  
  @JSImport("handlebars", "Visitor")
  @js.native
  class Visitor ()
    extends typings.handlebars.Handlebars.Visitor
  
  @JSImport("handlebars", "blockParams")
  @js.native
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("handlebars", "compile")
  @js.native
  def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
  @JSImport("handlebars", "compile")
  @js.native
  def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
  
  @JSImport("handlebars", "create")
  @js.native
  def create(): TypeofHandlebars = js.native
  
  @JSImport("handlebars", "createFrame")
  @js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  
  @JSImport("handlebars", "escapeExpression")
  @js.native
  val escapeExpression: js.Function1[/* str */ String, String] = js.native
  
  @JSImport("handlebars", "log")
  @js.native
  def log(level: Double, obj: js.Any): Unit = js.native
  
  @JSImport("handlebars", "logger")
  @js.native
  val logger: Logger = js.native
  
  @JSImport("handlebars", "noConflict")
  @js.native
  def noConflict(): TypeofHandlebars = js.native
  
  @JSImport("handlebars", "parse")
  @js.native
  def parse(input: String): Program = js.native
  @JSImport("handlebars", "parse")
  @js.native
  def parse(input: String, options: ParseOptions): Program = js.native
  
  @JSImport("handlebars", "parseWithoutProcessing")
  @js.native
  def parseWithoutProcessing(input: String): Program = js.native
  @JSImport("handlebars", "parseWithoutProcessing")
  @js.native
  def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
  
  @JSImport("handlebars", "precompile")
  @js.native
  def precompile(input: js.Any): TemplateSpecification = js.native
  @JSImport("handlebars", "precompile")
  @js.native
  def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
  
  @JSImport("handlebars", "registerDecorator")
  @js.native
  def registerDecorator(name: String, fn: js.Function): Unit = js.native
  
  @JSImport("handlebars", "registerHelper")
  @js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  @JSImport("handlebars", "registerHelper")
  @js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
  
  @JSImport("handlebars", "registerPartial")
  @js.native
  def registerPartial(name: String, fn: Template[_]): Unit = js.native
  @JSImport("handlebars", "registerPartial")
  @js.native
  def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
  
  @JSImport("handlebars", "template")
  @js.native
  def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
  
  @JSImport("handlebars", "templates")
  @js.native
  val templates: HandlebarsTemplates = js.native
  
  @JSImport("handlebars", "unregisterDecorator")
  @js.native
  def unregisterDecorator(name: String): Unit = js.native
  
  @JSImport("handlebars", "unregisterHelper")
  @js.native
  def unregisterHelper(name: String): Unit = js.native
  
  @JSImport("handlebars", "unregisterPartial")
  @js.native
  def unregisterPartial(name: String): Unit = js.native
}
