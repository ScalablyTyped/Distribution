package typings.mapboxShelfPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackOption extends js.Object {
  /// If true , the supplied bin objects will be updated inplace with x and y properties
  var inPlace: js.UndefOr[Boolean] = js.native
}

object PackOption {
  @scala.inline
  def apply(): PackOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackOption]
  }
  @scala.inline
  implicit class PackOptionOps[Self <: PackOption] (val x: Self) extends AnyVal {
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
    def setInPlace(value: Boolean): Self = this.set("inPlace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInPlace: Self = this.set("inPlace", js.undefined)
  }
  
}

