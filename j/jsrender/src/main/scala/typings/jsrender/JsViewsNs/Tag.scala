package typings.jsrender.JsViewsNs

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends TagOptionProps {
  var base: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var baseApply: js.UndefOr[js.Function1[/* args */ js.Array[_] | IArguments, _]] = js.native
  var parent: js.UndefOr[Tag] = js.native
  var parents: js.UndefOr[Hash[Tag]] = js.native
  var rendering: js.UndefOr[Hash[_]] = js.native
  /* Tag object */
  var tagCtx: TagCtx = js.native
  var tagCtxs: js.Array[TagCtx] = js.native
  var tagName: String = js.native
  def bndArgs(): js.Array[_] | Unit = js.native
  def bndArgs(elseBlock: Double): js.Array[_] | Unit = js.native
  def ctxPrm(name: String): js.Any = js.native
  def ctxPrm(name: String, value: js.Any): js.Any = js.native
   // get/set in JsViews but get only in JsRender
  def cvtArgs(): js.Array[_] | Unit = js.native
  def cvtArgs(elseBlock: Double): js.Array[_] | Unit = js.native
}

