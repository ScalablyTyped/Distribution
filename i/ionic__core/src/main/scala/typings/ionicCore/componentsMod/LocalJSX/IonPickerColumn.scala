package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.pickerInterfaceMod.PickerColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonPickerColumn extends StObject {
  
  /**
    * Picker column data
    */
  var col: PickerColumn
}
object IonPickerColumn {
  
  inline def apply(col: PickerColumn): IonPickerColumn = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonPickerColumn]
  }
  
  extension [Self <: IonPickerColumn](x: Self) {
    
    inline def setCol(value: PickerColumn): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
  }
}
