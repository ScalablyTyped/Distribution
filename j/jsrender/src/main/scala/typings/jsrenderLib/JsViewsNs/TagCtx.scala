package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagCtx extends js.Object {
  /* tagCtx object */
  /* Arguments passed declaratively */
  var args: js.Array[_] = js.native
  /* Template for wrapped content, or else external template. Otherwise, false */
  @JSName("content")
  var content_Original: Template = js.native
  /* View context for tag */
  var ctx: Context = js.native
  /* Tag instance index (if siblings rendered against array data) */
  var index: scala.Double = js.native
  /* Declarative tag params object */
  var params: TagCtxParams = js.native
  /* Properties passed declaratively */
  var props: Hash[_] = js.native
  /* Tag render method */
  @JSName("render")
  var render_Original: TagRenderMethod = js.native
  /* This tag instance */
  var tag: Tag = js.native
  /* External tmpl, or else template for wrapped content. Otherwise, false */
  @JSName("tmpl")
  var tmpl_Original: Template = js.native
  /* JsViews view containing this tag instance */
  var view: View = js.native
  /* tagCtx.bndArgs() method */
  def bndArgs(): js.Array[_] | scala.Unit = js.native
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
  /* Template for wrapped content, or else external template. Otherwise, false */
  def content(): java.lang.String = js.native
  def content(data: js.Any): java.lang.String = js.native
  def content(data: js.Any, helpersOrContext: Hash[_]): java.lang.String = js.native
  def content(data: js.Any, helpersOrContext: Hash[_], noIteration: scala.Boolean): java.lang.String = js.native
  def content(data: js.Any, noIteration: scala.Boolean): java.lang.String = js.native
  /* tagCtx.ctxPrm() method */
  def ctxPrm(name: java.lang.String): js.Any = js.native
  def ctxPrm(name: java.lang.String, value: js.Any): js.Any = js.native
   // get/set in JsViews but get only in JsRender
  /* tagCtx.cvtArgs() method */
  def cvtArgs(): js.Array[_] | scala.Unit = js.native
  /* Tag render method */
  def render(arguments: js.Any*): java.lang.String = js.native
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
  /* External tmpl, or else template for wrapped content. Otherwise, false */
  def tmpl(): java.lang.String = js.native
  def tmpl(data: js.Any): java.lang.String = js.native
  def tmpl(data: js.Any, helpersOrContext: Hash[_]): java.lang.String = js.native
  def tmpl(data: js.Any, helpersOrContext: Hash[_], noIteration: scala.Boolean): java.lang.String = js.native
  def tmpl(data: js.Any, noIteration: scala.Boolean): java.lang.String = js.native
}

