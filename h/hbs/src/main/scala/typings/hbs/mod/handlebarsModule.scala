package typings.hbs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.CompileOptions
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import typings.handlebars.Handlebars.ParseOptions
import typings.handlebars.Handlebars.Template
import typings.handlebars.HandlebarsTemplateDelegate
import typings.handlebars.HandlebarsTemplates
import typings.handlebars.Logger
import typings.handlebars.PrecompileOptions
import typings.handlebars.TemplateSpecification
import typings.handlebars.anon.TypeofHandlebars
import typings.handlebars.hbs.AST.Program
import typings.hbs.anon.TypeofAST
import typings.hbs.anon.TypeofUtils
import typings.hbs.anon.TypeofVM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait handlebarsModule extends js.Object {
  
  val AST: TypeofAST = js.native
  
  var Exception: Instantiable1[/* message */ String, typings.handlebars.mod.Exception] = js.native
  
  def K(): Unit = js.native
  
  var SafeString: Instantiable1[/* str */ String, typings.handlebars.mod.SafeString] = js.native
  
  val Utils: TypeofUtils = js.native
  
  val VERSION: String = js.native
  
  val VM: TypeofVM = js.native
  
  var Visitor: Instantiable0[typings.handlebars.mod.Visitor] = js.native
  
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  
  def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
  def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
  
  def create(): TypeofHandlebars = js.native
  
  def createFrame(`object`: js.Any): js.Any = js.native
  
  val decorators: StringDictionary[js.Function] = js.native
  
  def escapeExpression(str: String): String = js.native
  
  val helpers: StringDictionary[HelperDelegate] = js.native
  
  def log(level: Double, obj: js.Any): Unit = js.native
  
  val logger: Logger = js.native
  
  def noConflict(): TypeofHandlebars = js.native
  
  def parse(input: String): Program = js.native
  def parse(input: String, options: ParseOptions): Program = js.native
  
  def parseWithoutProcessing(input: String): Program = js.native
  def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
  
  val partials: StringDictionary[js.Any] = js.native
  
  def precompile(input: js.Any): TemplateSpecification = js.native
  def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
  
  def registerDecorator(name: String, fn: js.Function): Unit = js.native
  
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
  
  def registerPartial(name: String, fn: Template[_]): Unit = js.native
  def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
  
  def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
  
  val templates: HandlebarsTemplates = js.native
  
  def unregisterDecorator(name: String): Unit = js.native
  
  def unregisterHelper(name: String): Unit = js.native
  
  def unregisterPartial(name: String): Unit = js.native
}
