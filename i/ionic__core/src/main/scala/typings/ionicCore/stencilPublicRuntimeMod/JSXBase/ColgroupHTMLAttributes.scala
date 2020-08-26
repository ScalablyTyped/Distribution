package typings.ionicCore.stencilPublicRuntimeMod.JSXBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColgroupHTMLAttributes[T] extends HTMLAttributes[T] {
  var span: js.UndefOr[Double] = js.native
}

object ColgroupHTMLAttributes {
  @scala.inline
  def apply[T](): ColgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColgroupHTMLAttributes[T]]
  }
  @scala.inline
  implicit class ColgroupHTMLAttributesOps[Self <: ColgroupHTMLAttributes[_], T] (val x: Self with ColgroupHTMLAttributes[T]) extends AnyVal {
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
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
  
}

