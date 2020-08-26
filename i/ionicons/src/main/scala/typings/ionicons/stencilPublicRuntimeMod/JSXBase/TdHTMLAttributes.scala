package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TdHTMLAttributes[T] extends HTMLAttributes[T] {
  var colSpan: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
}

object TdHTMLAttributes {
  @scala.inline
  def apply[T](): TdHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdHTMLAttributes[T]]
  }
  @scala.inline
  implicit class TdHTMLAttributesOps[Self <: TdHTMLAttributes[_], T] (val x: Self with TdHTMLAttributes[T]) extends AnyVal {
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
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
  }
  
}

