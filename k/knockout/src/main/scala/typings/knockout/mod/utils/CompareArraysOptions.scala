package typings.knockout.mod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareArraysOptions extends js.Object {
  var dontLimitMoves: js.UndefOr[Boolean] = js.native
  var sparse: js.UndefOr[Boolean] = js.native
}

object CompareArraysOptions {
  @scala.inline
  def apply(): CompareArraysOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareArraysOptions]
  }
  @scala.inline
  implicit class CompareArraysOptionsOps[Self <: CompareArraysOptions] (val x: Self) extends AnyVal {
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
    def setDontLimitMoves(value: Boolean): Self = this.set("dontLimitMoves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontLimitMoves: Self = this.set("dontLimitMoves", js.undefined)
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
  }
  
}

