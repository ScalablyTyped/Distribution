package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Templates
@js.native
trait Templates extends Store[Template, TemplateSetter] {
  
  def apply(markupOrSelectorOrOptions: String, parentTmpl: Template): Template = js.native
  def apply(markupOrSelectorOrOptions: TemplateOptions): Template = js.native
  def apply(markupOrSelectorOrOptions: TemplateOptions, parentTmpl: Template): Template = js.native
}
