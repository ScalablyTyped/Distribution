package typings.handlebarsDashHelpers

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.CompileOptions
import typings.handlebars.HandlebarsNs.HelperDeclareSpec
import typings.handlebars.HandlebarsNs.HelperDelegate
import typings.handlebars.HandlebarsNs.ParseOptions
import typings.handlebars.HandlebarsNs.Template
import typings.handlebars.HandlebarsTemplateDelegate
import typings.handlebars.HandlebarsTemplates
import typings.handlebars.Logger
import typings.handlebars.PrecompileOptions
import typings.handlebars.TemplateSpecification
import typings.handlebars.hbsNs.ASTNs.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHandlebars extends js.Object {
  val ASTNs: TypeofAST = js.native
  var SafeString: Instantiable1[/* str */ String, typings.handlebars.handlebarsMod.SafeString] = js.native
  val UtilsNs: TypeofUtils = js.native
  var Visitor: Instantiable0[typings.handlebars.handlebarsMod.Visitor] = js.native
  val decorators: StringDictionary[js.Function] = js.native
  val helpers: StringDictionary[HelperDelegate] = js.native
  val logger: Logger = js.native
  val partials: StringDictionary[js.Any] = js.native
  val templates: HandlebarsTemplates = js.native
  def Exception(message: String): Unit = js.native
  def K(): Unit = js.native
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
  def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
  def create(): typings.handlebars.TypeofHandlebars = js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  def escapeExpression(str: String): String = js.native
  def log(level: Double, obj: js.Any): Unit = js.native
  def noConflict(): typings.handlebars.TypeofHandlebars = js.native
  def parse(input: String): Program = js.native
  def parse(input: String, options: ParseOptions): Program = js.native
  def precompile(input: js.Any): TemplateSpecification = js.native
  def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
  def registerDecorator(name: String, fn: js.Function): Unit = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
  def registerPartial(name: String, fn: Template[_]): Unit = js.native
  def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
  def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
  def unregisterDecorator(name: String): Unit = js.native
  def unregisterHelper(name: String): Unit = js.native
  def unregisterPartial(name: String): Unit = js.native
}

