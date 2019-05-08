package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends TemplateRender {
  var _is: java.lang.String = js.native
  var converters: js.UndefOr[Hash[Converter]] = js.native
  var fn: js.UndefOr[js.Function1[/* repeated */ js.Any, java.lang.String]] = js.native
  var helpers: js.UndefOr[Hash[_]] = js.native
  var markup: java.lang.String = js.native
  @JSName("render")
  var render_Original: TemplateRender = js.native
  var tags: js.UndefOr[Hash[Tag]] = js.native
  var templates: js.UndefOr[Hash[Template]] = js.native
  /* Compiled template object */
  var tmplName: java.lang.String = js.native
  var useViews: js.UndefOr[scala.Boolean] = js.native
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
  def render(): java.lang.String = js.native
  def render(data: js.Any): java.lang.String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_]): java.lang.String = js.native
  def render(data: js.Any, helpersOrContext: Hash[_], noIteration: scala.Boolean): java.lang.String = js.native
  def render(data: js.Any, noIteration: scala.Boolean): java.lang.String = js.native
}

