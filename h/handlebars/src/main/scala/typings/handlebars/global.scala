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

object global {
  
  object Handlebars {
    
    object AST {
      
      @JSGlobal("Handlebars.AST.helpers")
      @js.native
      val helpers: typings.handlebars.hbs.AST.helpers = js.native
    }
    
    @JSGlobal("Handlebars.Exception")
    @js.native
    class Exception protected ()
      extends typings.handlebars.Handlebars.Exception {
      def this(message: String) = this()
      def this(message: String, node: Node) = this()
    }
    
    @JSGlobal("Handlebars.K")
    @js.native
    def K(): Unit = js.native
    
    @JSGlobal("Handlebars.SafeString")
    @js.native
    class SafeString protected ()
      extends typings.handlebars.Handlebars.SafeString {
      def this(str: String) = this()
    }
    
    object Utils {
      
      @JSGlobal("Handlebars.Utils.blockParams")
      @js.native
      def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
      
      @JSGlobal("Handlebars.Utils.createFrame")
      @js.native
      def createFrame(`object`: js.Any): js.Any = js.native
      
      @JSGlobal("Handlebars.Utils.escapeExpression")
      @js.native
      def escapeExpression(str: String): String = js.native
      
      @JSGlobal("Handlebars.Utils.extend")
      @js.native
      def extend(obj: js.Any, source: js.Any*): js.Any = js.native
      
      @JSGlobal("Handlebars.Utils.isArray")
      @js.native
      def isArray(obj: js.Any): Boolean = js.native
      
      @JSGlobal("Handlebars.Utils.isEmpty")
      @js.native
      def isEmpty(obj: js.Any): Boolean = js.native
      
      @JSGlobal("Handlebars.Utils.isFunction")
      @js.native
      def isFunction(obj: js.Any): Boolean = js.native
      
      @JSGlobal("Handlebars.Utils.toString")
      @js.native
      def toString_(obj: js.Any): String = js.native
    }
    
    @JSGlobal("Handlebars.VERSION")
    @js.native
    val VERSION: String = js.native
    
    object VM {
      
      @JSGlobal("Handlebars.VM.resolvePartial")
      @js.native
      def resolvePartial[T](partial: js.UndefOr[scala.Nothing], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
      @JSGlobal("Handlebars.VM.resolvePartial")
      @js.native
      def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
    }
    
    @JSGlobal("Handlebars.Visitor")
    @js.native
    class Visitor ()
      extends typings.handlebars.Handlebars.Visitor
    
    @JSGlobal("Handlebars.blockParams")
    @js.native
    def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
    
    @JSGlobal("Handlebars.compile")
    @js.native
    def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
    @JSGlobal("Handlebars.compile")
    @js.native
    def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
    
    @JSGlobal("Handlebars.create")
    @js.native
    def create(): TypeofHandlebars = js.native
    
    @JSGlobal("Handlebars.createFrame")
    @js.native
    def createFrame(`object`: js.Any): js.Any = js.native
    
    @JSGlobal("Handlebars.escapeExpression")
    @js.native
    val escapeExpression: js.Function1[/* str */ String, String] = js.native
    
    @JSGlobal("Handlebars.log")
    @js.native
    def log(level: Double, obj: js.Any): Unit = js.native
    
    @JSGlobal("Handlebars.logger")
    @js.native
    val logger: Logger = js.native
    
    @JSGlobal("Handlebars.noConflict")
    @js.native
    def noConflict(): TypeofHandlebars = js.native
    
    @JSGlobal("Handlebars.parse")
    @js.native
    def parse(input: String): Program = js.native
    @JSGlobal("Handlebars.parse")
    @js.native
    def parse(input: String, options: ParseOptions): Program = js.native
    
    @JSGlobal("Handlebars.parseWithoutProcessing")
    @js.native
    def parseWithoutProcessing(input: String): Program = js.native
    @JSGlobal("Handlebars.parseWithoutProcessing")
    @js.native
    def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
    
    @JSGlobal("Handlebars.precompile")
    @js.native
    def precompile(input: js.Any): TemplateSpecification = js.native
    @JSGlobal("Handlebars.precompile")
    @js.native
    def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
    
    @JSGlobal("Handlebars.registerDecorator")
    @js.native
    def registerDecorator(name: String, fn: js.Function): Unit = js.native
    
    @JSGlobal("Handlebars.registerHelper")
    @js.native
    def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
    @JSGlobal("Handlebars.registerHelper")
    @js.native
    def registerHelper(name: HelperDeclareSpec): Unit = js.native
    
    @JSGlobal("Handlebars.registerPartial")
    @js.native
    def registerPartial(name: String, fn: Template[_]): Unit = js.native
    @JSGlobal("Handlebars.registerPartial")
    @js.native
    def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
    
    @JSGlobal("Handlebars.template")
    @js.native
    def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
    
    @JSGlobal("Handlebars.templates")
    @js.native
    val templates: HandlebarsTemplates = js.native
    
    @JSGlobal("Handlebars.unregisterDecorator")
    @js.native
    def unregisterDecorator(name: String): Unit = js.native
    
    @JSGlobal("Handlebars.unregisterHelper")
    @js.native
    def unregisterHelper(name: String): Unit = js.native
    
    @JSGlobal("Handlebars.unregisterPartial")
    @js.native
    def unregisterPartial(name: String): Unit = js.native
  }
}
