package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateRender extends js.Object {
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
  def apply(): java.lang.String = js.native
  def apply(data: js.Any): java.lang.String = js.native
  def apply(data: js.Any, helpersOrContext: Hash[_]): java.lang.String = js.native
  def apply(data: js.Any, helpersOrContext: Hash[_], noIteration: scala.Boolean): java.lang.String = js.native
  def apply(data: js.Any, noIteration: scala.Boolean): java.lang.String = js.native
}

