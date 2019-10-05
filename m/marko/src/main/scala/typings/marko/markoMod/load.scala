package typings.marko.markoMod

import typings.marko.srcRuntimeHtmlMod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko", "load")
@js.native
object load extends js.Object {
  def apply(templatePath: String): Template = js.native
  def apply(templatePath: String, options: TemplateOptions): Template = js.native
  def apply(templatePath: String, templateSrc: String): Template = js.native
  def apply(templatePath: String, templateSrc: String, options: TemplateOptions): Template = js.native
}

