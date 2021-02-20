package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.pickerInterfaceMod.PickerColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonPickerColumn extends StObject {
  
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
  implicit class IonPickerColumnMutableBuilder[Self <: IonPickerColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: PickerColumn): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
  }
}
