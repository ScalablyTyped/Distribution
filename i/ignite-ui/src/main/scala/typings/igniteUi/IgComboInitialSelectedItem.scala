package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgComboInitialSelectedItem
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="true" Index of item in the list. The index should be greater than -1 and less than the count of the [items](ui.igcombo#methods:items) in the list (rows in dataSource).
    *
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Optional="true" Value matching the [valueKey](ui.igcombo#options:valueKey) property of the item.
    *
    */
  var value: js.UndefOr[js.Any] = js.native
}
object IgComboInitialSelectedItem {
  
  @scala.inline
  def apply(): IgComboInitialSelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboInitialSelectedItem]
  }
  
  @scala.inline
  implicit class IgComboInitialSelectedItemMutableBuilder[Self <: IgComboInitialSelectedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
