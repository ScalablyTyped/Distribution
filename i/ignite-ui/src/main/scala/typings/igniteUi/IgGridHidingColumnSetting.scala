package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridHidingColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Allows the column to be hidden.
    *
    */
  var allowHiding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Column index. Can be used in place of column key. the preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Column key. this is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the initial visibility of the column.
    *
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object IgGridHidingColumnSetting {
  
  inline def apply(): IgGridHidingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridHidingColumnSetting]
  }
  
  extension [Self <: IgGridHidingColumnSetting](x: Self) {
    
    inline def setAllowHiding(value: Boolean): Self = StObject.set(x, "allowHiding", value.asInstanceOf[js.Any])
    
    inline def setAllowHidingUndefined: Self = StObject.set(x, "allowHiding", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
