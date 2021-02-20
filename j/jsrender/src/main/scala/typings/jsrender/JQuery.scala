package typings.jsrender

import typings.jsrender.JsViews.Hash
import typings.jsrender.JsViews.TemplateRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def render(): String = js.native
  def render(data: js.UndefOr[scala.Nothing], helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
  def render(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_]): String = js.native
  def render(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
  def render(data: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
  def render(data: js.Any): String = js.native
  def render(data: js.Any, helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_]): String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
  def render(data: js.Any, noIteration: Boolean): String = js.native
  /* var htmlString = $("#template").render(data, myHelpersObject); // Render template, and pass in helpers or context */
  @JSName("render")
  var render_Original: TemplateRender = js.native
}
