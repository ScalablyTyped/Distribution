package typings.marko.markoMod

import typings.marko.srcRuntimeHtmlMod.AsyncStream
import typings.marko.srcRuntimeHtmlMod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createOut(globalData: js.Any): AsyncStream = js.native
  def load(templatePath: String): Template = js.native
  def load(templatePath: String, options: TemplateOptions): Template = js.native
  def load(templatePath: String, templateSrc: String): Template = js.native
  def load(templatePath: String, templateSrc: String, options: TemplateOptions): Template = js.native
}

