package typings.handlebars.Handlebars

import typings.handlebars.CompileOptions
import typings.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Handlebars.compile")
@js.native
object compile extends js.Object {
  def apply[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
  def apply[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
}

