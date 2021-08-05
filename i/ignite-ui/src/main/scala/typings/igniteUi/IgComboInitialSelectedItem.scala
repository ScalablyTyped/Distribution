package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboInitialSelectedItem
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="true" Index of item in the list. The index should be greater than -1 and less than the count of the [items](ui.igcombo#methods:items) in the list (rows in dataSource).
    *
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional="true" Value matching the [valueKey](ui.igcombo#options:valueKey) property of the item.
    *
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object IgComboInitialSelectedItem {
  
  inline def apply(): IgComboInitialSelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboInitialSelectedItem]
  }
  
  extension [Self <: IgComboInitialSelectedItem](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
