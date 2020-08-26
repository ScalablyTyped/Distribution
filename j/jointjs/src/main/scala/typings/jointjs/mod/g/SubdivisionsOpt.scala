package typings.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubdivisionsOpt extends PrecisionOpt {
  var subdivisions: js.UndefOr[js.Array[Curve]] = js.native
}

object SubdivisionsOpt {
  @scala.inline
  def apply(): SubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubdivisionsOpt]
  }
  @scala.inline
  implicit class SubdivisionsOptOps[Self <: SubdivisionsOpt] (val x: Self) extends AnyVal {
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
    def setSubdivisionsVarargs(value: Curve*): Self = this.set("subdivisions", js.Array(value :_*))
    @scala.inline
    def setSubdivisions(value: js.Array[Curve]): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
  }
  
}

