package typings.jsrender

import typings.jsrender.JsViews.Hash
import typings.jsrender.JsViews.TemplateRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /* var htmlString = $("#template").render(data, myHelpersObject); // Render template, and pass in helpers or context */
  @JSName("render")
  var render_Original: TemplateRender = js.native
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
  def render(): String = js.native
  def render(data: js.Any): String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_]): String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
  def render(data: js.Any, noIteration: Boolean): String = js.native
}

