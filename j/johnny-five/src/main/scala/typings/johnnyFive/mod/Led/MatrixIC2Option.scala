package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixIC2Option extends js.Object {
  var addresses: js.UndefOr[js.Array[_]] = js.native
  var controller: String = js.native
  var dims: js.UndefOr[js.Any] = js.native
  var isBicolor: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
}

object MatrixIC2Option {
  @scala.inline
  def apply(controller: String): MatrixIC2Option = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixIC2Option]
  }
  @scala.inline
  implicit class MatrixIC2OptionOps[Self <: MatrixIC2Option] (val x: Self) extends AnyVal {
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
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressesVarargs(value: js.Any*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[_]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setDims(value: js.Any): Self = this.set("dims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDims: Self = this.set("dims", js.undefined)
    @scala.inline
    def setIsBicolor(value: Boolean): Self = this.set("isBicolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBicolor: Self = this.set("isBicolor", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
  }
  
}

