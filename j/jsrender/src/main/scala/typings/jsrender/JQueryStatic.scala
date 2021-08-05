package typings.jsrender

import org.scalablytyped.runtime.StringDictionary
import typings.jsrender.JsViews.Hash
import typings.jsrender.JsViews.Template
import typings.jsrender.JsViews.TemplateOptions
import typings.jsrender.JsViews.TemplateRender
import typings.jsrender.JsViews.TemplateSetter
import typings.jsrender.JsViews.Templates
import typings.jsrender.JsViews.Views
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ********************************** JsRender **********************************
trait JQueryStatic extends StObject {
  
  /* var htmlString = $.render.templateName(data, myHelpersObject); // Render named template */
  var render: StringDictionary[TemplateRender]
  
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
  def templates(markupOrSelectorOrOptions: String): Template
  def templates(markupOrSelectorOrOptions: String, parentTmpl: Template): Template
  def templates(markupOrSelectorOrOptions: TemplateOptions): Template
  def templates(markupOrSelectorOrOptions: TemplateOptions, parentTmpl: Template): Template
  // named item
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  def templates(namedItems: Hash[TemplateSetter]): Views
  def templates(namedItems: Hash[TemplateSetter], parentTmpl: Template): Views
  def templates(name: String, item: Unit, parentTmpl: Template): Template
  def templates(name: String, item: TemplateSetter): Template
  def templates(name: String, item: TemplateSetter, parentTmpl: Template): Template
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  @JSName("templates")
  var templates_Original: Templates
  
  /* $.views.xxx ... // JsRender/JsViews APIs */
  var views: Views
}
object JQueryStatic {
  
  inline def apply(render: StringDictionary[TemplateRender], templates: Templates, views: Views): JQueryStatic = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setRender(value: StringDictionary[TemplateRender]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setTemplates(value: Templates): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Views): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
