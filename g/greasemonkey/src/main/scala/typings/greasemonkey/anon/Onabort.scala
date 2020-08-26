package typings.greasemonkey.anon

import typings.greasemonkey.GM.ProgressResponse
import typings.greasemonkey.GM.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onabort[TContext] extends js.Object {
  var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.native
}

object Onabort {
  @scala.inline
  def apply[TContext](): Onabort[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onabort[TContext]]
  }
  @scala.inline
  implicit class OnabortOps[Self <: Onabort[_], TContext] (val x: Self with Onabort[TContext]) extends AnyVal {
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
    def setOnabort(value: /* response */ Response[TContext] => Unit): Self = this.set("onabort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    @scala.inline
    def setOnerror(value: /* response */ Response[TContext] => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnload(value: /* response */ Response[TContext] => Unit): Self = this.set("onload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnprogress(value: /* response */ ProgressResponse[TContext] => Unit): Self = this.set("onprogress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
  }
  
}

