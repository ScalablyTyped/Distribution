package typings
package handlebarsLib.runtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handlebars/runtime", JSImport.Namespace)
@js.native
object runtimeModMembers extends js.Object {
  val escapeExpression: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  val logger: handlebarsLib.Logger = js.native
  val templates: handlebarsLib.HandlebarsTemplates = js.native
  def Exception(message: java.lang.String): scala.Unit = js.native
  def K(): scala.Unit = js.native
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  def compile[T](input: js.Any): handlebarsLib.HandlebarsTemplateDelegate[T] = js.native
  def compile[T](input: js.Any, options: handlebarsLib.CompileOptions): handlebarsLib.HandlebarsTemplateDelegate[T] = js.native
  def create(): js.Object = js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  def log(level: scala.Double, obj: js.Any): scala.Unit = js.native
  def noConflict(): js.Object = js.native
  def parse(input: java.lang.String): handlebarsLib.hbsNs.ASTNs.Program = js.native
  def parse(input: java.lang.String, options: handlebarsLib.HandlebarsNs.ParseOptions): handlebarsLib.hbsNs.ASTNs.Program = js.native
  def precompile(input: js.Any): handlebarsLib.TemplateSpecification = js.native
  def precompile(input: js.Any, options: handlebarsLib.PrecompileOptions): handlebarsLib.TemplateSpecification = js.native
  def registerDecorator(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  def registerHelper(name: handlebarsLib.HandlebarsNs.HelperDeclareSpec): scala.Unit = js.native
  def registerHelper(name: java.lang.String, fn: handlebarsLib.HandlebarsNs.HelperDelegate): scala.Unit = js.native
  def registerPartial(name: java.lang.String, fn: handlebarsLib.HandlebarsNs.Template[_]): scala.Unit = js.native
  def registerPartial(spec: org.scalablytyped.runtime.StringDictionary[handlebarsLib.HandlebarsTemplateDelegate[_]]): scala.Unit = js.native
  def template[T](precompilation: handlebarsLib.TemplateSpecification): handlebarsLib.HandlebarsTemplateDelegate[T] = js.native
  def unregisterDecorator(name: java.lang.String): scala.Unit = js.native
  def unregisterHelper(name: java.lang.String): scala.Unit = js.native
  def unregisterPartial(name: java.lang.String): scala.Unit = js.native
}

