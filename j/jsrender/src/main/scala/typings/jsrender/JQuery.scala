package typings.jsrender

import typings.jsrender.JsViews.Hash
import typings.jsrender.JsViews.TemplateRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
  	 * Template render method: render the template as a string, using the specified data and helpers/context
  	 * var htmlString = template(data, myHelpersObject);
  	 * var htmlString = template.render(data, myHelpersObject);
  	 *
  	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
  	 *
  	 * @param {any}        data
  	 * @param {hash}       [helpersOrContext]
  	 * @param {boolean}    [noIteration]
  	 * @returns {string}   rendered template
  	 */
  /* var htmlString = $("#template").render(data, myHelpersObject); // Render template, and pass in helpers or context */
  def render(): String
  def render(data: js.Any): String
  def render(data: js.Any, helpersOrContext: Unit, noIteration: Boolean): String
  def render(data: js.Any, helpersOrContext: Hash[js.Any]): String
  def render(data: js.Any, helpersOrContext: Hash[js.Any], noIteration: Boolean): String
  def render(data: js.Any, noIteration: Boolean): String
  def render(data: Unit, helpersOrContext: Unit, noIteration: Boolean): String
  def render(data: Unit, helpersOrContext: Hash[js.Any]): String
  def render(data: Unit, helpersOrContext: Hash[js.Any], noIteration: Boolean): String
  def render(data: Unit, noIteration: Boolean): String
  /* var htmlString = $("#template").render(data, myHelpersObject); // Render template, and pass in helpers or context */
  @JSName("render")
  var render_Original: TemplateRender
}
object JQuery {
  
  inline def apply(render: TemplateRender): JQuery = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setRender(value: TemplateRender): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
