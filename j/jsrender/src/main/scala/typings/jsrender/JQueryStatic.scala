package typings.jsrender

import org.scalablytyped.runtime.StringDictionary
import typings.jsrender.JsViews.Hash
import typings.jsrender.JsViews.Template
import typings.jsrender.JsViews.TemplateOptions
import typings.jsrender.JsViews.TemplateRender
import typings.jsrender.JsViews.TemplateSetter
import typings.jsrender.JsViews.Templates
import typings.jsrender.JsViews.Views
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ********************************** JsRender **********************************
@js.native
trait JQueryStatic extends js.Object {
  
  /* var htmlString = $.render.templateName(data, myHelpersObject); // Render named template */
  var render: StringDictionary[TemplateRender] = js.native
  
  /**
  	 * Additional $.templates() signature for compiling unnamed template
  	 *
  	 * @param {string|TemplateOptions}   markup or selector
  	 * @param {Template}                 [parentTmpl] For compling template as private resource of parent template
  	 * @returns {Template}               compiled template
  	 */
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  /**
  	 * Generic store() function to register item, named item, or hash of items
  	 * Also used as hash to store the registered items
  	 * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
  	 *
  	 * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
  	 * @param {any}           [item]       (e.g. markup for named template)
  	 * @param {Template}      [parentTmpl] For item being registered as private resource of template
  	 * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
  	 */
  def templates(markupOrSelectorOrOptions: String): Template = js.native
  def templates(markupOrSelectorOrOptions: String, parentTmpl: Template): Template = js.native
  def templates(markupOrSelectorOrOptions: TemplateOptions): Template = js.native
  def templates(markupOrSelectorOrOptions: TemplateOptions, parentTmpl: Template): Template = js.native
   // named item
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  def templates(namedItems: Hash[TemplateSetter]): Views = js.native
  def templates(namedItems: Hash[TemplateSetter], parentTmpl: Template): Views = js.native
  def templates(name: String, item: js.UndefOr[TemplateSetter], parentTmpl: Template): Template = js.native
  def templates(name: String, item: TemplateSetter): Template = js.native
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  @JSName("templates")
  var templates_Original: Templates = js.native
  
  /* $.views.xxx ... // JsRender/JsViews APIs */
  var views: Views = js.native
}
