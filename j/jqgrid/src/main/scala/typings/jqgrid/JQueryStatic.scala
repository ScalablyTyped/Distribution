package typings.jqgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var jqGrid: js.UndefOr[JQueryJqGridStatic] = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
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
    def setJqGrid(value: JQueryJqGridStatic): Self = this.set("jqGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJqGrid: Self = this.set("jqGrid", js.undefined)
  }
  
}

