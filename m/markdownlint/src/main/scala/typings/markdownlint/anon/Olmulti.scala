package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Olmulti extends js.Object {
  var ol_multi: js.UndefOr[Double] = js.native
  var ol_single: js.UndefOr[Double] = js.native
  var ul_multi: js.UndefOr[Double] = js.native
  var ul_single: js.UndefOr[Double] = js.native
}

object Olmulti {
  @scala.inline
  def apply(): Olmulti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Olmulti]
  }
  @scala.inline
  implicit class OlmultiOps[Self <: Olmulti] (val x: Self) extends AnyVal {
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
    def setOl_multi(value: Double): Self = this.set("ol_multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOl_multi: Self = this.set("ol_multi", js.undefined)
    @scala.inline
    def setOl_single(value: Double): Self = this.set("ol_single", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOl_single: Self = this.set("ol_single", js.undefined)
    @scala.inline
    def setUl_multi(value: Double): Self = this.set("ul_multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUl_multi: Self = this.set("ul_multi", js.undefined)
    @scala.inline
    def setUl_single(value: Double): Self = this.set("ul_single", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUl_single: Self = this.set("ul_single", js.undefined)
  }
  
}

