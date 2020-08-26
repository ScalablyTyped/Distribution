package typings.ionicCore.stencilPublicRuntimeMod.JSXBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuHTMLAttributes[T] extends HTMLAttributes[T] {
  var `type`: js.UndefOr[String] = js.native
}

object MenuHTMLAttributes {
  @scala.inline
  def apply[T](): MenuHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuHTMLAttributes[T]]
  }
  @scala.inline
  implicit class MenuHTMLAttributesOps[Self <: MenuHTMLAttributes[_], T] (val x: Self with MenuHTMLAttributes[T]) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

