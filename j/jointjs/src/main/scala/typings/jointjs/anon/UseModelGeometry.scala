package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseModelGeometry extends js.Object {
  var useModelGeometry: js.UndefOr[Boolean] = js.native
}

object UseModelGeometry {
  @scala.inline
  def apply(): UseModelGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseModelGeometry]
  }
  @scala.inline
  implicit class UseModelGeometryOps[Self <: UseModelGeometry] (val x: Self) extends AnyVal {
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
    def setUseModelGeometry(value: Boolean): Self = this.set("useModelGeometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseModelGeometry: Self = this.set("useModelGeometry", js.undefined)
  }
  
}

