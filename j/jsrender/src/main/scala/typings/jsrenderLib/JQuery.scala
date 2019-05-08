package typings
package jsrenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /* var htmlString = $("#template").render(data, myHelpersObject); // Render template, and pass in helpers or context */
  @JSName("render")
  var render_Original: jsrenderLib.JsViewsNs.TemplateRender = js.native
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
  def render(): java.lang.String = js.native
  def render(data: js.Any): java.lang.String = js.native
  def render(data: js.Any, helpersOrContext: jsrenderLib.JsViewsNs.Hash[_]): java.lang.String = js.native
  def render(data: js.Any, helpersOrContext: jsrenderLib.JsViewsNs.Hash[_], noIteration: scala.Boolean): java.lang.String = js.native
  def render(data: js.Any, noIteration: scala.Boolean): java.lang.String = js.native
}

