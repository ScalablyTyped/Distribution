package typings.loadjs.anon

import typings.loadjs.loadjsBooleans.`true`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined loadjs.loadjs.LoadOptions & {  returnPromise :true} */
@js.native
trait LoadOptionsreturnPromiset extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.native
   // Arguments provided are different in case of returnPromise: true / false
  var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.native
  var numRetries: js.UndefOr[Double] = js.native
  var returnPromise: `true` = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object LoadOptionsreturnPromiset {
  @scala.inline
  def apply(returnPromise: `true`): LoadOptionsreturnPromiset = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptionsreturnPromiset]
  }
  @scala.inline
  implicit class LoadOptionsreturnPromisetOps[Self <: LoadOptionsreturnPromiset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReturnPromise(value: `true`): Self = this.set("returnPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBefore(value: (/* path */ String, /* scriptEl */ HTMLElement) => Unit): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setError(value: /* depsNotFound */ js.Array[String] => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNumRetries(value: Double): Self = this.set("numRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumRetries: Self = this.set("numRetries", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

