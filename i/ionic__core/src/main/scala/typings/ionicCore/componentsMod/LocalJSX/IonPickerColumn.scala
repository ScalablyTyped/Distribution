package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.pickerInterfaceMod.PickerColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPickerColumn extends js.Object {
  /**
    * Picker column data
    */
  var col: PickerColumn = js.native
}

object IonPickerColumn {
  @scala.inline
  def apply(col: PickerColumn): IonPickerColumn = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonPickerColumn]
  }
  @scala.inline
  implicit class IonPickerColumnOps[Self <: IonPickerColumn] (val x: Self) extends AnyVal {
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
    def setCol(value: PickerColumn): Self = this.set("col", value.asInstanceOf[js.Any])
  }
  
}

