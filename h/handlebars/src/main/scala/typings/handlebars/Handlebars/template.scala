package typings.handlebars.Handlebars

import typings.handlebars.HandlebarsTemplateDelegate
import typings.handlebars.TemplateSpecification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Handlebars.template")
@js.native
object template extends js.Object {
  def apply[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
}

