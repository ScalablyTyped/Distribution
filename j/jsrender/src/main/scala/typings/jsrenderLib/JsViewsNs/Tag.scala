package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends TagOptionProps {
  var base: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var baseApply: js.UndefOr[js.Function1[/* args */ js.Array[_] | stdLib.IArguments, _]] = js.native
  var parent: js.UndefOr[Tag] = js.native
  var parents: js.UndefOr[Hash[Tag]] = js.native
  var rendering: js.UndefOr[Hash[_]] = js.native
  /* Tag object */
  var tagCtx: TagCtx = js.native
  var tagCtxs: js.Array[TagCtx] = js.native
  var tagName: java.lang.String = js.native
  def bndArgs(): js.Array[_] | scala.Unit = js.native
  def bndArgs(elseBlock: scala.Double): js.Array[_] | scala.Unit = js.native
  def ctxPrm(name: java.lang.String): js.Any = js.native
  def ctxPrm(name: java.lang.String, value: js.Any): js.Any = js.native
   // get/set in JsViews but get only in JsRender
  def cvtArgs(): js.Array[_] | scala.Unit = js.native
  def cvtArgs(elseBlock: scala.Double): js.Array[_] | scala.Unit = js.native
}

