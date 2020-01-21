package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.pickerInterfaceMod.PickerColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonPickerColumn extends js.Object {
  /**
    * Picker column data
    */
  var col: PickerColumn
}

object IonPickerColumn {
  @scala.inline
  def apply(col: PickerColumn): IonPickerColumn = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonPickerColumn]
  }
}

