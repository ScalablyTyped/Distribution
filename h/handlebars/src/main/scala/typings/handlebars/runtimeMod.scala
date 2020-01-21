package typings.handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import typings.handlebars.Handlebars.ParseOptions
import typings.handlebars.Handlebars.ResolvePartialOptions
import typings.handlebars.Handlebars.Template_
import typings.handlebars.hbs.AST.Node
import typings.handlebars.hbs.AST.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handlebars/runtime", JSImport.Namespace)
@js.native
object runtimeMod extends js.Object {
  @js.native
  class Exception protected ()
    extends typings.handlebars.Handlebars.Exception {
    def this(message: String) = this()
    def this(message: String, node: Node) = this()
  }
  
  @js.native
  class SafeString protected ()
    extends typings.handlebars.Handlebars.SafeString {
    def this(str: String) = this()
  }
  
  @js.native
  class Visitor ()
    extends typings.handlebars.Handlebars.Visitor
  
  val escapeExpression: js.Function1[/* str */ String, String] = js.native
  val logger: Logger = js.native
  val templates: HandlebarsTemplates = js.native
  def K(): Unit = js.native
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
  def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
  def create(): TypeofHandlebars = js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  def log(level: Double, obj: js.Any): Unit = js.native
  def noConflict(): TypeofHandlebars = js.native
  def parse(input: String): Program = js.native
  def parse(input: String, options: ParseOptions): Program = js.native
  def parseWithoutProcessing(input: String): Program = js.native
  def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
  def precompile(input: js.Any): TemplateSpecification = js.native
  def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
  def registerDecorator(name: String, fn: js.Function): Unit = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
  def registerPartial(name: String, fn: Template_[_]): Unit = js.native
  def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
  def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
  def unregisterDecorator(name: String): Unit = js.native
  def unregisterHelper(name: String): Unit = js.native
  def unregisterPartial(name: String): Unit = js.native
  @js.native
  object AST extends js.Object {
    val helpers: typings.handlebars.hbs.AST.helpers = js.native
  }
  
  @js.native
  object Utils extends js.Object {
    def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
    def createFrame(`object`: js.Any): js.Any = js.native
    def escapeExpression(str: String): String = js.native
    def extend(obj: js.Any, source: js.Any*): js.Any = js.native
    def isArray(obj: js.Any): Boolean = js.native
    def isEmpty(obj: js.Any): Boolean = js.native
    def isFunction(obj: js.Any): Boolean = js.native
    def toString(obj: js.Any): String = js.native
  }
  
  @js.native
  object VM extends js.Object {
    def resolvePartial[T](partial: js.UndefOr[scala.Nothing], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
    def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
  }
  
  @js.native
  object decorators
    extends /* name */ StringDictionary[js.Function]
  
  @js.native
  object helpers extends /* name */ StringDictionary[HelperDelegate]
  
  @js.native
  object partials
    extends /* name */ StringDictionary[js.Any]
  
}

