package typings.marko.mod

import typings.marko.htmlMod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko", "load")
@js.native
object load extends js.Object {
  
  def apply(templatePath: String): Template = js.native
  def apply(templatePath: String, options: TemplateOptions): Template = js.native
  def apply(templatePath: String, templateSrc: String): Template = js.native
  def apply(templatePath: String, templateSrc: String, options: TemplateOptions): Template = js.native
}
